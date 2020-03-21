package typingsJapgolly.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDRTRoleRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the role the DRT will use to access your AWS account. Prior to making the AssociateDRTRole request, you must attach the AWSShieldDRTAccessPolicy managed policy to this role. For more information see Attaching and Detaching IAM Policies.
    */
  var RoleArn: typingsJapgolly.awsSdk.shieldMod.RoleArn = js.native
}

object AssociateDRTRoleRequest {
  @scala.inline
  def apply(RoleArn: RoleArn): AssociateDRTRoleRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateDRTRoleRequest]
  }
}

