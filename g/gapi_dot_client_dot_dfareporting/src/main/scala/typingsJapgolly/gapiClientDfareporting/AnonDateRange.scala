package typingsJapgolly.gapiClientDfareporting

import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.Activities
import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.CustomRichMediaEvents
import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.DateRange
import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.DimensionValue
import typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting.SortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDateRange extends js.Object {
  /** Activity group. */
  var activities: js.UndefOr[Activities] = js.undefined
  /** Custom Rich Media Events group. */
  var customRichMediaEvents: js.UndefOr[CustomRichMediaEvents] = js.undefined
  /** The date range this report should be run for. */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  /**
    * The list of filters on which dimensions are filtered.
    * Filters for different dimensions are ANDed, filters for the same dimension are grouped together and ORed.
    */
  var dimensionFilters: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The list of dimensions the report should include. */
  var dimensions: js.UndefOr[js.Array[SortedDimension]] = js.undefined
  /**
    * Whether to enable all reach dimension combinations in the report. Defaults to false. If enabled, the date range of the report should be within the last
    * three months.
    */
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined
  /** The list of names of metrics the report should include. */
  var metricNames: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of names of  Reach By Frequency metrics the report should include. */
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonDateRange {
  @scala.inline
  def apply(
    activities: Activities = null,
    customRichMediaEvents: CustomRichMediaEvents = null,
    dateRange: DateRange = null,
    dimensionFilters: js.Array[DimensionValue] = null,
    dimensions: js.Array[SortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined,
    metricNames: js.Array[String] = null,
    reachByFrequencyMetricNames: js.Array[String] = null
  ): AnonDateRange = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAllDimensionCombinations)) __obj.updateDynamic("enableAllDimensionCombinations")(enableAllDimensionCombinations.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (reachByFrequencyMetricNames != null) __obj.updateDynamic("reachByFrequencyMetricNames")(reachByFrequencyMetricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDateRange]
  }
}

