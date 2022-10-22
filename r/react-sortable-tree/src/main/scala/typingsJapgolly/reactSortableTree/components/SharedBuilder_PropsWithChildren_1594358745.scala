package typingsJapgolly.reactSortableTree.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSortableTree.mod.ExtendedNodeData
import typingsJapgolly.reactSortableTree.mod.FullTree
import typingsJapgolly.reactSortableTree.mod.NodeData
import typingsJapgolly.reactSortableTree.mod.NodeRenderer
import typingsJapgolly.reactSortableTree.mod.OnDragPreviousAndNextLocation
import typingsJapgolly.reactSortableTree.mod.OnDragStateChangedData
import typingsJapgolly.reactSortableTree.mod.OnMovePreviousAndNextLocation
import typingsJapgolly.reactSortableTree.mod.OnVisibilityToggleData
import typingsJapgolly.reactSortableTree.mod.PlaceholderRenderer
import typingsJapgolly.reactSortableTree.mod.SearchData
import typingsJapgolly.reactSortableTree.mod.ShouldCopyData
import typingsJapgolly.reactSortableTree.mod.ThemeProps
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.ltr
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.rtl
import typingsJapgolly.reactVirtualized.mod.Index
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PropsWithChildren_1594358745[T] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def canDrag(value: (js.Function1[/* data */ ExtendedNodeData[js.Object], Boolean]) | Boolean): this.type = set("canDrag", value.asInstanceOf[js.Any])
  
  inline def canDragFunction1(value: /* data */ ExtendedNodeData[js.Object] => Boolean): this.type = set("canDrag", js.Any.fromFunction1(value))
  
  inline def canDrop(value: /* data */ OnDragPreviousAndNextLocation[T] & NodeData[T] => Boolean): this.type = set("canDrop", js.Any.fromFunction1(value))
  
  inline def canNodeHaveChildren(value: /* node */ TreeItem[T] => Boolean): this.type = set("canNodeHaveChildren", js.Any.fromFunction1(value))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def dndType(value: String): this.type = set("dndType", value.asInstanceOf[js.Any])
  
  inline def generateNodeProps(value: /* data */ ExtendedNodeData[T] => StringDictionary[Any]): this.type = set("generateNodeProps", js.Any.fromFunction1(value))
  
  inline def getNodeKey(value: /* data */ TreeNode[T] & TreeIndex => String | Double): this.type = set("getNodeKey", js.Any.fromFunction1(value))
  
  inline def innerStyle(value: CSSProperties): this.type = set("innerStyle", value.asInstanceOf[js.Any])
  
  inline def isVirtualized(value: Boolean): this.type = set("isVirtualized", value.asInstanceOf[js.Any])
  
  inline def maxDepth(value: Double): this.type = set("maxDepth", value.asInstanceOf[js.Any])
  
  inline def nodeContentRenderer(value: NodeRenderer[T]): this.type = set("nodeContentRenderer", value.asInstanceOf[js.Any])
  
  inline def onDragStateChanged(value: /* data */ OnDragStateChangedData[T] => Callback): this.type = set("onDragStateChanged", js.Any.fromFunction1((t0: /* data */ OnDragStateChangedData[T]) => value(t0).runNow()))
  
  inline def onMoveNode(value: /* data */ NodeData[T] & FullTree[T] & OnMovePreviousAndNextLocation[T] => Callback): this.type = set("onMoveNode", js.Any.fromFunction1((t0: /* data */ NodeData[T] & FullTree[T] & OnMovePreviousAndNextLocation[T]) => value(t0).runNow()))
  
  inline def onVisibilityToggle(value: /* data */ OnVisibilityToggleData[T] => Callback): this.type = set("onVisibilityToggle", js.Any.fromFunction1((t0: /* data */ OnVisibilityToggleData[T]) => value(t0).runNow()))
  
  inline def onlyExpandSearchedNodes(value: Boolean): this.type = set("onlyExpandSearchedNodes", value.asInstanceOf[js.Any])
  
  inline def placeholderRenderer(value: PlaceholderRenderer[T]): this.type = set("placeholderRenderer", value.asInstanceOf[js.Any])
  
  inline def reactVirtualizedListProps(
    value: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ListProps */ Any
    ]
  ): this.type = set("reactVirtualizedListProps", value.asInstanceOf[js.Any])
  
  inline def rowDirection(value: ltr | rtl): this.type = set("rowDirection", value.asInstanceOf[js.Any])
  
  inline def rowHeight(value: (js.Function1[/* info */ NodeData[T] & Index, Double]) | Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
  
  inline def rowHeightFunction1(value: /* info */ NodeData[T] & Index => Double): this.type = set("rowHeight", js.Any.fromFunction1(value))
  
  inline def scaffoldBlockPxWidth(value: Double): this.type = set("scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
  
  inline def searchFinishCallback(value: /* matches */ js.Array[NodeData[T]] => Callback): this.type = set("searchFinishCallback", js.Any.fromFunction1((t0: /* matches */ js.Array[NodeData[T]]) => value(t0).runNow()))
  
  inline def searchFocusOffset(value: Double): this.type = set("searchFocusOffset", value.asInstanceOf[js.Any])
  
  inline def searchMethod(value: /* data */ SearchData[T] => Boolean): this.type = set("searchMethod", js.Any.fromFunction1(value))
  
  inline def searchQuery(value: String | Any): this.type = set("searchQuery", value.asInstanceOf[js.Any])
  
  inline def shouldCopyOnOutsideDrop(value: Boolean | (js.Function1[/* data */ ShouldCopyData[T], Boolean])): this.type = set("shouldCopyOnOutsideDrop", value.asInstanceOf[js.Any])
  
  inline def shouldCopyOnOutsideDropFunction1(value: /* data */ ShouldCopyData[T] => Boolean): this.type = set("shouldCopyOnOutsideDrop", js.Any.fromFunction1(value))
  
  inline def slideRegionSize(value: Double): this.type = set("slideRegionSize", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def theme(value: ThemeProps[T]): this.type = set("theme", value.asInstanceOf[js.Any])
}
