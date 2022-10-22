package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetBLEDeviceServicesCompleteCallback] = js.undefined
  
  /** 蓝牙设备 id */
  var deviceId: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetBLEDeviceServicesFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBLEDeviceServicesSuccessCallback] = js.undefined
}
object GetBLEDeviceServicesOption {
  
  inline def apply(deviceId: String): GetBLEDeviceServicesOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBLEDeviceServicesOption]
  }
  
  extension [Self <: GetBLEDeviceServicesOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetBLEDeviceServicesSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetBLEDeviceServicesSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
