package typingsJapgolly.ava

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complete extends StObject {
    
    def complete(): Unit
    
    def error(error: Any): Unit
  }
  object Complete {
    
    inline def apply(complete: Callback, error: Any => Callback): Complete = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn, error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()))
      __obj.asInstanceOf[Complete]
    }
    
    extension [Self <: Complete](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
