package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteObjectsRequest extends js.Object {
  /**
    * The bucket name containing the objects to delete.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must have sufficient permissions to perform this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.BypassGovernanceRetention] = js.native
  /**
    * Container for the request.
    */
  var Delete: typingsJapgolly.awsSdk.s3Mod.Delete = js.native
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device. Required to permanently delete a versioned object if versioning is configured with MFA delete enabled.
    */
  var MFA: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.MFA] = js.native
  var RequestPayer: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.RequestPayer] = js.native
}

object DeleteObjectsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delete: Delete,
    BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
    MFA: MFA = null,
    RequestPayer: RequestPayer = null
  ): DeleteObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention.asInstanceOf[js.Any])
    if (MFA != null) __obj.updateDynamic("MFA")(MFA.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsRequest]
  }
}

