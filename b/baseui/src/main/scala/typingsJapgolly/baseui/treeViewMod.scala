package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.IndentGuides
import typingsJapgolly.baseui.anon.IsFocusVisibleIsSelected
import typingsJapgolly.baseui.anon.IsLeafNode
import typingsJapgolly.baseui.anon.Overrides
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.li_
import typingsJapgolly.baseui.baseuiStrings.ul
import typingsJapgolly.baseui.treeViewTypesMod.TreeLabelProps
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeData
import typingsJapgolly.baseui.treeViewTypesMod.TreeNodeId
import typingsJapgolly.baseui.treeViewTypesMod.TreeViewProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeViewMod {
  
  @JSImport("baseui/tree-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def StatefulTreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StatefulTreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/tree-view", "StyledIconContainer")
  @js.native
  val StyledIconContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/tree-view", "StyledItemContent")
  @js.native
  val StyledItemContent: StyletronComponent[div, IsFocusVisibleIsSelected] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItem")
  @js.native
  val StyledTreeItem: StyletronComponent[li_, IsLeafNode] = js.native
  
  @JSImport("baseui/tree-view", "StyledTreeItemList")
  @js.native
  val StyledTreeItemList: StyletronComponent[ul, IndentGuides] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  val TreeLabel: ComponentType[TreeLabelProps] = js.native
  
  @JSImport("baseui/tree-view", "TreeLabelInteractable")
  @js.native
  val TreeLabelInteractable: PropsWithChildren[ComponentType[Overrides]] = js.native
  
  inline def TreeView(props: TreeViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TreeView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def toggleIsExpanded(arr: js.Array[TreeNodeData[Any]], toggledNode: TreeNodeData[Any]): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
  inline def toggleIsExpanded(
    arr: js.Array[TreeNodeData[Any]],
    toggledNode: TreeNodeData[Any],
    getId: js.Function1[/* node */ TreeNodeData[Any], TreeNodeId]
  ): js.Array[TreeNodeData[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleIsExpanded")(arr.asInstanceOf[js.Any], toggledNode.asInstanceOf[js.Any], getId.asInstanceOf[js.Any])).asInstanceOf[js.Array[TreeNodeData[Any]]]
  
  type TreeNode[T] = TreeNodeData[T]
}
