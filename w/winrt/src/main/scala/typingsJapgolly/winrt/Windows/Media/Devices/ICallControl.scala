package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControl extends js.Object {
  var hasRinger: Boolean
  var onanswerrequested: js.Any
  var onaudiotransferrequested: js.Any
  var ondialrequested: js.Any
  var onhanguprequested: js.Any
  var onkeypadpressed: js.Any
  var onredialrequested: js.Any
  def endCall(callToken: Double): Unit
  def indicateActiveCall(callToken: Double): Unit
  def indicateNewIncomingCall(enableRinger: Boolean, callerId: String): Double
  def indicateNewOutgoingCall(): Double
}

object ICallControl {
  @scala.inline
  def apply(
    endCall: Double => Callback,
    hasRinger: Boolean,
    indicateActiveCall: Double => Callback,
    indicateNewIncomingCall: (Boolean, String) => CallbackTo[Double],
    indicateNewOutgoingCall: CallbackTo[Double],
    onanswerrequested: js.Any,
    onaudiotransferrequested: js.Any,
    ondialrequested: js.Any,
    onhanguprequested: js.Any,
    onkeypadpressed: js.Any,
    onredialrequested: js.Any
  ): ICallControl = {
    val __obj = js.Dynamic.literal(hasRinger = hasRinger.asInstanceOf[js.Any], onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.updateDynamic("endCall")(js.Any.fromFunction1((t0: scala.Double) => endCall(t0).runNow()))
    __obj.updateDynamic("indicateActiveCall")(js.Any.fromFunction1((t0: scala.Double) => indicateActiveCall(t0).runNow()))
    __obj.updateDynamic("indicateNewIncomingCall")(js.Any.fromFunction2((t0: scala.Boolean, t1: java.lang.String) => indicateNewIncomingCall(t0, t1).runNow()))
    __obj.updateDynamic("indicateNewOutgoingCall")(indicateNewOutgoingCall.toJsFn)
    __obj.asInstanceOf[ICallControl]
  }
}

