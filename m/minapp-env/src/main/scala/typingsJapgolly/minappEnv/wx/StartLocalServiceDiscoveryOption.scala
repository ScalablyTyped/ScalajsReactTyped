package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartLocalServiceDiscoveryOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartLocalServiceDiscoveryCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartLocalServiceDiscoveryFailCallback] = js.undefined
  
  /** 要搜索的服务类型 */
  var serviceType: String
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartLocalServiceDiscoverySuccessCallback] = js.undefined
}
object StartLocalServiceDiscoveryOption {
  
  inline def apply(serviceType: String): StartLocalServiceDiscoveryOption = {
    val __obj = js.Dynamic.literal(serviceType = serviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartLocalServiceDiscoveryOption]
  }
  
  extension [Self <: StartLocalServiceDiscoveryOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* result */ StartLocalServiceDiscoveryFailCallbackResult => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* result */ StartLocalServiceDiscoveryFailCallbackResult) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ GeneralCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
