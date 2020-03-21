package typingsJapgolly.nodeObserver.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var subscribers: js.Array[js.Object]
  /**
    * triggering event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param data passed to the callback function when the event is fired
    */
  def send(targetObj: js.Object, eventName: String, data: js.Any): Unit
  /**
    * subscirpt event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param callback callback function executed when an event is fired
    */
  def subscribe(targetObj: js.Object, eventName: String, callback: js.Any): Unit
  /**
    * unsubscript event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    */
  def unsubscribe(targetObj: js.Object, eventName: String): Unit
}

object Observer {
  @scala.inline
  def apply(
    send: (js.Object, String, js.Any) => Callback,
    subscribe: (js.Object, String, js.Any) => Callback,
    subscribers: js.Array[js.Object],
    unsubscribe: (js.Object, String) => Callback
  ): Observer = {
    val __obj = js.Dynamic.literal(subscribers = subscribers.asInstanceOf[js.Any])
    __obj.updateDynamic("send")(js.Any.fromFunction3((t0: js.Object, t1: java.lang.String, t2: js.Any) => send(t0, t1, t2).runNow()))
    __obj.updateDynamic("subscribe")(js.Any.fromFunction3((t0: js.Object, t1: java.lang.String, t2: js.Any) => subscribe(t0, t1, t2).runNow()))
    __obj.updateDynamic("unsubscribe")(js.Any.fromFunction2((t0: js.Object, t1: java.lang.String) => unsubscribe(t0, t1).runNow()))
    __obj.asInstanceOf[Observer]
  }
}

