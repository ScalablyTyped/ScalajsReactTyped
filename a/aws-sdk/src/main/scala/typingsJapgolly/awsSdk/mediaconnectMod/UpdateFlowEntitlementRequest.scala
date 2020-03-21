package typingsJapgolly.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowEntitlementRequest extends js.Object {
  /**
    * A description of the entitlement. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the subscriber or end user.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The type of encryption that will be used on the output associated with this entitlement.
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.native
  /**
    * The ARN of the entitlement that you want to update.
    */
  var EntitlementArn: string = js.native
  /**
    * The flow that is associated with the entitlement that you want to update.
    */
  var FlowArn: string = js.native
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: js.UndefOr[listOfString] = js.native
}

object UpdateFlowEntitlementRequest {
  @scala.inline
  def apply(
    EntitlementArn: string,
    FlowArn: string,
    Description: string = null,
    Encryption: UpdateEncryption = null,
    Subscribers: listOfString = null
  ): UpdateFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Subscribers != null) __obj.updateDynamic("Subscribers")(Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowEntitlementRequest]
  }
}

