package typingsJapgolly.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliveryStreamsInput extends js.Object {
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
    */
  var DeliveryStreamType: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  /**
    * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
    */
  var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.native
  /**
    * The maximum number of delivery streams to list. The default value is 10.
    */
  var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.native
}

object ListDeliveryStreamsInput {
  @scala.inline
  def apply(
    DeliveryStreamType: DeliveryStreamType = null,
    ExclusiveStartDeliveryStreamName: DeliveryStreamName = null,
    Limit: Int | Double = null
  ): ListDeliveryStreamsInput = {
    val __obj = js.Dynamic.literal()
    if (DeliveryStreamType != null) __obj.updateDynamic("DeliveryStreamType")(DeliveryStreamType.asInstanceOf[js.Any])
    if (ExclusiveStartDeliveryStreamName != null) __obj.updateDynamic("ExclusiveStartDeliveryStreamName")(ExclusiveStartDeliveryStreamName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeliveryStreamsInput]
  }
}

