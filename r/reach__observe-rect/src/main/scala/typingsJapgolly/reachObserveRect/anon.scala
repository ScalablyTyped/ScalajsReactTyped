package typingsJapgolly.reachObserveRect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Observe extends StObject {
    
    def observe(): Unit
    
    def unobserve(): Unit
  }
  object Observe {
    
    inline def apply(observe: Callback, unobserve: Callback): Observe = {
      val __obj = js.Dynamic.literal(observe = observe.toJsFn, unobserve = unobserve.toJsFn)
      __obj.asInstanceOf[Observe]
    }
    
    extension [Self <: Observe](x: Self) {
      
      inline def setObserve(value: Callback): Self = StObject.set(x, "observe", value.toJsFn)
      
      inline def setUnobserve(value: Callback): Self = StObject.set(x, "unobserve", value.toJsFn)
    }
  }
}
