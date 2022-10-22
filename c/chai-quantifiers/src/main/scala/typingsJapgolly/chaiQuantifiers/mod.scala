package typingsJapgolly.chaiQuantifiers

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-quantifiers", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      trait Assertion extends StObject {
        
        // tslint:disable-next-line no-unnecessary-generics
        def containAll[T](cb: js.Function1[/* item */ T, Boolean]): Unit
        
        // tslint:disable-next-line no-unnecessary-generics
        def containExactlyOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit
        
        // tslint:disable-next-line no-unnecessary-generics
        def containOne[T](cb: js.Function1[/* item */ T, Boolean]): Unit
      }
      object Assertion {
        
        inline def apply(
          containAll: js.Function1[Any, Boolean] => Callback,
          containExactlyOne: js.Function1[Any, Boolean] => Callback,
          containOne: js.Function1[Any, Boolean] => Callback
        ): Assertion = {
          val __obj = js.Dynamic.literal(containAll = js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => containAll(t0).runNow()), containExactlyOne = js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => containExactlyOne(t0).runNow()), containOne = js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => containOne(t0).runNow()))
          __obj.asInstanceOf[Assertion]
        }
        
        extension [Self <: Assertion](x: Self) {
          
          inline def setContainAll(value: js.Function1[Any, Boolean] => Callback): Self = StObject.set(x, "containAll", js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => value(t0).runNow()))
          
          inline def setContainExactlyOne(value: js.Function1[Any, Boolean] => Callback): Self = StObject.set(x, "containExactlyOne", js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => value(t0).runNow()))
          
          inline def setContainOne(value: js.Function1[Any, Boolean] => Callback): Self = StObject.set(x, "containOne", js.Any.fromFunction1((t0: js.Function1[Any, Boolean]) => value(t0).runNow()))
        }
      }
    }
  }
}
