package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextButton with a text label. You can set the background color and disable the button when
  * needed.
  *
  *     var textButton = CardService.newTextButton()
  *         .setText("Open Link")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"));
  */
trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton
  def setBackgroundColor(backgroundColor: String): TextButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton
  def setDisabled(disabled: Boolean): TextButton
  def setOnClickAction(action: Action): TextButton
  def setOnClickOpenLinkAction(action: Action): TextButton
  def setOpenLink(openLink: OpenLink): TextButton
  def setText(text: String): TextButton
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton
}

object TextButton {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CallbackTo[TextButton],
    setBackgroundColor: String => CallbackTo[TextButton],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[TextButton],
    setDisabled: Boolean => CallbackTo[TextButton],
    setOnClickAction: Action => CallbackTo[TextButton],
    setOnClickOpenLinkAction: Action => CallbackTo[TextButton],
    setOpenLink: OpenLink => CallbackTo[TextButton],
    setText: String => CallbackTo[TextButton],
    setTextButtonStyle: TextButtonStyle => CallbackTo[TextButton]
  ): TextButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setBackgroundColor")(js.Any.fromFunction1((t0: java.lang.String) => setBackgroundColor(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisabled(t0).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.updateDynamic("setTextButtonStyle")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.TextButtonStyle) => setTextButtonStyle(t0).runNow()))
    __obj.asInstanceOf[TextButton]
  }
}

