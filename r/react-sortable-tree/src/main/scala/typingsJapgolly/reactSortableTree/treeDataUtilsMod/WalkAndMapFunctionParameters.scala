package typingsJapgolly.reactSortableTree.treeDataUtilsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   callback  :std.Function,   ignoreCollapsed ? :boolean} */
trait WalkAndMapFunctionParameters extends js.Object {
  var callback: js.Function
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var treeData: js.Array[TreeItem]
}

object WalkAndMapFunctionParameters {
  @scala.inline
  def apply(
    callback: js.Function,
    getNodeKey: /* data */ TreeIndex with TreeNode => CallbackTo[String | Double],
    treeData: js.Array[TreeItem],
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): WalkAndMapFunctionParameters = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], treeData = treeData.asInstanceOf[js.Any])
    __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.TreeIndex with typingsJapgolly.reactSortableTree.mod.TreeNode) => getNodeKey(t0).runNow()))
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkAndMapFunctionParameters]
  }
}

