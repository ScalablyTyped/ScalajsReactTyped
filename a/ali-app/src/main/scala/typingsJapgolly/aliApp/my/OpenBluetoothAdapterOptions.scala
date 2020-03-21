package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonIsSupportBLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 快速接入 https://docs.alipay.com/mini/api/bluetooth-intro
//#endregion
//#region API https://docs.alipay.com/mini/api/bluetooth-api
trait OpenBluetoothAdapterOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 不传的话默认是true，表示是否在离开当前页面时自动断开蓝牙(仅对android有效) */
  var autoClose: Boolean
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: AnonIsSupportBLE): Unit
}

object OpenBluetoothAdapterOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    success: AnonIsSupportBLE => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.AnonIsSupportBLE) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
}

