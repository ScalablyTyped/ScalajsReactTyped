package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeStringMod {
  
  @JSImport("jasmine-expect/dist/toBeString", "toBeString")
  @js.native
  val toBeString: ToBeString_ = js.native
  
  type ToBeString_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeString(): Boolean
        def toBeString(expectationFailOutput: Any): Boolean
        @JSName("toBeString")
        var toBeString_Original: ToBeString_
      }
      object Matchers {
        
        inline def apply[T](toBeString: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeString = js.Any.fromFunction1(toBeString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeString(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeString", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
