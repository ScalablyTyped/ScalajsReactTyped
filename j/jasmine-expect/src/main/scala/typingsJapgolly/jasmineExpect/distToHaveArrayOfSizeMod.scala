package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveArrayOfSizeMod {
  
  @JSImport("jasmine-expect/dist/toHaveArrayOfSize", "toHaveArrayOfSize")
  @js.native
  val toHaveArrayOfSize: ToHaveArrayOfSize_ = js.native
  
  type ToHaveArrayOfSize_ = js.Function3[
    /* key */ String, 
    /* size */ js.UndefOr[Double], 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveArrayOfSize(key: String): Boolean
        def toHaveArrayOfSize(key: String, size: Double): Boolean
        def toHaveArrayOfSize(key: String, size: Double, expectationFailOutput: Any): Boolean
        def toHaveArrayOfSize(key: String, size: Unit, expectationFailOutput: Any): Boolean
        @JSName("toHaveArrayOfSize")
        var toHaveArrayOfSize_Original: ToHaveArrayOfSize_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveArrayOfSize: (/* key */ String, /* size */ js.UndefOr[Double], /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveArrayOfSize = js.Any.fromFunction3(toHaveArrayOfSize))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveArrayOfSize(
            value: (/* key */ String, /* size */ js.UndefOr[Double], /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveArrayOfSize", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
