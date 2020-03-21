package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs a license acquisition process. */
trait IPlayReadyLicenseAcquisitionServiceRequest extends IPlayReadyServiceRequest {
  /** Gets the current content header property. */
  var contentHeader: PlayReadyContentHeader
  /** Gets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String
}

object IPlayReadyLicenseAcquisitionServiceRequest {
  @scala.inline
  def apply(
    beginServiceRequest: CallbackTo[IAsyncAction],
    challengeCustomData: String,
    contentHeader: PlayReadyContentHeader,
    domainServiceId: String,
    generateManualEnablingChallenge: CallbackTo[PlayReadySoapMessage],
    nextServiceRequest: CallbackTo[IPlayReadyServiceRequest],
    processManualEnablingResponse: js.Array[Double] => CallbackTo[WinRTError],
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyLicenseAcquisitionServiceRequest = {
    val __obj = js.Dynamic.literal(challengeCustomData = challengeCustomData.asInstanceOf[js.Any], contentHeader = contentHeader.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("beginServiceRequest")(beginServiceRequest.toJsFn)
    __obj.updateDynamic("generateManualEnablingChallenge")(generateManualEnablingChallenge.toJsFn)
    __obj.updateDynamic("nextServiceRequest")(nextServiceRequest.toJsFn)
    __obj.updateDynamic("processManualEnablingResponse")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => processManualEnablingResponse(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyLicenseAcquisitionServiceRequest]
  }
}

