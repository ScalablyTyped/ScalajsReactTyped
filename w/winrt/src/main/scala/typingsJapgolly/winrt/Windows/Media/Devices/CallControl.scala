package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallControl
  extends StObject
     with ICallControl
object CallControl {
  
  inline def apply(
    endCall: Double => Callback,
    hasRinger: Boolean,
    indicateActiveCall: Double => Callback,
    indicateNewIncomingCall: (Boolean, String) => Double,
    indicateNewOutgoingCall: CallbackTo[Double],
    onanswerrequested: Any,
    onaudiotransferrequested: Any,
    ondialrequested: Any,
    onhanguprequested: Any,
    onkeypadpressed: Any,
    onredialrequested: Any
  ): CallControl = {
    val __obj = js.Dynamic.literal(endCall = js.Any.fromFunction1((t0: Double) => endCall(t0).runNow()), hasRinger = hasRinger.asInstanceOf[js.Any], indicateActiveCall = js.Any.fromFunction1((t0: Double) => indicateActiveCall(t0).runNow()), indicateNewIncomingCall = js.Any.fromFunction2(indicateNewIncomingCall), indicateNewOutgoingCall = indicateNewOutgoingCall.toJsFn, onanswerrequested = onanswerrequested.asInstanceOf[js.Any], onaudiotransferrequested = onaudiotransferrequested.asInstanceOf[js.Any], ondialrequested = ondialrequested.asInstanceOf[js.Any], onhanguprequested = onhanguprequested.asInstanceOf[js.Any], onkeypadpressed = onkeypadpressed.asInstanceOf[js.Any], onredialrequested = onredialrequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallControl]
  }
}
