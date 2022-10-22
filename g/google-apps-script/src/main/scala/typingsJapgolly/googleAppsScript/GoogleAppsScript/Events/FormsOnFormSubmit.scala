package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.User
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.Form
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms.FormResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormsOnFormSubmit
  extends StObject
     with AppsScriptEvent {
  
  var response: FormResponse
  
  var source: Form
}
object FormsOnFormSubmit {
  
  inline def apply(authMode: AuthMode, response: FormResponse, source: Form, triggerUid: String, user: User): FormsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOnFormSubmit]
  }
  
  extension [Self <: FormsOnFormSubmit](x: Self) {
    
    inline def setResponse(value: FormResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Form): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
