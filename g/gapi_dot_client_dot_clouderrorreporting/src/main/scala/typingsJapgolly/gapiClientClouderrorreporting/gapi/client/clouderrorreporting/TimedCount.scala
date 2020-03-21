package typingsJapgolly.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimedCount extends js.Object {
  /** Approximate number of occurrences in the given time period. */
  var count: js.UndefOr[String] = js.undefined
  /** End of the time period to which `count` refers (excluded). */
  var endTime: js.UndefOr[String] = js.undefined
  /** Start of the time period to which `count` refers (included). */
  var startTime: js.UndefOr[String] = js.undefined
}

object TimedCount {
  @scala.inline
  def apply(count: String = null, endTime: String = null, startTime: String = null): TimedCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedCount]
  }
}

