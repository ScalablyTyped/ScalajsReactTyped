package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder for ActionResponse objects.
  */
trait ActionResponseBuilder extends js.Object {
  def build(): ActionResponse
  def setNavigation(navigation: Navigation): ActionResponseBuilder
  def setNotification(notification: Notification): ActionResponseBuilder
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder
}

object ActionResponseBuilder {
  @scala.inline
  def apply(
    build: CallbackTo[ActionResponse],
    setNavigation: Navigation => CallbackTo[ActionResponseBuilder],
    setNotification: Notification => CallbackTo[ActionResponseBuilder],
    setOpenLink: OpenLink => CallbackTo[ActionResponseBuilder],
    setStateChanged: Boolean => CallbackTo[ActionResponseBuilder]
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setNavigation")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Navigation) => setNavigation(t0).runNow()))
    __obj.updateDynamic("setNotification")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.Notification) => setNotification(t0).runNow()))
    __obj.updateDynamic("setOpenLink")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService.OpenLink) => setOpenLink(t0).runNow()))
    __obj.updateDynamic("setStateChanged")(js.Any.fromFunction1((t0: scala.Boolean) => setStateChanged(t0).runNow()))
    __obj.asInstanceOf[ActionResponseBuilder]
  }
}

