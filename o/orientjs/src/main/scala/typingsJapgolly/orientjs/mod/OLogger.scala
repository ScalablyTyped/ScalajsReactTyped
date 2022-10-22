package typingsJapgolly.orientjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OLogger extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def log(args: Any*): Unit
}
object OLogger {
  
  inline def apply(
    debug: /* repeated */ Any => Callback,
    error: /* repeated */ Any => Callback,
    log: /* repeated */ Any => Callback
  ): OLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()))
    __obj.asInstanceOf[OLogger]
  }
  
  extension [Self <: OLogger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
