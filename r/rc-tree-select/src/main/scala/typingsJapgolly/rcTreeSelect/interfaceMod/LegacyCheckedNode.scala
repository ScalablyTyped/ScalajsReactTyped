package typingsJapgolly.rcTreeSelect.interfaceMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyCheckedNode extends js.Object {
  var children: js.UndefOr[js.Array[LegacyCheckedNode]] = js.undefined
  var node: Element
  var pos: String
}

object LegacyCheckedNode {
  @scala.inline
  def apply(node: VdomElement, pos: String, children: js.Array[LegacyCheckedNode] = null): LegacyCheckedNode = {
    val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.rawElement.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyCheckedNode]
  }
}

