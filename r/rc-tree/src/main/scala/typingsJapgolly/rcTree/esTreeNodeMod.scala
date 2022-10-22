package typingsJapgolly.rcTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.rcTree.anon.DragNodeHighlight
import typingsJapgolly.rcTree.esContextTypesMod.TreeContextProps
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.rcTreeStrings.close
import typingsJapgolly.rcTree.rcTreeStrings.open
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeNodeMod extends Shortcut {
  
  @JSImport("rc-tree/es/TreeNode", JSImport.Default)
  @js.native
  val default: FC[TreeNodeProps[DataNode]] = js.native
  
  @JSImport("rc-tree/es/TreeNode", "InternalTreeNode")
  @js.native
  open class InternalTreeNode protected () extends Component[InternalTreeNodeProps, TreeNodeState, Any] {
    def this(props: InternalTreeNodeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InternalTreeNodeProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInternalTreeNode(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInternalTreeNode(): Unit = js.native
    
    def getNodeState(): close | open = js.native
    
    def hasChildren(): Boolean = js.native
    
    def isCheckable(): String | Double | Boolean | Element | ReactFragment = js.native
    
    def isDisabled(): Boolean = js.native
    
    def isDraggable(): Boolean = js.native
    
    def isLeaf(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def onCheck(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onContextMenu(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onDragEnd(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    def onDragEnter(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    def onDragLeave(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    def onDragOver(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    def onDragStart(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    def onDrop(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    
    var onExpand: MouseEventHandler[HTMLDivElement] = js.native
    
    def onMouseEnter(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onMouseLeave(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onSelect(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onSelectorClick(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def onSelectorDoubleClick(e: ReactMouseEventFrom[HTMLSpanElement]): Unit = js.native
    
    def renderCheckbox(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderDragHandler(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderDropIndicator(): Node = js.native
    
    def renderIcon(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderSelector(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderSwitcher(): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    def renderSwitcherIconDom(isLeaf: Boolean): Node = js.native
    
    var selectHandle: HTMLSpanElement = js.native
    
    def setSelectHandle(node: Any): Unit = js.native
    
    @JSName("state")
    var state_InternalTreeNode: DragNodeHighlight = js.native
    
    def syncLoadData(props: Any): Unit = js.native
  }
  
  trait InternalTreeNodeProps
    extends StObject
       with TreeNodeProps[DataNode] {
    
    var context: js.UndefOr[TreeContextProps[DataNode]] = js.undefined
  }
  object InternalTreeNodeProps {
    
    inline def apply(): InternalTreeNodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTreeNodeProps]
    }
    
    extension [Self <: InternalTreeNodeProps](x: Self) {
      
      inline def setContext(value: TreeContextProps[DataNode]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait TreeNodeProps[TreeDataType /* <: BasicDataNode */] extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var checkable: js.UndefOr[Boolean] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** New added in Tree for easy data access */
    var data: js.UndefOr[TreeDataType] = js.undefined
    
    var disableCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var domRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var dragOver: js.UndefOr[Boolean] = js.undefined
    
    var dragOverGapBottom: js.UndefOr[Boolean] = js.undefined
    
    var dragOverGapTop: js.UndefOr[Boolean] = js.undefined
    
    var eventKey: js.UndefOr[Key] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var halfChecked: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[IconType] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isEnd: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    var isLeaf: js.UndefOr[Boolean] = js.undefined
    
    var isStart: js.UndefOr[js.Array[Boolean]] = js.undefined
    
    var loaded: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var pos: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var switcherIcon: js.UndefOr[IconType] = js.undefined
    
    var title: js.UndefOr[Node | (js.Function1[/* data */ TreeDataType, Node])] = js.undefined
  }
  object TreeNodeProps {
    
    inline def apply[TreeDataType /* <: BasicDataNode */](): TreeNodeProps[TreeDataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNodeProps[TreeDataType]]
    }
    
    extension [Self <: TreeNodeProps[?], TreeDataType /* <: BasicDataNode */](x: Self & TreeNodeProps[TreeDataType]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
      
      inline def setData(value: TreeDataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
      
      inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDomRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "domRef", value.asInstanceOf[js.Any])
      
      inline def setDomRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "domRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setDomRefNull: Self = StObject.set(x, "domRef", null)
      
      inline def setDomRefUndefined: Self = StObject.set(x, "domRef", js.undefined)
      
      inline def setDragOver(value: Boolean): Self = StObject.set(x, "dragOver", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottom(value: Boolean): Self = StObject.set(x, "dragOverGapBottom", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapBottomUndefined: Self = StObject.set(x, "dragOverGapBottom", js.undefined)
      
      inline def setDragOverGapTop(value: Boolean): Self = StObject.set(x, "dragOverGapTop", value.asInstanceOf[js.Any])
      
      inline def setDragOverGapTopUndefined: Self = StObject.set(x, "dragOverGapTop", js.undefined)
      
      inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      inline def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHalfChecked(value: Boolean): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedUndefined: Self = StObject.set(x, "halfChecked", js.undefined)
      
      inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsEnd(value: js.Array[Boolean]): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
      
      inline def setIsEndUndefined: Self = StObject.set(x, "isEnd", js.undefined)
      
      inline def setIsEndVarargs(value: Boolean*): Self = StObject.set(x, "isEnd", js.Array(value*))
      
      inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
      
      inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
      
      inline def setIsStart(value: js.Array[Boolean]): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
      
      inline def setIsStartUndefined: Self = StObject.set(x, "isStart", js.undefined)
      
      inline def setIsStartVarargs(value: Boolean*): Self = StObject.set(x, "isStart", js.Array(value*))
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
      
      inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
      
      inline def setSwitcherIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
      
      inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: Node | (js.Function1[/* data */ TreeDataType, Node])): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* data */ TreeDataType => Node): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TreeNodeState extends StObject {
    
    var dragNodeHighlight: Boolean
  }
  object TreeNodeState {
    
    inline def apply(dragNodeHighlight: Boolean): TreeNodeState = {
      val __obj = js.Dynamic.literal(dragNodeHighlight = dragNodeHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNodeState]
    }
    
    extension [Self <: TreeNodeState](x: Self) {
      
      inline def setDragNodeHighlight(value: Boolean): Self = StObject.set(x, "dragNodeHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[TreeNodeProps[DataNode]]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeNodeMod.foo` */
  override def _to: FC[TreeNodeProps[DataNode]] = default
}
