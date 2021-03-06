package typingsJapgolly.antd.treeTreeMod

import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeMouseEvent extends js.Object {
  var event: ReactDragEventFrom[HTMLElement]
  var node: Component[AntTreeNodeProps with js.Object, js.Object]
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(
    event: ReactDragEventFrom[HTMLElement],
    node: Component[AntTreeNodeProps with js.Object, js.Object]
  ): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
}

