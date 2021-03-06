package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceServicesOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ GetBLEDeviceServicesSuccess, Unit]] = js.undefined
}

object GetBLEDeviceServicesOptions {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    deviceId: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* result */ GetBLEDeviceServicesSuccess => Callback = null
  ): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GetBLEDeviceServicesSuccess) => success(t0).runNow()))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
}

