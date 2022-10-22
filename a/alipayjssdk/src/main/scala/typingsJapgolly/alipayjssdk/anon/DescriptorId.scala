package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptorId extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** notify 的 descriptor 的 uuid */
  var descriptorId: js.UndefOr[String] = js.undefined
  
  /** 蓝牙设备 id，参考 device 对象 */
  var deviceId: String
  
  /** 蓝牙特征值对应 service 的 uuid */
  var serviceId: String
  
  /** 是否启用notify或indicate */
  var state: js.UndefOr[String] = js.undefined
}
object DescriptorId {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String): DescriptorId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptorId]
  }
  
  extension [Self <: DescriptorId](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDescriptorId(value: String): Self = StObject.set(x, "descriptorId", value.asInstanceOf[js.Any])
    
    inline def setDescriptorIdUndefined: Self = StObject.set(x, "descriptorId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
