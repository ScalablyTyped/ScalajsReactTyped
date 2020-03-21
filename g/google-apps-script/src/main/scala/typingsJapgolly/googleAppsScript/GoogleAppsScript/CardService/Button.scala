package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A base class for all buttons.
  */
trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button
  def setOnClickAction(action: Action): Button
  def setOnClickOpenLinkAction(action: Action): Button
  def setOpenLink(openLink: OpenLink): Button
}

object Button {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CallbackTo[Button],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[Button],
    setOnClickAction: Action => CallbackTo[Button],
    setOnClickOpenLinkAction: Action => CallbackTo[Button],
    setOpenLink: OpenLink => CallbackTo[Button]
  ): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.asInstanceOf[Button]
  }
}

