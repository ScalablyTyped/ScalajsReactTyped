package typingsJapgolly.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeFlowEntitlementResponse extends js.Object {
  /**
    * The ARN of the entitlement that was revoked.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  /**
    * The ARN of the flow that the entitlement was revoked from.
    */
  var FlowArn: js.UndefOr[string] = js.native
}

object RevokeFlowEntitlementResponse {
  @scala.inline
  def apply(EntitlementArn: string = null, FlowArn: string = null): RevokeFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn.asInstanceOf[js.Any])
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeFlowEntitlementResponse]
  }
}

