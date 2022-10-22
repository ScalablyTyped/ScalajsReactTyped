package typingsJapgolly.glaze.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Console, glaze.glaze/dist-types/logger.LogLevel> */
trait PickConsoleLogLevel extends StObject {
  
  var error: js.Function1[/* repeated */ Any, Unit]
  
  var warn: js.Function1[/* repeated */ Any, Unit]
}
object PickConsoleLogLevel {
  
  inline def apply(error: /* repeated */ Any => Callback, warn: /* repeated */ Any => Callback): PickConsoleLogLevel = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), warn = js.Any.fromFunction1((t0: /* repeated */ Any) => warn(t0).runNow()))
    __obj.asInstanceOf[PickConsoleLogLevel]
  }
  
  extension [Self <: PickConsoleLogLevel](x: Self) {
    
    inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setWarn(value: /* repeated */ Any => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
