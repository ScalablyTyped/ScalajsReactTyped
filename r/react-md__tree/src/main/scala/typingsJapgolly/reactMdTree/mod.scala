package typingsJapgolly.reactMdTree

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdList.typesListMod.ListElement
import typingsJapgolly.reactMdTree.anon.BaseTreeItemvisibleIndexn
import typingsJapgolly.reactMdTree.anon.PickTreeItemWithContentCo
import typingsJapgolly.reactMdTree.anon.RequiredTreeItemSelection
import typingsJapgolly.reactMdTree.typesTreeGroupMod.TreeGroupProps
import typingsJapgolly.reactMdTree.typesTypesMod.BaseTreeItem
import typingsJapgolly.reactMdTree.typesTypesMod.ExpandedIds
import typingsJapgolly.reactMdTree.typesTypesMod.ProvidedTreeItemProps
import typingsJapgolly.reactMdTree.typesTypesMod.ProvidedTreeProps
import typingsJapgolly.reactMdTree.typesTypesMod.SelectedIds
import typingsJapgolly.reactMdTree.typesTypesMod.TreeData
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemExpansion
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemId
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemProps
import typingsJapgolly.reactMdTree.typesTypesMod.TreeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tree", "Tree")
  @js.native
  val Tree: ForwardRefExoticComponent[TreeProps[Any] & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/tree", "TreeGroup")
  @js.native
  val TreeGroup: ForwardRefExoticComponent[TreeGroupProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/tree", "TreeItem")
  @js.native
  val TreeItem: ForwardRefExoticComponent[(TreeItemProps & RefAttributes[HTMLLIElement]) | PickTreeItemWithContentCo] = js.native
  
  inline def defaultTreeItemRenderer(itemProps: ProvidedTreeItemProps, item: BaseTreeItemvisibleIndexn, treeProps: ProvidedTreeProps): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTreeItemRenderer")(itemProps.asInstanceOf[js.Any], item.asInstanceOf[js.Any], treeProps.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
  inline def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
  
  inline def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  inline def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
}
