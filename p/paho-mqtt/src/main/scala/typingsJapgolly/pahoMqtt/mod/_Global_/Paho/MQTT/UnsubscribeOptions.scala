package typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeOptions extends js.Object {
  /** passed to the onSuccess callback or onFailure callback.  */
  var invocationContext: js.UndefOr[js.Any] = js.undefined
  /** called when the unsubscribe request has failed or timed out. */
  var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
  /** called when the unsubscribe acknowledgement has been received from the server. */
  var onSuccess: js.UndefOr[OnSuccessCallback] = js.undefined
  /**
    * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
    * The presence of a timeout does not prevent the onSuccess callback from being called when the unsubscribe
    * completes.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object UnsubscribeOptions {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    onFailure: /* e */ ErrorWithInvocationContext => Callback = null,
    onSuccess: /* o */ WithInvocationContext => Callback = null,
    timeout: Int | Double = null
  ): UnsubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT.ErrorWithInvocationContext) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* o */ typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT.WithInvocationContext) => onSuccess(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeOptions]
  }
}

