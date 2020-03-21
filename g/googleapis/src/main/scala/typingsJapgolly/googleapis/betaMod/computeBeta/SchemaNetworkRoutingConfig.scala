package typingsJapgolly.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A routing configuration attached to a network resource. The message
  * includes the list of routers associated with the network, and a flag
  * indicating the type of routing behavior to enforce network-wide.
  */
@js.native
trait SchemaNetworkRoutingConfig extends js.Object {
  /**
    * The network-wide routing mode to use. If set to REGIONAL, this
    * network&#39;s cloud routers will only advertise routes with subnets of
    * this network in the same region as the router. If set to GLOBAL, this
    * network&#39;s cloud routers will advertise routes with all subnets of
    * this network, across regions.
    */
  var routingMode: js.UndefOr[String] = js.native
}

object SchemaNetworkRoutingConfig {
  @scala.inline
  def apply(routingMode: String = null): SchemaNetworkRoutingConfig = {
    val __obj = js.Dynamic.literal()
    if (routingMode != null) __obj.updateDynamic("routingMode")(routingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkRoutingConfig]
  }
}

