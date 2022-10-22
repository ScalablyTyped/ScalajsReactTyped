package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: replace OnAndEmit with EventHandler and EventEmitter;
trait OnAndEmit[T, T2] extends StObject {
  
  def emit(eventType: String): Unit
  def emit(eventType: String, value: T2): Unit
  @JSName("emit")
  var emit_Original: EventDispatchFn[T2]
  
  def on(eventType: String, handler: js.Function1[/* eventData */ T, Unit]): Unit
  @JSName("on")
  var on_Original: EventHandlerFn[T]
}
object OnAndEmit {
  
  inline def apply[T, T2](
    emit: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Callback,
    on: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Callback
  ): OnAndEmit[T, T2] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* value */ js.UndefOr[T2]) => (emit(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* handler */ js.Function1[T, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[OnAndEmit[T, T2]]
  }
  
  extension [Self <: OnAndEmit[?, ?], T, T2](x: Self & (OnAndEmit[T, T2])) {
    
    inline def setEmit(value: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* value */ js.UndefOr[T2]) => (value(t0, t1)).runNow()))
    
    inline def setOn(value: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: /* eventType */ String, t1: /* handler */ js.Function1[T, Unit]) => (value(t0, t1)).runNow()))
  }
}
