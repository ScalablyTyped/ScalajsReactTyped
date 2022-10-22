package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoratorHandle extends StObject {
  
  /**
  	 * Called when any downstream template from the element will be updated.
  	 */
  var invalidate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
  	 * Called when the decorator is being removed from its element.
  	 */
  def teardown(): Unit
  
  /**
  	 * Called when any arguments passed to the decorator update. If no update function is supplied, then the decorator will be torn down and recreated when the decorator arguments update.j
  	 */
  var update: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
}
object DecoratorHandle {
  
  inline def apply(teardown: Callback): DecoratorHandle = {
    val __obj = js.Dynamic.literal(teardown = teardown.toJsFn)
    __obj.asInstanceOf[DecoratorHandle]
  }
  
  extension [Self <: DecoratorHandle](x: Self) {
    
    inline def setInvalidate(value: Callback): Self = StObject.set(x, "invalidate", value.toJsFn)
    
    inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    inline def setTeardown(value: Callback): Self = StObject.set(x, "teardown", value.toJsFn)
    
    inline def setUpdate(value: /* repeated */ Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
