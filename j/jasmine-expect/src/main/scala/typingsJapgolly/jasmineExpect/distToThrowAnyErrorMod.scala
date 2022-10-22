package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToThrowAnyErrorMod {
  
  @JSImport("jasmine-expect/dist/toThrowAnyError", "toThrowAnyError")
  @js.native
  val toThrowAnyError: ToThrowAnyError_ = js.native
  
  type ToThrowAnyError_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toThrowAnyError(): Boolean
        def toThrowAnyError(expectationFailOutput: Any): Boolean
        @JSName("toThrowAnyError")
        var toThrowAnyError_Original: ToThrowAnyError_
      }
      object Matchers {
        
        inline def apply[T](toThrowAnyError: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toThrowAnyError = js.Any.fromFunction1(toThrowAnyError))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToThrowAnyError(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toThrowAnyError", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
