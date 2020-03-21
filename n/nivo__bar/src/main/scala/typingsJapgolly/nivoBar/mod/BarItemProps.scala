package typingsJapgolly.nivoBar.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.nivoBar.AnonId
import typingsJapgolly.nivoCore.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarItemProps extends js.Object {
  var borderColor: String
  var borderRadius: Double
  var borderWidth: Double
  var color: String
  var data: AnonId
  var height: Double
  var label: String
  var labelColor: String
  var onClick: BarClickHandler
  var shouldRenderLabel: Boolean
  var theme: Theme
  var tooltip: TooltipProp
  var tooltipFormat: String | ValueFormatter
  var width: Double
  var x: Double
  var y: Double
  def hideTooltip(): Unit
  def showTooltip(tooltip: Node, event: ReactMouseEventFrom[HTMLCanvasElement]): Unit
}

object BarItemProps {
  @scala.inline
  def apply(
    borderColor: String,
    borderRadius: Double,
    borderWidth: Double,
    color: String,
    data: AnonId,
    height: Double,
    hideTooltip: Callback,
    label: String,
    labelColor: String,
    onClick: (/* datum */ BarExtendedDatum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback,
    shouldRenderLabel: Boolean,
    showTooltip: (Node, ReactMouseEventFrom[HTMLCanvasElement]) => Callback,
    theme: Theme,
    tooltip: TooltipProp,
    tooltipFormat: String | ValueFormatter,
    width: Double,
    x: Double,
    y: Double
  ): BarItemProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelColor = labelColor.asInstanceOf[js.Any], shouldRenderLabel = shouldRenderLabel.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipFormat = tooltipFormat.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoBar.mod.BarExtendedDatum, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLCanvasElement]) => onClick(t0, t1).runNow()))
    __obj.updateDynamic("showTooltip")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLCanvasElement]) => showTooltip(t0, t1).runNow()))
    __obj.asInstanceOf[BarItemProps]
  }
}

