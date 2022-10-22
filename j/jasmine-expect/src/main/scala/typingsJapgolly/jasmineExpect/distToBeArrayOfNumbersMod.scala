package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayOfNumbersMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfNumbers", "toBeArrayOfNumbers")
  @js.native
  val toBeArrayOfNumbers: ToBeArrayOfNumbers_ = js.native
  
  type ToBeArrayOfNumbers_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArrayOfNumbers(): Boolean
        def toBeArrayOfNumbers(expectationFailOutput: Any): Boolean
        @JSName("toBeArrayOfNumbers")
        var toBeArrayOfNumbers_Original: ToBeArrayOfNumbers_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfNumbers: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfNumbers = js.Any.fromFunction1(toBeArrayOfNumbers))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfNumbers(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeArrayOfNumbers", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
