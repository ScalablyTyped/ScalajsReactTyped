package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToStartWithMod {
  
  @JSImport("jasmine-expect/dist/toStartWith", "toStartWith")
  @js.native
  val toStartWith: ToStartWith_ = js.native
  
  type ToStartWith_ = js.Function2[/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toStartWith(subString: String): Boolean
        def toStartWith(subString: String, expectationFailOutput: Any): Boolean
        @JSName("toStartWith")
        var toStartWith_Original: ToStartWith_
      }
      object Matchers {
        
        inline def apply[T](toStartWith: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toStartWith = js.Any.fromFunction2(toStartWith))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToStartWith(value: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toStartWith", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
