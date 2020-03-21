package typingsJapgolly.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsumerDescription extends js.Object {
  /**
    * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call SubscribeToShard. If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that reference consumer ARNs.
    */
  var ConsumerARN: typingsJapgolly.awsSdk.kinesisMod.ConsumerARN = js.native
  /**
    * 
    */
  var ConsumerCreationTimestamp: js.Date = js.native
  /**
    * The name of the consumer is something you choose when you register the consumer.
    */
  var ConsumerName: typingsJapgolly.awsSdk.kinesisMod.ConsumerName = js.native
  /**
    * A consumer can't read data while in the CREATING or DELETING states.
    */
  var ConsumerStatus: typingsJapgolly.awsSdk.kinesisMod.ConsumerStatus = js.native
  /**
    * The ARN of the stream with which you registered the consumer.
    */
  var StreamARN: typingsJapgolly.awsSdk.kinesisMod.StreamARN = js.native
}

object ConsumerDescription {
  @scala.inline
  def apply(
    ConsumerARN: ConsumerARN,
    ConsumerCreationTimestamp: js.Date,
    ConsumerName: ConsumerName,
    ConsumerStatus: ConsumerStatus,
    StreamARN: StreamARN
  ): ConsumerDescription = {
    val __obj = js.Dynamic.literal(ConsumerARN = ConsumerARN.asInstanceOf[js.Any], ConsumerCreationTimestamp = ConsumerCreationTimestamp.asInstanceOf[js.Any], ConsumerName = ConsumerName.asInstanceOf[js.Any], ConsumerStatus = ConsumerStatus.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConsumerDescription]
  }
}

