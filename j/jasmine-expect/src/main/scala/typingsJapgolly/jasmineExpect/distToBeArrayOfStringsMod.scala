package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayOfStringsMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfStrings", "toBeArrayOfStrings")
  @js.native
  val toBeArrayOfStrings: ToBeArrayOfStrings_ = js.native
  
  type ToBeArrayOfStrings_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArrayOfStrings(): Boolean
        def toBeArrayOfStrings(expectationFailOutput: Any): Boolean
        @JSName("toBeArrayOfStrings")
        var toBeArrayOfStrings_Original: ToBeArrayOfStrings_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfStrings: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfStrings = js.Any.fromFunction1(toBeArrayOfStrings))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfStrings(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeArrayOfStrings", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
