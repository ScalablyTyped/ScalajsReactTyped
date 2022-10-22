package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDiscoveryOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartDiscoveryCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartDiscoveryFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartDiscoverySuccessCallback] = js.undefined
}
object StartDiscoveryOption {
  
  inline def apply(): StartDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDiscoveryOption]
  }
  
  extension [Self <: StartDiscoveryOption](x: Self) {
    
    inline def setComplete(value: /* res */ Nfcrwerror => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Nfcrwerror) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Nfcrwerror => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Nfcrwerror) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ Nfcrwerror => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Nfcrwerror) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
