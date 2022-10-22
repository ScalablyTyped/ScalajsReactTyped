package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Is there a `user` attribute?
trait CalendarEventUpdated
  extends StObject
     with AppsScriptEvent {
  
  var calendarId: String
}
object CalendarEventUpdated {
  
  inline def apply(authMode: AuthMode, calendarId: String, triggerUid: String, user: User): CalendarEventUpdated = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], calendarId = calendarId.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEventUpdated]
  }
  
  extension [Self <: CalendarEventUpdated](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
  }
}
