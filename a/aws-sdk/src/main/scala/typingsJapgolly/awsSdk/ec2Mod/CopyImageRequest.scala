package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyImageRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see How to Ensure Idempotency in the Amazon Elastic Compute Cloud User Guide.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * A description for the new AMI in the destination Region.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * An identifier for the symmetric AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted volume. This parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default CMK for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. When using an alias name, prefix it with "alias/". For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias ARN: arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias    AWS parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.  The specified CMK must exist in the Region that the snapshot is being copied to.  Amazon EBS does not support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.KmsKeyId] = js.native
  /**
    * The name of the new AMI in the destination Region.
    */
  var Name: String = js.native
  /**
    * The ID of the AMI to copy.
    */
  var SourceImageId: String = js.native
  /**
    * The name of the Region that contains the AMI to copy.
    */
  var SourceRegion: String = js.native
}

object CopyImageRequest {
  @scala.inline
  def apply(
    Name: String,
    SourceImageId: String,
    SourceRegion: String,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    KmsKeyId: KmsKeyId = null
  ): CopyImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
}

