package typingsJapgolly.rcTree.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDropData extends js.Object {
  var dragNode: Component[InternalTreeNodeProps with js.Object, js.Object]
  var dragNodesKeys: js.Array[String]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: Event_
  var node: Component[InternalTreeNodeProps with js.Object, js.Object]
}

object OnDropData {
  @scala.inline
  def apply(
    dragNode: Component[InternalTreeNodeProps with js.Object, js.Object],
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: Event_,
    node: Component[InternalTreeNodeProps with js.Object, js.Object],
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): OnDropData = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDropData]
  }
}

