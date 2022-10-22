package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveObjectMod {
  
  @JSImport("jasmine-expect/dist/toHaveObject", "toHaveObject")
  @js.native
  val toHaveObject: ToHaveObject_ = js.native
  
  type ToHaveObject_ = js.Function2[/* key */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveObject(key: String): Boolean
        def toHaveObject(key: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveObject")
        var toHaveObject_Original: ToHaveObject_
      }
      object Matchers {
        
        inline def apply[T](toHaveObject: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveObject = js.Any.fromFunction2(toHaveObject))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveObject(value: (/* key */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toHaveObject", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
