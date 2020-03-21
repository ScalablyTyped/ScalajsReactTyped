package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangeOptions extends js.Object {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: js.UndefOr[String] = js.undefined
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
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: js.UndefOr[String] = js.undefined
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: js.UndefOr[Boolean] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ StopBluetoothDevicesDiscoverySuccess, Unit]] = js.undefined
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    characteristicId: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    deviceId: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    serviceId: String = null,
    state: js.UndefOr[Boolean] = js.undefined,
    success: /* result */ StopBluetoothDevicesDiscoverySuccess => Callback = null
  ): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (characteristicId != null) __obj.updateDynamic("characteristicId")(characteristicId.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.StopBluetoothDevicesDiscoverySuccess) => success(t0).runNow()))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
}

