package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import typingsJapgolly.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
@js.native
class MobileBroadbandNetwork () extends IMobileBroadbandNetwork {
  /* CompleteClass */
  override var accessPointName: String = js.native
  /* CompleteClass */
  override var activationNetworkError: Double = js.native
  /* CompleteClass */
  override var networkAdapter: NetworkAdapter = js.native
  /* CompleteClass */
  override var networkRegistrationState: NetworkRegistrationState = js.native
  /* CompleteClass */
  override var packetAttachNetworkError: Double = js.native
  /* CompleteClass */
  override var registeredDataClass: DataClasses = js.native
  /* CompleteClass */
  override var registeredProviderId: String = js.native
  /* CompleteClass */
  override var registeredProviderName: String = js.native
  /* CompleteClass */
  override var registrationNetworkError: Double = js.native
  /* CompleteClass */
  override def showConnectionUI(): Unit = js.native
}

