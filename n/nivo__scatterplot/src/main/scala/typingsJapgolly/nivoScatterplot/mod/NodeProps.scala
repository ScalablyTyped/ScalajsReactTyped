package typingsJapgolly.nivoScatterplot.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.std.VoidFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var blendMode: CssMixBlendMode
  var color: String
  var node: Node
  var onClick: js.UndefOr[VoidFunction] = js.undefined
  var onMouseEnter: js.UndefOr[VoidFunction] = js.undefined
  var onMouseLeave: js.UndefOr[VoidFunction] = js.undefined
  var onMouseMove: js.UndefOr[VoidFunction] = js.undefined
  var size: Double
  var x: Double
  var y: Double
}

object NodeProps {
  @scala.inline
  def apply(
    blendMode: CssMixBlendMode,
    color: String,
    node: Node,
    size: Double,
    x: Double,
    y: Double,
    onClick: js.UndefOr[Callback] = js.undefined,
    onMouseEnter: js.UndefOr[Callback] = js.undefined,
    onMouseLeave: js.UndefOr[Callback] = js.undefined,
    onMouseMove: js.UndefOr[Callback] = js.undefined
  ): NodeProps = {
    val __obj = js.Dynamic.literal(blendMode = blendMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    onMouseEnter.foreach(p => __obj.updateDynamic("onMouseEnter")(p.toJsFn))
    onMouseLeave.foreach(p => __obj.updateDynamic("onMouseLeave")(p.toJsFn))
    onMouseMove.foreach(p => __obj.updateDynamic("onMouseMove")(p.toJsFn))
    __obj.asInstanceOf[NodeProps]
  }
}

