package typingsJapgolly.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseStreamRetentionPeriodInput extends js.Object {
  /**
    * The new retention period of the stream, in hours. Must be less than the current retention period.
    */
  var RetentionPeriodHours: typingsJapgolly.awsSdk.kinesisMod.RetentionPeriodHours = js.native
  /**
    * The name of the stream to modify.
    */
  var StreamName: typingsJapgolly.awsSdk.kinesisMod.StreamName = js.native
}

object DecreaseStreamRetentionPeriodInput {
  @scala.inline
  def apply(RetentionPeriodHours: RetentionPeriodHours, StreamName: StreamName): DecreaseStreamRetentionPeriodInput = {
    val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecreaseStreamRetentionPeriodInput]
  }
}

