package typingsJapgolly.reactSortableTree

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSortableTree.mod.NumberOrStringArray
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & react-sortable-tree.react-sortable-tree.TreePath & {  newNode  :std.Function | any,   getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed ? :boolean} */
trait FullTreeTreePathnewNodeFu extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var newNode: js.Function | js.Any
  var path: NumberOrStringArray
  var treeData: js.Array[TreeItem]
}

object FullTreeTreePathnewNodeFu {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => CallbackTo[String | Double],
    newNode: js.Function | js.Any,
    path: NumberOrStringArray,
    treeData: js.Array[TreeItem],
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): FullTreeTreePathnewNodeFu = {
    val __obj = js.Dynamic.literal(newNode = newNode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.TreeIndex with typingsJapgolly.reactSortableTree.mod.TreeNode) => getNodeKey(t0).runNow()))
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreeTreePathnewNodeFu]
  }
}

