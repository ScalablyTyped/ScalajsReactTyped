package typingsJapgolly.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteMultipartUploadInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual parts that you uploaded.
    */
  var archiveSize: js.UndefOr[String] = js.native
  /**
    * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as computed by Amazon S3 Glacier (Glacier), Glacier returns an error and the request fails.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The upload ID of the multipart upload.
    */
  var uploadId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object CompleteMultipartUploadInput {
  @scala.inline
  def apply(
    accountId: String,
    uploadId: String,
    vaultName: String,
    archiveSize: String = null,
    checksum: String = null
  ): CompleteMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (archiveSize != null) __obj.updateDynamic("archiveSize")(archiveSize.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadInput]
  }
}

