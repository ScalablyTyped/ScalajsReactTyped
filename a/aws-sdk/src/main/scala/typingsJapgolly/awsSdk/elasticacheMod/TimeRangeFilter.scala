package typingsJapgolly.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeRangeFilter extends js.Object {
  /**
    * The end time of the time range filter
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * The start time of the time range filter
    */
  var StartTime: js.UndefOr[js.Date] = js.native
}

object TimeRangeFilter {
  @scala.inline
  def apply(EndTime: js.Date = null, StartTime: js.Date = null): TimeRangeFilter = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRangeFilter]
  }
}

