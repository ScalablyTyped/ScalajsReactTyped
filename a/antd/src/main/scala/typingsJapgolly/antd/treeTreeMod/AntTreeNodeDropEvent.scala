package typingsJapgolly.antd.treeTreeMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: Component[AntTreeNodeProps with js.Object, js.Object]
  var dragNodesKeys: js.Array[String]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: ReactMouseEventFrom[HTMLElement]
  var node: Component[AntTreeNodeProps with js.Object, js.Object]
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: Component[AntTreeNodeProps with js.Object, js.Object],
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: ReactMouseEventFrom[HTMLElement],
    node: Component[AntTreeNodeProps with js.Object, js.Object],
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
}

