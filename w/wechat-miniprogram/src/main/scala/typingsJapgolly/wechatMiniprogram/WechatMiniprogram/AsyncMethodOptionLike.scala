package typingsJapgolly.wechatMiniprogram.WechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncMethodOptionLike extends StObject {
  
  var success: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
}
object AsyncMethodOptionLike {
  
  inline def apply(): AsyncMethodOptionLike = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncMethodOptionLike]
  }
  
  extension [Self <: AsyncMethodOptionLike](x: Self) {
    
    inline def setSuccess(value: /* repeated */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
