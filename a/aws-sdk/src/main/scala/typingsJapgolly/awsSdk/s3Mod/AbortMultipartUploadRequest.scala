package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortMultipartUploadRequest extends js.Object {
  /**
    * The bucket name to which the upload was taking place.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Key of the object for which the multipart upload was initiated.
    */
  var Key: ObjectKey = js.native
  var RequestPayer: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Upload ID that identifies the multipart upload.
    */
  var UploadId: MultipartUploadId = js.native
}

object AbortMultipartUploadRequest {
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId, RequestPayer: RequestPayer = null): AbortMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadRequest]
  }
}

