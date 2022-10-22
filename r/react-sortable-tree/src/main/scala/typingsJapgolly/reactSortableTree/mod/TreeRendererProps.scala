package typingsJapgolly.reactSortableTree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectDropTarget
import typingsJapgolly.reactDnd.distTypesConnectorsMod.ConnectableElement
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.ltr
import typingsJapgolly.reactSortableTree.reactSortableTreeStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeRendererProps[T] extends StObject {
  
  var canDrop: js.UndefOr[Boolean] = js.undefined
  
  var children: js.Array[Element]
  
  // Drop target
  var connectDropTarget: ConnectDropTarget
  
  var draggedNode: js.UndefOr[TreeItem[T]] = js.undefined
  
  // used in dndManager
  def getPrevRow(): FlatDataItem[js.Object] | Null
  
  var isOver: Boolean
  
  var listIndex: Double
  
  var lowerSiblingCounts: js.Array[Double]
  
  var node: TreeItem[T]
  
  var path: NumberOrStringArray
  
  var rowDirection: js.UndefOr[ltr | rtl] = js.undefined
  
  var scaffoldBlockPxWidth: Double
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var swapDepth: js.UndefOr[Double] = js.undefined
  
  var swapFrom: js.UndefOr[Double] = js.undefined
  
  var swapLength: js.UndefOr[Double] = js.undefined
  
  var treeId: String
  
  var treeIndex: Double
}
object TreeRendererProps {
  
  inline def apply[T](
    children: js.Array[Element],
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => japgolly.scalajs.react.facade.React.Element | Null,
    getPrevRow: CallbackTo[FlatDataItem[js.Object] | Null],
    isOver: Boolean,
    listIndex: Double,
    lowerSiblingCounts: js.Array[Double],
    node: TreeItem[T],
    path: NumberOrStringArray,
    scaffoldBlockPxWidth: Double,
    treeId: String,
    treeIndex: Double
  ): TreeRendererProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], connectDropTarget = js.Any.fromFunction2(connectDropTarget), getPrevRow = getPrevRow.toJsFn, isOver = isOver.asInstanceOf[js.Any], listIndex = listIndex.asInstanceOf[js.Any], lowerSiblingCounts = lowerSiblingCounts.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scaffoldBlockPxWidth = scaffoldBlockPxWidth.asInstanceOf[js.Any], treeId = treeId.asInstanceOf[js.Any], treeIndex = treeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeRendererProps[T]]
  }
  
  extension [Self <: TreeRendererProps[?], T](x: Self & TreeRendererProps[T]) {
    
    inline def setCanDrop(value: Boolean): Self = StObject.set(x, "canDrop", value.asInstanceOf[js.Any])
    
    inline def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
    
    inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[Any]) => japgolly.scalajs.react.facade.React.Element | Null
    ): Self = StObject.set(x, "connectDropTarget", js.Any.fromFunction2(value))
    
    inline def setDraggedNode(value: TreeItem[T]): Self = StObject.set(x, "draggedNode", value.asInstanceOf[js.Any])
    
    inline def setDraggedNodeUndefined: Self = StObject.set(x, "draggedNode", js.undefined)
    
    inline def setGetPrevRow(value: CallbackTo[FlatDataItem[js.Object] | Null]): Self = StObject.set(x, "getPrevRow", value.toJsFn)
    
    inline def setIsOver(value: Boolean): Self = StObject.set(x, "isOver", value.asInstanceOf[js.Any])
    
    inline def setListIndex(value: Double): Self = StObject.set(x, "listIndex", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCounts(value: js.Array[Double]): Self = StObject.set(x, "lowerSiblingCounts", value.asInstanceOf[js.Any])
    
    inline def setLowerSiblingCountsVarargs(value: Double*): Self = StObject.set(x, "lowerSiblingCounts", js.Array(value*))
    
    inline def setNode(value: TreeItem[T]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setPath(value: NumberOrStringArray): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setRowDirection(value: ltr | rtl): Self = StObject.set(x, "rowDirection", value.asInstanceOf[js.Any])
    
    inline def setRowDirectionUndefined: Self = StObject.set(x, "rowDirection", js.undefined)
    
    inline def setScaffoldBlockPxWidth(value: Double): Self = StObject.set(x, "scaffoldBlockPxWidth", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwapDepth(value: Double): Self = StObject.set(x, "swapDepth", value.asInstanceOf[js.Any])
    
    inline def setSwapDepthUndefined: Self = StObject.set(x, "swapDepth", js.undefined)
    
    inline def setSwapFrom(value: Double): Self = StObject.set(x, "swapFrom", value.asInstanceOf[js.Any])
    
    inline def setSwapFromUndefined: Self = StObject.set(x, "swapFrom", js.undefined)
    
    inline def setSwapLength(value: Double): Self = StObject.set(x, "swapLength", value.asInstanceOf[js.Any])
    
    inline def setSwapLengthUndefined: Self = StObject.set(x, "swapLength", js.undefined)
    
    inline def setTreeId(value: String): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIndex(value: Double): Self = StObject.set(x, "treeIndex", value.asInstanceOf[js.Any])
  }
}
