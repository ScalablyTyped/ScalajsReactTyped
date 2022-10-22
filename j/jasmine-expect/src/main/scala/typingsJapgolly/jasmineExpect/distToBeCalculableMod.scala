package typingsJapgolly.jasmineExpect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToBeCalculableMod {
  
  @JSImport("jasmine-expect/dist/toBeCalculable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toBeCalculable(actual: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBeCalculable")(actual.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ToBeCalculable_ = js.Function1[/* expectationFailOutput */ js.UndefOr[Any], Boolean]
  
  object global {
    
    object jasmine {
      
      trait Matchers[T] extends StObject {
        
        def toBeCalculable(): Boolean
        def toBeCalculable(expectationFailOutput: Any): Boolean
        @JSName("toBeCalculable")
        var toBeCalculable_Original: ToBeCalculable_
      }
      object Matchers {
        
        inline def apply[T](toBeCalculable: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Matchers[T] = {
          val __obj = js.Dynamic.literal(toBeCalculable = js.Any.fromFunction1(toBeCalculable))
          __obj.asInstanceOf[Matchers[T]]
        }
        
        extension [Self <: Matchers[?], T](x: Self & Matchers[T]) {
          
          inline def setToBeCalculable(value: /* expectationFailOutput */ js.UndefOr[Any] => Boolean): Self = StObject.set(x, "toBeCalculable", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
