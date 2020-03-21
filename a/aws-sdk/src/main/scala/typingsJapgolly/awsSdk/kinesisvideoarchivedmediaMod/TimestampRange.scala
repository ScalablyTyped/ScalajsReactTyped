package typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimestampRange extends js.Object {
  /**
    * The ending timestamp in the range of timestamps for which to return fragments.
    */
  var EndTimestamp: js.Date = js.native
  /**
    * The starting timestamp in the range of timestamps for which to return fragments.
    */
  var StartTimestamp: js.Date = js.native
}

object TimestampRange {
  @scala.inline
  def apply(EndTimestamp: js.Date, StartTimestamp: js.Date): TimestampRange = {
    val __obj = js.Dynamic.literal(EndTimestamp = EndTimestamp.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimestampRange]
  }
}

