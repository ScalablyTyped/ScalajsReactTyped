package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设备-----蓝牙
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: js.Any): Unit
}

object OpenBluetoothAdapterOptions {
  @scala.inline
  def apply(
    success: js.Any => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
}

