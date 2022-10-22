package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptorHandle extends StObject {
  
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): Any
  
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: Any): Unit
  
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: Any): Unit
  
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit
}
object AdaptorHandle {
  
  inline def apply(get: CallbackTo[Any], reset: Any => Callback, set: (String, Any) => Callback, teardown: Callback): AdaptorHandle = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, reset = js.Any.fromFunction1((t0: Any) => reset(t0).runNow()), set = js.Any.fromFunction2((t0: String, t1: Any) => (set(t0, t1)).runNow()), teardown = teardown.toJsFn)
    __obj.asInstanceOf[AdaptorHandle]
  }
  
  extension [Self <: AdaptorHandle](x: Self) {
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setReset(value: Any => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet(value: (String, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setTeardown(value: Callback): Self = StObject.set(x, "teardown", value.toJsFn)
  }
}
