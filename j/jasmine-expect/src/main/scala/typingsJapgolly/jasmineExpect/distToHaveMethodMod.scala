package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveMethodMod {
  
  @JSImport("jasmine-expect/dist/toHaveMethod", "toHaveMethod")
  @js.native
  val toHaveMethod: ToHaveMethod_ = js.native
  
  type ToHaveMethod_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveMethod(key: String): Boolean
        def toHaveMethod(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveMethod")
        var toHaveMethod_Original: ToHaveMethod_
      }
      object Matchers {
        
        inline def apply[T](toHaveMethod: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveMethod = js.Any.fromFunction2(toHaveMethod))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveMethod(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveMethod", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
