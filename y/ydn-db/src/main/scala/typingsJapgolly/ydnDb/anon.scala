package typingsJapgolly.ydnDb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Push extends StObject {
    
    def push(value: Any): Unit
  }
  object Push {
    
    inline def apply(push: Any => Callback): Push = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()))
      __obj.asInstanceOf[Push]
    }
    
    extension [Self <: Push](x: Self) {
      
      inline def setPush(value: Any => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
