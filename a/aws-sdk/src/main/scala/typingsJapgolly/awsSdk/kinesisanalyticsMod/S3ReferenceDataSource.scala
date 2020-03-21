package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSource extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typingsJapgolly.awsSdk.kinesisanalyticsMod.BucketARN = js.native
  /**
    * Object key name containing reference data.
    */
  var FileKey: typingsJapgolly.awsSdk.kinesisanalyticsMod.FileKey = js.native
  /**
    * ARN of the IAM role that the service can assume to read data on your behalf. This role must have permission for the s3:GetObject action on the object and trust policy that allows Amazon Kinesis Analytics service principal to assume this role.
    */
  var ReferenceRoleARN: RoleARN = js.native
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], ReferenceRoleARN = ReferenceRoleARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
}

