package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEnterData extends js.Object {
  var event: Event_
  var expandedKeys: js.Array[String]
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
}

object OnDragEnterData {
  @scala.inline
  def apply(
    event: Event_,
    expandedKeys: js.Array[String],
    node: Component[InternalTreeNodeProps with js.Object, js.Object]
  ): OnDragEnterData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragEnterData]
  }
}

