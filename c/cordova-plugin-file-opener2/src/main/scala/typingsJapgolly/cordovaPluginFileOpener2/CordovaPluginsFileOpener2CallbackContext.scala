package typingsJapgolly.cordovaPluginFileOpener2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPluginsFileOpener2CallbackContext extends StObject {
  
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CordovaPluginsFileOpener2CallbackContext {
  
  inline def apply(): CordovaPluginsFileOpener2CallbackContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CordovaPluginsFileOpener2CallbackContext]
  }
  
  extension [Self <: CordovaPluginsFileOpener2CallbackContext](x: Self) {
    
    inline def setError(value: /* error */ CordovaPluginsFileOpener2Result => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ CordovaPluginsFileOpener2Result) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: Callback): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
