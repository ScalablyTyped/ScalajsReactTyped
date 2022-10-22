package typingsJapgolly.gapiCalendar.gapi.client.calendar

import typingsJapgolly.gapiCalendar.anon.Method
import typingsJapgolly.gapiCalendar.gapiCalendarStrings.calendarNumbersignevents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events_ extends StObject {
  
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole
  
  var defaultReminders: js.Array[Method]
  
  var description: String
  
  var etag: typingsJapgolly.gapiCalendar.gapi.client.calendar.etag
  
  var items: js.Array[Event]
  
  var kind: calendarNumbersignevents
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  var summary: String
  
  var timeZone: String
  
  var updated: datetime
}
object Events_ {
  
  inline def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[Method],
    description: String,
    etag: etag,
    items: js.Array[Event],
    summary: String,
    timeZone: String,
    updated: datetime
  ): Events_ = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = "calendar#events", summary = summary.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events_]
  }
  
  extension [Self <: Events_](x: Self) {
    
    inline def setAccessRole(value: AccessRole): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    inline def setDefaultReminders(value: js.Array[Method]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersVarargs(value: Method*): Self = StObject.set(x, "defaultReminders", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Event]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Event*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: calendarNumbersignevents): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: datetime): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
