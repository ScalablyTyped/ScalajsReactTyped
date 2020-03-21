package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object that may be returned from a callback method for compose action in a Gmail add-on.
  *
  * Note: This object isn't related to compose actions that are
  * used to extend the compose UI. Rather,
  * this object is a response to an Action that composes draft messages when a specific UI element is
  * selected.
  *
  *     var composeActionResponse = CardService.newComposeActionResponseBuilder()
  *         .setGmailDraft(GmailApp.createDraft("recipient", "subject", "body"))
  *         .build();
  */
trait ComposeActionResponse extends js.Object {
  def printJson(): String
}

object ComposeActionResponse {
  @scala.inline
  def apply(printJson: CallbackTo[String]): ComposeActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson.toJsFn)
    __obj.asInstanceOf[ComposeActionResponse]
  }
}

