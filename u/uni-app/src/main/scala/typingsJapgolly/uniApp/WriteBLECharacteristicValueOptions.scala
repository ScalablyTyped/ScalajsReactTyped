package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValueOptions extends js.Object {
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
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ StopBluetoothDevicesDiscoverySuccess, Unit]] = js.undefined
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object WriteBLECharacteristicValueOptions {
  @scala.inline
  def apply(
    characteristicId: String = null,
    complete: js.UndefOr[Callback] = js.undefined,
    deviceId: String = null,
    fail: js.UndefOr[Callback] = js.undefined,
    serviceId: String = null,
    success: /* result */ StopBluetoothDevicesDiscoverySuccess => Callback = null,
    value: js.Array[_] = null
  ): WriteBLECharacteristicValueOptions = {
    val __obj = js.Dynamic.literal()
    if (characteristicId != null) __obj.updateDynamic("characteristicId")(characteristicId.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.StopBluetoothDevicesDiscoverySuccess) => success(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValueOptions]
  }
}

