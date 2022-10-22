package typingsJapgolly.nodeObserver

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-observer", JSImport.Namespace)
  @js.native
  val ^ : Observer = js.native
  
  trait Observer extends StObject {
    
    /**
      * triggering event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      * @param data passed to the callback function when the event is fired
      */
    def send(targetObj: js.Object, eventName: String, data: Any): Unit
    
    /**
      * subscirpt event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      * @param callback callback function executed when an event is fired
      */
    def subscribe(targetObj: js.Object, eventName: String, callback: Any): Unit
    
    /* private */ var subscribers: js.Array[js.Object]
    
    /**
      * unsubscript event
      * @param targetObj objects that subscribe to events
      * @param eventName the event name
      */
    def unsubscribe(targetObj: js.Object, eventName: String): Unit
  }
  object Observer {
    
    inline def apply(
      send: (js.Object, String, Any) => Callback,
      subscribe: (js.Object, String, Any) => Callback,
      subscribers: js.Array[js.Object],
      unsubscribe: (js.Object, String) => Callback
    ): Observer = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction3((t0: js.Object, t1: String, t2: Any) => (send(t0, t1, t2)).runNow()), subscribe = js.Any.fromFunction3((t0: js.Object, t1: String, t2: Any) => (subscribe(t0, t1, t2)).runNow()), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2((t0: js.Object, t1: String) => (unsubscribe(t0, t1)).runNow()))
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setSend(value: (js.Object, String, Any) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction3((t0: js.Object, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setSubscribe(value: (js.Object, String, Any) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction3((t0: js.Object, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setSubscribers(value: js.Array[js.Object]): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      inline def setSubscribersVarargs(value: js.Object*): Self = StObject.set(x, "subscribers", js.Array(value*))
      
      inline def setUnsubscribe(value: (js.Object, String) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: js.Object, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  type _To = Observer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Observer = ^
}
