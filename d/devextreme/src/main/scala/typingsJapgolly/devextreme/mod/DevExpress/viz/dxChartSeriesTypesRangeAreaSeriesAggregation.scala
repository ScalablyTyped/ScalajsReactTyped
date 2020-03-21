package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.custom
import typingsJapgolly.devextreme.devextremeStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures data aggregation for the series. */
trait dxChartSeriesTypesRangeAreaSeriesAggregation extends dxChartSeriesTypesCommonSeriesAggregation {
  /** Specifies how to aggregate series points. */
  @JSName("method")
  var method_dxChartSeriesTypesRangeAreaSeriesAggregation: js.UndefOr[range | custom] = js.undefined
}

object dxChartSeriesTypesRangeAreaSeriesAggregation {
  @scala.inline
  def apply(
    calculate: (/* aggregationInfo */ chartPointAggregationInfoObject, /* series */ chartSeriesObject) => CallbackTo[js.Any | js.Array[js.Any]] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    method: range | custom = null
  ): dxChartSeriesTypesRangeAreaSeriesAggregation = {
    val __obj = js.Dynamic.literal()
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction2((t0: /* aggregationInfo */ typingsJapgolly.devextreme.mod.DevExpress.viz.chartPointAggregationInfoObject, t1: /* series */ typingsJapgolly.devextreme.mod.DevExpress.viz.chartSeriesObject) => calculate(t0, t1).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesRangeAreaSeriesAggregation]
  }
}

