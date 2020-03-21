package typingsJapgolly.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterStreamConsumerInput extends js.Object {
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.
    */
  var ConsumerARN: js.UndefOr[typingsJapgolly.awsSdk.kinesisMod.ConsumerARN] = js.native
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typingsJapgolly.awsSdk.kinesisMod.ConsumerName] = js.native
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[typingsJapgolly.awsSdk.kinesisMod.StreamARN] = js.native
}

object DeregisterStreamConsumerInput {
  @scala.inline
  def apply(ConsumerARN: ConsumerARN = null, ConsumerName: ConsumerName = null, StreamARN: StreamARN = null): DeregisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    if (ConsumerARN != null) __obj.updateDynamic("ConsumerARN")(ConsumerARN.asInstanceOf[js.Any])
    if (ConsumerName != null) __obj.updateDynamic("ConsumerName")(ConsumerName.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterStreamConsumerInput]
  }
}

