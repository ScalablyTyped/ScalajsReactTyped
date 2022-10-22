package typingsJapgolly.rcTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTree.anon.Checked
import typingsJapgolly.rcTree.anon.DragNode
import typingsJapgolly.rcTree.anon.Event
import typingsJapgolly.rcTree.anon.EventMouseEvent
import typingsJapgolly.rcTree.anon.EventNode
import typingsJapgolly.rcTree.anon.Expanded
import typingsJapgolly.rcTree.anon.ExpandedKeys
import typingsJapgolly.rcTree.esContextTypesMod.NodeDragEventParams
import typingsJapgolly.rcTree.esContextTypesMod.NodeMouseEventParams
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.Direction
import typingsJapgolly.rcTree.esInterfaceMod.EventDataNode
import typingsJapgolly.rcTree.esInterfaceMod.FieldNames
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.esTreeMod.AllowDropOptions
import typingsJapgolly.rcTree.esTreeMod.CheckInfo
import typingsJapgolly.rcTree.esTreeMod.DraggableConfig
import typingsJapgolly.rcTree.esTreeMod.DraggableFn
import typingsJapgolly.rcTree.esTreeMod.ExpandAction
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TreeProps978924493[R <: js.Object, TreeDataType /* <: DataNode | BasicDataNode */] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activeKey(value: Key): this.type = set("activeKey", value.asInstanceOf[js.Any])
  
  inline def allowDrop(value: /* options */ AllowDropOptions[TreeDataType] => Boolean): this.type = set("allowDrop", js.Any.fromFunction1(value))
  
  inline def autoExpandParent(value: Boolean): this.type = set("autoExpandParent", value.asInstanceOf[js.Any])
  
  inline def checkStrictly(value: Boolean): this.type = set("checkStrictly", value.asInstanceOf[js.Any])
  
  inline def checkable(value: Boolean | Node): this.type = set("checkable", value.asInstanceOf[js.Any])
  
  inline def checkableNull: this.type = set("checkable", null)
  
  inline def checkableVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkable", js.Array(value*))
  
  inline def checkableVdomElement(value: VdomElement): this.type = set("checkable", value.rawElement.asInstanceOf[js.Any])
  
  inline def checkedKeys(value: js.Array[Key] | Checked): this.type = set("checkedKeys", value.asInstanceOf[js.Any])
  
  inline def checkedKeysVarargs(value: Key*): this.type = set("checkedKeys", js.Array(value*))
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def defaultCheckedKeys(value: js.Array[Key]): this.type = set("defaultCheckedKeys", value.asInstanceOf[js.Any])
  
  inline def defaultCheckedKeysVarargs(value: Key*): this.type = set("defaultCheckedKeys", js.Array(value*))
  
  inline def defaultExpandAll(value: Boolean): this.type = set("defaultExpandAll", value.asInstanceOf[js.Any])
  
  inline def defaultExpandParent(value: Boolean): this.type = set("defaultExpandParent", value.asInstanceOf[js.Any])
  
  inline def defaultExpandedKeys(value: js.Array[Key]): this.type = set("defaultExpandedKeys", value.asInstanceOf[js.Any])
  
  inline def defaultExpandedKeysVarargs(value: Key*): this.type = set("defaultExpandedKeys", js.Array(value*))
  
  inline def defaultSelectedKeys(value: js.Array[Key]): this.type = set("defaultSelectedKeys", value.asInstanceOf[js.Any])
  
  inline def defaultSelectedKeysVarargs(value: Key*): this.type = set("defaultSelectedKeys", js.Array(value*))
  
  inline def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def draggable(value: DraggableFn | Boolean | DraggableConfig): this.type = set("draggable", value.asInstanceOf[js.Any])
  
  inline def draggableFunction1(value: /* node */ DataNode => Boolean): this.type = set("draggable", js.Any.fromFunction1(value))
  
  inline def dropIndicatorRender(value: /* props */ typingsJapgolly.rcTree.anon.Direction => Node): this.type = set("dropIndicatorRender", js.Any.fromFunction1(value))
  
  inline def expandAction(value: ExpandAction): this.type = set("expandAction", value.asInstanceOf[js.Any])
  
  inline def expandedKeys(value: js.Array[Key]): this.type = set("expandedKeys", value.asInstanceOf[js.Any])
  
  inline def expandedKeysVarargs(value: Key*): this.type = set("expandedKeys", js.Array(value*))
  
  inline def fieldNames(value: FieldNames): this.type = set("fieldNames", value.asInstanceOf[js.Any])
  
  inline def filterTreeNode(value: /* treeNode */ EventDataNode[TreeDataType] => Boolean): this.type = set("filterTreeNode", js.Any.fromFunction1(value))
  
  inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def icon(value: IconType): this.type = set("icon", value.asInstanceOf[js.Any])
  
  inline def iconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): this.type = set("icon", js.Any.fromFunction1(value))
  
  inline def iconNull: this.type = set("icon", null)
  
  inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
  
  inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
  
  inline def itemHeight(value: Double): this.type = set("itemHeight", value.asInstanceOf[js.Any])
  
  inline def loadData(value: /* treeNode */ EventDataNode[TreeDataType] => js.Promise[Any]): this.type = set("loadData", js.Any.fromFunction1(value))
  
  inline def loadedKeys(value: js.Array[Key]): this.type = set("loadedKeys", value.asInstanceOf[js.Any])
  
  inline def loadedKeysVarargs(value: Key*): this.type = set("loadedKeys", js.Array(value*))
  
  inline def motion(value: Any): this.type = set("motion", value.asInstanceOf[js.Any])
  
  inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  
  inline def onActiveChange(value: /* key */ Key => Callback): this.type = set("onActiveChange", js.Any.fromFunction1((t0: /* key */ Key) => value(t0).runNow()))
  
  inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onCheck(value: (/* checked */ Checked | js.Array[Key], /* info */ CheckInfo[TreeDataType]) => Callback): this.type = set("onCheck", js.Any.fromFunction2((t0: /* checked */ Checked | js.Array[Key], t1: /* info */ CheckInfo[TreeDataType]) => (value(t0, t1)).runNow()))
  
  inline def onClick(
    value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], /* node */ EventDataNode[DataNode]) => Callback
  ): this.type = set("onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], t1: /* node */ EventDataNode[DataNode]) => (value(t0, t1)).runNow()))
  
  inline def onContextMenu(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onDoubleClick(
    value: (/* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], /* node */ EventDataNode[DataNode]) => Callback
  ): this.type = set("onDoubleClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element], t1: /* node */ EventDataNode[DataNode]) => (value(t0, t1)).runNow()))
  
  inline def onDragEnd(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDragEnter(value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & ExpandedKeys => Callback): this.type = set("onDragEnter", js.Any.fromFunction1((t0: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & ExpandedKeys) => value(t0).runNow()))
  
  inline def onDragLeave(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Callback): this.type = set("onDragLeave", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDragOver(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Callback): this.type = set("onDragOver", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDragStart(value: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement] => Callback): this.type = set("onDragStart", js.Any.fromFunction1((t0: /* info */ NodeDragEventParams[TreeDataType, HTMLDivElement]) => value(t0).runNow()))
  
  inline def onDrop(
    value: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & DragNode[TreeDataType] => Callback
  ): this.type = set("onDrop", js.Any.fromFunction1((t0: /* info */ (NodeDragEventParams[TreeDataType, HTMLDivElement]) & DragNode[TreeDataType]) => value(t0).runNow()))
  
  inline def onExpand(value: (/* expandedKeys */ js.Array[Key], /* info */ Expanded[TreeDataType]) => Callback): this.type = set("onExpand", js.Any.fromFunction2((t0: /* expandedKeys */ js.Array[Key], t1: /* info */ Expanded[TreeDataType]) => (value(t0, t1)).runNow()))
  
  inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onLoad(value: (/* loadedKeys */ js.Array[Key], /* info */ EventNode[TreeDataType]) => Callback): this.type = set("onLoad", js.Any.fromFunction2((t0: /* loadedKeys */ js.Array[Key], t1: /* info */ EventNode[TreeDataType]) => (value(t0, t1)).runNow()))
  
  inline def onMouseEnter(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement]) => value(t0).runNow()))
  
  inline def onMouseLeave(value: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* info */ NodeMouseEventParams[TreeDataType, HTMLSpanElement]) => value(t0).runNow()))
  
  inline def onRightClick(value: /* info */ EventMouseEvent[TreeDataType] => Callback): this.type = set("onRightClick", js.Any.fromFunction1((t0: /* info */ EventMouseEvent[TreeDataType]) => value(t0).runNow()))
  
  inline def onScroll(value: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onSelect(value: (/* selectedKeys */ js.Array[Key], /* info */ Event[TreeDataType]) => Callback): this.type = set("onSelect", js.Any.fromFunction2((t0: /* selectedKeys */ js.Array[Key], t1: /* info */ Event[TreeDataType]) => (value(t0, t1)).runNow()))
  
  inline def rootClassName(value: String): this.type = set("rootClassName", value.asInstanceOf[js.Any])
  
  inline def rootStyle(value: CSSProperties): this.type = set("rootStyle", value.asInstanceOf[js.Any])
  
  inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
  
  inline def selectedKeys(value: js.Array[Key]): this.type = set("selectedKeys", value.asInstanceOf[js.Any])
  
  inline def selectedKeysVarargs(value: Key*): this.type = set("selectedKeys", js.Array(value*))
  
  inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
  
  inline def showLine(value: Boolean): this.type = set("showLine", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def switcherIcon(value: IconType): this.type = set("switcherIcon", value.asInstanceOf[js.Any])
  
  inline def switcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): this.type = set("switcherIcon", js.Any.fromFunction1(value))
  
  inline def switcherIconNull: this.type = set("switcherIcon", null)
  
  inline def switcherIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("switcherIcon", js.Array(value*))
  
  inline def switcherIconVdomElement(value: VdomElement): this.type = set("switcherIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def titleRender(value: TreeDataType => Node): this.type = set("titleRender", js.Any.fromFunction1(value))
  
  inline def treeData(value: js.Array[TreeDataType]): this.type = set("treeData", value.asInstanceOf[js.Any])
  
  inline def treeDataVarargs(value: TreeDataType*): this.type = set("treeData", js.Array(value*))
  
  inline def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
}
