package typingsJapgolly.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalReport extends js.Object {
  var counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
  var cumulative_counters: js.UndefOr[js.Array[SignalMetric]] = js.undefined
  var gauges: js.UndefOr[js.Array[SignalMetric]] = js.undefined
}

object SignalReport {
  @scala.inline
  def apply(
    counters: js.Array[SignalMetric] = null,
    cumulative_counters: js.Array[SignalMetric] = null,
    gauges: js.Array[SignalMetric] = null
  ): SignalReport = {
    val __obj = js.Dynamic.literal()
    if (counters != null) __obj.updateDynamic("counters")(counters.asInstanceOf[js.Any])
    if (cumulative_counters != null) __obj.updateDynamic("cumulative_counters")(cumulative_counters.asInstanceOf[js.Any])
    if (gauges != null) __obj.updateDynamic("gauges")(gauges.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalReport]
  }
}

