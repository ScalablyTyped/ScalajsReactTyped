package typingsJapgolly.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceId extends StObject {
  
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
  var value: js.typedarray.ArrayBuffer
}
object DeviceId {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String, value: js.typedarray.ArrayBuffer): DeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceId]
  }
  
  extension [Self <: DeviceId](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
