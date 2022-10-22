package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveJsonStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveJsonString", "toHaveJsonString")
  @js.native
  val toHaveJsonString: ToHaveJsonString_ = js.native
  
  type ToHaveJsonString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveJsonString(key: String): Boolean
        def toHaveJsonString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveJsonString")
        var toHaveJsonString_Original: ToHaveJsonString_
      }
      object Matchers {
        
        inline def apply[T](toHaveJsonString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveJsonString = js.Any.fromFunction2(toHaveJsonString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveJsonString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveJsonString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
