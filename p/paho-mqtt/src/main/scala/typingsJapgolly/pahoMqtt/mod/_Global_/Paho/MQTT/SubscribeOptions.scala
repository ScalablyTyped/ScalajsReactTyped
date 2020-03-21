package typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to control a subscription
  */
trait SubscribeOptions extends js.Object {
  /** passed to the onSuccess callback or onFailure callback. */
  var invocationContext: js.UndefOr[js.Any] = js.undefined
  /** called when the subscribe request has failed or timed out. */
  var onFailure: js.UndefOr[OnFailureCallback] = js.undefined
  /** called when the subscribe acknowledgement has been received from the server. */
  var onSuccess: js.UndefOr[OnSubscribeSuccessCallback] = js.undefined
  /** the maximum qos of any publications sent as a result of making this subscription. */
  var qos: js.UndefOr[Qos] = js.undefined
  /**
    * timeout which, if present, determines the number of seconds after which the onFailure calback is called.
    * The presence of a timeout does not prevent the onSuccess callback from being called when the subscribe
    * completes.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    invocationContext: js.Any = null,
    onFailure: /* e */ ErrorWithInvocationContext => Callback = null,
    onSuccess: /* o */ OnSubscribeSuccessParams => Callback = null,
    qos: Qos = null,
    timeout: Int | Double = null
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT.ErrorWithInvocationContext) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* o */ typingsJapgolly.pahoMqtt.mod._Global_.Paho.MQTT.OnSubscribeSuccessParams) => onSuccess(t0).runNow()))
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOptions]
  }
}

