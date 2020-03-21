package typingsJapgolly.awsSdkClientS3Node.typesAnalyticsS3BucketDestinationMod

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsS3BucketDestination extends js.Object {
  /**
    * <p>The Amazon resource name (ARN) of the bucket to which data is exported.</p>
    */
  var Bucket: String
  /**
    * <p>The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.</p>
    */
  var BucketAccountId: js.UndefOr[String] = js.undefined
  /**
    * <p>The file format used when exporting data to Amazon S3.</p>
    */
  var Format: CSV | String
  /**
    * <p>The prefix to use when exporting data. The exported data begins with this prefix.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
}

object AnalyticsS3BucketDestination {
  @scala.inline
  def apply(Bucket: String, Format: CSV | String, BucketAccountId: String = null, Prefix: String = null): AnalyticsS3BucketDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any])
    if (BucketAccountId != null) __obj.updateDynamic("BucketAccountId")(BucketAccountId.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsS3BucketDestination]
  }
}

