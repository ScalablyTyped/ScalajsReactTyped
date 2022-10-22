package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceCharacteristicsOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBLEDeviceCharacteristicsCompleteCallback] = js.undefined
  
  /** 蓝牙设备 id */
  var deviceId: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBLEDeviceCharacteristicsFailCallback] = js.undefined
  
  /** 蓝牙服务 uuid，需要使用 `getBLEDeviceServices` 获取 */
  var serviceId: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBLEDeviceCharacteristicsSuccessCallback] = js.undefined
}
object GetBLEDeviceCharacteristicsOption {
  
  inline def apply(deviceId: String, serviceId: String): GetBLEDeviceCharacteristicsOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOption]
  }
  
  extension [Self <: GetBLEDeviceCharacteristicsOption](x: Self) {
    
    inline def setComplete(value: /* res */ BluetoothError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ BluetoothError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ BluetoothError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ BluetoothError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* result */ GetBLEDeviceCharacteristicsSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetBLEDeviceCharacteristicsSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
