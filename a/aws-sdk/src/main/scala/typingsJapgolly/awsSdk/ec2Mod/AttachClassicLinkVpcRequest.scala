package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachClassicLinkVpcRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of one or more of the VPC's security groups. You cannot specify security groups from a different VPC.
    */
  var Groups: GroupIdStringList = js.native
  /**
    * The ID of an EC2-Classic instance to link to the ClassicLink-enabled VPC.
    */
  var InstanceId: typingsJapgolly.awsSdk.ec2Mod.InstanceId = js.native
  /**
    * The ID of a ClassicLink-enabled VPC.
    */
  var VpcId: typingsJapgolly.awsSdk.ec2Mod.VpcId = js.native
}

object AttachClassicLinkVpcRequest {
  @scala.inline
  def apply(
    Groups: GroupIdStringList,
    InstanceId: InstanceId,
    VpcId: VpcId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): AttachClassicLinkVpcRequest = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachClassicLinkVpcRequest]
  }
}

