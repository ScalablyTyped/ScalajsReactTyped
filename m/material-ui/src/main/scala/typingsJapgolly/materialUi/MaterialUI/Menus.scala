package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.materialUi.MaterialUI.List.ListItemProps
import typingsJapgolly.materialUi.MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menus {
  
  type DropDownMenu = Component[DropDownMenuProps & js.Object, js.Object]
  
  trait DropDownMenuProps extends StObject {
    
    // <div/> is the element that gets the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var iconButton: js.UndefOr[Node] = js.undefined
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var labelStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var menuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[
          /* e */ ReactEventFrom[js.Object & Element], 
          /* index */ Double, 
          /* menuItemValue */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ ReactEventFrom[js.Object & Element], Unit]] = js.undefined
    
    var openImmediately: js.UndefOr[Boolean] = js.undefined
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var selectionRenderer: js.UndefOr[js.Function2[/* value */ Any, /* menuItem */ Any, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var underlineStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object DropDownMenuProps {
    
    inline def apply(): DropDownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropDownMenuProps]
    }
    
    extension [Self <: DropDownMenuProps](x: Self) {
      
      inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIconButton(value: VdomNode): Self = StObject.set(x, "iconButton", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconButtonNull: Self = StObject.set(x, "iconButton", null)
      
      inline def setIconButtonUndefined: Self = StObject.set(x, "iconButton", js.undefined)
      
      inline def setIconButtonVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "iconButton", js.Array(value*))
      
      inline def setIconButtonVdomElement(value: VdomElement): Self = StObject.set(x, "iconButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setLabelStyle(value: CSSProperties): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "menuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuItemStyleUndefined: Self = StObject.set(x, "menuItemStyle", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ ReactEventFrom[js.Object & Element], /* index */ Double, /* menuItemValue */ Any) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* index */ Double, t2: /* menuItemValue */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClose(value: /* e */ ReactEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOpenImmediately(value: Boolean): Self = StObject.set(x, "openImmediately", value.asInstanceOf[js.Any])
      
      inline def setOpenImmediatelyUndefined: Self = StObject.set(x, "openImmediately", js.undefined)
      
      inline def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      inline def setSelectionRenderer(value: (/* value */ Any, /* menuItem */ Any) => Callback): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction2((t0: /* value */ Any, t1: /* menuItem */ Any) => (value(t0, t1)).runNow()))
      
      inline def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setUnderlineStyle(value: CSSProperties): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type IconMenu = Component[IconMenuProps & js.Object, js.Object]
  
  trait IconMenuProps extends StObject {
    
    // <Menu/> is the element that get the 'other' properties
    var anchorOrigin: js.UndefOr[origin] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
    
    // Other properties from <Menu/>
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clickCloseDelay: js.UndefOr[Double] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var iconButtonElement: japgolly.scalajs.react.facade.React.Element
    
    var iconStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var menuStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & Element], 
          /* itemValue */ Any | js.Array[Any], 
          Unit
        ]
      ] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[js.Object & Element], Unit]] = js.undefined
    
    var onItemClick: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & Element], 
          Component[MenuItemProps & js.Object, js.Object], 
          Unit
        ]
      ] = js.undefined
    
    var onKeyboardFocus: js.UndefOr[
        js.Function2[
          /* e */ ReactFocusEventFrom[js.Object & Element], 
          /* isKeyboardFocused */ Boolean, 
          Unit
        ]
      ] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onMouseUp: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var onRequestChange: js.UndefOr[js.Function2[/* opening */ Boolean, /* reason */ String, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any | js.Array[Any]] = js.undefined
  }
  object IconMenuProps {
    
    inline def apply(iconButtonElement: VdomElement): IconMenuProps = {
      val __obj = js.Dynamic.literal(iconButtonElement = iconButtonElement.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconMenuProps]
    }
    
    extension [Self <: IconMenuProps](x: Self) {
      
      inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClickCloseDelay(value: Double): Self = StObject.set(x, "clickCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setClickCloseDelayUndefined: Self = StObject.set(x, "clickCloseDelay", js.undefined)
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setIconButtonElement(value: VdomElement): Self = StObject.set(x, "iconButtonElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconStyle(value: CSSProperties): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
      
      inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
      
      inline def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      inline def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMenuStyle(value: CSSProperties): Self = StObject.set(x, "menuStyle", value.asInstanceOf[js.Any])
      
      inline def setMenuStyleUndefined: Self = StObject.set(x, "menuStyle", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ ReactEventFrom[js.Object & Element], /* itemValue */ Any | js.Array[Any]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* itemValue */ Any | js.Array[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnItemClick(
        value: (/* e */ ReactEventFrom[js.Object & Element], Component[MenuItemProps & js.Object, js.Object]) => Callback
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: Component[MenuItemProps & js.Object, js.Object]) => (value(t0, t1)).runNow()))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnKeyboardFocus(
        value: (/* e */ ReactFocusEventFrom[js.Object & Element], /* isKeyboardFocused */ Boolean) => Callback
      ): Self = StObject.set(x, "onKeyboardFocus", js.Any.fromFunction2((t0: /* e */ ReactFocusEventFrom[js.Object & Element], t1: /* isKeyboardFocused */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnKeyboardFocusUndefined: Self = StObject.set(x, "onKeyboardFocus", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseUp(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnRequestChange(value: (/* opening */ Boolean, /* reason */ String) => Callback): Self = StObject.set(x, "onRequestChange", js.Any.fromFunction2((t0: /* opening */ Boolean, t1: /* reason */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnRequestChangeUndefined: Self = StObject.set(x, "onRequestChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
      
      inline def setValue(value: Any | js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  type Menu = Component[MenuProps & js.Object, js.Object]
  
  type MenuItem = Component[MenuItemProps & js.Object, js.Object]
  
  trait MenuItemProps
    extends StObject
       with ListItemProps {
    
    // <ListItem/> is the element that get the 'other' properties
    var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    @JSName("containerElement")
    var containerElement_MenuItemProps: js.UndefOr[Node | String] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var focusState: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String | Node] = js.undefined
    
    var menuItems: js.UndefOr[Node] = js.undefined
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    extension [Self <: MenuItemProps](x: Self) {
      
      inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setContainerElement(value: Node | String): Self = StObject.set(x, "containerElement", value.asInstanceOf[js.Any])
      
      inline def setContainerElementNull: Self = StObject.set(x, "containerElement", null)
      
      inline def setContainerElementUndefined: Self = StObject.set(x, "containerElement", js.undefined)
      
      inline def setContainerElementVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "containerElement", js.Array(value*))
      
      inline def setContainerElementVdomElement(value: VdomElement): Self = StObject.set(x, "containerElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setFocusState(value: String): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
      
      inline def setFocusStateUndefined: Self = StObject.set(x, "focusState", js.undefined)
      
      inline def setLabel(value: String | Node): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMenuItems(value: VdomNode): Self = StObject.set(x, "menuItems", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMenuItemsNull: Self = StObject.set(x, "menuItems", null)
      
      inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
      
      inline def setMenuItemsVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "menuItems", js.Array(value*))
      
      inline def setMenuItemsVdomElement(value: VdomElement): Self = StObject.set(x, "menuItems", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait MenuProps extends StObject {
    
    // <List/> is the element that get the 'other' properties
    var autoWidth: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var desktop: js.UndefOr[Boolean] = js.undefined
    
    var disableAutoFocus: js.UndefOr[Boolean] = js.undefined
    
    var initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & Element], 
          /* itemValue */ Any | js.Array[Any], 
          Unit
        ]
      ] = js.undefined
    
    var onEscKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
    
    var onItemClick: js.UndefOr[
        js.Function2[
          /* e */ ReactEventFrom[js.Object & Element], 
          Component[MenuItemProps & js.Object, js.Object], 
          Unit
        ]
      ] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[js.Object]] = js.undefined
    
    var selectedMenuItemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[Any | js.Array[Any]] = js.undefined
    
    var valueLink: js.UndefOr[ReactLink[Any | js.Array[Any]]] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
      
      inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDesktop(value: Boolean): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setDisableAutoFocus(value: Boolean): Self = StObject.set(x, "disableAutoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoFocusUndefined: Self = StObject.set(x, "disableAutoFocus", js.undefined)
      
      inline def setInitiallyKeyboardFocused(value: Boolean): Self = StObject.set(x, "initiallyKeyboardFocused", value.asInstanceOf[js.Any])
      
      inline def setInitiallyKeyboardFocusedUndefined: Self = StObject.set(x, "initiallyKeyboardFocused", js.undefined)
      
      inline def setListStyle(value: CSSProperties): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnChange(
        value: (/* e */ ReactEventFrom[js.Object & Element], /* itemValue */ Any | js.Array[Any]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: /* itemValue */ Any | js.Array[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEscKeyDown(value: ReactKeyboardEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onEscKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnEscKeyDownUndefined: Self = StObject.set(x, "onEscKeyDown", js.undefined)
      
      inline def setOnItemClick(
        value: (/* e */ ReactEventFrom[js.Object & Element], Component[MenuItemProps & js.Object, js.Object]) => Callback
      ): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2((t0: /* e */ ReactEventFrom[js.Object & Element], t1: Component[MenuItemProps & js.Object, js.Object]) => (value(t0, t1)).runNow()))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setSelectedMenuItemStyle(value: CSSProperties): Self = StObject.set(x, "selectedMenuItemStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedMenuItemStyleUndefined: Self = StObject.set(x, "selectedMenuItemStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Any | js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueLink(value: ReactLink[Any | js.Array[Any]]): Self = StObject.set(x, "valueLink", value.asInstanceOf[js.Any])
      
      inline def setValueLinkUndefined: Self = StObject.set(x, "valueLink", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
