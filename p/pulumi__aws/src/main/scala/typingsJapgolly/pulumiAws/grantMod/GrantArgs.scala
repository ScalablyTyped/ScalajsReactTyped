package typingsJapgolly.pulumiAws.grantMod

import typingsJapgolly.pulumiAws.inputMod.kms.GrantConstraint
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantArgs extends js.Object {
  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
    */
  val constraints: js.UndefOr[Input[js.Array[Input[GrantConstraint]]]] = js.native
  /**
    * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
    * * `retireOnDelete` -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
    * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
    */
  val grantCreationTokens: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val granteePrincipal: Input[String] = js.native
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
    */
  val keyId: Input[String] = js.native
  /**
    * A friendly name for identifying the grant.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
    */
  val operations: Input[js.Array[Input[String]]] = js.native
  val retireOnDelete: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val retiringPrincipal: js.UndefOr[Input[String]] = js.native
}

object GrantArgs {
  @scala.inline
  def apply(
    granteePrincipal: Input[String],
    keyId: Input[String],
    operations: Input[js.Array[Input[String]]],
    constraints: Input[js.Array[Input[GrantConstraint]]] = null,
    grantCreationTokens: Input[js.Array[Input[String]]] = null,
    name: Input[String] = null,
    retireOnDelete: Input[Boolean] = null,
    retiringPrincipal: Input[String] = null
  ): GrantArgs = {
    val __obj = js.Dynamic.literal(granteePrincipal = granteePrincipal.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (grantCreationTokens != null) __obj.updateDynamic("grantCreationTokens")(grantCreationTokens.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retireOnDelete != null) __obj.updateDynamic("retireOnDelete")(retireOnDelete.asInstanceOf[js.Any])
    if (retiringPrincipal != null) __obj.updateDynamic("retiringPrincipal")(retiringPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantArgs]
  }
}

