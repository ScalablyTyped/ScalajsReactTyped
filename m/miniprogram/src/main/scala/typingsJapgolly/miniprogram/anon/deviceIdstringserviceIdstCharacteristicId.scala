package typingsJapgolly.miniprogram.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.miniprogram.AsyncCallbackFailObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  deviceId :string,   serviceId :string,   characteristicId :string,   descriptorId :string | undefined,   state :boolean | undefined} & miniprogram.AsyncCallback<any> */
trait deviceIdstringserviceIdstCharacteristicId extends StObject {
  
  var characteristicId: String
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var descriptorId: js.UndefOr[String] = js.undefined
  
  var deviceId: String
  
  var fail: js.UndefOr[js.Function1[/* err */ AsyncCallbackFailObject, Unit]] = js.undefined
  
  var serviceId: String
  
  var state: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
}
object deviceIdstringserviceIdstCharacteristicId {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String): deviceIdstringserviceIdstCharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[deviceIdstringserviceIdstCharacteristicId]
  }
  
  extension [Self <: deviceIdstringserviceIdstCharacteristicId](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDescriptorId(value: String): Self = StObject.set(x, "descriptorId", value.asInstanceOf[js.Any])
    
    inline def setDescriptorIdUndefined: Self = StObject.set(x, "descriptorId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* err */ AsyncCallbackFailObject => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* err */ AsyncCallbackFailObject) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setState(value: Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuccess(value: /* res */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
