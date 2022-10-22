package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveArrayOfNumbersMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfNumbers", "toHaveArrayOfNumbers")
  @js.native
  val toHaveArrayOfNumbers: ToHaveArrayOfNumbers_ = js.native
  
  type ToHaveArrayOfNumbers_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveArrayOfNumbers(key: String): Boolean
        def toHaveArrayOfNumbers(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveArrayOfNumbers")
        var toHaveArrayOfNumbers_Original: ToHaveArrayOfNumbers_
      }
      object Matchers {
        
        inline def apply[T](toHaveArrayOfNumbers: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfNumbers = js.Any.fromFunction2(toHaveArrayOfNumbers))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArrayOfNumbers(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveArrayOfNumbers", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
