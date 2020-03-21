package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyNode extends js.Object {
  /** The node's label. */
  var label: String
  /** The node's incoming links. */
  var linksIn: js.Array[_]
  /** The node's outgoing links. */
  var linksOut: js.Array[_]
  /** @deprecated Use [label](/api-reference/20%20Data%20Visualization%20Widgets/dxSankey/6%20Node/2%20Fields/label.md '/Documentation/ApiReference/Data_Visualization_Widgets/dxSankey/Node/Fields/#label') instead. */
  /** The node's label. */
  var title: String
  /** Hides the sankey node's tooltip. */
  def hideTooltip(): Unit
  /** Changes the sankey node's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the sankey node is in the hover state. */
  def isHovered(): Boolean
  /** Shows the sankey node's tooltip. */
  def showTooltip(): Unit
}

object dxSankeyNode {
  @scala.inline
  def apply(
    hideTooltip: Callback,
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    label: String,
    linksIn: js.Array[_],
    linksOut: js.Array[_],
    showTooltip: Callback,
    title: String
  ): dxSankeyNode = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], linksIn = linksIn.asInstanceOf[js.Any], linksOut = linksOut.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("hover")(js.Any.fromFunction1((t0: scala.Boolean) => hover(t0).runNow()))
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[dxSankeyNode]
  }
}

