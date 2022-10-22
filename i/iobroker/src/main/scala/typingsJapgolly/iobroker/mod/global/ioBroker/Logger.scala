package typingsJapgolly.iobroker.mod.global.ioBroker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /** log message with debug level */
  def debug(message: String): Unit
  
  /** log message with error severity */
  def error(message: String): Unit
  
  /** log message with info level (default output level for all adapters) */
  def info(message: String): Unit
  
  /** Verbosity of the log output */
  var level: LogLevel
  
  /** log message with silly level */
  def silly(message: String): Unit
  
  /** log message with warning severity */
  def warn(message: String): Unit
}
object Logger {
  
  inline def apply(
    debug: String => Callback,
    error: String => Callback,
    info: String => Callback,
    level: LogLevel,
    silly: String => Callback,
    warn: String => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: String) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), level = level.asInstanceOf[js.Any], silly = js.Any.fromFunction1((t0: String) => silly(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setSilly(value: String => Callback): Self = StObject.set(x, "silly", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
