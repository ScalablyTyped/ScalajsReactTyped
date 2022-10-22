package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveEmptyObjectMod {
  
  @JSImport("jasmine-expect/dist/toHaveEmptyObject", "toHaveEmptyObject")
  @js.native
  val toHaveEmptyObject: ToHaveEmptyObject_ = js.native
  
  type ToHaveEmptyObject_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveEmptyObject(key: String): Boolean
        def toHaveEmptyObject(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveEmptyObject")
        var toHaveEmptyObject_Original: ToHaveEmptyObject_
      }
      object Matchers {
        
        inline def apply[T](toHaveEmptyObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveEmptyObject = js.Any.fromFunction2(toHaveEmptyObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveEmptyObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveEmptyObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
