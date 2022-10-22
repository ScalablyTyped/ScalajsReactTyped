package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toHaveEmptyArray", "toHaveEmptyArray")
  @js.native
  val toHaveEmptyArray: ToHaveEmptyArray_ = js.native
  
  type ToHaveEmptyArray_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveEmptyArray(key: String): Boolean
        def toHaveEmptyArray(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveEmptyArray")
        var toHaveEmptyArray_Original: ToHaveEmptyArray_
      }
      object Matchers {
        
        inline def apply[T](toHaveEmptyArray: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEmptyArray = js.Any.fromFunction2(toHaveEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveEmptyArray(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveEmptyArray", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
