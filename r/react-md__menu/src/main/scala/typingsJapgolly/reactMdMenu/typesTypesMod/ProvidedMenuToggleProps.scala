package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Booleanish
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.dialog
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.grid
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.listbox
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.menu
import typingsJapgolly.reactMdMenu.reactMdMenuStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvidedMenuToggleProps[E /* <: HTMLElement */] extends StObject {
  
  /**
    * This will be set to `true` only while the menu is `visible`.
    */
  var `aria-expanded`: js.UndefOr[Booleanish] = js.undefined
  
  /**
    * This will always be set to `"menu"`.
    */
  var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.undefined
  
  /**
    * This will be set to `${baseId}-toggle` and is used for providing an
    * accessible label to the menu if the {@link BaseMenuHookOptions.menuLabel}
    * was not provided.
    *
    * @see {@link BaseMenuHookOptions.baseId}
    */
  var id: String
  
  /**
    * A click handler that will toggle the visibility of the menu.
    *
    * @see {@link HoverModeHookReturnValue.onClick}
    */
  var onClick: MouseEventHandler[E]
  
  /**
    * The event handler will allow the menu to become visible by with `ArrowUp`
    * or `ArrowDown` for horizontal menus and `ArrowLeft` or `ArrowRight` for
    * vertical menus. This will also allow the focus to move between menus within
    * a `MenuBar` with the `ArrowLeft` and `ArrowRight` keys.
    */
  var onKeyDown: KeyboardEventHandler[E]
  
  /**
    * The event handler will allow a `Menu` within a `MenuBar` to gain
    * visibility.
    */
  var onMouseEnter: MouseEventHandler[E]
  
  /**
    * This handler just cancels the `hoverTimeout` from the `MenuBar`.
    */
  var onMouseLeave: MouseEventHandler[E]
}
object ProvidedMenuToggleProps {
  
  inline def apply[E /* <: HTMLElement */](
    id: String,
    onClick: ReactMouseEventFrom[E & Element] => Callback,
    onKeyDown: ReactKeyboardEventFrom[E & Element] => Callback,
    onMouseEnter: ReactMouseEventFrom[E & Element] => Callback,
    onMouseLeave: ReactMouseEventFrom[E & Element] => Callback
  ): ProvidedMenuToggleProps[E] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onClick(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => onKeyDown(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onMouseLeave(t0).runNow()))
    __obj.asInstanceOf[ProvidedMenuToggleProps[E]]
  }
  
  extension [Self <: ProvidedMenuToggleProps[?], E /* <: HTMLElement */](x: Self & ProvidedMenuToggleProps[E]) {
    
    inline def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
    
    inline def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
    
    inline def setOnMouseEnter(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
    
    inline def setOnMouseLeave(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
  }
}
