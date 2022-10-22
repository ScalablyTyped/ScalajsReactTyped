package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeNonEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyString", "toBeNonEmptyString")
  @js.native
  val toBeNonEmptyString: ToBeNonEmptyString_ = js.native
  
  type ToBeNonEmptyString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeNonEmptyString(): Boolean
        def toBeNonEmptyString(expectationFailOutput: Any): Boolean
        @JSName("toBeNonEmptyString")
        var toBeNonEmptyString_Original: ToBeNonEmptyString_
      }
      object Matchers {
        
        inline def apply[T](toBeNonEmptyString: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyString = js.Any.fromFunction1(toBeNonEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeNonEmptyString(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
