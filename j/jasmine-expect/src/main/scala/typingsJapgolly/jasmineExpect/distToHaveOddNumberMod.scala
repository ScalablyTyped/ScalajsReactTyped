package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveOddNumberMod {
  
  @JSImport("jasmine-expect/dist/toHaveOddNumber", "toHaveOddNumber")
  @js.native
  val toHaveOddNumber: ToHaveOddNumber_ = js.native
  
  type ToHaveOddNumber_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveOddNumber(key: String): Boolean
        def toHaveOddNumber(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveOddNumber")
        var toHaveOddNumber_Original: ToHaveOddNumber_
      }
      object Matchers {
        
        inline def apply[T](toHaveOddNumber: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveOddNumber = js.Any.fromFunction2(toHaveOddNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveOddNumber(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveOddNumber", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
