package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages secure stop messages. */
trait IPlayReadySecureStopServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current publisher certificate property. */
  var publisherCertificate: Double
  /** Gets the secure stop session identifier property. */
  var sessionID: String
  /** Gets the secure stop session's start time property. */
  var startTime: js.Date
  /** Gets the secure stop session's stopped flag property which indicates whether the secure stop session for this request was cleanly shut down. */
  var stopped: Boolean
  /** Gets the secure stop session's update/stop time property. */
  var updateTime: js.Date
}

object IPlayReadySecureStopServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => CallbackTo[WinRTError],
    protectionSystem: String,
    publisherCertificate: Double,
    responseCustomData: String,
    sessionID: String,
    startTime: js.Date,
    stopped: Boolean,
    `type`: String,
    updateTime: js.Date,
    uri: Uri
  ): IPlayReadySecureStopServiceRequest = {
    val __obj = js.Dynamic.literal(challengeCustomData = challengeCustomData.asInstanceOf[js.Any], protectionSystem = protectionSystem.asInstanceOf[js.Any], publisherCertificate = publisherCertificate.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], sessionID = sessionID.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("beginServiceRequest")(beginServiceRequest.toJsFn)
    __obj.updateDynamic("generateManualEnablingChallenge")(generateManualEnablingChallenge.toJsFn)
    __obj.updateDynamic("nextServiceRequest")(nextServiceRequest.toJsFn)
    __obj.updateDynamic("processManualEnablingResponse")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => processManualEnablingResponse(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadySecureStopServiceRequest]
  }
}

