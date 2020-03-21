package typingsJapgolly.atlaskitTree.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderItemParams extends js.Object {
  var depth: Double
  var item: TreeItem
  var provided: TreeDraggableProvided
  var snapshot: DraggableStateSnapshot
  def onCollapse(itemId: ItemId): Unit
  def onExpand(itemId: ItemId): Unit
}

object RenderItemParams {
  @scala.inline
  def apply(
    depth: Double,
    item: TreeItem,
    onCollapse: ItemId => Callback,
    onExpand: ItemId => Callback,
    provided: TreeDraggableProvided,
    snapshot: DraggableStateSnapshot
  ): RenderItemParams = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], provided = provided.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitTree.mod.ItemId) => onCollapse(t0).runNow()))
    __obj.updateDynamic("onExpand")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitTree.mod.ItemId) => onExpand(t0).runNow()))
    __obj.asInstanceOf[RenderItemParams]
  }
}

