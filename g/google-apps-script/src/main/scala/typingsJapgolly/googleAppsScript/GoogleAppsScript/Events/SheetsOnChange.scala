package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsOnChange
  extends StObject
     with AppsScriptEvent {
  
  var changeType: SheetsOnChangeChangeType
}
object SheetsOnChange {
  
  inline def apply(authMode: AuthMode, changeType: SheetsOnChangeChangeType, triggerUid: String, user: User): SheetsOnChange = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], changeType = changeType.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnChange]
  }
  
  extension [Self <: SheetsOnChange](x: Self) {
    
    inline def setChangeType(value: SheetsOnChangeChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
  }
}
