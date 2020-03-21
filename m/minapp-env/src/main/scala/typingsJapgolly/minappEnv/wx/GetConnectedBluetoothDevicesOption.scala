package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetConnectedBluetoothDevicesCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetConnectedBluetoothDevicesFailCallback] = js.undefined
  /** 蓝牙设备主 service 的 uuid 列表 */
  var services: Array[String]
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetConnectedBluetoothDevicesSuccessCallback] = js.undefined
}

object GetConnectedBluetoothDevicesOption {
  @scala.inline
  def apply(
    services: Array[String],
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* result */ GetConnectedBluetoothDevicesSuccessCallbackResult => Callback = null
  ): GetConnectedBluetoothDevicesOption = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.GetConnectedBluetoothDevicesSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOption]
  }
}

