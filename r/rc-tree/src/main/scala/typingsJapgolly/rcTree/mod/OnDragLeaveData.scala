package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragLeaveData extends js.Object {
  var event: Event_
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
}

object OnDragLeaveData {
  @scala.inline
  def apply(event: Event_, node: Component[InternalTreeNodeProps with js.Object, js.Object]): OnDragLeaveData = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnDragLeaveData]
  }
}

