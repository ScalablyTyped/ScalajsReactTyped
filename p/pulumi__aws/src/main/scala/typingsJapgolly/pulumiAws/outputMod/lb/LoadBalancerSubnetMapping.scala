package typingsJapgolly.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerSubnetMapping extends js.Object {
  /**
    * The allocation ID of the Elastic IP address.
    */
  var allocationId: js.UndefOr[String] = js.native
  /**
    * The id of the subnet of which to attach to the load balancer. You can specify only one subnet per Availability Zone.
    */
  var subnetId: String = js.native
}

object LoadBalancerSubnetMapping {
  @scala.inline
  def apply(subnetId: String, allocationId: String = null): LoadBalancerSubnetMapping = {
    val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any])
    if (allocationId != null) __obj.updateDynamic("allocationId")(allocationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerSubnetMapping]
  }
}

