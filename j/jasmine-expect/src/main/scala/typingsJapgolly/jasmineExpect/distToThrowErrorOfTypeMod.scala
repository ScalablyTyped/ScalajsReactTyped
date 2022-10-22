package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToThrowErrorOfTypeMod {
  
  @JSImport("jasmine-expect/dist/toThrowErrorOfType", "toThrowErrorOfType")
  @js.native
  val toThrowErrorOfType: ToThrowErrorOfType_ = js.native
  
  type ToThrowErrorOfType_ = js.Function2[/* type */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toThrowErrorOfType(`type`: String): Boolean
        def toThrowErrorOfType(`type`: String, expectationFailOutput: Any): Boolean
        @JSName("toThrowErrorOfType")
        var toThrowErrorOfType_Original: ToThrowErrorOfType_
      }
      object Matchers {
        
        inline def apply[T](toThrowErrorOfType: (/* type */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toThrowErrorOfType = js.Any.fromFunction2(toThrowErrorOfType))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToThrowErrorOfType(value: (/* type */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toThrowErrorOfType", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
