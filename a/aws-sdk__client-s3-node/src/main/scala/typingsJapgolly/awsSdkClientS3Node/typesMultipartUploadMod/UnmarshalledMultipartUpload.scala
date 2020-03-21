package typingsJapgolly.awsSdkClientS3Node.typesMultipartUploadMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsJapgolly.awsSdkClientS3Node.typesInitiatorMod.UnmarshalledInitiator
import typingsJapgolly.awsSdkClientS3Node.typesOwnerMod.UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledMultipartUpload extends MultipartUpload {
  /**
    * <p>Date and time at which the multipart upload was initiated.</p>
    */
  @JSName("Initiated")
  var Initiated_UnmarshalledMultipartUpload: js.UndefOr[js.Date] = js.undefined
  /**
    * <p>Identifies who initiated the multipart upload.</p>
    */
  @JSName("Initiator")
  var Initiator_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledInitiator] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner_UnmarshalledMultipartUpload: js.UndefOr[UnmarshalledOwner] = js.undefined
}

object UnmarshalledMultipartUpload {
  @scala.inline
  def apply(
    Initiated: js.Date = null,
    Initiator: UnmarshalledInitiator = null,
    Key: String = null,
    Owner: UnmarshalledOwner = null,
    StorageClass: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String = null,
    UploadId: String = null
  ): UnmarshalledMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Initiated != null) __obj.updateDynamic("Initiated")(Initiated.asInstanceOf[js.Any])
    if (Initiator != null) __obj.updateDynamic("Initiator")(Initiator.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (StorageClass != null) __obj.updateDynamic("StorageClass")(StorageClass.asInstanceOf[js.Any])
    if (UploadId != null) __obj.updateDynamic("UploadId")(UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledMultipartUpload]
  }
}

