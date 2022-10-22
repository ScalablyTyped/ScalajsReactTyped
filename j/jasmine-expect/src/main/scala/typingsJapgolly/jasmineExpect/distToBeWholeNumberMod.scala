package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeWholeNumberMod {
  
  @JSImport("jasmine-expect/dist/toBeWholeNumber", "toBeWholeNumber")
  @js.native
  val toBeWholeNumber: ToBeWholeNumber_ = js.native
  
  type ToBeWholeNumber_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeWholeNumber(): Boolean
        def toBeWholeNumber(expectationFailOutput: Any): Boolean
        @JSName("toBeWholeNumber")
        var toBeWholeNumber_Original: ToBeWholeNumber_
      }
      object Matchers {
        
        inline def apply[T](toBeWholeNumber: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeWholeNumber = js.Any.fromFunction1(toBeWholeNumber))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeWholeNumber(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeWholeNumber", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
