package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSystemInfoOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.undefined
}
object GetSystemInfoOptions {
  
  inline def apply(): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
  
  extension [Self <: GetSystemInfoOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ SystemInfo => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SystemInfo) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
