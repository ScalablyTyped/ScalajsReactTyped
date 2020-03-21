package typingsJapgolly.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferingHints extends js.Object {
  /**
    * Buffer incoming data for the specified period of time, in seconds, before delivering it to the destination. The default value is 300. This parameter is optional but if you specify a value for it, you must also specify a value for SizeInMBs, and vice versa.
    */
  var IntervalInSeconds: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.IntervalInSeconds] = js.native
  /**
    * Buffer incoming data to the specified size, in MiBs, before delivering it to the destination. The default value is 5. This parameter is optional but if you specify a value for it, you must also specify a value for IntervalInSeconds, and vice versa. We recommend setting this parameter to a value greater than the amount of data you typically ingest into the delivery stream in 10 seconds. For example, if you typically ingest data at 1 MiB/sec, the value should be 10 MiB or higher.
    */
  var SizeInMBs: js.UndefOr[typingsJapgolly.awsSdk.firehoseMod.SizeInMBs] = js.native
}

object BufferingHints {
  @scala.inline
  def apply(IntervalInSeconds: Int | Double = null, SizeInMBs: Int | Double = null): BufferingHints = {
    val __obj = js.Dynamic.literal()
    if (IntervalInSeconds != null) __obj.updateDynamic("IntervalInSeconds")(IntervalInSeconds.asInstanceOf[js.Any])
    if (SizeInMBs != null) __obj.updateDynamic("SizeInMBs")(SizeInMBs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferingHints]
  }
}

