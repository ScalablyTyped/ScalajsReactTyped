package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveStringMod {
  
  @JSImport("jasmine-expect/dist/toHaveString", "toHaveString")
  @js.native
  val toHaveString: ToHaveString_ = js.native
  
  type ToHaveString_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveString(key: String): Boolean
        def toHaveString(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveString")
        var toHaveString_Original: ToHaveString_
      }
      object Matchers {
        
        inline def apply[T](toHaveString: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveString = js.Any.fromFunction2(toHaveString))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveString(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveString", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
