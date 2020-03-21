package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.devicesArrayBluetoothDevi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  var services: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    success: devicesArrayBluetoothDevi => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    services: js.Array[String] = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.devicesArrayBluetoothDevi) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

