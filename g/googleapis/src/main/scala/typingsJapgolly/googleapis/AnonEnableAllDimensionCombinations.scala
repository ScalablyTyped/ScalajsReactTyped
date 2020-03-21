package typingsJapgolly.googleapis

import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaActivities
import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaCustomRichMediaEvents
import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaDateRange
import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaDimensionValue
import typingsJapgolly.googleapis.v32Mod.dfareportingV32.SchemaSortedDimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnableAllDimensionCombinations extends js.Object {
  var activities: js.UndefOr[SchemaActivities] = js.native
  var customRichMediaEvents: js.UndefOr[SchemaCustomRichMediaEvents] = js.native
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  var dimensionFilters: js.UndefOr[js.Array[SchemaDimensionValue]] = js.native
  var dimensions: js.UndefOr[js.Array[SchemaSortedDimension]] = js.native
  var enableAllDimensionCombinations: js.UndefOr[Boolean] = js.native
  var metricNames: js.UndefOr[js.Array[String]] = js.native
  var reachByFrequencyMetricNames: js.UndefOr[js.Array[String]] = js.native
}

object AnonEnableAllDimensionCombinations {
  @scala.inline
  def apply(
    activities: SchemaActivities = null,
    customRichMediaEvents: SchemaCustomRichMediaEvents = null,
    dateRange: SchemaDateRange = null,
    dimensionFilters: js.Array[SchemaDimensionValue] = null,
    dimensions: js.Array[SchemaSortedDimension] = null,
    enableAllDimensionCombinations: js.UndefOr[Boolean] = js.undefined,
    metricNames: js.Array[String] = null,
    reachByFrequencyMetricNames: js.Array[String] = null
  ): AnonEnableAllDimensionCombinations = {
    val __obj = js.Dynamic.literal()
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (customRichMediaEvents != null) __obj.updateDynamic("customRichMediaEvents")(customRichMediaEvents.asInstanceOf[js.Any])
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (dimensionFilters != null) __obj.updateDynamic("dimensionFilters")(dimensionFilters.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAllDimensionCombinations)) __obj.updateDynamic("enableAllDimensionCombinations")(enableAllDimensionCombinations.asInstanceOf[js.Any])
    if (metricNames != null) __obj.updateDynamic("metricNames")(metricNames.asInstanceOf[js.Any])
    if (reachByFrequencyMetricNames != null) __obj.updateDynamic("reachByFrequencyMetricNames")(reachByFrequencyMetricNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnableAllDimensionCombinations]
  }
}

