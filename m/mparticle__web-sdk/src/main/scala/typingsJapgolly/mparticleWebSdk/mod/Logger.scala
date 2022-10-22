package typingsJapgolly.mparticleWebSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var error: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var verbose: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  
  var warning: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
}
object Logger {
  
  inline def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setError(value: /* error */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setVerbose(value: /* error */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWarning(value: /* error */ String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "warning", js.Any.fromFunction1((t0: /* error */ String) => value(t0).runNow()))
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
