package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveNonEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveNonEmptyString", "toHaveNonEmptyString")
  @js.native
  val toHaveNonEmptyString: ToHaveNonEmptyString_ = js.native
  
  type ToHaveNonEmptyString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveNonEmptyString(key: String): Boolean
        def toHaveNonEmptyString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveNonEmptyString")
        var toHaveNonEmptyString_Original: ToHaveNonEmptyString_
      }
      object Matchers {
        
        inline def apply[T](toHaveNonEmptyString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNonEmptyString = js.Any.fromFunction2(toHaveNonEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveNonEmptyString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveNonEmptyString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
