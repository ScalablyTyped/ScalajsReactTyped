package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeAfterMod {
  
  @JSImport("jasmine-expect/dist/toBeAfter", "toBeAfter")
  @js.native
  val toBeAfter: ToBeAfter_ = js.native
  
  type ToBeAfter_ = js.Function2[/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeAfter(otherDate: js.Date): Boolean
        def toBeAfter(otherDate: js.Date, expectationFailOutput: Any): Boolean
        @JSName("toBeAfter")
        var toBeAfter_Original: ToBeAfter_
      }
      object Matchers {
        
        inline def apply[T](toBeAfter: (/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeAfter = js.Any.fromFunction2(toBeAfter))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeAfter(value: (/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeAfter", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
