package typingsJapgolly.wechatMiniprogram

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAPIParam[T] extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* val */ T | IAPIError, Unit]] = js.undefined
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* err */ IAPIError, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}
object IAPIParam {
  
  inline def apply[T](): IAPIParam[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAPIParam[T]]
  }
  
  extension [Self <: IAPIParam[?], T](x: Self & IAPIParam[T]) {
    
    inline def setComplete(value: /* val */ T | IAPIError => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* val */ T | IAPIError) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setFail(value: /* err */ IAPIError => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* err */ IAPIError) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* res */ T => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ T) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
