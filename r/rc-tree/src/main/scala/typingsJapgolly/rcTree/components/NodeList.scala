package typingsJapgolly.rcTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.FlattenNode
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.rcTree.esNodeListMod.NodeListProps
import typingsJapgolly.rcTree.esNodeListMod.NodeListRef
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeList {
  
  inline def apply(
    activeItem: FlattenNode[Any],
    checkedKeys: js.Array[Key],
    data: js.Array[FlattenNode[Any]],
    dragOverNodeKey: Key,
    dragging: Boolean,
    dropPosition: Double,
    expandedKeys: js.Array[Key],
    halfCheckedKeys: js.Array[Key],
    height: Double,
    itemHeight: Double,
    keyEntities: Record[Key, DataEntity[Any]],
    loadedKeys: js.Array[Key],
    loadingKeys: js.Array[Key],
    motion: Any,
    onActiveChange: Key => Callback,
    onListChangeEnd: Callback,
    onListChangeStart: Callback,
    prefixCls: String,
    selectedKeys: js.Array[Key],
    style: CSSProperties,
    tabIndex: Double
  ): Builder = {
    val __props = js.Dynamic.literal(activeItem = activeItem.asInstanceOf[js.Any], checkedKeys = checkedKeys.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dragOverNodeKey = dragOverNodeKey.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadedKeys = loadedKeys.asInstanceOf[js.Any], loadingKeys = loadingKeys.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], onActiveChange = js.Any.fromFunction1((t0: Key) => onActiveChange(t0).runNow()), onListChangeEnd = onListChangeEnd.toJsFn, onListChangeStart = onListChangeStart.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NodeListProps[Any] & RefAttributes[NodeListRef]]))
  }
  
  @JSImport("rc-tree/es/NodeList", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[NodeListRef] {
    
    inline def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    
    inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onFocus(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def selectable(value: Boolean): this.type = set("selectable", value.asInstanceOf[js.Any])
    
    inline def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NodeListProps[Any] & RefAttributes[NodeListRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
