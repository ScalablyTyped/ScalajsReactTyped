package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait basePointObject extends js.Object {
  /** Contains the data object that the series point represents. */
  var data: js.Any
  /** Provides information about the state of the point object. */
  var fullState: Double
  /** Returns the point's argument value that was set in the data source. */
  var originalArgument: String | Double | js.Date
  /** Returns the point's value that was set in the data source. */
  var originalValue: String | Double | js.Date
  /** Returns the series object to which the point belongs. */
  var series: js.Any
  /** Returns the tag of the point. */
  var tag: js.Any
  /** Switches the point from the hover state back to normal. */
  def clearHover(): Unit
  /** Deselects the point. */
  def clearSelection(): Unit
  /** Gets the color of a particular point. */
  def getColor(): String
  /** Allows you to obtain the label(s) of the series point. */
  def getLabel(): baseLabelObject with js.Array[baseLabelObject]
  /** Hides the tooltip of the point. */
  def hideTooltip(): Unit
  /** Switches the point into the hover state, the same as when a user places the mouse pointer on it. */
  def hover(): Unit
  /** Provides information about the hover state of a point. */
  def isHovered(): Boolean
  /** Provides information about the selection state of a point. */
  def isSelected(): Boolean
  /** Selects the point. The point is displayed in a 'selected' style until another point is selected or the current point is deselected programmatically. */
  def select(): Unit
  /** Shows the tooltip of the point. */
  def showTooltip(): Unit
}

object basePointObject {
  @scala.inline
  def apply(
    clearHover: Callback,
    clearSelection: Callback,
    data: js.Any,
    fullState: Double,
    getColor: CallbackTo[String],
    getLabel: CallbackTo[baseLabelObject with js.Array[baseLabelObject]],
    hideTooltip: Callback,
    hover: Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    originalArgument: String | Double | js.Date,
    originalValue: String | Double | js.Date,
    select: Callback,
    series: js.Any,
    showTooltip: Callback,
    tag: js.Any
  ): basePointObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fullState = fullState.asInstanceOf[js.Any], originalArgument = originalArgument.asInstanceOf[js.Any], originalValue = originalValue.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("clearHover")(clearHover.toJsFn)
    __obj.updateDynamic("clearSelection")(clearSelection.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("getLabel")(getLabel.toJsFn)
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("hover")(hover.toJsFn)
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("isSelected")(isSelected.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[basePointObject]
  }
}

