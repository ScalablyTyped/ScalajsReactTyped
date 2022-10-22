package typingsJapgolly.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsUpdateParameters extends StObject {
  
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
  var calendarId: String
  
  var eventId: String
  
  var maxAttendees: js.UndefOr[integer] = js.undefined
  
  // Event resource
  var resource: EventInput
  
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
}
object EventsUpdateParameters {
  
  inline def apply(calendarId: String, eventId: String, resource: EventInput): EventsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsUpdateParameters]
  }
  
  extension [Self <: EventsUpdateParameters](x: Self) {
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendees(value: integer): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setResource(value: EventInput): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    inline def setSupportsAttachments(value: Boolean): Self = StObject.set(x, "supportsAttachments", value.asInstanceOf[js.Any])
    
    inline def setSupportsAttachmentsUndefined: Self = StObject.set(x, "supportsAttachments", js.undefined)
  }
}
