package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to a prompt dialog displayed in the
  * user-interface environment for a Google App. The response contains any text the user entered in
  * the dialog's input field and indicates which button the user clicked to dismiss the dialog.
  *
  *     // Display a dialog box with a title, message, input field, and "Yes" and "No" buttons. The
  *     // user can also close the dialog by clicking the close button in its title bar.
  *     var ui = DocumentApp.getUi();
  *     var response = ui.prompt('Getting to know you', 'May I know your name?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response.getSelectedButton() == ui.Button.YES) {
  *       Logger.log('The user\'s name is %s.', response.getResponseText());
  *     } else if (response.getSelectedButton() == ui.Button.NO) {
  *       Logger.log('The user didn\'t want to provide a name.');
  *     } else {
  *       Logger.log('The user clicked the close button in the dialog\'s title bar.');
  *     }
  */
trait PromptResponse extends StObject {
  
  def getResponseText(): String
  
  def getSelectedButton(): Button
}
object PromptResponse {
  
  inline def apply(getResponseText: CallbackTo[String], getSelectedButton: CallbackTo[Button]): PromptResponse = {
    val __obj = js.Dynamic.literal(getResponseText = getResponseText.toJsFn, getSelectedButton = getSelectedButton.toJsFn)
    __obj.asInstanceOf[PromptResponse]
  }
  
  extension [Self <: PromptResponse](x: Self) {
    
    inline def setGetResponseText(value: CallbackTo[String]): Self = StObject.set(x, "getResponseText", value.toJsFn)
    
    inline def setGetSelectedButton(value: CallbackTo[Button]): Self = StObject.set(x, "getSelectedButton", value.toJsFn)
  }
}
