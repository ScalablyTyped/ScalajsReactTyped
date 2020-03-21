package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribableMixin extends js.Object {
  /**
    * Special form of calling `addListener` that *guarantees* that a
    * subscription *must* be tied to a component instance, and therefore will
    * be cleaned up when the component is unmounted. It is impossible to create
    * the subscription and pass it in - this method must be the one to create
    * the subscription and therefore can guarantee it is retained in a way that
    * will be cleaned up.
    *
    * @param eventEmitter emitter to subscribe to.
    * @param eventType Type of event to listen to.
    * @param listener Function to invoke when event occurs.
    * @param context Object to use as listener context.
    */
  def addListenerOn(eventEmitter: js.Any, eventType: String, listener: js.Function0[_], context: js.Any): Unit
}

object SubscribableMixin {
  @scala.inline
  def apply(addListenerOn: (js.Any, String, js.Function0[js.Any], js.Any) => Callback): SubscribableMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListenerOn")(js.Any.fromFunction4((t0: js.Any, t1: java.lang.String, t2: js.Function0[js.Any], t3: js.Any) => addListenerOn(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[SubscribableMixin]
  }
}

