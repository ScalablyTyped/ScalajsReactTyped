package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsOutputDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream.
    */
  var ResourceARN: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to access the stream.  Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var RoleARN: js.UndefOr[typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.RoleARN] = js.native
}

object KinesisStreamsOutputDescription {
  @scala.inline
  def apply(ResourceARN: ResourceARN, RoleARN: RoleARN = null): KinesisStreamsOutputDescription = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamsOutputDescription]
  }
}

