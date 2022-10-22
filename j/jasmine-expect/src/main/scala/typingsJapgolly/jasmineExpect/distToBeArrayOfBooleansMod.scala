package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayOfBooleansMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfBooleans", "toBeArrayOfBooleans")
  @js.native
  val toBeArrayOfBooleans: ToBeArrayOfBooleans_ = js.native
  
  type ToBeArrayOfBooleans_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArrayOfBooleans(): Boolean
        def toBeArrayOfBooleans(expectationFailOutput: Any): Boolean
        @JSName("toBeArrayOfBooleans")
        var toBeArrayOfBooleans_Original: ToBeArrayOfBooleans_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfBooleans: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfBooleans = js.Any.fromFunction1(toBeArrayOfBooleans))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfBooleans(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeArrayOfBooleans", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
