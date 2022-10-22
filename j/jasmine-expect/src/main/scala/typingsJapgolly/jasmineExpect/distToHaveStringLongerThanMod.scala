package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveStringLongerThanMod {
  
  @JSImport("jasmine-expect/dist/toHaveStringLongerThan", "toHaveStringLongerThan")
  @js.native
  val toHaveStringLongerThan: ToHaveStringLongerThan_ = js.native
  
  type ToHaveStringLongerThan_ = js.Function3[
    /* key */ String, 
    /* other */ String, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveStringLongerThan(key: String, other: String): Boolean
        def toHaveStringLongerThan(key: String, other: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveStringLongerThan")
        var toHaveStringLongerThan_Original: ToHaveStringLongerThan_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveStringLongerThan: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveStringLongerThan = js.Any.fromFunction3(toHaveStringLongerThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveStringLongerThan(
            value: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveStringLongerThan", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
