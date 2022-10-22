package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions[R, E] extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, Unit]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, Unit]] = js.undefined
}
object BaseOptions {
  
  inline def apply[R, E](): BaseOptions[R, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions[R, E]]
  }
  
  extension [Self <: BaseOptions[?, ?], R, E](x: Self & (BaseOptions[R, E])) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ E => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ E) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ R => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ R) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
