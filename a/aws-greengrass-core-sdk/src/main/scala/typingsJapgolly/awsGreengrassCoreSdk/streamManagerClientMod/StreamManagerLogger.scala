package typingsJapgolly.awsGreengrassCoreSdk.streamManagerClientMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamManagerLogger extends StObject {
  
  def debug(args: scala.Nothing*): Unit
  
  def error(args: scala.Nothing*): Unit
  
  def info(args: scala.Nothing*): Unit
  
  def warn(args: scala.Nothing*): Unit
}
object StreamManagerLogger {
  
  inline def apply(
    debug: /* repeated */ scala.Nothing => Callback,
    error: /* repeated */ scala.Nothing => Callback,
    info: /* repeated */ scala.Nothing => Callback,
    warn: /* repeated */ scala.Nothing => Callback
  ): StreamManagerLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => error(t0).runNow()), info = js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => info(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => warn(t0).runNow()))
    __obj.asInstanceOf[StreamManagerLogger]
  }
  
  extension [Self <: StreamManagerLogger](x: Self) {
    
    inline def setDebug(value: /* repeated */ scala.Nothing => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => value(t0).runNow()))
    
    inline def setError(value: /* repeated */ scala.Nothing => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => value(t0).runNow()))
    
    inline def setInfo(value: /* repeated */ scala.Nothing => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ scala.Nothing => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ scala.Nothing) => value(t0).runNow()))
  }
}
