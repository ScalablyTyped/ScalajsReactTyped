package typingsJapgolly.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SampleChannelDataRequest extends js.Object {
  /**
    * The name of the channel whose message samples are retrieved.
    */
  var channelName: ChannelName = js.native
  /**
    * The end of the time window from which sample messages are retrieved.
    */
  var endTime: js.UndefOr[js.Date] = js.native
  /**
    * The number of sample messages to be retrieved. The limit is 10, the default is also 10.
    */
  var maxMessages: js.UndefOr[MaxMessages] = js.native
  /**
    * The start of the time window from which sample messages are retrieved.
    */
  var startTime: js.UndefOr[js.Date] = js.native
}

object SampleChannelDataRequest {
  @scala.inline
  def apply(
    channelName: ChannelName,
    endTime: js.Date = null,
    maxMessages: Int | Double = null,
    startTime: js.Date = null
  ): SampleChannelDataRequest = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SampleChannelDataRequest]
  }
}

