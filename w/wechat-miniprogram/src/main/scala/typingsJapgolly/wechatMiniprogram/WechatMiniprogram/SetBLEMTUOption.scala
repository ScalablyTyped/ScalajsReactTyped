package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetBLEMTUOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetBLEMTUCompleteCallback] = js.undefined
  
  /** 用于区分设备的 id */
  var deviceId: String
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetBLEMTUFailCallback] = js.undefined
  
  /** 最大传输单元(22,512) 区间内，单位 bytes */
  var mtu: Double
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetBLEMTUSuccessCallback] = js.undefined
}
object SetBLEMTUOption {
  
  inline def apply(deviceId: String, mtu: Double): SetBLEMTUOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], mtu = mtu.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBLEMTUOption]
  }
  
  extension [Self <: SetBLEMTUOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setMtu(value: Double): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
