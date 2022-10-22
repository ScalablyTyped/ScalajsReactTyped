package typingsJapgolly.azureMobileApps.Azure.MobileApps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(message: Any*): Unit
  
  def error(message: Any*): Unit
  
  def info(message: Any*): Unit
  
  def log(level: String, message: Any*): Unit
  
  def silly(message: Any*): Unit
  
  def verbose(message: Any*): Unit
  
  def warn(message: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Callback,
    error: /* repeated */ Any => Callback,
    info: /* repeated */ Any => Callback,
    log: (String, /* repeated */ Any) => Callback,
    silly: /* repeated */ Any => Callback,
    verbose: /* repeated */ Any => Callback,
    warn: /* repeated */ Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), log = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (log(t0, t1)).runNow()), silly = js.Any.fromFunction1((t0: /* repeated */ Any) => silly(t0).runNow()), verbose = js.Any.fromFunction1((t0: /* repeated */ Any) => verbose(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLog(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setSilly(value: /* repeated */ Any => Callback): Self = StObject.set(x, "silly", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setVerbose(value: /* repeated */ Any => Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
