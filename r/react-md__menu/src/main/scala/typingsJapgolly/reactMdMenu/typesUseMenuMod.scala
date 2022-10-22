package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactMdButton.typesFabMod.FABPosition
import typingsJapgolly.reactMdMenu.typesTypesMod.BaseMenuHookOptions
import typingsJapgolly.reactMdMenu.typesTypesMod.BaseMenuHookReturnValue
import typingsJapgolly.reactMdMenu.typesTypesMod.ProvidedMenuProps
import typingsJapgolly.reactMdMenu.typesTypesMod.ProvidedMenuToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseMenuMod {
  
  @JSImport("@react-md/menu/types/useMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMenu[ToggleEl /* <: HTMLElement */](options: MenuHookOptions[ToggleEl]): MenuHookReturnValue[ToggleEl] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenu")(options.asInstanceOf[js.Any]).asInstanceOf[MenuHookReturnValue[ToggleEl]]
  
  trait MenuHookOptions[ToggleEl /* <: HTMLElement */]
    extends StObject
       with BaseMenuHookOptions {
    
    /**
      * Boolean if the toggle component is currently disabled which will prevent
      * the arrow keys from opening a menuitem's menu.
      *
      * @defaultValue `false`
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is just used to update the default anchor behavior.
      *
      * @see {@link FABPosition}
      * @defaultValue `null`
      */
    var floating: js.UndefOr[FABPosition] = js.undefined
    
    /**
      * An optional click handler to merge with the
      * {@link MenuHookReturnValue.onClick} behavior.
      */
    var onMenuClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * An optional keydown handler to merge with the
      * {@link MenuHookReturnValue.menuProps} behavior. Calling
      * `event.stopPropagation()` will prevent the default behavior of closing the
      * menu when the `"Escape"` key is pressed.
      */
    var onMenuKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * An optional click handler to merge with the toggle visibility behavior.
      * Calling `event.stopPropagation()` will prevent the default behavior from
      * occurring.
      */
    var onToggleClick: js.UndefOr[MouseEventHandler[ToggleEl]] = js.undefined
    
    /**
      * An optional keydown handler to merge with the
      * {@link ProvidedMenuToggleProps.onKeyDown} behavior.
      */
    var onToggleKeyDown: js.UndefOr[KeyboardEventHandler[ToggleEl]] = js.undefined
    
    /**
      * An optional keydown handler to merge with the
      * {@link ProvidedMenuToggleProps.onMouseEnter} behavior.
      */
    var onToggleMouseEnter: js.UndefOr[MouseEventHandler[ToggleEl]] = js.undefined
    
    /**
      * An optional keydown handler to merge with the
      * {@link ProvidedMenuToggleProps.onMouseLeave} behavior.
      */
    var onToggleMouseLeave: js.UndefOr[MouseEventHandler[ToggleEl]] = js.undefined
  }
  object MenuHookOptions {
    
    inline def apply[ToggleEl /* <: HTMLElement */](baseId: String, setVisible: SetStateAction[Boolean] => Callback, visible: Boolean): MenuHookOptions[ToggleEl] = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuHookOptions[ToggleEl]]
    }
    
    extension [Self <: MenuHookOptions[?], ToggleEl /* <: HTMLElement */](x: Self & MenuHookOptions[ToggleEl]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFloating(value: FABPosition): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingNull: Self = StObject.set(x, "floating", null)
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setOnMenuClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMenuClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMenuClickUndefined: Self = StObject.set(x, "onMenuClick", js.undefined)
      
      inline def setOnMenuKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onMenuKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnMenuKeyDownUndefined: Self = StObject.set(x, "onMenuKeyDown", js.undefined)
      
      inline def setOnToggleClick(value: ReactMouseEventFrom[ToggleEl & Element] => Callback): Self = StObject.set(x, "onToggleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[ToggleEl & Element]) => value(t0).runNow()))
      
      inline def setOnToggleClickUndefined: Self = StObject.set(x, "onToggleClick", js.undefined)
      
      inline def setOnToggleKeyDown(value: ReactKeyboardEventFrom[ToggleEl & Element] => Callback): Self = StObject.set(x, "onToggleKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[ToggleEl & Element]) => value(t0).runNow()))
      
      inline def setOnToggleKeyDownUndefined: Self = StObject.set(x, "onToggleKeyDown", js.undefined)
      
      inline def setOnToggleMouseEnter(value: ReactMouseEventFrom[ToggleEl & Element] => Callback): Self = StObject.set(x, "onToggleMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[ToggleEl & Element]) => value(t0).runNow()))
      
      inline def setOnToggleMouseEnterUndefined: Self = StObject.set(x, "onToggleMouseEnter", js.undefined)
      
      inline def setOnToggleMouseLeave(value: ReactMouseEventFrom[ToggleEl & Element] => Callback): Self = StObject.set(x, "onToggleMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[ToggleEl & Element]) => value(t0).runNow()))
      
      inline def setOnToggleMouseLeaveUndefined: Self = StObject.set(x, "onToggleMouseLeave", js.undefined)
    }
  }
  
  trait MenuHookReturnValue[ToggleEl /* <: HTMLElement */]
    extends StObject
       with BaseMenuHookReturnValue {
    
    /**
      * An object of props that must be provided to the toggle element for the
      * visibility functionality of menus to work.
      *
      * @see {@link ProvidedMenuToggleProps}
      */
    var toggleProps: ProvidedMenuToggleProps[ToggleEl]
    
    /**
      * A ref that **must** be passed to the toggle element if the toggle should be
      * refocused when the menu is closed via a keyboard press. This can also be
      * used if you need access to the toggle element's DOM node for some reason.
      */
    var toggleRef: MutableRefObject[ToggleEl | Null]
  }
  object MenuHookReturnValue {
    
    inline def apply[ToggleEl /* <: HTMLElement */](
      menuNodeRef: RefHandle[HTMLDivElement],
      menuProps: ProvidedMenuProps,
      toggleProps: ProvidedMenuToggleProps[ToggleEl],
      toggleRef: MutableRefObject[ToggleEl | Null]
    ): MenuHookReturnValue[ToggleEl] = {
      val __obj = js.Dynamic.literal(menuNodeRef = menuNodeRef.asInstanceOf[js.Any], menuProps = menuProps.asInstanceOf[js.Any], toggleProps = toggleProps.asInstanceOf[js.Any], toggleRef = toggleRef.asInstanceOf[js.Any], menuRef = null)
      __obj.asInstanceOf[MenuHookReturnValue[ToggleEl]]
    }
    
    extension [Self <: MenuHookReturnValue[?], ToggleEl /* <: HTMLElement */](x: Self & MenuHookReturnValue[ToggleEl]) {
      
      inline def setToggleProps(value: ProvidedMenuToggleProps[ToggleEl]): Self = StObject.set(x, "toggleProps", value.asInstanceOf[js.Any])
      
      inline def setToggleRef(value: MutableRefObject[ToggleEl | Null]): Self = StObject.set(x, "toggleRef", value.asInstanceOf[js.Any])
    }
  }
}
