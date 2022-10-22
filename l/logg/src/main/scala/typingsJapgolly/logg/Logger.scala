package typingsJapgolly.logg

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def error(var_args: Any*): Unit
  
  def fine(var_args: Any*): Unit
  
  def getLogLevel(): Double
  
  def getParent(): Logger
  
  def getWatchers(): js.Array[js.Function]
  
  def info(var_args: Any*): Unit
  
  def isLoggable(level: Double): Boolean
  
  def log(level: Double, var_args: Any*): Unit
  
  def registerWatcher(watcher: js.Function1[/* logRecord */ String, Unit]): Unit
  
  def setLogLevel(level: Double): Unit
  
  def setParent(logger: Logger): Unit
  
  def warn(var_args: Any*): Unit
}
object Logger {
  
  inline def apply(
    error: /* repeated */ Any => Callback,
    fine: /* repeated */ Any => Callback,
    getLogLevel: CallbackTo[Double],
    getParent: CallbackTo[Logger],
    getWatchers: CallbackTo[js.Array[js.Function]],
    info: /* repeated */ Any => Callback,
    isLoggable: Double => Boolean,
    log: (Double, /* repeated */ Any) => Callback,
    registerWatcher: js.Function1[/* logRecord */ String, Unit] => Callback,
    setLogLevel: Double => Callback,
    setParent: Logger => Callback,
    warn: /* repeated */ Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), fine = js.Any.fromFunction1((t0: /* repeated */ Any) => fine(t0).runNow()), getLogLevel = getLogLevel.toJsFn, getParent = getParent.toJsFn, getWatchers = getWatchers.toJsFn, info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), isLoggable = js.Any.fromFunction1(isLoggable), log = js.Any.fromFunction2((t0: Double, t1: /* repeated */ Any) => (log(t0, t1)).runNow()), registerWatcher = js.Any.fromFunction1((t0: js.Function1[/* logRecord */ String, Unit]) => registerWatcher(t0).runNow()), setLogLevel = js.Any.fromFunction1((t0: Double) => setLogLevel(t0).runNow()), setParent = js.Any.fromFunction1((t0: Logger) => setParent(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setFine(value: /* repeated */ Any => Callback): Self = StObject.set(x, "fine", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setGetLogLevel(value: CallbackTo[Double]): Self = StObject.set(x, "getLogLevel", value.toJsFn)
    
    inline def setGetParent(value: CallbackTo[Logger]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setGetWatchers(value: CallbackTo[js.Array[js.Function]]): Self = StObject.set(x, "getWatchers", value.toJsFn)
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setIsLoggable(value: Double => Boolean): Self = StObject.set(x, "isLoggable", js.Any.fromFunction1(value))
    
    inline def setLog(value: (Double, /* repeated */ Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: Double, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setRegisterWatcher(value: js.Function1[/* logRecord */ String, Unit] => Callback): Self = StObject.set(x, "registerWatcher", js.Any.fromFunction1((t0: js.Function1[/* logRecord */ String, Unit]) => value(t0).runNow()))
    
    inline def setSetLogLevel(value: Double => Callback): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetParent(value: Logger => Callback): Self = StObject.set(x, "setParent", js.Any.fromFunction1((t0: Logger) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
