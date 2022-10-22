package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevtoolsHook extends StObject {
  
  var appRecords: js.Array[AppRecord]
  
  /**
    * Added at https://github.com/vuejs/devtools/commit/f2ad51eea789006ab66942e5a27c0f0986a257f9
    * Returns wether the arg was buffered or not
    */
  var cleanupBuffer: js.UndefOr[js.Function1[/* matchArg */ Any, Boolean]] = js.undefined
  
  def emit(event: String, payload: Any*): Unit
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  def off(event: String, handler: js.Function): Unit
  
  def on(event: String, handler: js.Function): Unit
  
  def once(event: String, handler: js.Function): Unit
}
object DevtoolsHook {
  
  inline def apply(
    appRecords: js.Array[AppRecord],
    emit: (String, /* repeated */ Any) => Callback,
    off: (String, js.Function) => Callback,
    on: (String, js.Function) => Callback,
    once: (String, js.Function) => Callback
  ): DevtoolsHook = {
    val __obj = js.Dynamic.literal(appRecords = appRecords.asInstanceOf[js.Any], emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), off = js.Any.fromFunction2((t0: String, t1: js.Function) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function) => (on(t0, t1)).runNow()), once = js.Any.fromFunction2((t0: String, t1: js.Function) => (once(t0, t1)).runNow()))
    __obj.asInstanceOf[DevtoolsHook]
  }
  
  extension [Self <: DevtoolsHook](x: Self) {
    
    inline def setAppRecords(value: js.Array[AppRecord]): Self = StObject.set(x, "appRecords", value.asInstanceOf[js.Any])
    
    inline def setAppRecordsVarargs(value: AppRecord*): Self = StObject.set(x, "appRecords", js.Array(value*))
    
    inline def setCleanupBuffer(value: /* matchArg */ Any => Boolean): Self = StObject.set(x, "cleanupBuffer", js.Any.fromFunction1(value))
    
    inline def setCleanupBufferUndefined: Self = StObject.set(x, "cleanupBuffer", js.undefined)
    
    inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOff(value: (String, js.Function) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (String, js.Function) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnce(value: (String, js.Function) => Callback): Self = StObject.set(x, "once", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
  }
}
