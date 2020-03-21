package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an action to open a link with some options.
  *
  *     // A button that opens as a link in an overlay and
  *     // requires a reload when closed.
  *     var button = CardService.newTextButton()
  *         .setText("This button opens a link in an overlay window")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com")
  *             .setOpenAs(CardService.OpenAs.OVERLAY)
  *             .setOnClose(CardService.OnClose.RELOAD_ADD_ON));
  *
  *     // An action response that opens a link in full screen and
  *     // requires no action when closed.
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com")
  *             .setOpenAs(CardService.OpenAs.FULL_SIZE)
  *             .setOnClose(CardService.OnClose.NOTHING));
  *         .build();
  */
trait OpenLink extends js.Object {
  def setOnClose(onClose: OnClose): OpenLink
  def setOpenAs(openAs: OpenAs): OpenLink
  def setUrl(url: String): OpenLink
}

object OpenLink {
  @scala.inline
  def apply(
    setOnClose: OnClose => CallbackTo[OpenLink],
    setOpenAs: OpenAs => CallbackTo[OpenLink],
    setUrl: String => CallbackTo[OpenLink]
  ): OpenLink = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setOnClose")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OnClose) => setOnClose(t0).runNow()))
    __obj.updateDynamic("setOpenAs")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenAs) => setOpenAs(t0).runNow()))
    __obj.updateDynamic("setUrl")(js.Any.fromFunction1((t0: java.lang.String) => setUrl(t0).runNow()))
    __obj.asInstanceOf[OpenLink]
  }
}

