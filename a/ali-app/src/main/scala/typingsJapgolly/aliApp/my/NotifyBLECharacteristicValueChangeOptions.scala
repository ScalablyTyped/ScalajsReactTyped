package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String
  /**
  		 * notify 的 descriptor 的 uuid （只有android 会用到，非必填，默认值00002902-0000-10008000-00805f9b34fb）
  		 */
  var descriptorId: js.UndefOr[String] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  /**
  		 * 蓝牙特征值对应 service 的 uuid
  		 */
  var serviceId: String
  /**
  		 * 是否启用notify或indicate
  		 */
  var state: js.UndefOr[Boolean] = js.undefined
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    complete: /* res */ js.Any => Callback = null,
    descriptorId: String = null,
    fail: js.Any => Callback = null,
    state: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Callback = null
  ): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (descriptorId != null) __obj.updateDynamic("descriptorId")(descriptorId.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
}

