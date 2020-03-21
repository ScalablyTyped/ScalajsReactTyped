package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookApi.notificationsMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddNotification extends js.Object {
  def addNotification(notification: Notification): Unit
  def clearNotification(id: String): Unit
}

object AnonAddNotification {
  @scala.inline
  def apply(addNotification: Notification => Callback, clearNotification: String => Callback): AnonAddNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNotification")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.notificationsMod.Notification) => addNotification(t0).runNow()))
    __obj.updateDynamic("clearNotification")(js.Any.fromFunction1((t0: java.lang.String) => clearNotification(t0).runNow()))
    __obj.asInstanceOf[AnonAddNotification]
  }
}

