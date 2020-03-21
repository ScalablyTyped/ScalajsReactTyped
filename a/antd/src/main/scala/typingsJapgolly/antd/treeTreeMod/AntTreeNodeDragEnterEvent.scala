package typingsJapgolly.antd.treeTreeMod

import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[String]
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: ReactDragEventFrom[HTMLElement],
    expandedKeys: js.Array[String],
    node: Component[AntTreeNodeProps with js.Object, js.Object]
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
}

