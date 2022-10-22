package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveEmptyString", "toHaveEmptyString")
  @js.native
  val toHaveEmptyString: ToHaveEmptyString_ = js.native
  
  type ToHaveEmptyString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveEmptyString(key: String): Boolean
        def toHaveEmptyString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveEmptyString")
        var toHaveEmptyString_Original: ToHaveEmptyString_
      }
      object Matchers {
        
        inline def apply[T](toHaveEmptyString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEmptyString = js.Any.fromFunction2(toHaveEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveEmptyString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveEmptyString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
