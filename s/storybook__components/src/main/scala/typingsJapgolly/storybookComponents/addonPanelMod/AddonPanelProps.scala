package typingsJapgolly.storybookComponents.addonPanelMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddonPanelProps extends js.Object {
  var active: Boolean = js.native
  var children: Node = js.native
}

object AddonPanelProps {
  @scala.inline
  def apply(active: Boolean, children: VdomNode = null): AddonPanelProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddonPanelProps]
  }
}

