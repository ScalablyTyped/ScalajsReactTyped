package typingsJapgolly.rxLite.Rx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventTarget extends StObject {
  
  def off(name: String, cb: js.Function1[/* e */ Any, Any]): Unit
  
  def on(name: String, cb: js.Function1[/* e */ Any, Any]): Unit
}
object NativeEventTarget {
  
  inline def apply(
    off: (String, js.Function1[/* e */ Any, Any]) => Callback,
    on: (String, js.Function1[/* e */ Any, Any]) => Callback
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[NativeEventTarget]
  }
  
  extension [Self <: NativeEventTarget](x: Self) {
    
    inline def setOff(value: (String, js.Function1[/* e */ Any, Any]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, js.Function1[/* e */ Any, Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* e */ Any, Any]) => (value(t0, t1)).runNow()))
  }
}
