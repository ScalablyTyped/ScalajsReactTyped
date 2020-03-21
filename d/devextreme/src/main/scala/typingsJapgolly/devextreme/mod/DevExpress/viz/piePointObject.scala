package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait piePointObject extends basePointObject {
  /** Gets the percentage value of the specific point. */
  var percent: String | Double | js.Date
  /** Hides a specific point. */
  def hide(): Unit
  /** Provides information about the visibility state of a point. */
  def isVisible(): Boolean
  /** Makes a specific point visible. */
  def show(): Unit
}

object piePointObject {
  @scala.inline
  def apply(
    clearHover: Callback,
    clearSelection: Callback,
    data: js.Any,
    fullState: Double,
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject with js.Array[baseLabelObject]],
    hide: Callback,
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    isVisible: CallbackTo[Boolean],
    originalArgument: String | Double | js.Date,
    originalValue: String | Double | js.Date,
    percent: String | Double | js.Date,
    select: Callback,
    series: js.Any,
    show: Callback,
    showTooltip: Callback,
    tag: js.Any
  ): piePointObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("clearHover")(clearHover.toJsFn)
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("hover")(hover.toJsFn)
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("isSelected")(isSelected.toJsFn)
    __obj.updateDynamic("isVisible")(isVisible.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[piePointObject]
  }
}

