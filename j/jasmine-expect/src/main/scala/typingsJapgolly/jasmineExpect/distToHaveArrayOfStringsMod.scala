package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveArrayOfStringsMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfStrings", "toHaveArrayOfStrings")
  @js.native
  val toHaveArrayOfStrings: ToHaveArrayOfStrings_ = js.native
  
  type ToHaveArrayOfStrings_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveArrayOfStrings(key: String): Boolean
        def toHaveArrayOfStrings(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveArrayOfStrings")
        var toHaveArrayOfStrings_Original: ToHaveArrayOfStrings_
      }
      object Matchers {
        
        inline def apply[T](toHaveArrayOfStrings: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfStrings = js.Any.fromFunction2(toHaveArrayOfStrings))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArrayOfStrings(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveArrayOfStrings", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
