package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reminder extends StObject {
  
  /**
    * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows
    * Exchange to apply changes to the correct version of the object.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date, time and time zone that the event ends.
  var eventEndTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The unique ID of the event. Read only.
  var eventId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The location of the event.
  var eventLocation: js.UndefOr[NullableOption[Location]] = js.undefined
  
  // The date, time, and time zone that the event starts.
  var eventStartTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The text of the event's subject line.
  var eventSubject: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox
    * via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot
    * be accessed from within an iFrame.
    */
  var eventWebLink: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date, time, and time zone that the reminder is set to occur.
  var reminderFireTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
}
object Reminder {
  
  inline def apply(): Reminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reminder]
  }
  
  extension [Self <: Reminder](x: Self) {
    
    inline def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    inline def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    inline def setEventEndTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "eventEndTime", value.asInstanceOf[js.Any])
    
    inline def setEventEndTimeNull: Self = StObject.set(x, "eventEndTime", null)
    
    inline def setEventEndTimeUndefined: Self = StObject.set(x, "eventEndTime", js.undefined)
    
    inline def setEventId(value: NullableOption[String]): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setEventLocation(value: NullableOption[Location]): Self = StObject.set(x, "eventLocation", value.asInstanceOf[js.Any])
    
    inline def setEventLocationNull: Self = StObject.set(x, "eventLocation", null)
    
    inline def setEventLocationUndefined: Self = StObject.set(x, "eventLocation", js.undefined)
    
    inline def setEventStartTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "eventStartTime", value.asInstanceOf[js.Any])
    
    inline def setEventStartTimeNull: Self = StObject.set(x, "eventStartTime", null)
    
    inline def setEventStartTimeUndefined: Self = StObject.set(x, "eventStartTime", js.undefined)
    
    inline def setEventSubject(value: NullableOption[String]): Self = StObject.set(x, "eventSubject", value.asInstanceOf[js.Any])
    
    inline def setEventSubjectNull: Self = StObject.set(x, "eventSubject", null)
    
    inline def setEventSubjectUndefined: Self = StObject.set(x, "eventSubject", js.undefined)
    
    inline def setEventWebLink(value: NullableOption[String]): Self = StObject.set(x, "eventWebLink", value.asInstanceOf[js.Any])
    
    inline def setEventWebLinkNull: Self = StObject.set(x, "eventWebLink", null)
    
    inline def setEventWebLinkUndefined: Self = StObject.set(x, "eventWebLink", js.undefined)
    
    inline def setReminderFireTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "reminderFireTime", value.asInstanceOf[js.Any])
    
    inline def setReminderFireTimeNull: Self = StObject.set(x, "reminderFireTime", null)
    
    inline def setReminderFireTimeUndefined: Self = StObject.set(x, "reminderFireTime", js.undefined)
  }
}
