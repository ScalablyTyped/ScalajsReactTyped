package typingsJapgolly.reactSelect.menuMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactSelect.typesMod.InnerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuListProps extends js.Object {
  /** The children to be rendered. */
  var children: Node
  /** Inner ref to DOM Node */
  var innerRef: InnerRef
}

object MenuListProps {
  @scala.inline
  def apply(children: VdomNode = null, innerRef: InnerRef = null): MenuListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListProps]
  }
}

