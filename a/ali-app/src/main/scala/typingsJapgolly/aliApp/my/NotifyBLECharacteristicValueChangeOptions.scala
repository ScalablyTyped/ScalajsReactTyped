package typingsJapgolly.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyBLECharacteristicValueChangeOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
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
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
  
  extension [Self <: NotifyBLECharacteristicValueChangeOptions](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setDescriptorId(value: String): Self = StObject.set(x, "descriptorId", value.asInstanceOf[js.Any])
    
    inline def setDescriptorIdUndefined: Self = StObject.set(x, "descriptorId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
