package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toBeEmptyObject", "toBeEmptyObject")
  @js.native
  val toBeEmptyObject: ToBeEmptyObject_ = js.native
  
  type ToBeEmptyObject_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeEmptyObject(): Boolean
        def toBeEmptyObject(expectationFailOutput: Any): Boolean
        @JSName("toBeEmptyObject")
        var toBeEmptyObject_Original: ToBeEmptyObject_
      }
      object Matchers {
        
        inline def apply[T](toBeEmptyObject: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeEmptyObject = js.Any.fromFunction1(toBeEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeEmptyObject(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeEmptyObject", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
