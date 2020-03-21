package typingsJapgolly.reactSortableTree

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.treeDataUtilsMod.GetNodeKeyFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-sortable-tree.react-sortable-tree.FullTree & {  getNodeKey  :react-sortable-tree.react-sortable-tree/utils/tree-data-utils.GetNodeKeyFunction,   ignoreCollapsed ? :boolean} */
trait FullTreegetNodeKeyGetNode extends js.Object {
  var getNodeKey: GetNodeKeyFunction
  var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  var treeData: js.Array[TreeItem]
}

object FullTreegetNodeKeyGetNode {
  @scala.inline
  def apply(
    getNodeKey: /* data */ TreeIndex with TreeNode => CallbackTo[String | Double],
    treeData: js.Array[TreeItem],
    ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  ): FullTreegetNodeKeyGetNode = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
    __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.TreeIndex with typingsJapgolly.reactSortableTree.mod.TreeNode) => getNodeKey(t0).runNow()))
    if (!js.isUndefined(ignoreCollapsed)) __obj.updateDynamic("ignoreCollapsed")(ignoreCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTreegetNodeKeyGetNode]
  }
}

