package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.recharts.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrushProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: js.UndefOr[DataKey] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var leaveTimeOut: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[RechartsFunction] = js.undefined
  var padding: js.UndefOr[PartialMargin] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  var travellerWidth: js.UndefOr[Double] = js.undefined
  var updateId: js.UndefOr[String | Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object BrushProps {
  @scala.inline
  def apply(
    children: VdomNode = null,
    className: String = null,
    data: js.Array[_] = null,
    dataKey: DataKey = null,
    endIndex: Int | Double = null,
    fill: String = null,
    gap: Int | Double = null,
    height: Int | Double = null,
    leaveTimeOut: Int | Double = null,
    onChange: /* repeated */ js.Any => Callback = null,
    padding: PartialMargin = null,
    startIndex: Int | Double = null,
    stroke: String = null,
    tickFormatter: /* value */ js.Any => CallbackTo[js.Any] = null,
    travellerWidth: Int | Double = null,
    updateId: String | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): BrushProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (leaveTimeOut != null) __obj.updateDynamic("leaveTimeOut")(leaveTimeOut.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onChange(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tickFormatter != null) __obj.updateDynamic("tickFormatter")(js.Any.fromFunction1((t0: /* value */ js.Any) => tickFormatter(t0).runNow()))
    if (travellerWidth != null) __obj.updateDynamic("travellerWidth")(travellerWidth.asInstanceOf[js.Any])
    if (updateId != null) __obj.updateDynamic("updateId")(updateId.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushProps]
  }
}

