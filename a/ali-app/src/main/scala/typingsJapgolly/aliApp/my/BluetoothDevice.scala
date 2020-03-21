package typingsJapgolly.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
trait BluetoothDevice extends js.Object {
  /**
  		 * 设备信号强度
  		 */
  var RSSI: Double
  /**
  		 * 设备的广播内容
  		 */
  var advertisData: scala.scalajs.js.typedarray.ArrayBuffer
  /**
  		 * 设备的 id
  		 */
  var deviceId: String
  /**
  		 * (兼容旧版本) 值与 name 一致
  		 */
  var deviceName: String
  /**
  		 * 广播设备名称
  		 */
  var localName: String
  /**
  		 * 设备的manufacturerData
  		 */
  var manufacturerData: scala.scalajs.js.typedarray.ArrayBuffer
  /**
  		 * 蓝牙设备名称，某些设备可能没有
  		 */
  var name: String
}

object BluetoothDevice {
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: scala.scalajs.js.typedarray.ArrayBuffer,
    deviceId: String,
    deviceName: String,
    localName: String,
    manufacturerData: scala.scalajs.js.typedarray.ArrayBuffer,
    name: String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothDevice]
  }
}

