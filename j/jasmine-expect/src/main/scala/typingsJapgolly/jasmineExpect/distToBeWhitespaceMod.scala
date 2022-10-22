package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeWhitespaceMod {
  
  @JSImport("jasmine-expect/dist/toBeWhitespace", "toBeWhitespace")
  @js.native
  val toBeWhitespace: ToBeWhitespace_ = js.native
  
  type ToBeWhitespace_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeWhitespace(): Boolean
        def toBeWhitespace(expectationFailOutput: Any): Boolean
        @JSName("toBeWhitespace")
        var toBeWhitespace_Original: ToBeWhitespace_
      }
      object Matchers {
        
        inline def apply[T](toBeWhitespace: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWhitespace = js.Any.fromFunction1(toBeWhitespace))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeWhitespace(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeWhitespace", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
