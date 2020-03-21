package typingsJapgolly.pulumiAws.inputMod.kinesis

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamKinesisSourceConfiguration extends js.Object {
  /**
    * The kinesis stream used as the source of the firehose delivery stream.
    */
  var kinesisStreamArn: Input[String] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: Input[String] = js.native
}

object FirehoseDeliveryStreamKinesisSourceConfiguration {
  @scala.inline
  def apply(kinesisStreamArn: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamKinesisSourceConfiguration = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirehoseDeliveryStreamKinesisSourceConfiguration]
  }
}

