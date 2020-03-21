package typingsJapgolly.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetVaultAccessPolicyInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The vault access policy as a JSON string.
    */
  var policy: js.UndefOr[VaultAccessPolicy] = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object SetVaultAccessPolicyInput {
  @scala.inline
  def apply(accountId: String, vaultName: String, policy: VaultAccessPolicy = null): SetVaultAccessPolicyInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVaultAccessPolicyInput]
  }
}

