package typingsJapgolly.antd.notificationMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationInstance extends js.Object {
  def error(args: ArgsProps): Unit
  def info(args: ArgsProps): Unit
  def open(args: ArgsProps): Unit
  def success(args: ArgsProps): Unit
  def warning(args: ArgsProps): Unit
}

object NotificationInstance {
  @scala.inline
  def apply(
    error: ArgsProps => Callback,
    info: ArgsProps => Callback,
    open: ArgsProps => Callback,
    success: ArgsProps => Callback,
    warning: ArgsProps => Callback
  ): NotificationInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => info(t0).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => open(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => success(t0).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => warning(t0).runNow()))
    __obj.asInstanceOf[NotificationInstance]
  }
}

