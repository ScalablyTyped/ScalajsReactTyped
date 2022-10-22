package typingsJapgolly.imapflow.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def debug(obj: js.Object): Unit
  
  def error(obj: js.Object): Unit
  
  def info(obj: js.Object): Unit
  
  def warn(obj: js.Object): Unit
}
object Logger {
  
  inline def apply(
    debug: js.Object => Callback,
    error: js.Object => Callback,
    info: js.Object => Callback,
    warn: js.Object => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: js.Object) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: js.Object) => error(t0).runNow()), info = js.Any.fromFunction1((t0: js.Object) => info(t0).runNow()), warn = js.Any.fromFunction1((t0: js.Object) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: js.Object => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setError(value: js.Object => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setInfo(value: js.Object => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setWarn(value: js.Object => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
