package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsV2Request extends js.Object {
  /**
    * Bucket name to list.  When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation using an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName = js.native
  /**
    * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  /**
    * A delimiter is a character you use to group keys.
    */
  var Delimiter: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Delimiter] = js.native
  /**
    * Encoding type used by Amazon S3 to encode object keys in the response.
    */
  var EncodingType: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.EncodingType] = js.native
  /**
    * The owner field is not present in listV2 by default, if you want to return owner field with each key in the result then set the fetch owner field to true.
    */
  var FetchOwner: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.FetchOwner] = js.native
  /**
    * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
    */
  var MaxKeys: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.MaxKeys] = js.native
  /**
    * Limits the response to keys that begin with the specified prefix.
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.Prefix] = js.native
  /**
    * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket owners need not specify this parameter in their requests.
    */
  var RequestPayer: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket.
    */
  var StartAfter: js.UndefOr[typingsJapgolly.awsSdk.s3Mod.StartAfter] = js.native
}

object ListObjectsV2Request {
  @scala.inline
  def apply(
    Bucket: BucketName,
    ContinuationToken: Token = null,
    Delimiter: Delimiter = null,
    EncodingType: EncodingType = null,
    FetchOwner: js.UndefOr[Boolean] = js.undefined,
    MaxKeys: Int | Double = null,
    Prefix: Prefix = null,
    RequestPayer: RequestPayer = null,
    StartAfter: StartAfter = null
  ): ListObjectsV2Request = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (Delimiter != null) __obj.updateDynamic("Delimiter")(Delimiter.asInstanceOf[js.Any])
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (!js.isUndefined(FetchOwner)) __obj.updateDynamic("FetchOwner")(FetchOwner.asInstanceOf[js.Any])
    if (MaxKeys != null) __obj.updateDynamic("MaxKeys")(MaxKeys.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (StartAfter != null) __obj.updateDynamic("StartAfter")(StartAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsV2Request]
  }
}

