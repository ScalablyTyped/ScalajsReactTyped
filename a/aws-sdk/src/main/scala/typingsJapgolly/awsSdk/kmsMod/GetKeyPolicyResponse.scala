package typingsJapgolly.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyPolicyResponse extends js.Object {
  /**
    * A key policy document in JSON format.
    */
  var Policy: js.UndefOr[PolicyType] = js.native
}

object GetKeyPolicyResponse {
  @scala.inline
  def apply(Policy: PolicyType = null): GetKeyPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyPolicyResponse]
  }
}

