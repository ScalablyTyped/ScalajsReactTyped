package typingsJapgolly.titanium

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options object for the [accept](Titanium.Network.Socket.TCP.accept) method.
  */
trait AcceptDict extends js.Object {
  /**
  	 * Callback to be fired when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  	 */
  var error: js.UndefOr[js.Function1[/* param0 */ ErrorCallbackArgs, _]] = js.undefined
  /**
  	 * Timeout, in milliseconds, for all `write` operations.
  	 */
  var timeout: js.UndefOr[Double] = js.undefined
}

object AcceptDict {
  @scala.inline
  def apply(error: /* param0 */ ErrorCallbackArgs => CallbackTo[js.Any] = null, timeout: Int | Double = null): AcceptDict = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* param0 */ typingsJapgolly.titanium.ErrorCallbackArgs) => error(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptDict]
  }
}

