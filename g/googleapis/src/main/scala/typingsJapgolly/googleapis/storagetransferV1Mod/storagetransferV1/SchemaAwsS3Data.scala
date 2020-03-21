package typingsJapgolly.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An AwsS3Data resource can be a data source, but not a data sink. In an
  * AwsS3Data resource, an object&#39;s name is the S3 object&#39;s key name.
  */
@js.native
trait SchemaAwsS3Data extends js.Object {
  /**
    * AWS access key used to sign the API requests to the AWS S3 bucket.
    * Permissions on the bucket must be granted to the access ID of the AWS
    * access key. Required.
    */
  var awsAccessKey: js.UndefOr[SchemaAwsAccessKey] = js.native
  /**
    * S3 Bucket name (see [Creating a
    * bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/create-bucket-get-location-example.html)).
    * Required.
    */
  var bucketName: js.UndefOr[String] = js.native
}

object SchemaAwsS3Data {
  @scala.inline
  def apply(awsAccessKey: SchemaAwsAccessKey = null, bucketName: String = null): SchemaAwsS3Data = {
    val __obj = js.Dynamic.literal()
    if (awsAccessKey != null) __obj.updateDynamic("awsAccessKey")(awsAccessKey.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAwsS3Data]
  }
}

