package com.google.appinventor.client;

import java.util.HashMap;
import java.util.Map;

import static com.google.appinventor.client.Ode.MESSAGES;

public class ComponentsTranslation {
  public static Map<String, String> myMap = map();

  private static String getName(String key) {
    String value = myMap.get(key);
    if (key == null) {
      return "**Missing key in ComponentsTranslations**";
    } else {
      return value;
    }
  }

  public static String getPropertyName(String key) {
    String value = getName("PROPERTY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getPropertyDescription(String key) {
    String value = getName("PROPDESC-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getMethodName(String key) {
    String value = getName("METHOD-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getEventName(String key) {
    String value = getName("EVENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentName(String key) {
    String value = getName("COMPONENT-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getCategoryName(String key) {
    String value = getName("CATEGORY-" + key);
    if(value == null) return key;
    return value;
  }

  public static String getComponentHelpString(String key) {
    String value = getName(key + "-helpString");
    if(value == null) return key;
    return value;
  }
  public static HashMap<String, String> map() {
    HashMap<String, String> map = new HashMap<String, String>();


/* OptionList Icon */

     map.put("OPTIONLIST-Icon", MESSAGES.iconOptionList());
    map.put("OPTION-IconAdd", MESSAGES.iconAddOption());
    map.put("OPTION-IconAddToMenu", MESSAGES.iconAddToMenuOption());
    map.put("OPTION-IconAgenda", MESSAGES.iconAgendaOption());
    map.put("OPTION-IconAlarm", MESSAGES.iconAlarmOption());
    map.put("OPTION-IconAlert", MESSAGES.iconAlertOption());
    map.put("OPTION-IconCall", MESSAGES.iconCallOption());
    map.put("OPTION-IconCamera", MESSAGES.iconCameraOption());
    map.put("OPTION-IconCharging", MESSAGES.iconChargingOption());
    map.put("OPTION-IconClearNotifications", MESSAGES.iconClearNotificationsOption());
    map.put("OPTION-IconCloseClearCancel", MESSAGES.iconCloseClearCancelOption());
    map.put("OPTION-IconCompass", MESSAGES.iconCompassOption());
    map.put("OPTION-IconCrop", MESSAGES.iconCropOption());
    map.put("OPTION-IconDay", MESSAGES.iconDayOption());
    map.put("OPTION-IconDelete", MESSAGES.iconDeleteOption());
    map.put("OPTION-IconDeleteInput", MESSAGES.iconDeleteInputOption());
    map.put("OPTION-IconDeleteMenu", MESSAGES.iconDeleteMenuOption());
    map.put("OPTION-IconDialer", MESSAGES.iconDialerOption());
    map.put("OPTION-IconDirections", MESSAGES.iconDirectionsOption());
    map.put("OPTION-IconDiskFull", MESSAGES.iconDiskFullOption());
    map.put("OPTION-IconEdit", MESSAGES.iconEditOption());
    map.put("OPTION-IconEmail", MESSAGES.iconEmailOption());
    map.put("OPTION-IconGetInput", MESSAGES.iconGetInputOption());
    map.put("OPTION-IconHelp", MESSAGES.iconHelpOption());
    map.put("OPTION-IconIdleLock", MESSAGES.iconIdleLockOption());
    map.put("OPTION-IconInfo", MESSAGES.iconInfoOption());
    map.put("OPTION-IconInfoDetails", MESSAGES.iconInfoDetailsOption());
    map.put("OPTION-IconLock", MESSAGES.iconLockOption());
    map.put("OPTION-IconLowBattery", MESSAGES.iconLowBatteryOption());
    map.put("OPTION-IconManage", MESSAGES.iconManageOption());
    map.put("OPTION-IconMap", MESSAGES.iconMapOption());
    map.put("OPTION-IconMonth", MESSAGES.iconMonthOption());
    map.put("OPTION-IconMore", MESSAGES.iconMoreOption());
    map.put("OPTION-IconMyCalendar", MESSAGES.iconMyCalendarOption());
    map.put("OPTION-IconMyLocation", MESSAGES.iconMyLocationOption());
    map.put("OPTION-IconMyPlaces", MESSAGES.iconMyPlacesOption());
    map.put("OPTION-IconNext", MESSAGES.iconNextOption());
    map.put("OPTION-IconOverlayNotifications", MESSAGES.iconOverlayNotificationsOption());
    map.put("OPTION-IconPartialSecure", MESSAGES.iconPartialSecureOption());
    map.put("OPTION-IconPause", MESSAGES.iconPauseOption());
    map.put("OPTION-IconPlay", MESSAGES.iconPlayOption());
    map.put("OPTION-IconPowerOff", MESSAGES.iconPowerOffOption());
    map.put("OPTION-IconPreferences", MESSAGES.iconPreferencesOption());
    map.put("OPTION-IconPrevious", MESSAGES.iconPreviousOption());
    map.put("OPTION-IconRecentHistory", MESSAGES.iconRecentHistoryOption());
    map.put("OPTION-IconReminder", MESSAGES.iconReminderOption());
    map.put("OPTION-IconReportImage", MESSAGES.iconReportImageOption());
    map.put("OPTION-IconRevert", MESSAGES.iconRevertOption());
    map.put("OPTION-IconRew", MESSAGES.iconRewOption());
    map.put("OPTION-IconRotate", MESSAGES.iconRotateOption());
    map.put("OPTION-IconSave", MESSAGES.iconSaveOption());
    map.put("OPTION-IconSearch", MESSAGES.iconSearchOption());
    map.put("OPTION-IconSearchCategoryDefault", MESSAGES.iconSearchCategoryDefaultOption());
    map.put("OPTION-IconSend", MESSAGES.iconSendOption());
    map.put("OPTION-IconSetAs", MESSAGES.iconSetAsOption());
    map.put("OPTION-IconShare", MESSAGES.iconShareOption());
    map.put("OPTION-IconSilentMode", MESSAGES.iconSilentModeOption());
    map.put("OPTION-IconSilentModeOff", MESSAGES.iconSilentModeOffOption());
    map.put("OPTION-IconSortAlphabetically", MESSAGES.iconSortAlphabeticallyOption());
    map.put("OPTION-IconSortBySize", MESSAGES.iconSortBySizeOption());
    map.put("OPTION-IconSpeakNow", MESSAGES.iconSpeakNowOption());
    map.put("OPTION-IconSync", MESSAGES.iconSyncOption());
    map.put("OPTION-IconToday", MESSAGES.iconTodayOption());
    map.put("OPTION-IconUpload", MESSAGES.iconUploadOption());
    map.put("OPTION-IconUploadYouTube", MESSAGES.iconUploadYouTubeOption());
    map.put("OPTION-IconView", MESSAGES.iconViewOption());
    map.put("OPTION-IconWeek", MESSAGES.iconWeekOption());
    map.put("OPTION-IconZoom", MESSAGES.iconZoomOption());


    /* Descriptions */

    map.put("METHODDESC-SetButtonIconsMethodDescriptions", MESSAGES.SetButtonIconsMethodDescriptions());
    map.put("METHODDESC-SetCustomButtonIconsMethodDescriptions", MESSAGES.SetCustomButtonIconsMethodDescriptions());
    map.put("METHODDESC-SetFontAwesomeButtonIconsMethodDescriptions", MESSAGES.SetFontAwesomeButtonIconsMethodDescriptions());
    map.put("METHODDESC-SetMaterialButtonIconsMethodDescriptions", MESSAGES.SetMaterialButtonIconsMethodDescriptions());


    /* Categories */

    map.put("CATEGORY-Extension", MESSAGES.extensionComponentPallette());
  return map;
  }
}
