package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Channels are ways that freedom modules can send each other messages.
trait Channel
  extends StObject
     with OnAndEmit[Any, Any] {
  
  def close(): Unit
}
object Channel {
  
  inline def apply(
    close: Callback,
    emit: (/* eventType */ String, /* value */ js.UndefOr[Any]) => Callback,
    on: (/* eventType */ String, /* handler */ js.Function1[Any, Unit]) => Callback
  ): Channel = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, emit = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* value */ js.UndefOr[Any]) => (emit(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* handler */ js.Function1[Any, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
