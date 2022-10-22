package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeShorterThanMod {
  
  @JSImport("jasmine-expect/dist/toBeShorterThan", "toBeShorterThan")
  @js.native
  val toBeShorterThan: ToBeShorterThan_ = js.native
  
  type ToBeShorterThan_ = js.Function2[/* other */ String, /* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeShorterThan(other: String): Boolean
        def toBeShorterThan(other: String, expectationFailOutput: Any): Boolean
        @JSName("toBeShorterThan")
        var toBeShorterThan_Original: ToBeShorterThan_
      }
      object Matchers {
        
        inline def apply[T](toBeShorterThan: (/* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeShorterThan = js.Any.fromFunction2(toBeShorterThan))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeShorterThan(value: (/* other */ String, /* expectationFailOutput */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "toBeShorterThan", js.Any.fromFunction2(value))
        }
      }
    }
  }
}
