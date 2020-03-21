package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.Array
import typingsJapgolly.minappEnv.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** uuid 对应的的已连接设备列表 */
trait GetBluetoothDevicesSuccessCallbackResultBlueToothDevice extends js.Object {
  /** 当前蓝牙设备的信号强度 */
  var RSSI: Double
  /** 当前蓝牙设备的广播数据段中的 ManufacturerData 数据段。 */
  var advertisData: ArrayBuffer
  /** 当前蓝牙设备的广播数据段中的 ServiceUUIDs 数据段 */
  var advertisServiceUUIDs: Array[String]
  /** 用于区分设备的 id */
  var deviceId: String
  /** 当前蓝牙设备的广播数据段中的 LocalName 数据段 */
  var localName: String
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String
  /** 当前蓝牙设备的广播数据段中的 ServiceData 数据段 */
  var serviceData: js.Object
}

object GetBluetoothDevicesSuccessCallbackResultBlueToothDevice {
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: ArrayBuffer,
    advertisServiceUUIDs: Array[String],
    deviceId: String,
    localName: String,
    name: String,
    serviceData: js.Object
  ): GetBluetoothDevicesSuccessCallbackResultBlueToothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], advertisServiceUUIDs = advertisServiceUUIDs.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBluetoothDevicesSuccessCallbackResultBlueToothDevice]
  }
}

