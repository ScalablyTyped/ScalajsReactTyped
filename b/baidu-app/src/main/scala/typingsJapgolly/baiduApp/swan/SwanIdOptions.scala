package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwanIdOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_SwanIdOptions: js.UndefOr[js.Function1[/* res */ SwanIdTask, Unit]] = js.undefined
}
object SwanIdOptions {
  
  inline def apply(): SwanIdOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwanIdOptions]
  }
  
  extension [Self <: SwanIdOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ SwanIdTask => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ SwanIdTask) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
