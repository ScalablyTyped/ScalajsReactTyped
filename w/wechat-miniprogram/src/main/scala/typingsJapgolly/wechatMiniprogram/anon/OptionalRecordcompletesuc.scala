package typingsJapgolly.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.Optional<std.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
trait OptionalRecordcompletesuc extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
}
object OptionalRecordcompletesuc {
  
  inline def apply(): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
  
  extension [Self <: OptionalRecordcompletesuc](x: Self) {
    
    inline def setComplete(value: /* repeated */ Any => Any): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* repeated */ Any => Any): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* repeated */ Any => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
