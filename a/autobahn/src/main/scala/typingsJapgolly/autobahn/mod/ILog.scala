package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILog extends StObject {
  
  def debug(args: Any*): Unit
}
object ILog {
  
  inline def apply(debug: /* repeated */ Any => Callback): ILog = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: /* repeated */ Any) => debug(t0).runNow()))
    __obj.asInstanceOf[ILog]
  }
  
  extension [Self <: ILog](x: Self) {
    
    inline def setDebug(value: /* repeated */ Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
