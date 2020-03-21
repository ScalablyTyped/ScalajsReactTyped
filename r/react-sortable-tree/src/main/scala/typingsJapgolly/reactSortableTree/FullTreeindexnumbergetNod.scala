package typingsJapgolly.reactSortableTree

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  index  :number,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction} */
trait FullTreeindexnumbergetNod extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var index: Double
  var treeData: js.Array[TreeItem]
}

object FullTreeindexnumbergetNod {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => CallbackTo[String | Double],
    index: Double,
    treeData: js.Array[TreeItem]
  ): FullTreeindexnumbergetNod = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.TreeIndex with typingsJapgolly.reactSortableTree.mod.TreeNode) => getNodeKey(t0).runNow()))
    __obj.asInstanceOf[FullTreeindexnumbergetNod]
  }
}

