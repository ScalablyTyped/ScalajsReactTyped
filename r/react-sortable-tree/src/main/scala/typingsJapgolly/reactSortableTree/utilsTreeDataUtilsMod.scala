package typingsJapgolly.reactSortableTree

import typingsJapgolly.reactSortableTree.anon.AddAsFirstChild
import typingsJapgolly.reactSortableTree.anon.Depth
import typingsJapgolly.reactSortableTree.anon.ExpandAllMatchPaths
import typingsJapgolly.reactSortableTree.anon.Expanded
import typingsJapgolly.reactSortableTree.anon.FlatData
import typingsJapgolly.reactSortableTree.anon.GetNodeKey
import typingsJapgolly.reactSortableTree.anon.GetNodeKeyIgnoreCollapsed
import typingsJapgolly.reactSortableTree.anon.IgnoreCollapsed
import typingsJapgolly.reactSortableTree.anon.Index
import typingsJapgolly.reactSortableTree.anon.LowerSiblingsCounts
import typingsJapgolly.reactSortableTree.anon.Matches
import typingsJapgolly.reactSortableTree.anon.ParentNode
import typingsJapgolly.reactSortableTree.mod.FlatDataItem
import typingsJapgolly.reactSortableTree.mod.FullTree
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.mod.TreePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsTreeDataUtilsMod {
  
  @JSImport("react-sortable-tree/utils/tree-data-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addNodeUnderParent[T](data: FullTree[T] & AddAsFirstChild[T]): FullTree[T] & TreeIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("addNodeUnderParent")(data.asInstanceOf[js.Any]).asInstanceOf[FullTree[T] & TreeIndex]
  
  inline def changeNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKey[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]
  
  inline def find[T](data: FullTree[T] & ExpandAllMatchPaths[T]): Matches[T] & FullTree[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(data.asInstanceOf[js.Any]).asInstanceOf[Matches[T] & FullTree[T]]
  
  inline def getDepth[T](node: TreeItem[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getDepth[T](node: TreeItem[T], depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDepth")(node.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDescendantCount[T](data: TreeNode[T] & IgnoreCollapsed): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescendantCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getFlatDataFromTree[T](data: FullTree[T] & GetNodeKeyIgnoreCollapsed[T]): js.Array[FlatDataItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFlatDataFromTree")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlatDataItem[T]]]
  
  inline def getNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): (TreeNode[T] & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[(TreeNode[T] & TreeIndex) | Null]
  
  inline def getTreeFromFlatData[T](data: FlatData[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTreeFromFlatData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]
  
  inline def getVisibleNodeCount[T](data: FullTree[T]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeCount")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getVisibleNodeInfoAtIndex[T](data: FullTree[T] & Index[T]): (TreeNode[T] & TreePath & LowerSiblingsCounts) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisibleNodeInfoAtIndex")(data.asInstanceOf[js.Any]).asInstanceOf[(TreeNode[T] & TreePath & LowerSiblingsCounts) | Null]
  
  inline def insertNode[T](data: FullTree[T] & Depth[T]): FullTree[T] & TreeIndex & TreePath & ParentNode[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertNode")(data.asInstanceOf[js.Any]).asInstanceOf[FullTree[T] & TreeIndex & TreePath & ParentNode[T]]
  
  inline def isDescendant[T](older: TreeItem[T], younger: TreeItem[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDescendant")(older.asInstanceOf[js.Any], younger.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def map[T](data: WalkAndMapFunctionParameters[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]
  
  inline def removeNode[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): (FullTree[T] & TreeNode[T] & TreeIndex) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(data.asInstanceOf[js.Any]).asInstanceOf[(FullTree[T] & TreeNode[T] & TreeIndex) | Null]
  
  inline def removeNodeAtPath[T](data: FullTree[T] & TreePath & GetNodeKeyIgnoreCollapsed[T]): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNodeAtPath")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]
  
  inline def toggleExpandedForAll[T](data: FullTree[T] & Expanded): js.Array[TreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleExpandedForAll")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[TreeItem[T]]]
  
  inline def walk[T](data: WalkAndMapFunctionParameters[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("walk")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type GetNodeKeyFunction[T] = js.Function1[/* data */ TreeIndex & TreeNode[T], String | Double]
  
  trait WalkAndMapFunctionParameters[T]
    extends StObject
       with FullTree[T] {
    
    var callback: js.Function
    
    var getNodeKey: GetNodeKeyFunction[T]
    
    var ignoreCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object WalkAndMapFunctionParameters {
    
    inline def apply[T](
      callback: js.Function,
      getNodeKey: /* data */ TreeIndex & TreeNode[T] => String | Double,
      treeData: js.Array[TreeItem[T]]
    ): WalkAndMapFunctionParameters[T] = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], getNodeKey = js.Any.fromFunction1(getNodeKey), treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[WalkAndMapFunctionParameters[T]]
    }
    
    extension [Self <: WalkAndMapFunctionParameters[?], T](x: Self & WalkAndMapFunctionParameters[T]) {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setGetNodeKey(value: /* data */ TreeIndex & TreeNode[T] => String | Double): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      inline def setIgnoreCollapsed(value: Boolean): Self = StObject.set(x, "ignoreCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCollapsedUndefined: Self = StObject.set(x, "ignoreCollapsed", js.undefined)
    }
  }
}
