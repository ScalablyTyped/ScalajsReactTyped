package typingsJapgolly.randomJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type Distribution[T] = js.Function1[/* engine */ Engine, T]
  
  trait Engine extends StObject {
    
    def next(): Double
  }
  object Engine {
    
    inline def apply(next: CallbackTo[Double]): Engine = {
      val __obj = js.Dynamic.literal(next = next.toJsFn)
      __obj.asInstanceOf[Engine]
    }
    
    extension [Self <: Engine](x: Self) {
      
      inline def setNext(value: CallbackTo[Double]): Self = StObject.set(x, "next", value.toJsFn)
    }
  }
  
  type StringDistribution = js.Function2[/* engine */ Engine, /* length */ Double, String]
}
