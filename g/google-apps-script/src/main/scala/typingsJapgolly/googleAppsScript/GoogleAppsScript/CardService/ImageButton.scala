package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ImageButton with an image displayed on it.
  *
  *     var imageButton = CardService.newImageButton()
  *         .setAltText("An image button with an airplane icon.")
  *         .setIcon(CardService.Icon.AIRPLANE)
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://airplane.com"));
  */
trait ImageButton extends js.Object {
  def setAltText(altText: String): ImageButton
  def setAuthorizationAction(action: AuthorizationAction): ImageButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): ImageButton
  def setIcon(icon: Icon): ImageButton
  def setIconUrl(url: String): ImageButton
  def setOnClickAction(action: Action): ImageButton
  def setOnClickOpenLinkAction(action: Action): ImageButton
  def setOpenLink(openLink: OpenLink): ImageButton
}

object ImageButton {
  @scala.inline
  def apply(
    setAltText: String => CallbackTo[ImageButton],
    setAuthorizationAction: AuthorizationAction => CallbackTo[ImageButton],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[ImageButton],
    setIcon: Icon => CallbackTo[ImageButton],
    setIconUrl: String => CallbackTo[ImageButton],
    setOnClickAction: Action => CallbackTo[ImageButton],
    setOnClickOpenLinkAction: Action => CallbackTo[ImageButton],
    setOpenLink: OpenLink => CallbackTo[ImageButton]
  ): ImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAltText")(js.Any.fromFunction1((t0: java.lang.String) => setAltText(t0).runNow()))
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Icon) => setIcon(t0).runNow()))
    __obj.updateDynamic("setIconUrl")(js.Any.fromFunction1((t0: java.lang.String) => setIconUrl(t0).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.asInstanceOf[ImageButton]
  }
}

