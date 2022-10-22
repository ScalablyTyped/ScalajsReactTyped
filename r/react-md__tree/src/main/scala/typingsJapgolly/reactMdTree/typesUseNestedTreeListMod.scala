package typingsJapgolly.reactMdTree

import typingsJapgolly.reactMdTree.anon.ChildItems
import typingsJapgolly.reactMdTree.typesTypesMod.BaseTreeItem
import typingsJapgolly.reactMdTree.typesTypesMod.TreeData
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemId
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemSorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseNestedTreeListMod {
  
  @JSImport("@react-md/tree/types/useNestedTreeList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(parentId.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[NestedTreeItem[T]]]]
  inline def buildTree[T /* <: BaseTreeItem */](parentId: Null, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(parentId.asInstanceOf[js.Any], items.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[NestedTreeItem[T]]]]
  inline def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(parentId.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[NestedTreeItem[T]]]]
  inline def buildTree[T /* <: BaseTreeItem */](parentId: TreeItemId, items: js.Array[T], sort: TreeItemSorter[T]): js.UndefOr[js.Array[NestedTreeItem[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildTree")(parentId.asInstanceOf[js.Any], items.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[NestedTreeItem[T]]]]
  
  inline def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T]): js.Array[NestedTreeItem[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestedTreeList")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Array[NestedTreeItem[T]]]
  inline def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: Unit, rootId: TreeItemId): js.Array[NestedTreeItem[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNestedTreeList")(tree.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], rootId.asInstanceOf[js.Any])).asInstanceOf[js.Array[NestedTreeItem[T]]]
  inline def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T]): js.Array[NestedTreeItem[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNestedTreeList")(tree.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[js.Array[NestedTreeItem[T]]]
  inline def useNestedTreeList[T /* <: BaseTreeItem */](tree: TreeData[T], sort: TreeItemSorter[T], rootId: TreeItemId): js.Array[NestedTreeItem[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNestedTreeList")(tree.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], rootId.asInstanceOf[js.Any])).asInstanceOf[js.Array[NestedTreeItem[T]]]
  
  type NestedTreeItem[T /* <: BaseTreeItem */] = T & ChildItems[T]
}
