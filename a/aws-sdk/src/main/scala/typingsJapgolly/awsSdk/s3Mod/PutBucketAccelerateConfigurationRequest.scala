package typingsJapgolly.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBucketAccelerateConfigurationRequest extends js.Object {
  /**
    * Container for setting the transfer acceleration state.
    */
  var AccelerateConfiguration: typingsJapgolly.awsSdk.s3Mod.AccelerateConfiguration = js.native
  /**
    * Name of the bucket for which the accelerate configuration is set.
    */
  var Bucket: BucketName = js.native
}

object PutBucketAccelerateConfigurationRequest {
  @scala.inline
  def apply(AccelerateConfiguration: AccelerateConfiguration, Bucket: BucketName): PutBucketAccelerateConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccelerateConfiguration = AccelerateConfiguration.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketAccelerateConfigurationRequest]
  }
}

