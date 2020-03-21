package typingsJapgolly.reactSortableTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSortableTree.PartialListProps
import typingsJapgolly.reactSortableTree.mod.ExtendedNodeData
import typingsJapgolly.reactSortableTree.mod.FullTree
import typingsJapgolly.reactSortableTree.mod.NodeData
import typingsJapgolly.reactSortableTree.mod.NodeRenderer
import typingsJapgolly.reactSortableTree.mod.OnDragPreviousAndNextLocation
import typingsJapgolly.reactSortableTree.mod.OnDragStateChangedData
import typingsJapgolly.reactSortableTree.mod.OnMovePreviousAndNextLocation
import typingsJapgolly.reactSortableTree.mod.OnVisibilityToggleData
import typingsJapgolly.reactSortableTree.mod.PlaceholderRenderer
import typingsJapgolly.reactSortableTree.mod.ReactSortableTreeProps
import typingsJapgolly.reactSortableTree.mod.SearchData
import typingsJapgolly.reactSortableTree.mod.ShouldCopyData
import typingsJapgolly.reactSortableTree.mod.ThemeProps
import typingsJapgolly.reactSortableTree.mod.TreeIndex
import typingsJapgolly.reactSortableTree.mod.TreeItem
import typingsJapgolly.reactSortableTree.mod.TreeNode
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.ltr
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.rtl
import typingsJapgolly.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ReactSortableTreeProps1275503466[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    treeData: js.Array[TreeItem],
    onChange: js.Array[TreeItem] => Callback,
    canDrag: (js.Function1[/* data */ ExtendedNodeData, Boolean]) | Boolean = null,
    canDrop: /* data */ OnDragPreviousAndNextLocation with NodeData => CallbackTo[Boolean] = null,
    canNodeHaveChildren: /* node */ TreeItem => CallbackTo[Boolean] = null,
    className: String = null,
    dndType: String = null,
    generateNodeProps: /* data */ ExtendedNodeData => CallbackTo[StringDictionary[js.Any]] = null,
    getNodeKey: /* data */ TreeNode with TreeIndex => CallbackTo[String | Double] = null,
    innerStyle: CSSProperties = null,
    isVirtualized: js.UndefOr[Boolean] = js.undefined,
    maxDepth: Int | Double = null,
    nodeContentRenderer: NodeRenderer = null,
    onDragStateChanged: /* data */ OnDragStateChangedData => Callback = null,
    onMoveNode: /* data */ NodeData with FullTree with OnMovePreviousAndNextLocation => Callback = null,
    onVisibilityToggle: /* data */ OnVisibilityToggleData => Callback = null,
    onlyExpandSearchedNodes: js.UndefOr[Boolean] = js.undefined,
    placeholderRenderer: PlaceholderRenderer = null,
    reactVirtualizedListProps: PartialListProps = null,
    rowDirection: ltr | rtl = null,
    rowHeight: (js.Function1[/* info */ Index, Double]) | Double = null,
    scaffoldBlockPxWidth: Int | Double = null,
    searchFinishCallback: /* matches */ js.Array[NodeData] => Callback = null,
    searchFocusOffset: Int | Double = null,
    searchMethod: /* data */ SearchData => CallbackTo[Boolean] = null,
    searchQuery: String | js.Any = null,
    shouldCopyOnOutsideDrop: Boolean | (js.Function1[/* data */ ShouldCopyData, Boolean]) = null,
    slideRegionSize: Int | Double = null,
    style: CSSProperties = null,
    theme: ThemeProps = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactSortableTreeProps, ComponentRef, Unit, ReactSortableTreeProps] = {
    val __obj = js.Dynamic.literal(treeData = treeData.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.reactSortableTree.mod.TreeItem]) => onChange(t0).runNow()))
    if (canDrag != null) __obj.updateDynamic("canDrag")(canDrag.asInstanceOf[js.Any])
    if (canDrop != null) __obj.updateDynamic("canDrop")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.OnDragPreviousAndNextLocation with typingsJapgolly.reactSortableTree.mod.NodeData) => canDrop(t0).runNow()))
    if (canNodeHaveChildren != null) __obj.updateDynamic("canNodeHaveChildren")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.reactSortableTree.mod.TreeItem) => canNodeHaveChildren(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dndType != null) __obj.updateDynamic("dndType")(dndType.asInstanceOf[js.Any])
    if (generateNodeProps != null) __obj.updateDynamic("generateNodeProps")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.ExtendedNodeData) => generateNodeProps(t0).runNow()))
    if (getNodeKey != null) __obj.updateDynamic("getNodeKey")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.TreeNode with typingsJapgolly.reactSortableTree.mod.TreeIndex) => getNodeKey(t0).runNow()))
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(isVirtualized)) __obj.updateDynamic("isVirtualized")(isVirtualized.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (nodeContentRenderer != null) __obj.updateDynamic("nodeContentRenderer")(nodeContentRenderer.asInstanceOf[js.Any])
    if (onDragStateChanged != null) __obj.updateDynamic("onDragStateChanged")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.OnDragStateChangedData) => onDragStateChanged(t0).runNow()))
    if (onMoveNode != null) __obj.updateDynamic("onMoveNode")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.NodeData with typingsJapgolly.reactSortableTree.mod.FullTree with typingsJapgolly.reactSortableTree.mod.OnMovePreviousAndNextLocation) => onMoveNode(t0).runNow()))
    if (onVisibilityToggle != null) __obj.updateDynamic("onVisibilityToggle")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.OnVisibilityToggleData) => onVisibilityToggle(t0).runNow()))
    if (!js.isUndefined(onlyExpandSearchedNodes)) __obj.updateDynamic("onlyExpandSearchedNodes")(onlyExpandSearchedNodes.asInstanceOf[js.Any])
    if (placeholderRenderer != null) __obj.updateDynamic("placeholderRenderer")(placeholderRenderer.asInstanceOf[js.Any])
    if (reactVirtualizedListProps != null) __obj.updateDynamic("reactVirtualizedListProps")(reactVirtualizedListProps.asInstanceOf[js.Any])
    if (rowDirection != null) __obj.updateDynamic("rowDirection")(rowDirection.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scaffoldBlockPxWidth != null) __obj.updateDynamic("scaffoldBlockPxWidth")(scaffoldBlockPxWidth.asInstanceOf[js.Any])
    if (searchFinishCallback != null) __obj.updateDynamic("searchFinishCallback")(js.Any.fromFunction1((t0: /* matches */ js.Array[typingsJapgolly.reactSortableTree.mod.NodeData]) => searchFinishCallback(t0).runNow()))
    if (searchFocusOffset != null) __obj.updateDynamic("searchFocusOffset")(searchFocusOffset.asInstanceOf[js.Any])
    if (searchMethod != null) __obj.updateDynamic("searchMethod")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSortableTree.mod.SearchData) => searchMethod(t0).runNow()))
    if (searchQuery != null) __obj.updateDynamic("searchQuery")(searchQuery.asInstanceOf[js.Any])
    if (shouldCopyOnOutsideDrop != null) __obj.updateDynamic("shouldCopyOnOutsideDrop")(shouldCopyOnOutsideDrop.asInstanceOf[js.Any])
    if (slideRegionSize != null) __obj.updateDynamic("slideRegionSize")(slideRegionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSortableTree.mod.ReactSortableTreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSortableTree.mod.ReactSortableTreeProps])(children: _*)
  }
}

