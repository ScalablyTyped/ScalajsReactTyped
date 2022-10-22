package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveHtmlStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveHtmlString", "toHaveHtmlString")
  @js.native
  val toHaveHtmlString: ToHaveHtmlString_ = js.native
  
  type ToHaveHtmlString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveHtmlString(key: String): Boolean
        def toHaveHtmlString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveHtmlString")
        var toHaveHtmlString_Original: ToHaveHtmlString_
      }
      object Matchers {
        
        inline def apply[T](toHaveHtmlString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveHtmlString = js.Any.fromFunction2(toHaveHtmlString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveHtmlString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveHtmlString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
