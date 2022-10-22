package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveWhitespaceStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveWhitespaceString", "toHaveWhitespaceString")
  @js.native
  val toHaveWhitespaceString: ToHaveWhitespaceString_ = js.native
  
  type ToHaveWhitespaceString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveWhitespaceString(key: String): Boolean
        def toHaveWhitespaceString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveWhitespaceString")
        var toHaveWhitespaceString_Original: ToHaveWhitespaceString_
      }
      object Matchers {
        
        inline def apply[T](toHaveWhitespaceString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveWhitespaceString = js.Any.fromFunction2(toHaveWhitespaceString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveWhitespaceString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveWhitespaceString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
