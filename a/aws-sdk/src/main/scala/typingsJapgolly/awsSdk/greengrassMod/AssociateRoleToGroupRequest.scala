package typingsJapgolly.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateRoleToGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
  /**
    * The ARN of the role you wish to associate with this group. The existence of the role is not validated.
    */
  var RoleArn: string = js.native
}

object AssociateRoleToGroupRequest {
  @scala.inline
  def apply(GroupId: string, RoleArn: string): AssociateRoleToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateRoleToGroupRequest]
  }
}

