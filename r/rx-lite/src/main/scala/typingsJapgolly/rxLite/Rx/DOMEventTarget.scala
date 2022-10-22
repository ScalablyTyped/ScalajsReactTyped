package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMEventTarget extends StObject {
  
  def addEventListener(`type`: String, listener: js.Function1[/* e */ Any, Any], useCapture: Boolean): Unit
  
  def removeEventListener(`type`: String, listener: js.Function1[/* e */ Any, Any], useCapture: Boolean): Unit
}
object DOMEventTarget {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* e */ Any, Any], Boolean) => Callback,
    removeEventListener: (String, js.Function1[/* e */ Any, Any], Boolean) => Callback
  ): DOMEventTarget = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction3((t0: String, t1: js.Function1[/* e */ Any, Any], t2: Boolean) => (addEventListener(t0, t1, t2)).runNow()), removeEventListener = js.Any.fromFunction3((t0: String, t1: js.Function1[/* e */ Any, Any], t2: Boolean) => (removeEventListener(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DOMEventTarget]
  }
  
  extension [Self <: DOMEventTarget](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* e */ Any, Any], Boolean) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3((t0: String, t1: js.Function1[/* e */ Any, Any], t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* e */ Any, Any], Boolean) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction3((t0: String, t1: js.Function1[/* e */ Any, Any], t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
