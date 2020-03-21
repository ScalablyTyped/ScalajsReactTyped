package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the service methods for obtaining PlayReady licenses. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseAcquisitionServiceRequest")
@js.native
/** Initializes a new instance of the PlayReadyLicenseAcquisitionServiceRequest class. */
class PlayReadyLicenseAcquisitionServiceRequest () extends js.Object {
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String = js.native
  /** Gets or sets the current content header property. */
  var contentHeader: PlayReadyContentHeader = js.native
  /** Gets or sets the current domain service identifier property that overrides a service identifier in the content header. */
  var domainServiceId: String = js.native
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String = js.native
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String = js.native
  /** Gets the GUID for the type of operation that the PlayReady license acquisition service request performs. */
  var `type`: String = js.native
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction = js.native
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage = js.native
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
}

