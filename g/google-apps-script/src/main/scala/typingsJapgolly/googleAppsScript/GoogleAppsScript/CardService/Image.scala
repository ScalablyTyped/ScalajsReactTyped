package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A widget that shows a single image.
  *
  *     var image = CardService.newImage().setAltText("A nice image").setImageUrl("https://image.png");
  */
trait Image extends js.Object {
  def setAltText(altText: String): Image
  def setAuthorizationAction(action: AuthorizationAction): Image
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image
  def setImageUrl(url: String): Image
  def setOnClickAction(action: Action): Image
  def setOnClickOpenLinkAction(action: Action): Image
  def setOpenLink(openLink: OpenLink): Image
}

object Image {
  @scala.inline
  def apply(
    setAltText: String => CallbackTo[Image],
    setAuthorizationAction: AuthorizationAction => CallbackTo[Image],
    setComposeAction: (Action, ComposedEmailType) => CallbackTo[Image],
    setImageUrl: String => CallbackTo[Image],
    setOnClickAction: Action => CallbackTo[Image],
    setOnClickOpenLinkAction: Action => CallbackTo[Image],
    setOpenLink: OpenLink => CallbackTo[Image]
  ): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAltText")(js.Any.fromFunction1((t0: java.lang.String) => setAltText(t0).runNow()))
    __obj.updateDynamic("setAuthorizationAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.AuthorizationAction) => setAuthorizationAction(t0).runNow()))
    __obj.updateDynamic("setComposeAction")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.ComposedEmailType) => setComposeAction(t0, t1).runNow()))
    __obj.updateDynamic("setImageUrl")(js.Any.fromFunction1((t0: java.lang.String) => setImageUrl(t0).runNow()))
    __obj.updateDynamic("setOnClickAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickAction(t0).runNow()))
    __obj.updateDynamic("setOnClickOpenLinkAction")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Action) => setOnClickOpenLinkAction(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.asInstanceOf[Image]
  }
}

