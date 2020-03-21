package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.rcTree.rcTreeStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectData extends js.Object {
  var event: select
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
  var selected: Boolean
  var selectedNodes: js.Array[Component[InternalTreeNodeProps with js.Object, js.Object]]
}

object SelectData {
  @scala.inline
  def apply(
    event: select,
    node: Component[InternalTreeNodeProps with js.Object, js.Object],
    selected: Boolean,
    selectedNodes: js.Array[Component[InternalTreeNodeProps with js.Object, js.Object]]
  ): SelectData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedNodes = selectedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectData]
  }
}

