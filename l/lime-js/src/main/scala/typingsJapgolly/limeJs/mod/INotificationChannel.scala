package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotificationChannel extends js.Object {
  def onNotification(notification: Notification): js.Any
  def sendNotification(notification: Notification): Unit
}

object INotificationChannel {
  @scala.inline
  def apply(onNotification: Notification => CallbackTo[js.Any], sendNotification: Notification => Callback): INotificationChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onNotification")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Notification) => onNotification(t0).runNow()))
    __obj.updateDynamic("sendNotification")(js.Any.fromFunction1((t0: typingsJapgolly.limeJs.mod.Notification) => sendNotification(t0).runNow()))
    __obj.asInstanceOf[INotificationChannel]
  }
}

