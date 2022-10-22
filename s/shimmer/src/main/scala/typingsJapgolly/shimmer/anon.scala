package typingsJapgolly.shimmer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Logger extends StObject {
    
    var logger: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  }
  object Logger {
    
    inline def apply(): Logger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setLogger(value: /* msg */ String => Callback): Self = StObject.set(x, "logger", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
