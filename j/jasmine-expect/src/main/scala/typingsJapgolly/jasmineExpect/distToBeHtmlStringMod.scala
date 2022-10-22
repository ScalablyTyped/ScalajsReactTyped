package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeHtmlStringMod {
  
  @JSImport("jasmine-expect/dist/toBeHtmlString", "toBeHtmlString")
  @js.native
  val toBeHtmlString: ToBeHtmlString_ = js.native
  
  type ToBeHtmlString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeHtmlString(): Boolean
        def toBeHtmlString(expectationFailOutput: Any): Boolean
        @JSName("toBeHtmlString")
        var toBeHtmlString_Original: ToBeHtmlString_
      }
      object Matchers {
        
        inline def apply[T](toBeHtmlString: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeHtmlString = js.Any.fromFunction1(toBeHtmlString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeHtmlString(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeHtmlString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
