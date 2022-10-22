package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveNumberWithinRangeMod {
  
  @JSImport("jasmine-expect/dist/toHaveNumberWithinRange", "toHaveNumberWithinRange")
  @js.native
  val toHaveNumberWithinRange: ToHaveNumberWithinRange_ = js.native
  
  type ToHaveNumberWithinRange_ = js.Function4[
    /* key */ String, 
    /* floor */ Double, 
    /* ceiling */ Double, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveNumberWithinRange(key: String, floor: Double, ceiling: Double): Boolean
        def toHaveNumberWithinRange(key: String, floor: Double, ceiling: Double, expectationFailOutput: Any): Boolean
        @JSName("toHaveNumberWithinRange")
        var toHaveNumberWithinRange_Original: ToHaveNumberWithinRange_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveNumberWithinRange: (/* key */ String, /* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNumberWithinRange = js.Any.fromFunction4(toHaveNumberWithinRange))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveNumberWithinRange(
            value: (/* key */ String, /* floor */ Double, /* ceiling */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveNumberWithinRange", js.Any.fromFunction4(value))
        }
      }
    }
  }
}
