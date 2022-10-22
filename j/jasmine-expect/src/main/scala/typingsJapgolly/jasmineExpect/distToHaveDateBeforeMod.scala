package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveDateBeforeMod {
  
  @JSImport("jasmine-expect/dist/toHaveDateBefore", "toHaveDateBefore")
  @js.native
  val toHaveDateBefore: ToHaveDateBefore_ = js.native
  
  type ToHaveDateBefore_ = js.Function3[
    /* key */ String, 
    /* otherDate */ js.Date, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveDateBefore(key: String, otherDate: js.Date): Boolean
        def toHaveDateBefore(key: String, otherDate: js.Date, expectationFailOutput: Any): Boolean
        @JSName("toHaveDateBefore")
        var toHaveDateBefore_Original: ToHaveDateBefore_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveDateBefore: (/* key */ String, /* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveDateBefore = js.Any.fromFunction3(toHaveDateBefore))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveDateBefore(
            value: (/* key */ String, /* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveDateBefore", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
