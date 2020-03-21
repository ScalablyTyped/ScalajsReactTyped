package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksAddPeeringRequest extends js.Object {
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * in network_peering instead. Whether Google Compute Engine manages the
    * routes automatically.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Network peering parameters. In order to specify route policies for
    * peering using import/export custom routes, you will have to fill all
    * peering related parameters (name, peer network, exchange_subnet_routes)
    * in network_peeringfield. Corresponding fields in
    * NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
  /**
    * URL of the peer network. It can be either full URL or partial URL. The
    * peer network may belong to a different project. If the partial URL does
    * not contain project, it is assumed that the peer network is in the same
    * project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}

object SchemaNetworksAddPeeringRequest {
  @scala.inline
  def apply(
    autoCreateRoutes: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    networkPeering: SchemaNetworkPeering = null,
    peerNetwork: String = null
  ): SchemaNetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreateRoutes)) __obj.updateDynamic("autoCreateRoutes")(autoCreateRoutes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkPeering != null) __obj.updateDynamic("networkPeering")(networkPeering.asInstanceOf[js.Any])
    if (peerNetwork != null) __obj.updateDynamic("peerNetwork")(peerNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworksAddPeeringRequest]
  }
}

