package typingsJapgolly.jupyterlabApputils.collapseMod.Collapse

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions[T /* <: Widget */]
  extends typingsJapgolly.phosphorWidgets.widgetMod.Widget.IOptions {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var widget: T
}

object IOptions {
  @scala.inline
  def apply[T /* <: Widget */](widget: T, collapsed: js.UndefOr[Boolean] = js.undefined, node: HTMLElement = null): IOptions[T] = {
    val __obj = js.Dynamic.literal(widget = widget.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[T]]
  }
}

