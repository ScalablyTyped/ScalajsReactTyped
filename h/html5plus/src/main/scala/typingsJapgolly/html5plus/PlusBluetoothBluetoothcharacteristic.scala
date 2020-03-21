package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备特征值
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothcharacteristic extends js.Object {
  /**
    * 设备特征值支持的操作类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var properties: js.UndefOr[PlusBluetoothBluetoothcharacteristicProperties] = js.undefined
  /**
    * 蓝牙设备特征值的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object PlusBluetoothBluetoothcharacteristic {
  @scala.inline
  def apply(properties: PlusBluetoothBluetoothcharacteristicProperties = null, uuid: String = null): PlusBluetoothBluetoothcharacteristic = {
    val __obj = js.Dynamic.literal()
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusBluetoothBluetoothcharacteristic]
  }
}

