package typingsJapgolly.aliApp.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.my.ImageSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ChooseImageOptions> */
trait PartialChooseImageOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.undefined
}
object PartialChooseImageOptions {
  
  inline def apply(): PartialChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseImageOptions]
  }
  
  extension [Self <: PartialChooseImageOptions](x: Self) {
    
    inline def setComplete(value: /* res */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFail(value: /* res */ Any => Callback): Self = StObject.set(x, "fail", js.Any.fromFunction1((t0: /* res */ Any) => value(t0).runNow()))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSourceType(value: js.Array[ImageSourceType]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: ImageSourceType*): Self = StObject.set(x, "sourceType", js.Array(value*))
    
    inline def setSuccess(value: /* res */ ApFilePaths => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ ApFilePaths) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
