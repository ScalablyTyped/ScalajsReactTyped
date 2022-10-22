package typingsJapgolly.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gapiCalendar.anon.Busy
import typingsJapgolly.gapiCalendar.anon.Calendars
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusy_ extends StObject {
  
  var calendars: StringDictionary[Busy]
  
  var groups: StringDictionary[Calendars]
  
  var kind: calendarNumbersignfreeBusy
  
  var timeMax: datetime
  
  var timeMin: datetime
}
object FreeBusy_ {
  
  inline def apply(
    calendars: StringDictionary[Busy],
    groups: StringDictionary[Calendars],
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = calendars.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], kind = "calendar#freeBusy", timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
  
  extension [Self <: FreeBusy_](x: Self) {
    
    inline def setCalendars(value: StringDictionary[Busy]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: StringDictionary[Calendars]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setKind(value: calendarNumbersignfreeBusy): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
  }
}
