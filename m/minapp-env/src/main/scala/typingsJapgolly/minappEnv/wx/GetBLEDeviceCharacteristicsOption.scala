package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBLEDeviceCharacteristicsCompleteCallback] = js.undefined
  /** 蓝牙设备 id */
  var deviceId: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBLEDeviceCharacteristicsFailCallback] = js.undefined
  /** 蓝牙服务 uuid，需要使用 `getBLEDeviceServices` 获取 */
  var serviceId: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBLEDeviceCharacteristicsSuccessCallback] = js.undefined
}

object GetBLEDeviceCharacteristicsOption {
  @scala.inline
  def apply(
    deviceId: String,
    serviceId: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* result */ GetBLEDeviceCharacteristicsSuccessCallbackResult => Callback = null
  ): GetBLEDeviceCharacteristicsOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.GetBLEDeviceCharacteristicsSuccessCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOption]
  }
}

