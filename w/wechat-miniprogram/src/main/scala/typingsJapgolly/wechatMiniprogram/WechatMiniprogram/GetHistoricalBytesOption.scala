package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistoricalBytesOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[GetHistoricalBytesCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[GetHistoricalBytesFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetHistoricalBytesSuccessCallback] = js.undefined
}
object GetHistoricalBytesOption {
  
  inline def apply(): GetHistoricalBytesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHistoricalBytesOption]
  }
  
  extension [Self <: GetHistoricalBytesOption](x: Self) {
    
    inline def setComplete(value: /* res */ Nfcrwerror => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Nfcrwerror) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Nfcrwerror => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Nfcrwerror) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* result */ GetHistoricalBytesSuccessCallbackResult => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ GetHistoricalBytesSuccessCallbackResult) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
