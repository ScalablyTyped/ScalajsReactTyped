package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeLessThanOrEqualToMod {
  
  @JSImport("jasmine-expect/dist/toBeLessThanOrEqualTo", "toBeLessThanOrEqualTo")
  @js.native
  val toBeLessThanOrEqualTo: ToBeLessThanOrEqualTo_ = js.native
  
  type ToBeLessThanOrEqualTo_ = js.Function2[/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeLessThanOrEqualTo(otherNumber: Double): Boolean
        def toBeLessThanOrEqualTo(otherNumber: Double, expectationFailOutput: Any): Boolean
        @JSName("toBeLessThanOrEqualTo")
        var toBeLessThanOrEqualTo_Original: ToBeLessThanOrEqualTo_
      }
      object Matchers {
        
        inline def apply[T](
          toBeLessThanOrEqualTo: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeLessThanOrEqualTo = js.Any.fromFunction2(toBeLessThanOrEqualTo))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeLessThanOrEqualTo(value: (/* otherNumber */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeLessThanOrEqualTo", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
