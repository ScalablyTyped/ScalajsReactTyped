package typingsJapgolly.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
trait BluetoothDevice extends js.Object {
  /**
  		 * int 当前蓝牙设备的信号强度
  		 */
  var RSSI: Double
  /**
  		 * 当前蓝牙设备的广播内容
  		 */
  var advertisData: scala.scalajs.js.typedarray.ArrayBuffer
  /**
  		 * 用于区分设备的 id
  		 */
  var deviceId: String
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
    name: String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothDevice]
  }
}

