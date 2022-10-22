package typingsJapgolly.rcTree.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.FieldDataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTree.rcTreeStrings.children
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-tree.rc-tree/es/interface.FieldDataNode<{  key :string | number,   title :react.react.ReactNode | (data : rc-tree.rc-tree/es/interface.DataNode): react.react.ReactNode | undefined}, 'children'> */
trait FieldDataNodekeystringnum extends StObject {
  
  var checkable: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[js.Array[FieldDataNode[Key, typingsJapgolly.rcTree.rcTreeStrings.children]]] = js.undefined
  
  /** Set style of TreeNode. This is not recommend if you don't have any force requirement */
  var className: js.UndefOr[String] = js.undefined
  
  var disableCheckbox: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[IconType] = js.undefined
  
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  
  var key: String | Double
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var switcherIcon: js.UndefOr[IconType] = js.undefined
  
  var title: js.UndefOr[
    japgolly.scalajs.react.facade.React.Node | (js.Function1[/* data */ this.type, japgolly.scalajs.react.facade.React.Node])
  ] = js.undefined
}
object FieldDataNodekeystringnum {
  
  inline def apply(key: String | Double): FieldDataNodekeystringnum = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDataNodekeystringnum]
  }
  
  extension [Self <: FieldDataNodekeystringnum](x: Self) {
    
    inline def setCheckable(value: Boolean): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
    
    inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
    
    inline def setChildren(value: js.Array[FieldDataNode[Key, children]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (FieldDataNode[Key, children])*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisableCheckbox(value: Boolean): Self = StObject.set(x, "disableCheckbox", value.asInstanceOf[js.Any])
    
    inline def setDisableCheckboxUndefined: Self = StObject.set(x, "disableCheckbox", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: IconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ TreeNodeProps[DataNode] => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setIsLeaf(value: Boolean): Self = StObject.set(x, "isLeaf", value.asInstanceOf[js.Any])
    
    inline def setIsLeafUndefined: Self = StObject.set(x, "isLeaf", js.undefined)
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
    
    inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
    
    inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
    
    inline def setSwitcherIconUndefined: Self = StObject.set(x, "switcherIcon", js.undefined)
    
    inline def setSwitcherIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
    
    inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTitle(
      value: japgolly.scalajs.react.facade.React.Node | (js.Function1[FieldDataNodekeystringnum, japgolly.scalajs.react.facade.React.Node])
    ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleFunction1(value: FieldDataNodekeystringnum => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
