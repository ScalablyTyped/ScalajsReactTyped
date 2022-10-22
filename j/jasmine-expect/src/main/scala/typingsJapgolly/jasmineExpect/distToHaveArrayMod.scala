package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveArrayMod {
  
  @JSImport("jasmine-expect/dist/toHaveArray", "toHaveArray")
  @js.native
  val toHaveArray: ToHaveArray_ = js.native
  
  type ToHaveArray_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveArray(key: String): Boolean
        def toHaveArray(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveArray")
        var toHaveArray_Original: ToHaveArray_
      }
      object Matchers {
        
        inline def apply[T](toHaveArray: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArray = js.Any.fromFunction2(toHaveArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArray(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveArray", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
