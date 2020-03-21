package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait chartPointObject extends basePointObject {
  /** Provides information about the aggregation interval and the data objects that fall within it. */
  var aggregationInfo: chartPointAggregationInfoObject
  /** Contains the close value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalCloseValue: Double | String
  /** Contains the high value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalHighValue: Double | String
  /** Contains the low value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalLowValue: Double | String
  /** Contains the first value of the point. This field is useful for points belonging to a series of the range area or range bar type only. */
  var originalMinValue: String | Double | js.Date
  /** Contains the open value of the point. This field is useful for points belonging to a series of the candle stick or stock type only. */
  var originalOpenValue: Double | String
  /** Contains the size of the bubble as it was set in the data source. This field is useful for points belonging to a series of the bubble type only. */
  var size: Double | String
  /** Gets the parameters of the point's minimum bounding rectangle (MBR). */
  def getBoundingRect(): js.Any
}

object chartPointObject {
  @scala.inline
  def apply(
    aggregationInfo: chartPointAggregationInfoObject,
    clearHover: Callback,
    clearSelection: Callback,
    data: js.Any,
    fullState: Double,
    getBoundingRect: CallbackTo[js.Any],
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject with js.Array[baseLabelObject]],
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    originalArgument: String | Double | js.Date,
    originalCloseValue: Double | String,
    originalHighValue: Double | String,
    originalLowValue: Double | String,
    originalMinValue: String | Double | js.Date,
    originalOpenValue: Double | String,
    originalValue: String | Double | js.Date,
    select: Callback,
    series: js.Any,
    showTooltip: Callback,
    size: Double | String,
    tag: js.Any
  ): chartPointObject = {
    val __obj = js.Dynamic.literal(aggregationInfo = aggregationInfo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], originalArgument = originalArgument.asInstanceOf[js.Any], originalCloseValue = originalCloseValue.asInstanceOf[js.Any], originalHighValue = originalHighValue.asInstanceOf[js.Any], originalLowValue = originalLowValue.asInstanceOf[js.Any], originalMinValue = originalMinValue.asInstanceOf[js.Any], originalOpenValue = originalOpenValue.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("clearHover")(clearHover.toJsFn)
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.updateDynamic("getBoundingRect")(getBoundingRect.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("hover")(hover.toJsFn)
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("isSelected")(isSelected.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[chartPointObject]
  }
}

