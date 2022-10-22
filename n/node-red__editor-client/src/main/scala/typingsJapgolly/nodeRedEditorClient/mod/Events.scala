package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  def emit(evt: String, args: Any*): Unit
  
  def off(evt: String, func: js.Function1[/* repeated */ Any, Unit]): Unit
  
  def on(evt: String, func: js.Function1[/* repeated */ Any, Unit]): Unit
}
object Events {
  
  inline def apply(
    emit: (String, /* repeated */ Any) => Callback,
    off: (String, js.Function1[/* repeated */ Any, Unit]) => Callback,
    on: (String, js.Function1[/* repeated */ Any, Unit]) => Callback
  ): Events = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setOff(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, js.Function1[/* repeated */ Any, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function1[/* repeated */ Any, Unit]) => (value(t0, t1)).runNow()))
  }
}
