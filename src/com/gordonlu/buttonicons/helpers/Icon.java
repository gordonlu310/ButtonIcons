package com.gordonlu.buttonicons.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.function.IntConsumer;

import com.google.appinventor.components.common.OptionList;

public enum Icon implements OptionList<Integer> {
  Add(17301547),
  AddToMenu(17301555),
  Agenda(17301556),
  Alarm(17301550),
  Alert(17301543),
  Call(17301558),
  Camera(17301559),
  Charging(17301534),
  ClearNotifications(17301594),
  CloseClearCancel(17301560),
  Compass(17301561),
  Crop(17301562),
  Day(17301563),
  Delete(17301533),
  DeleteInput(17301548),
  DeleteMenu(17301564),
  Dialer(17301544),
  Directions(17301565),
  DiskFull(17301597),
  Edit(17301566),
  Email(17301545),
  GetInput(17301549),
  Help(17301568),
  IdleLock(17301535),
  Info(17301659),
  InfoDetails(17301569),
  Lock(17301551),
  LowBattery(17301536),
  Manage(17301570),
  Map(17301546),
  Month(17301572),
  More(17301573),
  MyCalendar(17301574),
  MyLocation(17301575),
  MyPlaces(17301576),
  Next(17301538),
  OverlayNotifications(17301595),
  PartialSecure(17301596),
  Pause(17301539),
  Play(17301540),
  PowerOff(17301552),
  Preferences(17301577),
  Previous(17301541),
  RecentHistory(17301578),
  Reminder(17301598),
  ReportImage(17301579),
  Revert(17301580),
  Rew(17301542),
  Rotate(17301581),
  Save(17301582),
  Search(17301583),
  SearchCategoryDefault(17301600),
  Send(17301584),
  SetAs(17301585),
  Share(17301587),
  SilentMode(17301553),
  SilentModeOff(17301554),
  SortAlphabetically(17301660),
  SortBySize(17301661),
  SpeakNow(17301668),
  Sync(17301599),
  Today(17301589),
  Upload(17301589),
  UploadYouTube(17301591),
  View(17301591),
  Week(17301592),
  Zoom(17301593);
  
    private int icon;
  
    Icon(int h) {
      this.icon = h;
    }
  
    public Integer toUnderlyingValue() {
      return icon;
    }
  
    private static final Map<Integer, Icon> lookup = new HashMap<>();
  
    static {
      for(Icon h : Icon.values()) {
        lookup.put(h.toUnderlyingValue(), h);
      }
    }

    public static Icon fromUnderlyingValue(int h) {
      return lookup.get(h);
    }
  }