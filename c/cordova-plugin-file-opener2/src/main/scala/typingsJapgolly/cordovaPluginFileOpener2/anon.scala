package typingsJapgolly.cordovaPluginFileOpener2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
    
    var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: /* error */ CordovaPluginsFileOpener2Result => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ CordovaPluginsFileOpener2Result) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccess(value: /* result */ CordovaPluginsFileOpener2Result => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* result */ CordovaPluginsFileOpener2Result) => value(t0).runNow()))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
