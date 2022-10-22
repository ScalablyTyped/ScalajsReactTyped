package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeValidDateMod {
  
  @JSImport("jasmine-expect/dist/toBeValidDate", "toBeValidDate")
  @js.native
  val toBeValidDate: ToBeValidDate_ = js.native
  
  type ToBeValidDate_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeValidDate(): Boolean
        def toBeValidDate(expectationFailOutput: Any): Boolean
        @JSName("toBeValidDate")
        var toBeValidDate_Original: ToBeValidDate_
      }
      object Matchers {
        
        inline def apply[T](toBeValidDate: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeValidDate = js.Any.fromFunction1(toBeValidDate))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeValidDate(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeValidDate", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
