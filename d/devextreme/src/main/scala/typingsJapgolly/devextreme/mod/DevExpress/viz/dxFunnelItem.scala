package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFunnelItem extends js.Object {
  /** The item's argument. */
  var argument: String | js.Date | Double
  /** The item's original data object. */
  var data: js.Any
  /** The item's calculated percentage value. */
  var percent: Double
  /** The item's value. */
  var value: Double
  /** Gets the funnel item's color specified in the data source or palette. */
  def getColor(): String
  /** Changes the funnel item's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the funnel item is in the hover state. */
  def isHovered(): Boolean
  /** Indicates whether the funnel item is selected. */
  def isSelected(): Boolean
  /** Selects or cancels the funnel item's selection. */
  def select(state: Boolean): Unit
  /** Shows the funnel item's tooltip. */
  def showTooltip(): Unit
}

object dxFunnelItem {
  @scala.inline
  def apply(
    argument: String | js.Date | Double,
    data: js.Any,
    getColor: CallbackTo[String],
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    isSelected: CallbackTo[Boolean],
    percent: Double,
    select: Boolean => Callback,
    showTooltip: Callback,
    value: Double
  ): dxFunnelItem = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("hover")(js.Any.fromFunction1((t0: scala.Boolean) => hover(t0).runNow()))
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("isSelected")(isSelected.toJsFn)
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: scala.Boolean) => select(t0).runNow()))
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[dxFunnelItem]
  }
}

