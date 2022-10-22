package typingsJapgolly.workerpool

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(payload: Any): Unit
  }
  object On {
    
    inline def apply(on: Any => Callback): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction1((t0: Any) => on(t0).runNow()))
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setOn(value: Any => Callback): Self = StObject.set(x, "on", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
