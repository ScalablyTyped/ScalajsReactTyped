package typingsJapgolly.awsSdkClientS3Node.typesStatsEventMod

import typingsJapgolly.awsSdkClientS3Node.typesStatsMod.UnmarshalledStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStatsEvent extends StatsEvent {
  /**
    * <p>The Stats event details.</p>
    */
  @JSName("Details")
  var Details_UnmarshalledStatsEvent: js.UndefOr[UnmarshalledStats] = js.undefined
}

object UnmarshalledStatsEvent {
  @scala.inline
  def apply(Details: UnmarshalledStats = null): UnmarshalledStatsEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStatsEvent]
  }
}

