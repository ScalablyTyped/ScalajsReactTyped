package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.rcTree.rcTreeStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckData extends js.Object {
  var checked: Boolean
  var checkedNodes: js.Array[Component[InternalTreeNodeProps with js.Object, js.Object]]
  var event: check
  var halfCheckedKeys: js.Array[String]
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
}

object CheckData {
  @scala.inline
  def apply(
    checked: Boolean,
    checkedNodes: js.Array[Component[InternalTreeNodeProps with js.Object, js.Object]],
    event: check,
    halfCheckedKeys: js.Array[String],
    node: Component[InternalTreeNodeProps with js.Object, js.Object]
  ): CheckData = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], checkedNodes = checkedNodes.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckData]
  }
}

