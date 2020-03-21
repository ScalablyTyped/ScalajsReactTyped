package typingsJapgolly.awsSdkClientKmsNode.typesKeyMetadataMod

import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.AWS_KMS
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CUSTOMER
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Disabled
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ENCRYPT_DECRYPT
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.EXTERNAL
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Enabled
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_DOES_NOT_EXPIRE
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.KEY_MATERIAL_EXPIRES
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingDeletion
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.PendingImport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMetadata extends js.Object {
  /**
    * <p>The twelve-digit account ID of the AWS account that owns the CMK.</p>
    */
  var AWSAccountId: js.UndefOr[String] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the CMK. For examples, see <a href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time when the CMK was created.</p>
    */
  var CreationDate: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is <code>PendingDeletion</code>, otherwise this value is omitted.</p>
    */
  var DeletionDate: js.UndefOr[js.Date | String | Double] = js.undefined
  /**
    * <p>The description of the CMK.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true, otherwise it is false.</p>
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is <code>EXTERNAL</code>, otherwise this value is omitted.</p>
    */
  var ExpirationModel: js.UndefOr[KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String] = js.undefined
  /**
    * <p>The globally unique identifier for the CMK.</p>
    */
  var KeyId: String
  /**
    * <p>The CMK's manager. CMKs are either customer managed or AWS managed. For more information about the difference, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var KeyManager: js.UndefOr[AWS | CUSTOMER | String] = js.undefined
  /**
    * <p>The state of the CMK.</p> <p>For more information about how key state affects the use of a CMK, see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.</p>
    */
  var KeyState: js.UndefOr[Enabled | Disabled | PendingDeletion | PendingImport | String] = js.undefined
  /**
    * <p>The cryptographic operations for which you can use the CMK. Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a> operations.</p>
    */
  var KeyUsage: js.UndefOr[ENCRYPT_DECRYPT | String] = js.undefined
  /**
    * <p>The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management infrastructure or the CMK lacks key material.</p>
    */
  var Origin: js.UndefOr[AWS_KMS | EXTERNAL | String] = js.undefined
  /**
    * <p>The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this value is omitted.</p>
    */
  var ValidTo: js.UndefOr[js.Date | String | Double] = js.undefined
}

object KeyMetadata {
  @scala.inline
  def apply(
    KeyId: String,
    AWSAccountId: String = null,
    Arn: String = null,
    CreationDate: js.Date | String | Double = null,
    DeletionDate: js.Date | String | Double = null,
    Description: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    ExpirationModel: KEY_MATERIAL_EXPIRES | KEY_MATERIAL_DOES_NOT_EXPIRE | String = null,
    KeyManager: AWS | CUSTOMER | String = null,
    KeyState: Enabled | Disabled | PendingDeletion | PendingImport | String = null,
    KeyUsage: ENCRYPT_DECRYPT | String = null,
    Origin: AWS_KMS | EXTERNAL | String = null,
    ValidTo: js.Date | String | Double = null
  ): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (ExpirationModel != null) __obj.updateDynamic("ExpirationModel")(ExpirationModel.asInstanceOf[js.Any])
    if (KeyManager != null) __obj.updateDynamic("KeyManager")(KeyManager.asInstanceOf[js.Any])
    if (KeyState != null) __obj.updateDynamic("KeyState")(KeyState.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (ValidTo != null) __obj.updateDynamic("ValidTo")(ValidTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMetadata]
  }
}

