package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveArrayOfBooleansMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfBooleans", "toHaveArrayOfBooleans")
  @js.native
  val toHaveArrayOfBooleans: ToHaveArrayOfBooleans_ = js.native
  
  type ToHaveArrayOfBooleans_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveArrayOfBooleans(key: String): Boolean
        def toHaveArrayOfBooleans(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveArrayOfBooleans")
        var toHaveArrayOfBooleans_Original: ToHaveArrayOfBooleans_
      }
      object Matchers {
        
        inline def apply[T](toHaveArrayOfBooleans: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfBooleans = js.Any.fromFunction2(toHaveArrayOfBooleans))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArrayOfBooleans(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveArrayOfBooleans", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
