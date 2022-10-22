package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeNonEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toBeNonEmptyObject", "toBeNonEmptyObject")
  @js.native
  val toBeNonEmptyObject: ToBeNonEmptyObject_ = js.native
  
  type ToBeNonEmptyObject_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeNonEmptyObject(): Boolean
        def toBeNonEmptyObject(expectationFailOutput: Any): Boolean
        @JSName("toBeNonEmptyObject")
        var toBeNonEmptyObject_Original: ToBeNonEmptyObject_
      }
      object Matchers {
        
        inline def apply[T](toBeNonEmptyObject: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeNonEmptyObject = js.Any.fromFunction1(toBeNonEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeNonEmptyObject(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeNonEmptyObject", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
