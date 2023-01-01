package com.gordonlu.buttonicons;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.gordonlu.buttonicons.helpers.Icon;

import com.google.appinventor.components.common.OptionList;
import com.google.appinventor.components.annotations.Options;

import android.view.View;
import android.widget.Button;

import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Canvas;
import com.google.appinventor.components.runtime.Form;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import com.google.appinventor.components.annotations.UsesAssets;
import android.graphics.BitmapFactory.*;
import android.util.DisplayMetrics;
import java.io.*;
import java.io.FileOutputStream;
import java.io.InputStream;

@DesignerComponent(version = 2, category = ComponentCategory.EXTENSION, description = "A non-visible extension that provides extra features for the AppInventor" + 
" Button component. Created by Gordon.", nonVisible = true, iconName = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABq0lEQVR42p2R2U7CQBSGeWnfQB/BKO6CAi" + 
"5AWbUFyiIICopLQmRfChQiiSZGb3/PmdIWY/SCJl/mzPJ/M51xOOhTFAXL4DDDcmWMWu8dtf5vKo0ZpMIAwXxfELhievCpHfj9fgjBc/cN2usnhn+QuBsjdK0hRCKWnWS6cCktW1Cuz4zFM4OR4EvUbf0DHtpt96IJZ6wBZ7SOzUgdG" + 
"+EXWxAtaVCrOrJPU+SY56nYNZAfwJVoY/eyRYIWdkiyHW9iS4gatiB+O8JFmRnjkggWNBxS8DDREe2BYrAvt7Ent4SQZZaAQ3yRMu0avRnCneriaAHuu5MduJK2cF9euAOFgol7nVod3kwPnrSBN23Xx4w6FwrRwiskqxOkHiaQrofwZ" + 
"fs4YXIDG+rzuDfTN2RqT4gsgfo4FZLTqwHOiPO89gsePzVlc5ElCJdGkIpD+OnyAnSKoEnRaHksUKB5FhEs4hNZAjMoFUcIlQzCN2ML7ksEC3mdeSJLwP9jhiK39BJlHTGmooua4XGeFyKS8ItYgpX1IlZdVawx7n+g+VXBvcj8ECyDEPDHxTJw9htjXTNbFi6OggAAAABJRU5ErkJggg==")
@UsesAssets(fileNames = "material-icons.ttf")
@SimpleObject(external = true)

public class ButtonIcons extends AndroidNonvisibleComponent {

    public ButtonIcons(ComponentContainer container) {
        super(container.$form());
    }

    @SimpleFunction(description = "Sets the icon of the specified button. Use 0 if you do not want an icon to appear.")
    public void SetAndroidButtonIcons(AndroidViewComponent component, @Options(Icon.class) int leftIcon, @Options(Icon.class) int topIcon, @Options(Icon.class) int rightIcon, 
    @Options(Icon.class) int bottomIcon) {
        Button button = (Button) component.getView();
        button.setCompoundDrawablesWithIntrinsicBounds(leftIcon, topIcon, rightIcon, bottomIcon);
    }

    @SimpleFunction(description = "Sets the icon of the specified button. Use an empty text block if you do not want an icon to appear. Please use absolute paths or full paths in this instance.")
    public void SetCustomButtonIcons(AndroidViewComponent component, String leftIconPath, String topIconPath, String rightIconPath, String bottomIconPath) {
        Button button = (Button) component.getView();
        button.setCompoundDrawablesWithIntrinsicBounds(createDrawable(leftIconPath), createDrawable(topIconPath), createDrawable(rightIconPath), createDrawable(bottomIconPath));
    }

    public Drawable createDrawable(String path) {
        if(path.startsWith("file://")) {
			path = path.replace("file://", "");
		}
        if (path == "") {
            return null;
        } else {
            File image = new File(path);
            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
            Bitmap bitmap = BitmapFactory.decodeFile(image.getAbsolutePath(), bmOptions);
            return new BitmapDrawable(form.getResources(), bitmap);
        }
    }

    public Drawable createMaterialIcon(String icon, int color, int size) {
        if (icon == "") {
            return null; 
        } else {
            try {
                String newFilePath = GetFont();
                Typeface typeface = Typeface.createFromFile(newFilePath);
                Paint paint = new Paint();
                paint.setTypeface(typeface);
                paint.setColor(color);
                paint.setTextSize((float)size);
                paint.setTextAlign(Paint.Align.CENTER);
                Bitmap bit = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bit);
                canvas.drawText(icon, (float) (canvas.getWidth() / 2),   (((float) (canvas.getHeight() / 2)) - ((paint.descent() + paint.ascent()) / 2)), paint);
                return new BitmapDrawable(form.getResources(), bit);    
            } catch (IOException e) {
                return null;
            }
        }
    }

    @SimpleFunction(description = "Sets the material icon of the specified button. Use an empty text block if you do not want an icon to appear. The size of the icons should be in pixels.")
    public void SetMaterialButtonIcons(AndroidViewComponent component, String leftIcon, String topIcon, String rightIcon, String bottomIcon, int color, int size) {
        Button button = (Button) component.getView();
        int pixels = size * getDensity();
        button.setCompoundDrawablesWithIntrinsicBounds(createMaterialIcon(leftIcon, color, pixels), createMaterialIcon(topIcon, color, pixels), 
        createMaterialIcon(rightIcon, color, pixels), createMaterialIcon(bottomIcon, color, pixels));
    }

    @SimpleFunction(description = "Sets the size of the padding between the icon and the text.")
    public void SetIconPadding(AndroidViewComponent component, int padding) {
        Button button = (Button) component.getView();
        button.setCompoundDrawablePadding(padding);
    }

    public int getDensity(){
        DisplayMetrics metrics = form.getResources().getDisplayMetrics();
        return (int) metrics.density;
    }

    @SimpleEvent(description = "This event is fired when an error has occurred.")
    public void Error(String error) {
        EventDispatcher.dispatchEvent(this, "ErrorOccurred", error);
    }

    // Credit: TIMAI2, https://community.appinventor.mit.edu/t/f-os-button-icon-extension-android-material-and-custom-icons/73439/14?u=gordon_lu

    public String GetFont() throws IOException {
        String filePath = "";
        File file = File.createTempFile("temp", ".ttf");
        filePath = file.getAbsolutePath();
        try {
          InputStream in = form.openAssetForExtension(this, "material-icons.ttf");
          int size = in.available();
          byte[] buffer = new byte[size];
          in.read(buffer);
          in.close();
          FileOutputStream out = new FileOutputStream(filePath);
          out.write(buffer);
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
          Error(e.getMessage());
        }
        return filePath;
      }

    // This block is added in V2.

    @SimpleFunction(description = "Sets the button's icons from the given icon font. Please use absolute or full paths in this instance.")
    public void SetFontButtonIcons(AndroidViewComponent component, String fontPath, String leftIcon, String topIcon, String rightIcon, String bottomIcon, int color, int size) {
        Button button = (Button) component.getView();
        int pixels = size * getDensity();
        if (fontPath.startsWith("file://")) {
            fontPath = fontPath.replace("file://", "");
        }
        button.setCompoundDrawablesWithIntrinsicBounds(createIcon(leftIcon, color, pixels, fontPath), createIcon(topIcon, color, pixels, fontPath), 
        createIcon(rightIcon, color, pixels, fontPath), createIcon(bottomIcon, color, pixels, fontPath));
    }

    public Drawable createIcon(String icon, int color, int size, String fontPath) {
        if (icon == "") {
            return null; 
        } else {
            Typeface typeface = Typeface.createFromFile(fontPath);
            Paint paint = new Paint();
            paint.setTypeface(typeface);
            paint.setColor(color);
            paint.setTextSize((float)size);
            paint.setTextAlign(Paint.Align.CENTER);
            Bitmap bit = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bit);
            canvas.drawText(icon, (float) (canvas.getWidth() / 2),   (((float) (canvas.getHeight() / 2)) - ((paint.descent() + paint.ascent()) / 2)), paint);
            return new BitmapDrawable(form.getResources(), bit);    
        }
    }
}
