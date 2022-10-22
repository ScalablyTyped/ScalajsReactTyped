package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeWithinRangeMod {
  
  @JSImport("jasmine-expect/dist/toBeWithinRange", "toBeWithinRange")
  @js.native
  val toBeWithinRange: ToBeWithinRange_ = js.native
  
  type ToBeWithinRange_ = js.Function3[
    /* floor */ Double, 
    /* ceiling */ Double, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeWithinRange(floor: Double, ceiling: Double): Boolean
        def toBeWithinRange(floor: Double, ceiling: Double, expectationFailOutput: Any): Boolean
        @JSName("toBeWithinRange")
        var toBeWithinRange_Original: ToBeWithinRange_
      }
      object Matchers {
        
        inline def apply[T](
          toBeWithinRange: (/* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWithinRange = js.Any.fromFunction3(toBeWithinRange))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeWithinRange(
            value: (/* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toBeWithinRange", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
