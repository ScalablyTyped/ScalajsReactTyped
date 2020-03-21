package typingsJapgolly.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BatchEventTask extends js.Object {
  var s3BucketArn: String
  var s3Key: String
  var s3VersionId: String | Null
  var taskId: String
}

object S3BatchEventTask {
  @scala.inline
  def apply(s3BucketArn: String, s3Key: String, taskId: String, s3VersionId: String = null): S3BatchEventTask = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    if (s3VersionId != null) __obj.updateDynamic("s3VersionId")(s3VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchEventTask]
  }
}

