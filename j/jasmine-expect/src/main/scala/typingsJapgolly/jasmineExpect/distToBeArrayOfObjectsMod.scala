package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayOfObjectsMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfObjects", "toBeArrayOfObjects")
  @js.native
  val toBeArrayOfObjects: ToBeArrayOfObjects_ = js.native
  
  type ToBeArrayOfObjects_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArrayOfObjects(): Boolean
        def toBeArrayOfObjects(expectationFailOutput: Any): Boolean
        @JSName("toBeArrayOfObjects")
        var toBeArrayOfObjects_Original: ToBeArrayOfObjects_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfObjects: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfObjects = js.Any.fromFunction1(toBeArrayOfObjects))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfObjects(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeArrayOfObjects", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
