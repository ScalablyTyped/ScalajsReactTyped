package typingsJapgolly.antd.notificationMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationApi extends NotificationInstance {
  def close(key: String): Unit
  def config(options: ConfigProps): Unit
  def destroy(): Unit
  def useNotification(): js.Tuple2[NotificationInstance, Element]
  def warn(args: ArgsProps): Unit
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
    useNotification: CallbackTo[js.Tuple2[NotificationInstance, Element]],
    warn: ArgsProps => Callback,
    warning: ArgsProps => Callback
  ): NotificationApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(js.Any.fromFunction1((t0: java.lang.String) => close(t0).runNow()))
    __obj.updateDynamic("config")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ConfigProps) => config(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => info(t0).runNow()))
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => open(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => success(t0).runNow()))
    __obj.updateDynamic("useNotification")(useNotification.toJsFn)
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => warn(t0).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction1((t0: typingsJapgolly.antd.notificationMod.ArgsProps) => warning(t0).runNow()))
    __obj.asInstanceOf[NotificationApi]
  }
}

