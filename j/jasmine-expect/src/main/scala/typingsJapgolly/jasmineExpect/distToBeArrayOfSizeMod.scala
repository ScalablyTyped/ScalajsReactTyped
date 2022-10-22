package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeArrayOfSizeMod {
  
  @JSImport("jasmine-expect/dist/toBeArrayOfSize", "toBeArrayOfSize")
  @js.native
  val toBeArrayOfSize: ToBeArrayOfSize_ = js.native
  
  type ToBeArrayOfSize_ = js.Function2[/* size */ Double, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeArrayOfSize(size: Double): Boolean
        def toBeArrayOfSize(size: Double, expectationFailOutput: Any): Boolean
        @JSName("toBeArrayOfSize")
        var toBeArrayOfSize_Original: ToBeArrayOfSize_
      }
      object Matchers {
        
        inline def apply[T](toBeArrayOfSize: (/* size */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeArrayOfSize = js.Any.fromFunction2(toBeArrayOfSize))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeArrayOfSize(value: (/* size */ Double, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeArrayOfSize", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
