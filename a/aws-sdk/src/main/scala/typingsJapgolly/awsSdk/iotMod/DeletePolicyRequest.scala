package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyRequest extends js.Object {
  /**
    * The name of the policy to delete.
    */
  var policyName: PolicyName = js.native
}

object DeletePolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePolicyRequest]
  }
}

