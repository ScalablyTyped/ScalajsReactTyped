package typingsJapgolly.useSubscription.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription[T] extends js.Object {
  /**
    * (Synchronously) returns the current value of our subscription.
    */
  def getCurrentValue(): T
  /**
    * This function is passed an event handler to attach to the subscription.
    * It must return an unsubscribe function that removes the handler.
    */
  def subscribe(callback: js.Function0[Unit]): Unsubscribe
}

object Subscription {
  @scala.inline
  def apply[T](getCurrentValue: CallbackTo[T], subscribe: js.Function0[Unit] => CallbackTo[Unsubscribe]): Subscription[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentValue")(getCurrentValue.toJsFn)
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[Subscription[T]]
  }
}

