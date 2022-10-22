package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveDateAfterMod {
  
  @JSImport("jasmine-expect/dist/toHaveDateAfter", "toHaveDateAfter")
  @js.native
  val toHaveDateAfter: ToHaveDateAfter_ = js.native
  
  type ToHaveDateAfter_ = js.Function3[
    /* key */ String, 
    /* otherDate */ js.Date, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveDateAfter(key: String, otherDate: js.Date): Boolean
        def toHaveDateAfter(key: String, otherDate: js.Date, expectationFailOutput: Any): Boolean
        @JSName("toHaveDateAfter")
        var toHaveDateAfter_Original: ToHaveDateAfter_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveDateAfter: (/* key */ String, /* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveDateAfter = js.Any.fromFunction3(toHaveDateAfter))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveDateAfter(
            value: (/* key */ String, /* otherDate */ js.Date, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveDateAfter", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
