package typingsJapgolly.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeviceId extends js.Object {
  /**
  				 * 特征值 uuid
  				 */
  var characteristicId: String
  /**
  				 * 蓝牙设备 id，参考 device 对象
  				 */
  var deviceId: String
  /**
  				 * 特征值所属服务 uuid
  				 */
  var serviceId: String
  /**
  				 * 特征值最新的值
  				 */
  var value: scala.scalajs.js.typedarray.ArrayBuffer
}

object AnonDeviceId {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    value: scala.scalajs.js.typedarray.ArrayBuffer
  ): AnonDeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeviceId]
  }
}

