package typingsJapgolly.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsGetParameters extends StObject {
  
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
  var calendarId: String
  
  var eventId: String
  
  var maxAttendees: js.UndefOr[integer] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object EventsGetParameters {
  
  inline def apply(calendarId: String, eventId: String): EventsGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsGetParameters]
  }
  
  extension [Self <: EventsGetParameters](x: Self) {
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendees(value: integer): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
