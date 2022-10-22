package typingsJapgolly.freedom.freedom

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortModule[T, T2]
  extends StObject
     with OnAndEmit[T, T2] {
  
  var controlChannel: String
}
object PortModule {
  
  inline def apply[T, T2](
    controlChannel: String,
    emit: (/* eventType */ String, /* value */ js.UndefOr[T2]) => Callback,
    on: (/* eventType */ String, /* handler */ js.Function1[T, Unit]) => Callback
  ): PortModule[T, T2] = {
    val __obj = js.Dynamic.literal(controlChannel = controlChannel.asInstanceOf[js.Any], emit = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* value */ js.UndefOr[T2]) => (emit(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: /* eventType */ String, t1: /* handler */ js.Function1[T, Unit]) => (on(t0, t1)).runNow()))
    __obj.asInstanceOf[PortModule[T, T2]]
  }
  
  extension [Self <: PortModule[?, ?], T, T2](x: Self & (PortModule[T, T2])) {
    
    inline def setControlChannel(value: String): Self = StObject.set(x, "controlChannel", value.asInstanceOf[js.Any])
  }
}
