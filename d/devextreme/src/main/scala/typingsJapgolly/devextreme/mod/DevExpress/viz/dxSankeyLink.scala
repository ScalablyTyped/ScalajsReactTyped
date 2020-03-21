package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSankeyLink extends js.Object {
  /** An object that describes the connection. */
  var connection: dxSankeyConnectionInfoObject
  /** Hides the sankey link's tooltip. */
  def hideTooltip(): Unit
  /** Changes the sankey link's hover state. */
  def hover(state: Boolean): Unit
  /** Indicates whether the sankey link is in the hover state. */
  def isHovered(): Boolean
  /** Shows the sankey link's tooltip. */
  def showTooltip(): Unit
}

object dxSankeyLink {
  @scala.inline
  def apply(
    connection: dxSankeyConnectionInfoObject,
    hideTooltip: Callback,
    hover: Boolean => Callback,
    isHovered: CallbackTo[Boolean],
    showTooltip: Callback
  ): dxSankeyLink = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
    __obj.updateDynamic("hideTooltip")(hideTooltip.toJsFn)
    __obj.updateDynamic("hover")(js.Any.fromFunction1((t0: scala.Boolean) => hover(t0).runNow()))
    __obj.updateDynamic("isHovered")(isHovered.toJsFn)
    __obj.updateDynamic("showTooltip")(showTooltip.toJsFn)
    __obj.asInstanceOf[dxSankeyLink]
  }
}

