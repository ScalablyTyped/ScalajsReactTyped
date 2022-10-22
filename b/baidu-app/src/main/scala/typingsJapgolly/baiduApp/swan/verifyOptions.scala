package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait verifyOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_verifyOptions: js.UndefOr[js.Function1[/* res */ verifyTask, Unit]] = js.undefined
}
object verifyOptions {
  
  inline def apply(): verifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[verifyOptions]
  }
  
  extension [Self <: verifyOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ verifyTask => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* res */ verifyTask) => value(t0).runNow()))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
