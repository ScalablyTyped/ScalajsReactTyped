package typingsJapgolly.facebookJsSdk.facebook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacebookStaticEvent extends StObject {
  
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
  
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit
}
object FacebookStaticEvent {
  
  inline def apply(
    subscribe: (Any, FacebookEventCallback[Any]) => Callback,
    unsubscribe: (Any, FacebookEventCallback[Any]) => Callback
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2((t0: Any, t1: FacebookEventCallback[Any]) => (subscribe(t0, t1)).runNow()), unsubscribe = js.Any.fromFunction2((t0: Any, t1: FacebookEventCallback[Any]) => (unsubscribe(t0, t1)).runNow()))
    __obj.asInstanceOf[FacebookStaticEvent]
  }
  
  extension [Self <: FacebookStaticEvent](x: Self) {
    
    inline def setSubscribe(value: (Any, FacebookEventCallback[Any]) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: Any, t1: FacebookEventCallback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUnsubscribe(value: (Any, FacebookEventCallback[Any]) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: Any, t1: FacebookEventCallback[Any]) => (value(t0, t1)).runNow()))
  }
}
