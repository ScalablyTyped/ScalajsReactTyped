package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayMod {
  
  @JSImport("jasmine-expect/dist/toBeArray", "toBeArray")
  @js.native
  val toBeArray: ToBeArray_ = js.native
  
  type ToBeArray_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArray(): Boolean
        def toBeArray(expectationFailOutput: Any): Boolean
        @JSName("toBeArray")
        var toBeArray_Original: ToBeArray_
      }
      object Matchers {
        
        inline def apply[T](toBeArray: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArray = js.Any.fromFunction1(toBeArray))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArray(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeArray", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
