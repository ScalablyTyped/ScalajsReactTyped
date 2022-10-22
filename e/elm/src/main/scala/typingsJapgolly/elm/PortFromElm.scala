package typingsJapgolly.elm

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortFromElm[V] extends StObject {
  
  def subscribe(handler: js.Function1[/* value */ V, Unit]): Unit
  
  def unsubscribe(handler: js.Function1[/* value */ V, Unit]): Unit
}
object PortFromElm {
  
  inline def apply[V](
    subscribe: js.Function1[/* value */ V, Unit] => Callback,
    unsubscribe: js.Function1[/* value */ V, Unit] => Callback
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1((t0: js.Function1[/* value */ V, Unit]) => subscribe(t0).runNow()), unsubscribe = js.Any.fromFunction1((t0: js.Function1[/* value */ V, Unit]) => unsubscribe(t0).runNow()))
    __obj.asInstanceOf[PortFromElm[V]]
  }
  
  extension [Self <: PortFromElm[?], V](x: Self & PortFromElm[V]) {
    
    inline def setSubscribe(value: js.Function1[/* value */ V, Unit] => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction1((t0: js.Function1[/* value */ V, Unit]) => value(t0).runNow()))
    
    inline def setUnsubscribe(value: js.Function1[/* value */ V, Unit] => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1((t0: js.Function1[/* value */ V, Unit]) => value(t0).runNow()))
  }
}
