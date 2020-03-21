package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation analyzing log information for queries and events. */
trait MetricTokenAggregation extends js.Object {
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.undefined
  /** Array of results for the metric token aggregation. */
  var results: js.UndefOr[js.Array[MetricTokenAggregationResult]] = js.undefined
}

object MetricTokenAggregation {
  @scala.inline
  def apply(event_type: String = null, results: js.Array[MetricTokenAggregationResult] = null): MetricTokenAggregation = {
    val __obj = js.Dynamic.literal()
    if (event_type != null) __obj.updateDynamic("event_type")(event_type.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTokenAggregation]
  }
}

