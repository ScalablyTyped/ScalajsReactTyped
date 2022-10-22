package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveIso8601Mod {
  
  @JSImport("jasmine-expect/dist/toHaveIso8601", "toHaveIso8601")
  @js.native
  val toHaveIso8601: ToHaveIso8601_ = js.native
  
  type ToHaveIso8601_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveIso8601(key: String): Boolean
        def toHaveIso8601(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveIso8601")
        var toHaveIso8601_Original: ToHaveIso8601_
      }
      object Matchers {
        
        inline def apply[T](toHaveIso8601: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveIso8601 = js.Any.fromFunction2(toHaveIso8601))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveIso8601(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveIso8601", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
