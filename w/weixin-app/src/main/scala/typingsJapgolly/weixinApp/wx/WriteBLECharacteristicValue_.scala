package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValue_
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String
  @JSName("complete")
  var complete_WriteBLECharacteristicValue_ : js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  @JSName("fail")
  var fail_WriteBLECharacteristicValue_ : js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: String
  /**
  		 * 蓝牙设备特征值对应的二进制值
  		 */
  var value: scala.scalajs.js.typedarray.ArrayBuffer
  @JSName("success")
  def success_MWriteBLECharacteristicValue_(res: ErrMsgResponse): Unit
}

object WriteBLECharacteristicValue_ {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Callback,
    value: scala.scalajs.js.typedarray.ArrayBuffer,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined
  ): WriteBLECharacteristicValue_ = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.weixinApp.wx.ErrMsgResponse) => success(t0).runNow()))
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    __obj.asInstanceOf[WriteBLECharacteristicValue_]
  }
}

