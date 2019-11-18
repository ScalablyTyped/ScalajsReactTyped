package typingsJapgolly.antd.libNotificationMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationApi extends js.Object {
  def close(key: String): Unit
  def config(options: ConfigProps): Unit
  def destroy(): Unit
  def error(args: ArgsProps): Unit
  def info(args: ArgsProps): Unit
  def open(args: ArgsProps): Unit
  def success(args: ArgsProps): Unit
  def warn(args: ArgsProps): Unit
  def warning(args: ArgsProps): Unit
}

object NotificationApi {
  @scala.inline
  def apply(
    close: String => Callback,
    config: ConfigProps => Callback,
    destroy: Callback,
    error: ArgsProps => Callback,
    info: ArgsProps => Callback,
    open: ArgsProps => Callback,
    success: ArgsProps => Callback,
    warn: ArgsProps => Callback,
    warning: ArgsProps => Callback
  ): NotificationApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: java.lang.String) => close(t0).runNow()))
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ConfigProps) => config(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => info(t0).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => open(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => success(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => warn(t0).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libNotificationMod.ArgsProps) => warning(t0).runNow()))
    __obj.asInstanceOf[NotificationApi]
  }
}

