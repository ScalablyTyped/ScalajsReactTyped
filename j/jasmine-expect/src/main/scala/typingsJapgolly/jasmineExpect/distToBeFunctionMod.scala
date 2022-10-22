package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeFunctionMod {
  
  @JSImport("jasmine-expect/dist/toBeFunction", "toBeFunction")
  @js.native
  val toBeFunction: ToBeFunction_ = js.native
  
  type ToBeFunction_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeFunction(): Boolean
        def toBeFunction(expectationFailOutput: Any): Boolean
        @JSName("toBeFunction")
        var toBeFunction_Original: ToBeFunction_
      }
      object Matchers {
        
        inline def apply[T](toBeFunction: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeFunction = js.Any.fromFunction1(toBeFunction))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeFunction(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeFunction", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
