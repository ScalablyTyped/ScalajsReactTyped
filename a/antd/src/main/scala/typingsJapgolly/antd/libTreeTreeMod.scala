package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.antd.anon.Checked
import typingsJapgolly.antd.anon.DirectoryTree
import typingsJapgolly.antd.anon.ShowLeafIcon
import typingsJapgolly.antd.anon.`4`
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.check
import typingsJapgolly.antd.antdStrings.select_
import typingsJapgolly.rcTree.anon.Direction
import typingsJapgolly.rcTree.anon.DragNode
import typingsJapgolly.rcTree.anon.Event
import typingsJapgolly.rcTree.anon.EventMouseEvent
import typingsJapgolly.rcTree.anon.EventNode
import typingsJapgolly.rcTree.anon.Expanded
import typingsJapgolly.rcTree.anon.ExpandedKeys
import typingsJapgolly.rcTree.esContextTypesMod.NodeDragEventParams
import typingsJapgolly.rcTree.esContextTypesMod.NodeMouseEventHandler
import typingsJapgolly.rcTree.esContextTypesMod.NodeMouseEventParams
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.EventDataNode
import typingsJapgolly.rcTree.esInterfaceMod.FieldNames
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.esTreeMod.AllowDrop
import typingsJapgolly.rcTree.esTreeMod.AllowDropOptions
import typingsJapgolly.rcTree.esTreeMod.CheckInfo
import typingsJapgolly.rcTree.esTreeMod.ExpandAction
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.UIEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/Tree", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  type AntTreeNode = Component[AntTreeNodeProps & js.Object, js.Object]
  
  trait AntTreeNodeBaseEvent extends StObject {
    
    var nativeEvent: MouseEvent
    
    var node: Component[AntTreeNodeProps & js.Object, js.Object]
  }
  object AntTreeNodeBaseEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: Component[AntTreeNodeProps & js.Object, js.Object]): AntTreeNodeBaseEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeBaseEvent]
    }
    
    extension [Self <: AntTreeNodeBaseEvent](x: Self) {
      
      inline def setNativeEvent(value: MouseEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Component[AntTreeNodeProps & js.Object, js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeCheckedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedNodes: js.UndefOr[js.Array[Component[AntTreeNodeProps & js.Object, js.Object]]] = js.undefined
    
    var event: check
  }
  object AntTreeNodeCheckedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: Component[AntTreeNodeProps & js.Object, js.Object]): AntTreeNodeCheckedEvent = {
      val __obj = js.Dynamic.literal(event = "check", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeCheckedEvent]
    }
    
    extension [Self <: AntTreeNodeCheckedEvent](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodes(value: js.Array[Component[AntTreeNodeProps & js.Object, js.Object]]): Self = StObject.set(x, "checkedNodes", value.asInstanceOf[js.Any])
      
      inline def setCheckedNodesUndefined: Self = StObject.set(x, "checkedNodes", js.undefined)
      
      inline def setCheckedNodesVarargs(value: (Component[AntTreeNodeProps & js.Object, js.Object])*): Self = StObject.set(x, "checkedNodes", js.Array(value*))
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setEvent(value: check): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeDragEnterEvent
    extends StObject
       with AntTreeNodeMouseEvent {
    
    var expandedKeys: js.Array[Key]
  }
  object AntTreeNodeDragEnterEvent {
    
    inline def apply(
      event: ReactDragEventFrom[HTMLElement],
      expandedKeys: js.Array[Key],
      node: Component[AntTreeNodeProps & js.Object, js.Object]
    ): AntTreeNodeDragEnterEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
    }
    
    extension [Self <: AntTreeNodeDragEnterEvent](x: Self) {
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
    }
  }
  
  trait AntTreeNodeDropEvent extends StObject {
    
    var dragNode: Component[AntTreeNodeProps & js.Object, js.Object]
    
    var dragNodesKeys: js.Array[Key]
    
    var dropPosition: Double
    
    var dropToGap: js.UndefOr[Boolean] = js.undefined
    
    var event: ReactMouseEventFrom[HTMLElement]
    
    var node: Component[AntTreeNodeProps & js.Object, js.Object]
  }
  object AntTreeNodeDropEvent {
    
    inline def apply(
      dragNode: Component[AntTreeNodeProps & js.Object, js.Object],
      dragNodesKeys: js.Array[Key],
      dropPosition: Double,
      event: ReactMouseEventFrom[HTMLElement],
      node: Component[AntTreeNodeProps & js.Object, js.Object]
    ): AntTreeNodeDropEvent = {
      val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeDropEvent]
    }
    
    extension [Self <: AntTreeNodeDropEvent](x: Self) {
      
      inline def setDragNode(value: Component[AntTreeNodeProps & js.Object, js.Object]): Self = StObject.set(x, "dragNode", value.asInstanceOf[js.Any])
      
      inline def setDragNodesKeys(value: js.Array[Key]): Self = StObject.set(x, "dragNodesKeys", value.asInstanceOf[js.Any])
      
      inline def setDragNodesKeysVarargs(value: Key*): Self = StObject.set(x, "dragNodesKeys", js.Array(value*))
      
      inline def setDropPosition(value: Double): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
      
      inline def setDropToGap(value: Boolean): Self = StObject.set(x, "dropToGap", value.asInstanceOf[js.Any])
      
      inline def setDropToGapUndefined: Self = StObject.set(x, "dropToGap", js.undefined)
      
      inline def setEvent(value: ReactMouseEventFrom[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Component[AntTreeNodeProps & js.Object, js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeExpandedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object AntTreeNodeExpandedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: Component[AntTreeNodeProps & js.Object, js.Object]): AntTreeNodeExpandedEvent = {
      val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeExpandedEvent]
    }
    
    extension [Self <: AntTreeNodeExpandedEvent](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  trait AntTreeNodeMouseEvent extends StObject {
    
    var event: ReactDragEventFrom[HTMLElement]
    
    var node: Component[AntTreeNodeProps & js.Object, js.Object]
  }
  object AntTreeNodeMouseEvent {
    
    inline def apply(event: ReactDragEventFrom[HTMLElement], node: Component[AntTreeNodeProps & js.Object, js.Object]): AntTreeNodeMouseEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeMouseEvent]
    }
    
    extension [Self <: AntTreeNodeMouseEvent](x: Self) {
      
      inline def setEvent(value: ReactDragEventFrom[HTMLElement]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Component[AntTreeNodeProps & js.Object, js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeProps
    extends StObject
       with /* customProp */ StringDictionary[Any] {
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[String] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[(js.Function1[/* treeNode */ AntdTreeNodeAttribute, Node]) | Node] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | Node] = js.undefined
  }
  object AntTreeNodeProps {
    
    inline def apply(): AntTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntTreeNodeProps]
    }
    
    extension [Self <: AntTreeNodeProps](x: Self) {
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIcon(value: (js.Function1[/* treeNode */ AntdTreeNodeAttribute, Node]) | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* treeNode */ AntdTreeNodeAttribute => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTitle(value: String | Node): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait AntTreeNodeSelectedEvent
    extends StObject
       with AntTreeNodeBaseEvent {
    
    var event: select_
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedNodes: js.UndefOr[js.Array[DataNode]] = js.undefined
  }
  object AntTreeNodeSelectedEvent {
    
    inline def apply(nativeEvent: MouseEvent, node: Component[AntTreeNodeProps & js.Object, js.Object]): AntTreeNodeSelectedEvent = {
      val __obj = js.Dynamic.literal(event = "select", nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[AntTreeNodeSelectedEvent]
    }
    
    extension [Self <: AntTreeNodeSelectedEvent](x: Self) {
      
      inline def setEvent(value: select_): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodes(value: js.Array[DataNode]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
      
      inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
      
      inline def setSelectedNodesVarargs(value: DataNode*): Self = StObject.set(x, "selectedNodes", js.Array(value*))
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait AntdTreeNodeAttribute extends StObject {
    
    var checked: Boolean
    
    var children: Node
    
    var className: String
    
    var disableCheckbox: Boolean
    
    var disabled: Boolean
    
    var dragOver: Boolean
    
    var dragOverGapBottom: Boolean
    
    var dragOverGapTop: Boolean
    
    var eventKey: String
    
    var expanded: Boolean
    
    var halfChecked: Boolean
    
    var isLeaf: Boolean
    
    var pos: String
    
    var prefixCls: String
    
    var selectable: Boolean
    
    var selected: Boolean
    
    var title: Node
  }
  object AntdTreeNodeAttribute {
    
    inline def apply(
      checked: Boolean,
      className: String,
      disableCheckbox: Boolean,
      disabled: Boolean,
      dragOver: Boolean,
      dragOverGapBottom: Boolean,
      dragOverGapTop: Boolean,
      eventKey: String,
      expanded: Boolean,
      halfChecked: Boolean,
      isLeaf: Boolean,
      pos: String,
      prefixCls: String,
      selectable: Boolean,
      selected: Boolean
    ): AntdTreeNodeAttribute = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableCheckbox = disableCheckbox.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], children = null, title = null)
      __obj.asInstanceOf[AntdTreeNodeAttribute]
    }
    
    extension [Self <: AntdTreeNodeAttribute](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type CompoundedComponent = (js.Function1[/* props */ PropsWithChildren[TreeProps[DataNode]] & `4`, Element]) & DirectoryTree
  
  trait DraggableConfig extends StObject {
    
    var icon: js.UndefOr[Node | `false`] = js.undefined
    
    var nodeDraggable: js.UndefOr[DraggableFn] = js.undefined
  }
  object DraggableConfig {
    
    inline def apply(): DraggableConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggableConfig]
    }
    
    extension [Self <: DraggableConfig](x: Self) {
      
      inline def setIcon(value: Node | `false`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNodeDraggable(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "nodeDraggable", js.Any.fromFunction1(value))
      
      inline def setNodeDraggableUndefined: Self = StObject.set(x, "nodeDraggable", js.undefined)
    }
  }
  
  type DraggableFn = js.Function1[/* node */ DataNode, Boolean]
  
  type SwitcherIcon = Node | (js.Function1[/* props */ AntTreeNodeProps, Node])
  
  type TreeLeafIcon = Node | (js.Function1[/* props */ AntTreeNodeProps, Node])
  
  type TreeNodeNormal = DataNode
  
  /* Inlined parent std.Omit<rc-tree.rc-tree.TreeProps<T>, 'prefixCls' | 'showLine' | 'direction' | 'draggable' | 'icon' | 'switcherIcon'> */
  trait TreeProps[T /* <: BasicDataNode */] extends StObject {
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var allowDrop: js.UndefOr[AllowDrop[T]] = js.undefined
    
    /** 是否自动展开父节点 */
    var autoExpandParent: js.UndefOr[Boolean] = js.undefined
    
    var blockNode: js.UndefOr[Boolean] = js.undefined
    
    /** Checkable状态下节点选择完全受控（父子节点选中状态不再关联） */
    var checkStrictly: js.UndefOr[Boolean] = js.undefined
    
    /** 是否支持选中 */
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    /** （受控）选中复选框的树节点 */
    var checkedKeys: js.UndefOr[js.Array[Key] | Checked] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** 默认选中复选框的树节点 */
    var defaultCheckedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 默认展开所有树节点 */
    var defaultExpandAll: js.UndefOr[Boolean] = js.undefined
    
    /** 默认展开对应树节点 */
    var defaultExpandParent: js.UndefOr[Boolean] = js.undefined
    
    /** 默认展开指定的树节点 */
    var defaultExpandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 默认选中的树节点 */
    var defaultSelectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** 是否禁用树 */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** 设置节点可拖拽（IE>8） */
    var draggable: js.UndefOr[DraggableFn | Boolean | DraggableConfig] = js.undefined
    
    var dropIndicatorRender: js.UndefOr[js.Function1[/* props */ Direction, Node]] = js.undefined
    
    var expandAction: js.UndefOr[ExpandAction] = js.undefined
    
    /** （受控）展开指定的树节点 */
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    /** 点击树节点触发 */
    var filterAntTreeNode: js.UndefOr[js.Function1[Component[AntTreeNodeProps & js.Object, js.Object], Boolean]] = js.undefined
    
    var filterTreeNode: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[T], Boolean]] = js.undefined
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var icon: js.UndefOr[(js.Function1[/* nodeProps */ AntdTreeNodeAttribute, Node]) | Node | IconType] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var loadData: js.UndefOr[js.Function1[/* treeNode */ EventDataNode[T], js.Promise[Any]]] = js.undefined
    
    var loadedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var motion: js.UndefOr[Any] = js.undefined
    
    /** 是否支持多选 */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onActiveChange: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onCheck: js.UndefOr[
        js.Function2[
          /* checked */ typingsJapgolly.rcTree.anon.Checked | js.Array[Key], 
          /* info */ CheckInfo[T], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onDoubleClick: js.UndefOr[NodeMouseEventHandler[DataNode, HTMLSpanElement]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.undefined
    
    var onDragEnter: js.UndefOr[
        js.Function1[/* info */ (NodeDragEventParams[T, HTMLDivElement]) & ExpandedKeys, Unit]
      ] = js.undefined
    
    var onDragLeave: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.undefined
    
    var onDragOver: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* info */ NodeDragEventParams[T, HTMLDivElement], Unit]] = js.undefined
    
    var onDrop: js.UndefOr[
        js.Function1[/* info */ (NodeDragEventParams[T, HTMLDivElement]) & DragNode[T], Unit]
      ] = js.undefined
    
    var onExpand: js.UndefOr[js.Function2[/* expandedKeys */ js.Array[Key], /* info */ Expanded[T], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function2[/* loadedKeys */ js.Array[Key], /* info */ EventNode[T], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[T, HTMLSpanElement], Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function1[/* info */ NodeMouseEventParams[T, HTMLSpanElement], Unit]] = js.undefined
    
    var onRightClick: js.UndefOr[js.Function1[/* info */ EventMouseEvent[T], Unit]] = js.undefined
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLElement]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* selectedKeys */ js.Array[Key], /* info */ Event[T], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rootStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /** （受控）设置选中的树节点 */
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showLine: js.UndefOr[Boolean | ShowLeafIcon] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[SwitcherIcon | IconType] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var titleRender: js.UndefOr[js.Function1[/* node */ T, Node]] = js.undefined
    
    var treeData: js.UndefOr[js.Array[T]] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeProps {
    
    inline def apply[T /* <: BasicDataNode */](): TreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps[T]]
    }
    
    extension [Self <: TreeProps[?], T /* <: BasicDataNode */](x: Self & TreeProps[T]) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setAllowDrop(value: /* options */ AllowDropOptions[T] => Boolean): Self = StObject.set(x, "allowDrop", js.Any.fromFunction1(value))
      
      inline def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      inline def setAutoExpandParent(value: Boolean): Self = StObject.set(x, "autoExpandParent", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandParentUndefined: Self = StObject.set(x, "autoExpandParent", js.undefined)
      
      inline def setBlockNode(value: Boolean): Self = StObject.set(x, "blockNode", value.asInstanceOf[js.Any])
      
      inline def setBlockNodeUndefined: Self = StObject.set(x, "blockNode", js.undefined)
      
      inline def setCheckStrictly(value: Boolean): Self = StObject.set(x, "checkStrictly", value.asInstanceOf[js.Any])
      
      inline def setCheckStrictlyUndefined: Self = StObject.set(x, "checkStrictly", js.undefined)
      
      inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckedKeys(value: js.Array[Key] | Checked): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysUndefined: Self = StObject.set(x, "checkedKeys", js.undefined)
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedKeysUndefined: Self = StObject.set(x, "defaultCheckedKeys", js.undefined)
      
      inline def setDefaultCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultCheckedKeys", js.Array(value*))
      
      inline def setDefaultExpandAll(value: Boolean): Self = StObject.set(x, "defaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandAllUndefined: Self = StObject.set(x, "defaultExpandAll", js.undefined)
      
      inline def setDefaultExpandParent(value: Boolean): Self = StObject.set(x, "defaultExpandParent", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandParentUndefined: Self = StObject.set(x, "defaultExpandParent", js.undefined)
      
      inline def setDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedKeysUndefined: Self = StObject.set(x, "defaultExpandedKeys", js.undefined)
      
      inline def setDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultExpandedKeys", js.Array(value*))
      
      inline def setDefaultSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDraggable(value: DraggableFn | Boolean | DraggableConfig): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableFunction1(value: /* node */ DataNode => Boolean): Self = StObject.set(x, "draggable", js.Any.fromFunction1(value))
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropIndicatorRender(value: /* props */ Direction => Node): Self = StObject.set(x, "dropIndicatorRender", js.Any.fromFunction1(value))
      
      inline def setDropIndicatorRenderUndefined: Self = StObject.set(x, "dropIndicatorRender", js.undefined)
      
      inline def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      inline def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFilterAntTreeNode(value: Component[AntTreeNodeProps & js.Object, js.Object] => Boolean): Self = StObject.set(x, "filterAntTreeNode", js.Any.fromFunction1(value))
      
      inline def setFilterAntTreeNodeUndefined: Self = StObject.set(x, "filterAntTreeNode", js.undefined)
      
      inline def setFilterTreeNode(value: /* treeNode */ EventDataNode[T] => Boolean): Self = StObject.set(x, "filterTreeNode", js.Any.fromFunction1(value))
      
      inline def setFilterTreeNodeUndefined: Self = StObject.set(x, "filterTreeNode", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: (js.Function1[/* nodeProps */ AntdTreeNodeAttribute, Node]) | Node | IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: (/* nodeProps */ AntdTreeNodeAttribute) | (/* props */ TreeNodeProps[DataNode]) => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Element | Empty | JsNumber | String)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setLoadData(value: /* treeNode */ EventDataNode[T] => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "loadedKeys", value.asInstanceOf[js.Any])
      
      inline def setLoadedKeysUndefined: Self = StObject.set(x, "loadedKeys", js.undefined)
      
      inline def setLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "loadedKeys", js.Array(value*))
      
      inline def setMotion(value: Any): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnActiveChange(value: /* key */ Key => Callback): Self = StObject.set(x, "onActiveChange", js.Any.fromFunction1((t0: /* key */ Key) => value(t0).runNow()))
      
      inline def setOnActiveChangeUndefined: Self = StObject.set(x, "onActiveChange", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCheck(
        value: (/* checked */ typingsJapgolly.rcTree.anon.Checked | js.Array[Key], /* info */ CheckInfo[T]) => Callback
      ): Self = StObject.set(x, "onCheck", js.Any.fromFunction2((t0: /* checked */ typingsJapgolly.rcTree.anon.Checked | js.Array[Key], t1: /* info */ CheckInfo[T]) => (value(t0, t1)).runNow()))
      
      inline def setOnCheckUndefined: Self = StObject.set(x, "onCheck", js.undefined)
      
      inline def setOnClick(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], /* node */ EventDataNode[DataNode]) => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], t1: /* node */ EventDataNode[DataNode]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnDoubleClick(
        value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], /* node */ EventDataNode[DataNode]) => Callback
      ): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], t1: /* node */ EventDataNode[DataNode]) => (value(t0, t1)).runNow()))
      
      inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      inline def setOnDragEnd(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[T, HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragEnter(value: /* info */ (NodeDragEventParams[T, HTMLDivElement]) & ExpandedKeys => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: /* info */ (NodeDragEventParams[T, HTMLDivElement]) & ExpandedKeys) => value(t0).runNow()))
      
      inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      inline def setOnDragLeave(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[T, HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      inline def setOnDragOver(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[T, HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      inline def setOnDragStart(value: /* info */ NodeDragEventParams[T, HTMLDivElement] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[T, HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(value: /* info */ (NodeDragEventParams[T, HTMLDivElement]) & DragNode[T] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: /* info */ (NodeDragEventParams[T, HTMLDivElement]) & DragNode[T]) => value(t0).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[T]) => Callback): Self = StObject.set(x, "onExpand", js.Any.fromFunction2((t0: /* expandedKeys */ js.Array[Key], t1: /* info */ Expanded[T]) => (value(t0, t1)).runNow()))
      
      inline def setOnExpandUndefined: Self = StObject.set(x, "onExpand", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[T]) => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction2((t0: /* loadedKeys */ js.Array[Key], t1: /* info */ EventNode[T]) => (value(t0, t1)).runNow()))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ NodeMouseEventParams[T, HTMLSpanElement] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* info */ NodeMouseEventParams[T, HTMLSpanElement]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ NodeMouseEventParams[T, HTMLSpanElement] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* info */ NodeMouseEventParams[T, HTMLSpanElement]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnRightClick(value: /* info */ EventMouseEvent[T] => Callback): Self = StObject.set(x, "onRightClick", js.Any.fromFunction1((t0: /* info */ EventMouseEvent[T]) => value(t0).runNow()))
      
      inline def setOnRightClickUndefined: Self = StObject.set(x, "onRightClick", js.undefined)
      
      inline def setOnScroll(value: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[T]) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* selectedKeys */ js.Array[Key], t1: /* info */ Event[T]) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowLine(value: Boolean | ShowLeafIcon): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
      
      inline def setShowLineUndefined: Self = StObject.set(x, "showLine", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: SwitcherIcon | IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: (/* props */ AntTreeNodeProps) | (/* props */ TreeNodeProps[DataNode]) => Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setSwitcherIconVarargs(value: (Element | Empty | JsNumber | String)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
      
      inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTitleRender(value: /* node */ T => Node): Self = StObject.set(x, "titleRender", js.Any.fromFunction1(value))
      
      inline def setTitleRenderUndefined: Self = StObject.set(x, "titleRender", js.undefined)
      
      inline def setTreeData(value: js.Array[T]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataUndefined: Self = StObject.set(x, "treeData", js.undefined)
      
      inline def setTreeDataVarargs(value: T*): Self = StObject.set(x, "treeData", js.Array(value*))
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libTreeTreeMod.foo` */
  override def _to: CompoundedComponent = default
}
