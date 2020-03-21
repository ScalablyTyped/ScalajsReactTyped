package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingInfo extends js.Object {
  /**
    * The name of an Amazon S3 bucket where execution logs are stored .
    */
  var S3BucketName: typingsJapgolly.awsSdk.ssmMod.S3BucketName = js.native
  /**
    * (Optional) The Amazon S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.S3KeyPrefix] = js.native
  /**
    * The region where the Amazon S3 bucket is located.
    */
  var S3Region: typingsJapgolly.awsSdk.ssmMod.S3Region = js.native
}

object LoggingInfo {
  @scala.inline
  def apply(S3BucketName: S3BucketName, S3Region: S3Region, S3KeyPrefix: S3KeyPrefix = null): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any])
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
}

