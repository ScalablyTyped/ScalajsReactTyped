package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveUndefinedMod {
  
  @JSImport("jasmine-expect/dist/toHaveUndefined", "toHaveUndefined")
  @js.native
  val toHaveUndefined: ToHaveUndefined_ = js.native
  
  type ToHaveUndefined_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveUndefined(key: String): Boolean
        def toHaveUndefined(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveUndefined")
        var toHaveUndefined_Original: ToHaveUndefined_
      }
      object Matchers {
        
        inline def apply[T](toHaveUndefined: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveUndefined = js.Any.fromFunction2(toHaveUndefined))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveUndefined(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveUndefined", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
