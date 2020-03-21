package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigResponse extends js.Object {
  /**
    * A list of VPC security groups IDs.
    */
  var SecurityGroupIds: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.SecurityGroupIds] = js.native
  /**
    * A list of VPC subnet IDs.
    */
  var SubnetIds: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.SubnetIds] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.lambdaMod.VpcId] = js.native
}

object VpcConfigResponse {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null, VpcId: VpcId = null): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigResponse]
  }
}

