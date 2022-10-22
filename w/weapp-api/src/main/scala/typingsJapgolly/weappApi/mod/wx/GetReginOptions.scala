package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReginOptions
  extends StObject
     with CommonCallbackOptions {
  
  @JSName("success")
  var success_GetReginOptions: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit], Unit]
  ] = js.undefined
}
object GetReginOptions {
  
  inline def apply(): GetReginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReginOptions]
  }
  
  extension [Self <: GetReginOptions](x: Self) {
    
    inline def setSuccess(value: /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit]) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
