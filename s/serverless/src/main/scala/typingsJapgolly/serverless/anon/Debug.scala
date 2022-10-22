package typingsJapgolly.serverless.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def info(args: Any*): Unit
  
  def notice(args: Any*): Unit
  
  def success(args: Any*): Unit
  
  def verbose(args: Any*): Unit
  
  def warning(args: Any*): Unit
}
object Debug {
  
  inline def apply(
    debug: /* repeated */ Any => Callback,
    error: /* repeated */ Any => Callback,
    info: /* repeated */ Any => Callback,
    notice: /* repeated */ Any => Callback,
    success: /* repeated */ Any => Callback,
    verbose: /* repeated */ Any => Callback,
    warning: /* repeated */ Any => Callback
  ): Debug = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), notice = js.Any.fromFunction1((t0: /* repeated */ Any) => notice(t0).runNow()), success = js.Any.fromFunction1((t0: /* repeated */ Any) => success(t0).runNow()), verbose = js.Any.fromFunction1((t0: /* repeated */ Any) => verbose(t0).runNow()), warning = js.Any.fromFunction1((t0: /* repeated */ Any) => warning(t0).runNow()))
    __obj.asInstanceOf[Debug]
  }
  
  extension [Self <: Debug](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setNotice(value: /* repeated */ Any => Callback): Self = StObject.set(x, "notice", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setSuccess(value: /* repeated */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setVerbose(value: /* repeated */ Any => Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarning(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warning", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
