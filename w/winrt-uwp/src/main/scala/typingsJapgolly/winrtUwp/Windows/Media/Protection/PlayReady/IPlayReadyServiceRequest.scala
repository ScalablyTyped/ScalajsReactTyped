package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Media.Protection.IMediaProtectionServiceRequest
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Base interface for all service request interfaces. */
trait IPlayReadyServiceRequest extends IMediaProtectionServiceRequest {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction
  /**
    * Begins the process of manually enabling.
    * @return Begins the process of manually enabling.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest
  /**
    * Processes the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError
}

object IPlayReadyServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => CallbackTo[WinRTError],
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyServiceRequest = {
    val __obj = js.Dynamic.literal(challengeCustomData = challengeCustomData.asInstanceOf[js.Any], protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("beginServiceRequest")(beginServiceRequest.toJsFn)
    __obj.updateDynamic("generateManualEnablingChallenge")(generateManualEnablingChallenge.toJsFn)
    __obj.updateDynamic("nextServiceRequest")(nextServiceRequest.toJsFn)
    __obj.updateDynamic("processManualEnablingResponse")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => processManualEnablingResponse(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyServiceRequest]
  }
}

