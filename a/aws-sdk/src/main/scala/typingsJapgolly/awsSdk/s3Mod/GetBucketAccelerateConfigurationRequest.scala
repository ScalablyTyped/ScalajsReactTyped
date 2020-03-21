package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Name of the bucket for which the accelerate configuration is retrieved.
    */
  var Bucket: BucketName = js.native
}

object GetBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName): GetBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBucketAccelerateConfigurationRequest]
  }
}

