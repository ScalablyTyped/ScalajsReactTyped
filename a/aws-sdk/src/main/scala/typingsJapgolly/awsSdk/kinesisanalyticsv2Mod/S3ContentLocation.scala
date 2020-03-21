package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ContentLocation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARN: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.BucketARN = js.native
  /**
    * The file key for the object containing the application code.
    */
  var FileKey: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.FileKey = js.native
  /**
    * The version of the object containing the application code.
    */
  var ObjectVersion: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ObjectVersion] = js.native
}

object S3ContentLocation {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ObjectVersion: ObjectVersion = null): S3ContentLocation = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    if (ObjectVersion != null) __obj.updateDynamic("ObjectVersion")(ObjectVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ContentLocation]
  }
}

