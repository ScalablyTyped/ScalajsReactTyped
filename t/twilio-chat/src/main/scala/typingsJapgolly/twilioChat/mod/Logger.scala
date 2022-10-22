package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// twilio-chat is used by Flex SDK. Please DO NOT change
trait Logger extends StObject {
  
  def debug(args: Any*): Unit
  
  def error(args: Any*): Unit
  
  def info(args: Any*): Unit
  
  /* private */ var prefix: Any
  
  def setLevel(level: Any): Unit
  
  def trace(args: Any*): Unit
  
  def warn(args: Any*): Unit
}
object Logger {
  
  inline def apply(
    debug: /* repeated */ Any => Callback,
    error: /* repeated */ Any => Callback,
    info: /* repeated */ Any => Callback,
    prefix: Any,
    setLevel: Any => Callback,
    trace: /* repeated */ Any => Callback,
    warn: /* repeated */ Any => Callback
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), prefix = prefix.asInstanceOf[js.Any], setLevel = js.Any.fromFunction1((t0: Any) => setLevel(t0).runNow()), trace = js.Any.fromFunction1((t0: /* repeated */ Any) => trace(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setPrefix(value: Any): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setSetLevel(value: Any => Callback): Self = StObject.set(x, "setLevel", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTrace(value: /* repeated */ Any => Callback): Self = StObject.set(x, "trace", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
