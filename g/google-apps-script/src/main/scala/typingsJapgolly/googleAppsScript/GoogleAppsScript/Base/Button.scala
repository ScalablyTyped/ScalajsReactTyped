package typingsJapgolly.googleAppsScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Button extends js.Object

/**
  * An enum representing predetermined, localized dialog buttons returned by an alert or PromptResponse.getSelectedButton() to indicate
  * which button in a dialog the user clicked. These values cannot be set; to add buttons to an
  * alert or prompt, use ButtonSet instead.
  *
  *     // Display a dialog box with a message and "Yes" and "No" buttons.
  *     var ui = DocumentApp.getUi();
  *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response == ui.Button.YES) {
  *       Logger.log('The user clicked "Yes."');
  *     } else {
  *       Logger.log('The user clicked "No" or the dialog\'s close button.');
  *     }
  */
@JSGlobal("GoogleAppsScript.Base.Button")
@js.native
object Button extends js.Object {
  @js.native
  sealed trait CANCEL extends Button
  
  @js.native
  sealed trait CLOSE extends Button
  
  @js.native
  sealed trait NO extends Button
  
  @js.native
  sealed trait OK extends Button
  
  @js.native
  sealed trait YES extends Button
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Button with Double] = js.native
  /* 2 */ @js.native
  object CANCEL extends TopLevel[CANCEL with Double]
  
  /* 0 */ @js.native
  object CLOSE extends TopLevel[CLOSE with Double]
  
  /* 4 */ @js.native
  object NO extends TopLevel[NO with Double]
  
  /* 1 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 3 */ @js.native
  object YES extends TopLevel[YES with Double]
  
}

