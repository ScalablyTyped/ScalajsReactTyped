package typingsJapgolly.reactPopper.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagerProps extends js.Object {
  var children: Node
}

object ManagerProps {
  @scala.inline
  def apply(children: VdomNode = null): ManagerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerProps]
  }
}

