package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveNonEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toHaveNonEmptyArray", "toHaveNonEmptyArray")
  @js.native
  val toHaveNonEmptyArray: ToHaveNonEmptyArray_ = js.native
  
  type ToHaveNonEmptyArray_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveNonEmptyArray(key: String): Boolean
        def toHaveNonEmptyArray(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveNonEmptyArray")
        var toHaveNonEmptyArray_Original: ToHaveNonEmptyArray_
      }
      object Matchers {
        
        inline def apply[T](toHaveNonEmptyArray: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveNonEmptyArray = js.Any.fromFunction2(toHaveNonEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveNonEmptyArray(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveNonEmptyArray", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
