package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToHaveStringSameLengthAsMod {
  
  @JSImport("jasmine-expect/dist/toHaveStringSameLengthAs", "toHaveStringSameLengthAs")
  @js.native
  val toHaveStringSameLengthAs: ToHaveStringSameLengthAs_ = js.native
  
  type ToHaveStringSameLengthAs_ = js.Function3[
    /* key */ String, 
    /* other */ String, 
    /* expectationFailOutput */ js.UndefOr[Any], 
    Boolean
  ]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toHaveStringSameLengthAs(key: String, other: String): Boolean
        def toHaveStringSameLengthAs(key: String, other: String, expectationFailOutput: Any): Boolean
        @JSName("toHaveStringSameLengthAs")
        var toHaveStringSameLengthAs_Original: ToHaveStringSameLengthAs_
      }
      object Matchers {
        
        inline def apply[T](
          toHaveStringSameLengthAs: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
        ): Matchers[T] = {
          val __obj = js.Dynamic.literal(toHaveStringSameLengthAs = js.Any.fromFunction3(toHaveStringSameLengthAs))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToHaveStringSameLengthAs(
            value: (/* key */ String, /* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean
          ): Self = StObject.set(x, "toHaveStringSameLengthAs", js.Any.fromFunction3(value))
        }
      }
    }
  }
}
