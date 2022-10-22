package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeDateMod {
  
  @JSImport("jasmine-expect/dist/toBeDate", "toBeDate")
  @js.native
  val toBeDate: ToBeDate_ = js.native
  
  type ToBeDate_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeDate(): Boolean
        def toBeDate(expectationFailOutput: Any): Boolean
        @JSName("toBeDate")
        var toBeDate_Original: ToBeDate_
      }
      object Matchers {
        
        inline def apply[T](toBeDate: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeDate = js.Any.fromFunction1(toBeDate))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeDate(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeDate", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
