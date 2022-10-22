package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeGreaterThanOrEqualToMod {
  
  @JSImport("jasmine-expect/dist/toBeGreaterThanOrEqualTo", "toBeGreaterThanOrEqualTo")
  @js.native
  val toBeGreaterThanOrEqualTo: ToBeGreaterThanOrEqualTo_ = js.native
  
  type ToBeGreaterThanOrEqualTo_ = js.Function2[/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeGreaterThanOrEqualTo(otherNumber: Double): Boolean
        def toBeGreaterThanOrEqualTo(otherNumber: Double, expectationFailOutput: Any): Boolean
        @JSName("toBeGreaterThanOrEqualTo")
        var toBeGreaterThanOrEqualTo_Original: ToBeGreaterThanOrEqualTo_
      }
      object Matchers {
        
        inline def apply[T](
          toBeGreaterThanOrEqualTo: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeGreaterThanOrEqualTo = js.Any.fromFunction2(toBeGreaterThanOrEqualTo))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeGreaterThanOrEqualTo(value: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeGreaterThanOrEqualTo", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
