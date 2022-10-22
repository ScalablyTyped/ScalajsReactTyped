package typingsJapgolly.websocketAsync

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reject extends StObject {
    
    def reject(reason: Any): Unit
    
    def resolve(data: Any): Unit
  }
  object Reject {
    
    inline def apply(reject: Any => Callback, resolve: Any => Callback): Reject = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1((t0: Any) => reject(t0).runNow()), resolve = js.Any.fromFunction1((t0: Any) => resolve(t0).runNow()))
      __obj.asInstanceOf[Reject]
    }
    
    extension [Self <: Reject](x: Self) {
      
      inline def setReject(value: Any => Callback): Self = StObject.set(x, "reject", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setResolve(value: Any => Callback): Self = StObject.set(x, "resolve", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
