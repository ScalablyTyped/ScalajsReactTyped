package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToEndWithMod {
  
  @JSImport("jasmine-expect/dist/toEndWith", "toEndWith")
  @js.native
  val toEndWith: ToEndWith_ = js.native
  
  type ToEndWith_ = js.Function2[/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toEndWith(subString: String): Boolean
        def toEndWith(subString: String, expectationFailOutput: Any): Boolean
        @JSName("toEndWith")
        var toEndWith_Original: ToEndWith_
      }
      object Matchers {
        
        inline def apply[T](toEndWith: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toEndWith = js.Any.fromFunction2(toEndWith))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToEndWith(value: (/* subString */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toEndWith", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
