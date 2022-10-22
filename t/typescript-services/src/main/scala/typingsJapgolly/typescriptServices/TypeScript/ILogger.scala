package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILogger extends StObject {
  
  def debug(): Boolean
  
  def error(): Boolean
  
  def fatal(): Boolean
  
  def information(): Boolean
  
  def log(s: String): Unit
  
  def warning(): Boolean
}
object ILogger {
  
  inline def apply(
    debug: CallbackTo[Boolean],
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    information: CallbackTo[Boolean],
    log: String => Callback,
    warning: CallbackTo[Boolean]
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = debug.toJsFn, error = error.toJsFn, fatal = fatal.toJsFn, information = information.toJsFn, log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), warning = warning.toJsFn)
    __obj.asInstanceOf[ILogger]
  }
  
  extension [Self <: ILogger](x: Self) {
    
    inline def setDebug(value: CallbackTo[Boolean]): Self = StObject.set(x, "debug", value.toJsFn)
    
    inline def setError(value: CallbackTo[Boolean]): Self = StObject.set(x, "error", value.toJsFn)
    
    inline def setFatal(value: CallbackTo[Boolean]): Self = StObject.set(x, "fatal", value.toJsFn)
    
    inline def setInformation(value: CallbackTo[Boolean]): Self = StObject.set(x, "information", value.toJsFn)
    
    inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarning(value: CallbackTo[Boolean]): Self = StObject.set(x, "warning", value.toJsFn)
  }
}
