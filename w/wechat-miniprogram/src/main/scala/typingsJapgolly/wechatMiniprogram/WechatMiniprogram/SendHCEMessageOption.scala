package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendHCEMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SendHCEMessageCompleteCallback] = js.undefined
  
  /** 二进制数据 */
  var data: js.typedarray.ArrayBuffer
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SendHCEMessageFailCallback] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SendHCEMessageSuccessCallback] = js.undefined
}
object SendHCEMessageOption {
  
  inline def apply(data: js.typedarray.ArrayBuffer): SendHCEMessageOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendHCEMessageOption]
  }
  
  extension [Self <: SendHCEMessageOption](x: Self) {
    
    inline def setComplete(value: /* res */ NFCError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ NFCError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* res */ NFCError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ NFCError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ NFCError => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ NFCError) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
