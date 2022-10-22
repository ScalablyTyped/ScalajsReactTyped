package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeObjectMod {
  
  @JSImport("jasmine-expect/dist/toBeObject", "toBeObject")
  @js.native
  val toBeObject: ToBeObject_ = js.native
  
  type ToBeObject_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeObject(): Boolean
        def toBeObject(expectationFailOutput: Any): Boolean
        @JSName("toBeObject")
        var toBeObject_Original: ToBeObject_
      }
      object Matchers {
        
        inline def apply[T](toBeObject: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeObject = js.Any.fromFunction1(toBeObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeObject(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeObject", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
