package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILogger extends StObject {
  
  def debug(message: Any, optionalParams: Any*): Unit
  def debug(message: Unit, optionalParams: Any*): Unit
  @JSName("debug")
  var debug_Original: ILogFunction
  
  def error(message: Any, optionalParams: Any*): Unit
  def error(message: Unit, optionalParams: Any*): Unit
  @JSName("error")
  var error_Original: ILogFunction
  
  def info(message: Any, optionalParams: Any*): Unit
  def info(message: Unit, optionalParams: Any*): Unit
  @JSName("info")
  var info_Original: ILogFunction
  
  def log(message: Any, optionalParams: Any*): Unit
  def log(message: Unit, optionalParams: Any*): Unit
  @JSName("log")
  var log_Original: ILogFunction
  
  def trace(message: Any, optionalParams: Any*): Unit
  def trace(message: Unit, optionalParams: Any*): Unit
  @JSName("trace")
  var trace_Original: ILogFunction
  
  def warn(message: Any, optionalParams: Any*): Unit
  def warn(message: Unit, optionalParams: Any*): Unit
  @JSName("warn")
  var warn_Original: ILogFunction
}
object ILogger {
  
  inline def apply(
    debug: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
    error: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
    info: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
    log: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
    trace: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback,
    warn: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (debug(t0, t1)).runNow()), error = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (error(t0, t1)).runNow()), info = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (info(t0, t1)).runNow()), log = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (log(t0, t1)).runNow()), trace = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (trace(t0, t1)).runNow()), warn = js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (warn(t0, t1)).runNow()))
    __obj.asInstanceOf[ILogger]
  }
  
  extension [Self <: ILogger](x: Self) {
    
    inline def setDebug(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setError(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "error", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setInfo(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "info", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setLog(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setTrace(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setWarn(value: (/* message */ js.UndefOr[Any], /* repeated */ Any) => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction2((t0: /* message */ js.UndefOr[Any], t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
  }
}
