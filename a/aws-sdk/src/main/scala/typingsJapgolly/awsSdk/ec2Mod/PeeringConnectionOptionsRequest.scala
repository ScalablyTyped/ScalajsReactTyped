package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeeringConnectionOptionsRequest extends js.Object {
  /**
    * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.
    */
  var AllowDnsResolutionFromRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * If true, enables outbound communication from an EC2-Classic instance that's linked to a local VPC using ClassicLink to instances in a peer VPC.
    */
  var AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[Boolean] = js.native
  /**
    * If true, enables outbound communication from instances in a local VPC to an EC2-Classic instance that's linked to a peer VPC using ClassicLink.
    */
  var AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[Boolean] = js.native
}

object PeeringConnectionOptionsRequest {
  @scala.inline
  def apply(
    AllowDnsResolutionFromRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalClassicLinkToRemoteVpc: js.UndefOr[scala.Boolean] = js.undefined,
    AllowEgressFromLocalVpcToRemoteClassicLink: js.UndefOr[scala.Boolean] = js.undefined
  ): PeeringConnectionOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowDnsResolutionFromRemoteVpc)) __obj.updateDynamic("AllowDnsResolutionFromRemoteVpc")(AllowDnsResolutionFromRemoteVpc.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowEgressFromLocalClassicLinkToRemoteVpc)) __obj.updateDynamic("AllowEgressFromLocalClassicLinkToRemoteVpc")(AllowEgressFromLocalClassicLinkToRemoteVpc.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowEgressFromLocalVpcToRemoteClassicLink)) __obj.updateDynamic("AllowEgressFromLocalVpcToRemoteClassicLink")(AllowEgressFromLocalVpcToRemoteClassicLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeeringConnectionOptionsRequest]
  }
}

