package typingsJapgolly.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLifecyclePolicyResponse extends js.Object {
  /**
    * The identifier of the lifecycle policy.
    */
  var PolicyId: js.UndefOr[typingsJapgolly.awsSdk.dlmMod.PolicyId] = js.native
}

object CreateLifecyclePolicyResponse {
  @scala.inline
  def apply(PolicyId: PolicyId = null): CreateLifecyclePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (PolicyId != null) __obj.updateDynamic("PolicyId")(PolicyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLifecyclePolicyResponse]
  }
}

