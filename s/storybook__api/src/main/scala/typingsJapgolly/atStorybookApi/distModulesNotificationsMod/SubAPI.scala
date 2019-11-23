package typingsJapgolly.atStorybookApi.distModulesNotificationsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def addNotification(notification: Notification): Unit
  def clearNotification(id: String): Unit
}

object SubAPI {
  @scala.inline
  def apply(addNotification: Notification => Callback, clearNotification: String => Callback): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNotification")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesNotificationsMod.Notification) => addNotification(t0).runNow()))
    __obj.updateDynamic("clearNotification")(js.Any.fromFunction1((t0: java.lang.String) => clearNotification(t0).runNow()))
    __obj.asInstanceOf[SubAPI]
  }
}

