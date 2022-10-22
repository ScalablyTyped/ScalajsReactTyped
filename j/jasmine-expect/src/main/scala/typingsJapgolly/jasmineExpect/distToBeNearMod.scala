package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeNearMod {
  
  @JSImport("jasmine-expect/dist/toBeNear", "toBeNear")
  @js.native
  val toBeNear: ToBeNear_ = js.native
  
  type ToBeNear_ = js.Function3[
    /* value */ Double, 
    /* epsilon */ Double, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeNear(value: Double, epsilon: Double): Boolean
        def toBeNear(value: Double, epsilon: Double, expectationFailOutput: Any): Boolean
        @JSName("toBeNear")
        var toBeNear_Original: ToBeNear_
      }
      object Matchers {
        
        inline def apply[T](
          toBeNear: (/* value */ Double, /* epsilon */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNear = js.Any.fromFunction3(toBeNear))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeNear(
            value: (/* value */ Double, /* epsilon */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toBeNear", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
