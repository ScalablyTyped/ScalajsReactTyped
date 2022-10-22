package typingsJapgolly.rcTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.rcTree.anon.DropPosition
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.Direction
import typingsJapgolly.rcTree.esInterfaceMod.EventDataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.esInterfaceMod.NodeInstance
import typingsJapgolly.rcTree.esTreeMod.DraggableConfig
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTree.rcTreeInts.`-1`
import typingsJapgolly.rcTree.rcTreeInts.`0`
import typingsJapgolly.rcTree.rcTreeInts.`1`
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextTypesMod {
  
  @JSImport("rc-tree/es/contextTypes", "TreeContext")
  @js.native
  val TreeContext: Context[TreeContextProps[Any] | Null] = js.native
  
  type NodeDragEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function3[
    /* e */ ReactDragEventFrom[T & Element], 
    /* node */ NodeInstance[TreeDataType], 
    /* outsideTree */ js.UndefOr[Boolean], 
    Unit
  ]
  
  trait NodeDragEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: ReactDragEventFrom[T & Element]
    
    var node: EventDataNode[TreeDataType]
  }
  object NodeDragEventParams {
    
    inline def apply[TreeDataType /* <: BasicDataNode */, T](event: ReactDragEventFrom[T & Element], node: EventDataNode[TreeDataType]): NodeDragEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDragEventParams[TreeDataType, T]]
    }
    
    extension [Self <: NodeDragEventParams[?, ?], TreeDataType /* <: BasicDataNode */, T](x: Self & (NodeDragEventParams[TreeDataType, T])) {
      
      inline def setEvent(value: ReactDragEventFrom[T & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeMouseEventHandler[TreeDataType /* <: BasicDataNode */, T] = js.Function2[
    /* e */ ReactMouseEventFrom[T & Element], 
    /* node */ EventDataNode[TreeDataType], 
    Unit
  ]
  
  trait NodeMouseEventParams[TreeDataType /* <: BasicDataNode */, T] extends StObject {
    
    var event: ReactMouseEventFrom[T & Element]
    
    var node: EventDataNode[TreeDataType]
  }
  object NodeMouseEventParams {
    
    inline def apply[TreeDataType /* <: BasicDataNode */, T](event: ReactMouseEventFrom[T & Element], node: EventDataNode[TreeDataType]): NodeMouseEventParams[TreeDataType, T] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeMouseEventParams[TreeDataType, T]]
    }
    
    extension [Self <: NodeMouseEventParams[?, ?], TreeDataType /* <: BasicDataNode */, T](x: Self & (NodeMouseEventParams[TreeDataType, T])) {
      
      inline def setEvent(value: ReactMouseEventFrom[T & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeContextProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var checkStrictly: Boolean
    
    var checkable: Boolean | Node
    
    var direction: Direction
    
    var disabled: Boolean
    
    var dragOverNodeKey: Key | Null
    
    var draggable: js.UndefOr[DraggableConfig] = js.undefined
    
    var draggingNodeKey: js.UndefOr[typingsJapgolly.react.mod.Key] = js.undefined
    
    var dropContainerKey: Key | Null
    
    def dropIndicatorRender(props: DropPosition): Node
    
    var dropLevelOffset: js.UndefOr[Double] = js.undefined
    
    var dropPosition: `-1` | `0` | `1` | Null
    
    var dropTargetKey: Key | Null
    
    def filterTreeNode(treeNode: EventDataNode[TreeDataType]): Boolean
    
    var icon: IconType
    
    var indent: Double | Null
    
    var keyEntities: Record[Key, DataEntity[Any]]
    
    def loadData(treeNode: EventDataNode[TreeDataType]): js.Promise[Unit]
    
    def onNodeCheck(e: ReactMouseEventFrom[HTMLSpanElement], treeNode: EventDataNode[TreeDataType], checked: Boolean): Unit
    
    var onNodeClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeContextMenu: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeDoubleClick: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeDragEnd: NodeDragEventHandler[Any, Any]
    
    var onNodeDragEnter: NodeDragEventHandler[Any, Any]
    
    var onNodeDragLeave: NodeDragEventHandler[Any, Any]
    
    var onNodeDragOver: NodeDragEventHandler[Any, Any]
    
    var onNodeDragStart: NodeDragEventHandler[Any, Any]
    
    var onNodeDrop: NodeDragEventHandler[Any, Any]
    
    var onNodeExpand: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    def onNodeLoad(treeNode: EventDataNode[TreeDataType]): Unit
    
    var onNodeMouseEnter: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeMouseLeave: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var onNodeSelect: NodeMouseEventHandler[TreeDataType, HTMLSpanElement]
    
    var prefixCls: String
    
    var selectable: Boolean
    
    var showIcon: Boolean
    
    var switcherIcon: IconType
    
    var titleRender: js.UndefOr[js.Function1[/* node */ Any, Node]] = js.undefined
  }
  object TreeContextProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](
      checkStrictly: Boolean,
      disabled: Boolean,
      dropIndicatorRender: DropPosition => Node,
      filterTreeNode: EventDataNode[TreeDataType] => Boolean,
      keyEntities: Record[Key, DataEntity[Any]],
      loadData: EventDataNode[TreeDataType] => js.Promise[Unit],
      onNodeCheck: (ReactMouseEventFrom[HTMLSpanElement], EventDataNode[TreeDataType], Boolean) => Callback,
      onNodeClick: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeContextMenu: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeDoubleClick: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeDragEnd: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeDragEnter: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeDragLeave: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeDragOver: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeDragStart: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeDrop: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback,
      onNodeExpand: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeLoad: EventDataNode[TreeDataType] => Callback,
      onNodeMouseEnter: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeMouseLeave: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      onNodeSelect: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback,
      prefixCls: String,
      selectable: Boolean,
      showIcon: Boolean
    ): TreeContextProps[TreeDataType] = {
      val __obj = js.Dynamic.literal(checkStrictly = checkStrictly.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropIndicatorRender = js.Any.fromFunction1(dropIndicatorRender), filterTreeNode = js.Any.fromFunction1(filterTreeNode), keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onNodeCheck = js.Any.fromFunction3((t0: ReactMouseEventFrom[HTMLSpanElement], t1: EventDataNode[TreeDataType], t2: Boolean) => (onNodeCheck(t0, t1, t2)).runNow()), onNodeClick = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeClick(t0, t1)).runNow()), onNodeContextMenu = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeContextMenu(t0, t1)).runNow()), onNodeDoubleClick = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeDoubleClick(t0, t1)).runNow()), onNodeDragEnd = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDragEnd(t0, t1, t2)).runNow()), onNodeDragEnter = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDragEnter(t0, t1, t2)).runNow()), onNodeDragLeave = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDragLeave(t0, t1, t2)).runNow()), onNodeDragOver = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDragOver(t0, t1, t2)).runNow()), onNodeDragStart = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDragStart(t0, t1, t2)).runNow()), onNodeDrop = js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (onNodeDrop(t0, t1, t2)).runNow()), onNodeExpand = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeExpand(t0, t1)).runNow()), onNodeLoad = js.Any.fromFunction1((t0: EventDataNode[TreeDataType]) => onNodeLoad(t0).runNow()), onNodeMouseEnter = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeMouseEnter(t0, t1)).runNow()), onNodeMouseLeave = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeMouseLeave(t0, t1)).runNow()), onNodeSelect = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (onNodeSelect(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], showIcon = showIcon.asInstanceOf[js.Any], checkable = null, dragOverNodeKey = null, dropContainerKey = null, dropPosition = null, dropTargetKey = null, icon = null, indent = null, switcherIcon = null)
      __obj.asInstanceOf[TreeContextProps[TreeDataType]]
    }
    
    extension [Self <: TreeContextProps[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeContextProps[TreeDataType]) {
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckable(value: Boolean | Node): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableNull: Self = StObject.set(x, "checkable", null)
      
      inline def setCheckableVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "checkable", js.Array(value*))
      
      inline def setCheckableVdomElement(value: VdomElement): Self = StObject.set(x, "checkable", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragOverNodeKey(value: Key): Self = StObject.set(x, "dragOverNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDragOverNodeKeyNull: Self = StObject.set(x, "dragOverNodeKey", null)
      
      inline def setDraggable(value: DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDraggingNodeKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "draggingNodeKey", value.asInstanceOf[js.Any])
      
      inline def setDraggingNodeKeyUndefined: Self = StObject.set(x, "draggingNodeKey", js.undefined)
      
      inline def setDropContainerKey(value: Key): Self = StObject.set(x, "dropContainerKey", value.asInstanceOf[js.Any])
      
      inline def setDropContainerKeyNull: Self = StObject.set(x, "dropContainerKey", null)
      
      inline def setDropIndicatorRender(value: DropPosition => Node): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      inline def setDropLevelOffset(value: Double): Self = StObject.set(x, "dropLevelOffset", value.asInstanceOf[js.Any])
      
      inline def setDropLevelOffsetUndefined: Self = StObject.set(x, "dropLevelOffset", js.undefined)
      
      inline def setDropPosition(value: `-1` | `0` | `1`): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropPositionNull: Self = StObject.set(x, "dropPosition", null)
      
      inline def setDropTargetKey(value: Key): Self = StObject.set(x, "dropTargetKey", value.asInstanceOf[js.Any])
      
      inline def setDropTargetKeyNull: Self = StObject.set(x, "dropTargetKey", null)
      
      inline def setFilterTreeNode(value: EventDataNode[TreeDataType] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentNull: Self = StObject.set(x, "indent", null)
      
      inline def setKeyEntities(value: Record[Key, DataEntity[Any]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadData(value: EventDataNode[TreeDataType] => js.Promise[Unit]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setOnNodeCheck(value: (ReactMouseEventFrom[HTMLSpanElement], EventDataNode[TreeDataType], Boolean) => Callback): Self = StObject.set(x, "onNodeCheck", js.Any.fromFunction3((t0: ReactMouseEventFrom[HTMLSpanElement], t1: EventDataNode[TreeDataType], t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeClick(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeContextMenu(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeContextMenu", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeDoubleClick(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeDoubleClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeDragEnd(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDragEnd", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeDragEnter(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDragEnter", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeDragLeave(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDragLeave", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeDragOver(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDragOver", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeDragStart(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDragStart", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeDrop(
        value: (/* e */ ReactDragEventFrom[Any & Element], /* node */ NodeInstance[Any], /* outsideTree */ js.UndefOr[Boolean]) => Callback
      ): Self = StObject.set(x, "onNodeDrop", js.Any.fromFunction3((t0: /* e */ ReactDragEventFrom[Any & Element], t1: /* node */ NodeInstance[Any], t2: /* outsideTree */ js.UndefOr[Boolean]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodeExpand(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeExpand", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeLoad(value: EventDataNode[TreeDataType] => Callback): Self = StObject.set(x, "onNodeLoad", js.Any.fromFunction1((t0: EventDataNode[TreeDataType]) => value(t0).runNow()))
      
      inline def setOnNodeMouseEnter(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeMouseEnter", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeMouseLeave(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeMouseLeave", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnNodeSelect(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & Element], /* node */ EventDataNode[TreeDataType]) => Callback
      ): Self = StObject.set(x, "onNodeSelect", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & Element], t1: /* node */ EventDataNode[TreeDataType]) => (value(t0, t1)).runNow()))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
      
      inline def setSwitcherIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
      
      inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitleRender(value: /* node */ Any => Node): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
    }
  }
}
