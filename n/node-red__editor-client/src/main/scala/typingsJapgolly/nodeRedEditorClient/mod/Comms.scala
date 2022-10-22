package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comms extends StObject {
  
  def connect(): Unit
  
  def subscribe(topic: String, callback: CommSubscriber): Unit
  
  def unsubscribe(topic: String, callback: CommSubscriber): Unit
}
object Comms {
  
  inline def apply(
    connect: Callback,
    subscribe: (String, CommSubscriber) => Callback,
    unsubscribe: (String, CommSubscriber) => Callback
  ): Comms = {
    val __obj = js.Dynamic.literal(connect = connect.toJsFn, subscribe = js.Any.fromFunction2((t0: String, t1: CommSubscriber) => (subscribe(t0, t1)).runNow()), unsubscribe = js.Any.fromFunction2((t0: String, t1: CommSubscriber) => (unsubscribe(t0, t1)).runNow()))
    __obj.asInstanceOf[Comms]
  }
  
  extension [Self <: Comms](x: Self) {
    
    inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setSubscribe(value: (String, CommSubscriber) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: String, t1: CommSubscriber) => (value(t0, t1)).runNow()))
    
    inline def setUnsubscribe(value: (String, CommSubscriber) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: String, t1: CommSubscriber) => (value(t0, t1)).runNow()))
  }
}
