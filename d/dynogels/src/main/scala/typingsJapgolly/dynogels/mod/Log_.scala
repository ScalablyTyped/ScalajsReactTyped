package typingsJapgolly.dynogels.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log_ extends StObject {
  
  def info(args: Any*): Unit
  
  def warn(args: Any*): Unit
}
object Log_ {
  
  inline def apply(info: /* repeated */ Any => Callback, warn: /* repeated */ Any => Callback): Log_ = {
    val __obj = js.Dynamic.literal(info = js.Any.fromFunction1((t0: /* repeated */ Any) => info(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Log_]
  }
  
  extension [Self <: Log_](x: Self) {
    
    inline def setInfo(value: /* repeated */ Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
