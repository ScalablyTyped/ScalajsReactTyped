package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Range
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Spreadsheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsOnEdit
  extends StObject
     with AppsScriptEvent {
  
  var oldValue: String
  
  var range: Range
  
  var source: Spreadsheet
  
  var value: String
}
object SheetsOnEdit {
  
  inline def apply(
    authMode: AuthMode,
    oldValue: String,
    range: Range,
    source: Spreadsheet,
    triggerUid: String,
    user: User,
    value: String
  ): SheetsOnEdit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnEdit]
  }
  
  extension [Self <: SheetsOnEdit](x: Self) {
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Spreadsheet): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
