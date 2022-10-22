package typingsJapgolly.feflowCli

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def debug(desc: String): Unit
  
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def error(desc: String): Unit
  
  /**
    * Print trace level log, The Color is red
    * @param desc log detail
    */
  def fatal(desc: String): Unit
  
  /**
    * Print trace level log, The Color is green
    * @param desc log detail
    */
  def info(desc: String): Unit
  
  /**
    * Print trace level log, The Color is gray
    * @param desc log detail
    */
  def trace(desc: String): Unit
  
  /**
    * Print trace level log, The Color is yellow
    * @param desc log detail
    */
  def warn(desc: String): Unit
}
object Logger {
  
  inline def apply(
    debug: String => Callback,
    error: String => Callback,
    fatal: String => Callback,
    info: String => Callback,
    trace: String => Callback,
    warn: String => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: String) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), fatal = js.Any.fromFunction1((t0: String) => fatal(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), trace = js.Any.fromFunction1((t0: String) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFatal(value: String => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTrace(value: String => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
