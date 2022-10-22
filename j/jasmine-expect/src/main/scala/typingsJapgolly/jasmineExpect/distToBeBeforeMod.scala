package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeBeforeMod {
  
  @JSImport("jasmine-expect/dist/toBeBefore", "toBeBefore")
  @js.native
  val toBeBefore: ToBeBefore_ = js.native
  
  type ToBeBefore_ = js.Function2[/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeBefore(otherDate: js.Date): Boolean
        def toBeBefore(otherDate: js.Date, expectationFailOutput: Any): Boolean
        @JSName("toBeBefore")
        var toBeBefore_Original: ToBeBefore_
      }
      object Matchers {
        
        inline def apply[T](toBeBefore: (/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeBefore = js.Any.fromFunction2(toBeBefore))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeBefore(value: (/* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeBefore", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
