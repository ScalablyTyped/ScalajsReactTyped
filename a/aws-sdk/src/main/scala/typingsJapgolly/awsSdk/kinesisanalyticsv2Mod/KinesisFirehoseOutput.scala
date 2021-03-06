package typingsJapgolly.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseOutput extends js.Object {
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var ResourceARN: typingsJapgolly.awsSdk.kinesisanalyticsv2Mod.ResourceARN = js.native
}

object KinesisFirehoseOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisFirehoseOutput]
  }
}

