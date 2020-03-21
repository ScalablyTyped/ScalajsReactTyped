package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clickable menu item that is added to the card header menu.
  *
  *     var action = CardService.newAction();
  *     // Finish building the action...
  *
  *     var cardAction = CardService.newCardAction()
  *         .setText("Card action")
  *         .setOnClickAction(action);
  */
trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction
  def setOnClickAction(action: Action): CardAction
  def setOnClickOpenLinkAction(action: Action): CardAction
  def setOpenLink(openLink: OpenLink): CardAction
  def setText(text: String): CardAction
}

object CardAction {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CallbackTo[CardAction],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[CardAction],
    setOnClickAction: Action => CallbackTo[CardAction],
    setOnClickOpenLinkAction: Action => CallbackTo[CardAction],
    setOpenLink: OpenLink => CallbackTo[CardAction],
    setText: String => CallbackTo[CardAction]
  ): CardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[CardAction]
  }
}

