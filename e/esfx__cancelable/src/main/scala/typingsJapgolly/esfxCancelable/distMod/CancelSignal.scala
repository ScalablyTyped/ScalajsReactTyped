package typingsJapgolly.esfxCancelable.distMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelSignal extends js.Object {
  /**
    * Gets a value indicating whether cancellation was signaled.
    */
  val signaled: Boolean
  /**
    * Subscribes to notifications for when the object becomes signaled.
    */
  def subscribe(onSignaled: js.Function0[Unit]): CancelSubscription
}

object CancelSignal {
  @scala.inline
  def apply(signaled: Boolean, subscribe: js.Function0[Unit] => CallbackTo[CancelSubscription]): CancelSignal = {
    val __obj = js.Dynamic.literal(signaled = signaled.asInstanceOf[js.Any])
    __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[CancelSignal]
  }
}

