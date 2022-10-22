package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeNonEmptyArrayMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyArray", "toBeNonEmptyArray")
  @js.native
  val toBeNonEmptyArray: ToBeNonEmptyArray_ = js.native
  
  type ToBeNonEmptyArray_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeNonEmptyArray(): Boolean
        def toBeNonEmptyArray(expectationFailOutput: Any): Boolean
        @JSName("toBeNonEmptyArray")
        var toBeNonEmptyArray_Original: ToBeNonEmptyArray_
      }
      object Matchers {
        
        inline def apply[T](toBeNonEmptyArray: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyArray = js.Any.fromFunction1(toBeNonEmptyArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeNonEmptyArray(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyArray", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
