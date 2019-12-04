package typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcViewsResourceSavingSceneMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var isVisible: Boolean
  var style: js.UndefOr[js.Any] = js.undefined
}

object Props {
  @scala.inline
  def apply(isVisible: Boolean, children: VdomNode = null, style: js.Any = null): Props = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

