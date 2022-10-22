package typingsJapgolly.ibmMobilefirst.WL

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class which defines instances created via:  WL.Logger.create({pkg: 'something'});
  * Actual definition is outside of WL namespace. For easier d.ts file compiling it is here
  */
trait LogInstance extends StObject {
  
  def debug(message: String): Unit
  
  def error(message: String): Unit
  
  def fatal(message: String): Unit
  
  def info(message: String): Unit
  
  def trace(message: String): Unit
  
  def warn(message: String): Unit
}
object LogInstance {
  
  inline def apply(
    debug: String => Callback,
    error: String => Callback,
    fatal: String => Callback,
    info: String => Callback,
    trace: String => Callback,
    warn: String => Callback
  ): LogInstance = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: String) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), fatal = js.Any.fromFunction1((t0: String) => fatal(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), trace = js.Any.fromFunction1((t0: String) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
    __obj.asInstanceOf[LogInstance]
  }
  
  extension [Self <: LogInstance](x: Self) {
    
    inline def setDebug(value: String => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFatal(value: String => Callback): Self = StObject.set(x, "fatal", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTrace(value: String => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
