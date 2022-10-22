package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeEmptyStringMod {
  
  @JSImport("jasmine-expect/dist/toBeEmptyString", "toBeEmptyString")
  @js.native
  val toBeEmptyString: ToBeEmptyString_ = js.native
  
  type ToBeEmptyString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeEmptyString(): Boolean
        def toBeEmptyString(expectationFailOutput: Any): Boolean
        @JSName("toBeEmptyString")
        var toBeEmptyString_Original: ToBeEmptyString_
      }
      object Matchers {
        
        inline def apply[T](toBeEmptyString: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEmptyString = js.Any.fromFunction1(toBeEmptyString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeEmptyString(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeEmptyString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
