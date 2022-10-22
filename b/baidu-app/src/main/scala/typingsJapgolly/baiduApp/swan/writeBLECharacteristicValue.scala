package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteBLECharacteristicValue
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): Unit
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: js.typedarray.ArrayBuffer
}
object WriteBLECharacteristicValue {
  
  inline def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Callback,
    value: js.typedarray.ArrayBuffer
  ): WriteBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1((t0: ErrMsgResponse) => success(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValue]
  }
  
  extension [Self <: WriteBLECharacteristicValue](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: Callback): Self = StObject.set(x, "fail", value.toJsFn)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ErrMsgResponse => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: ErrMsgResponse) => value(t0).runNow()))
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
