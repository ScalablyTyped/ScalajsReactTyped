package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.rcMenu.anon.DomEvent
import typingsJapgolly.rcMenu.rcMenuStrings.divider
import typingsJapgolly.rcMenu.rcMenuStrings.group
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type BuiltinPlacements = Record[String, Any]
  
  trait ItemSharedProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ItemSharedProps {
    
    inline def apply(): ItemSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSharedProps]
    }
    
    extension [Self <: ItemSharedProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMenu.esInterfaceMod.SubMenuType
    - typingsJapgolly.rcMenu.esInterfaceMod.MenuItemType
    - typingsJapgolly.rcMenu.esInterfaceMod.MenuItemGroupType
    - typingsJapgolly.rcMenu.esInterfaceMod.MenuDividerType
    - scala.Null
  */
  type ItemType = _ItemType | Null
  
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  
  trait MenuDividerType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var `type`: divider
  }
  object MenuDividerType {
    
    inline def apply(): MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[MenuDividerType]
    }
    
    extension [Self <: MenuDividerType](x: Self) {
      
      inline def setType(value: divider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuHoverEventHandler = js.Function1[/* info */ DomEvent, Unit]
  
  trait MenuInfo extends StObject {
    
    var domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]
    
    /** @deprecated This will not support in future. You should avoid to use this */
    var item: ReactInstance
    
    var key: String
    
    var keyPath: js.Array[String]
  }
  object MenuInfo {
    
    inline def apply(
      domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String]
    ): MenuInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInfo]
    }
    
    extension [Self <: MenuInfo](x: Self) {
      
      inline def setDomEvent(value: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
    }
  }
  
  trait MenuItemGroupType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.UndefOr[js.Array[ItemType]] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var `type`: group
  }
  object MenuItemGroupType {
    
    inline def apply(): MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[MenuItemGroupType]
    }
    
    extension [Self <: MenuItemGroupType](x: Self) {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItemType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var key: Key
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  }
  object MenuItemType {
    
    inline def apply(key: Key): MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemType]
    }
    
    extension [Self <: MenuItemType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => Node): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setItemIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "itemIcon", js.Array(value*))
      
      inline def setItemIconVdomElement(value: VdomElement): Self = StObject.set(x, "itemIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* info */ MenuInfo => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* info */ MenuInfo) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMenu.rcMenuStrings.horizontal
    - typingsJapgolly.rcMenu.rcMenuStrings.vertical
    - typingsJapgolly.rcMenu.rcMenuStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    inline def horizontal: typingsJapgolly.rcMenu.rcMenuStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.rcMenu.rcMenuStrings.horizontal]
    
    inline def `inline`: typingsJapgolly.rcMenu.rcMenuStrings.`inline` = "inline".asInstanceOf[typingsJapgolly.rcMenu.rcMenuStrings.`inline`]
    
    inline def vertical: typingsJapgolly.rcMenu.rcMenuStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.rcMenu.rcMenuStrings.vertical]
  }
  
  @js.native
  trait MenuRef extends StObject {
    
    /**
      * Focus active child if any, or the first child which is not disabled will be focused.
      * @param options
      */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    var list: HTMLUListElement = js.native
  }
  
  trait MenuTitleInfo extends StObject {
    
    var domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]
    
    var key: String
  }
  object MenuTitleInfo {
    
    inline def apply(domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], key: String): MenuTitleInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuTitleInfo]
    }
    
    extension [Self <: MenuTitleInfo](x: Self) {
      
      inline def setDomEvent(value: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderIconInfo extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var isSubMenu: js.UndefOr[Boolean] = js.undefined
  }
  object RenderIconInfo {
    
    inline def apply(): RenderIconInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderIconInfo]
    }
    
    extension [Self <: RenderIconInfo](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setIsSubMenu(value: Boolean): Self = StObject.set(x, "isSubMenu", value.asInstanceOf[js.Any])
      
      inline def setIsSubMenuUndefined: Self = StObject.set(x, "isSubMenu", js.undefined)
    }
  }
  
  type RenderIconType = Node | (js.Function1[/* props */ RenderIconInfo, Node])
  
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  
  trait SelectInfo
    extends StObject
       with MenuInfo {
    
    var selectedKeys: js.Array[String]
  }
  object SelectInfo {
    
    inline def apply(
      domEvent: ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String],
      selectedKeys: js.Array[String]
    ): SelectInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    extension [Self <: SelectInfo](x: Self) {
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  trait SubMenuType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.Array[ItemType]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var key: String
    
    var label: js.UndefOr[Node] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleClick: js.UndefOr[js.Function1[/* info */ MenuTitleInfo, Unit]] = js.undefined
    
    var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
  }
  object SubMenuType {
    
    inline def apply(children: js.Array[ItemType], key: String): SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuType]
    }
    
    extension [Self <: SubMenuType](x: Self) {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => Node): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconNull: Self = StObject.set(x, "expandIcon", null)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandIcon", js.Array(value*))
      
      inline def setExpandIconVdomElement(value: VdomElement): Self = StObject.set(x, "expandIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => Node): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setItemIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "itemIcon", js.Array(value*))
      
      inline def setItemIconVdomElement(value: VdomElement): Self = StObject.set(x, "itemIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* info */ MenuInfo => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* info */ MenuInfo) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTitleClick(value: /* info */ MenuTitleInfo => Callback): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1((t0: /* info */ MenuTitleInfo) => value(t0).runNow()))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setOnTitleMouseEnter(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      inline def setOnTitleMouseLeave(value: /* info */ DomEvent => Callback): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1((t0: /* info */ DomEvent) => value(t0).runNow()))
      
      inline def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value*))
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMenu.rcMenuStrings.click
    - typingsJapgolly.rcMenu.rcMenuStrings.hover
  */
  trait TriggerSubMenuAction extends StObject
  object TriggerSubMenuAction {
    
    inline def click: typingsJapgolly.rcMenu.rcMenuStrings.click = "click".asInstanceOf[typingsJapgolly.rcMenu.rcMenuStrings.click]
    
    inline def hover: typingsJapgolly.rcMenu.rcMenuStrings.hover = "hover".asInstanceOf[typingsJapgolly.rcMenu.rcMenuStrings.hover]
  }
  
  trait _ItemType extends StObject
  object _ItemType {
    
    inline def MenuDividerType(): typingsJapgolly.rcMenu.esInterfaceMod.MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[typingsJapgolly.rcMenu.esInterfaceMod.MenuDividerType]
    }
    
    inline def MenuItemGroupType(): typingsJapgolly.rcMenu.esInterfaceMod.MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[typingsJapgolly.rcMenu.esInterfaceMod.MenuItemGroupType]
    }
    
    inline def MenuItemType(key: Key): typingsJapgolly.rcMenu.esInterfaceMod.MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.rcMenu.esInterfaceMod.MenuItemType]
    }
    
    inline def SubMenuType(children: js.Array[ItemType], key: String): typingsJapgolly.rcMenu.esInterfaceMod.SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.rcMenu.esInterfaceMod.SubMenuType]
    }
  }
}
