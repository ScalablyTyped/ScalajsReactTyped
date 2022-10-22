package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeLongerThanMod {
  
  @JSImport("jasmine-expect/dist/toBeLongerThan", "toBeLongerThan")
  @js.native
  val toBeLongerThan: ToBeLongerThan_ = js.native
  
  type ToBeLongerThan_ = js.Function2[/* other */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeLongerThan(other: String): Boolean
        def toBeLongerThan(other: String, expectationFailOutput: Any): Boolean
        @JSName("toBeLongerThan")
        var toBeLongerThan_Original: ToBeLongerThan_
      }
      object Matchers {
        
        inline def apply[T](toBeLongerThan: (/* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeLongerThan = js.Any.fromFunction2(toBeLongerThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeLongerThan(value: (/* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeLongerThan", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
