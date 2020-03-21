package typingsJapgolly.storybookRouter.visibilityMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: Node
  var hidden: Boolean
}

object Props {
  @scala.inline
  def apply(hidden: Boolean, children: VdomNode = null): Props = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

