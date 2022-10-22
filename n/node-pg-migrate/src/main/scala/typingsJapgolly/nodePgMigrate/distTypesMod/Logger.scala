package typingsJapgolly.nodePgMigrate.distTypesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  var debug: js.UndefOr[LogFn] = js.undefined
  
  def error(msg: String): Unit
  @JSName("error")
  var error_Original: LogFn
  
  def info(msg: String): Unit
  @JSName("info")
  var info_Original: LogFn
  
  def warn(msg: String): Unit
  @JSName("warn")
  var warn_Original: LogFn
}
object Logger {
  
  inline def apply(
    error: /* msg */ String => Callback,
    info: /* msg */ String => Callback,
    warn: /* msg */ String => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* msg */ String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* msg */ String) => info(t0).runNow()), warn = js.Any.fromFunction1((t0: /* msg */ String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* msg */ String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: /* msg */ String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def setInfo(value: /* msg */ String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
    
    inline def setWarn(value: /* msg */ String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
  }
}
