package typingsJapgolly.storybookClientLogger

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Debug extends StObject {
    
    def debug(message: Any, rest: Any*): Unit
    
    def error(message: Any, rest: Any*): Unit
    
    def info(message: Any, rest: Any*): Unit
    
    def log(message: Any, rest: Any*): Unit
    
    def trace(message: Any, rest: Any*): Unit
    
    def warn(message: Any, rest: Any*): Unit
  }
  object Debug {
    
    inline def apply(
      debug: (Any, /* repeated */ Any) => Callback,
      error: (Any, /* repeated */ Any) => Callback,
      info: (Any, /* repeated */ Any) => Callback,
      log: (Any, /* repeated */ Any) => Callback,
      trace: (Any, /* repeated */ Any) => Callback,
      warn: (Any, /* repeated */ Any) => Callback
    ): Debug = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (debug(t0, t1)).runNow()), error = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (error(t0, t1)).runNow()), info = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (info(t0, t1)).runNow()), log = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (log(t0, t1)).runNow()), trace = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (trace(t0, t1)).runNow()), warn = js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (warn(t0, t1)).runNow()))
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setError(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setInfo(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "info", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setLog(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setTrace(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setWarn(value: (Any, /* repeated */ Any) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction2((t0: Any, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    }
  }
}
