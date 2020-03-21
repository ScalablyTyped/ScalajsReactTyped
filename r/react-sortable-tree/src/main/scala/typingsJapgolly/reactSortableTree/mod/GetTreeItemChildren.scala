package typingsJapgolly.reactSortableTree.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTreeItemChildren extends js.Object {
  var lowerSiblingCounts: js.Array[Double]
  var node: TreeItem
  var path: NumberOrStringArray
  var treeIndex: Double
  def done(children: js.Array[TreeItem]): Unit
}

object GetTreeItemChildren {
  @scala.inline
  def apply(
    done: js.Array[TreeItem] => Callback,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem,
    path: NumberOrStringArray,
    treeIndex: Double
  ): GetTreeItemChildren = {
    val __obj = js.Dynamic.literal(lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("done")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.reactSortableTree.mod.TreeItem]) => done(t0).runNow()))
    __obj.asInstanceOf[GetTreeItemChildren]
  }
}

