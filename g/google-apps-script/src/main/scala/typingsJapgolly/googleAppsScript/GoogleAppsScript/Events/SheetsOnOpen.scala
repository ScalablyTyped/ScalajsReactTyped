package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// External interfaces
trait SheetsOnOpen
  extends StObject
     with AppsScriptEvent {
  
  var source: Spreadsheet
}
object SheetsOnOpen {
  
  inline def apply(authMode: AuthMode, source: Spreadsheet, triggerUid: String, user: User): SheetsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnOpen]
  }
  
  extension [Self <: SheetsOnOpen](x: Self) {
    
    inline def setSource(value: Spreadsheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
