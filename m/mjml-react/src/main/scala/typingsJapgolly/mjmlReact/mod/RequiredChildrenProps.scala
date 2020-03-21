package typingsJapgolly.mjmlReact.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredChildrenProps extends js.Object {
  var children: Node
}

object RequiredChildrenProps {
  @scala.inline
  def apply(children: VdomNode = null): RequiredChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredChildrenProps]
  }
}

