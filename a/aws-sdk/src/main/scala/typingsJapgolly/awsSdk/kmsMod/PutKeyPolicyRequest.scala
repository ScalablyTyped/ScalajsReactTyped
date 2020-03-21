package typingsJapgolly.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutKeyPolicyRequest extends js.Object {
  /**
    * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the AWS Key Management Service Developer Guide.  Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the CMK. The default value is false.
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.native
  /**
    * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  /**
    * The key policy to attach to the CMK. The key policy must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must allow the principal that is making the PutKeyPolicy request to make a subsequent PutKeyPolicy request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the AWS Key Management Service Developer Guide.   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to AWS KMS. For more information, see Changes that I make are not always immediately visible in the AWS Identity and Access Management User Guide.   The key policy cannot exceed 32 kilobytes (32768 bytes). For more information, see Resource Quotas in the AWS Key Management Service Developer Guide.
    */
  var Policy: PolicyType = js.native
  /**
    * The name of the key policy. The only valid value is default.
    */
  var PolicyName: PolicyNameType = js.native
}

object PutKeyPolicyRequest {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Policy: PolicyType,
    PolicyName: PolicyNameType,
    BypassPolicyLockoutSafetyCheck: js.UndefOr[Boolean] = js.undefined
  ): PutKeyPolicyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
    if (!js.isUndefined(BypassPolicyLockoutSafetyCheck)) __obj.updateDynamic("BypassPolicyLockoutSafetyCheck")(BypassPolicyLockoutSafetyCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKeyPolicyRequest]
  }
}

