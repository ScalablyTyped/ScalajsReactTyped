package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerModule
  extends StObject
     with Module {
  
  def error(args: Any*): Unit
  
  def log(args: Any*): Unit
  
  @JSName("type")
  var type_LoggerModule: logger
  
  def warn(args: Any*): Unit
}
object LoggerModule {
  
  inline def apply(
    error: /* repeated */ Any => japgolly.scalajs.react.Callback,
    log: /* repeated */ Any => japgolly.scalajs.react.Callback,
    warn: /* repeated */ Any => japgolly.scalajs.react.Callback
  ): LoggerModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.updateDynamic("type")("logger")
    __obj.asInstanceOf[LoggerModule]
  }
  
  extension [Self <: LoggerModule](x: Self) {
    
    inline def setError(value: /* repeated */ Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLog(value: /* repeated */ Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setType(value: logger): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: /* repeated */ Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
