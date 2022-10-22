package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 公共回调函数
  */
trait CommonCallbackOptions extends StObject {
  
  //  接口调用结束的回调函数
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  
  //  接口调用失败回调函数
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  
  //  接口调用成功回调函数
  var success: js.UndefOr[ResponseCallback] = js.undefined
}
object CommonCallbackOptions {
  
  inline def apply(): CommonCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCallbackOptions]
  }
  
  extension [Self <: CommonCallbackOptions](x: Self) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
