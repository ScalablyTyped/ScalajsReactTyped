package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryS3BucketDestination extends js.Object {
  /**
    * The ID of the account that owns the destination bucket.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.AccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the bucket where inventory results will be published.
    */
  var Bucket: BucketName = js.native
  /**
    * Contains the type of server-side encryption used to encrypt the inventory results.
    */
  var Encryption: js.UndefOr[InventoryEncryption] = js.native
  /**
    * Specifies the output format of the inventory results.
    */
  var Format: InventoryFormat = js.native
  /**
    * The prefix that is prepended to all inventory results.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Prefix] = js.native
}

object InventoryS3BucketDestination {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Format: InventoryFormat,
    AccountId: AccountId = null,
    Encryption: InventoryEncryption = null,
    Prefix: Prefix = null
  ): InventoryS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryS3BucketDestination]
  }
}

