package typingsJapgolly.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateVaultLockInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The vault lock policy as a JSON string, which uses "\" as an escape character.
    */
  var policy: js.UndefOr[VaultLockPolicy] = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object InitiateVaultLockInput {
  @scala.inline
  def apply(accountId: String, vaultName: String, policy: VaultLockPolicy = null): InitiateVaultLockInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateVaultLockInput]
  }
}

