package typingsJapgolly.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePermissionPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup from which you want to delete the policy. The user making the request must be the owner of the RuleGroup.
    */
  var ResourceArn: typingsJapgolly.awsSdk.wafregionalMod.ResourceArn = js.native
}

object DeletePermissionPolicyRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): DeletePermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePermissionPolicyRequest]
  }
}

