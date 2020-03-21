package typingsJapgolly.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworksAddPeeringRequest extends js.Object {
  /** Whether Google Compute Engine manages the routes automatically. */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.undefined
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.undefined
}

object NetworksAddPeeringRequest {
  @scala.inline
  def apply(
    autoCreateRoutes: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    peerNetwork: String = null
  ): NetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreateRoutes)) __obj.updateDynamic("autoCreateRoutes")(autoCreateRoutes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (peerNetwork != null) __obj.updateDynamic("peerNetwork")(peerNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworksAddPeeringRequest]
  }
}

