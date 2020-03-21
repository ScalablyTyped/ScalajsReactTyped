package typingsJapgolly.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyMountTargetSecurityGroupsRequest extends js.Object {
  /**
    * The ID of the mount target whose security groups you want to modify.
    */
  var MountTargetId: typingsJapgolly.awsSdk.efsMod.MountTargetId = js.native
  /**
    * An array of up to five VPC security group IDs.
    */
  var SecurityGroups: js.UndefOr[typingsJapgolly.awsSdk.efsMod.SecurityGroups] = js.native
}

object ModifyMountTargetSecurityGroupsRequest {
  @scala.inline
  def apply(MountTargetId: MountTargetId, SecurityGroups: SecurityGroups = null): ModifyMountTargetSecurityGroupsRequest = {
    val __obj = js.Dynamic.literal(MountTargetId = MountTargetId.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyMountTargetSecurityGroupsRequest]
  }
}

