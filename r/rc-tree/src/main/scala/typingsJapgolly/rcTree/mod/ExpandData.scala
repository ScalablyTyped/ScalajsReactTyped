package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandData extends js.Object {
  var expanded: Boolean
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
}

object ExpandData {
  @scala.inline
  def apply(expanded: Boolean, node: Component[InternalTreeNodeProps with js.Object, js.Object]): ExpandData = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandData]
  }
}

