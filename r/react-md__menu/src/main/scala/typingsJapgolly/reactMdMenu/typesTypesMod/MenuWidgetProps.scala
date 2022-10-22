package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusArg
import typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusCallbacks because var conflicts: onFocus, onKeyDown. Inlined onJumpToFirst, onSearch, onIncrement, onDecrement, onJumpToLast
- typingsJapgolly.reactMdUtils.typesKeyboardMovementUseKeyboardFocusMod.KeyboardFocusHookOptions because var conflicts: onFocus, onKeyDown. Inlined onFocusChange, getDefaultFocusIndex */ trait MenuWidgetProps
  extends StObject
     with HTMLAttributes[HTMLDivElement]
     with MenuOrientationProps {
  
  /**
    * Boolean if the menu should not gain the elevation styles and should only be
    * set to `true` when rendering within a `Sheet`.
    *
    * @defaultValue `false`
    */
  var disableElevation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that can be used to get the default focus index when the
    * container element first gains focus. If this returns `-1`, no child element
    * will be focused and the container will maintain focus instead.
    *
    * @param elements - The current list of elements that can be focused within
    * the container element
    * @param container - The container element that gained focus
    */
  var getDefaultFocusIndex: js.UndefOr[js.Function2[/* elements */ js.Array[HTMLElement], HTMLDivElement, Double]] = js.undefined
  
  /**
    * An id required for a11y.
    */
  @JSName("id")
  var id_MenuWidgetProps: String
  
  /**
    * This is called whenever one of the
    * {@link KeyboardMovementBehavior.decrementKeys} are pressed.
    */
  var onDecrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  
  /**
    * An optional function to call when the custom focused element should change.
    * The default value is just to call `element.focus()`.
    *
    * @param element - The element that should gain custom focus
    * @param nextFocusIndex - The next focus index which can be used for
    * additional movement behavior.
    */
  var onFocusChange: js.UndefOr[js.Function2[/* element */ HTMLElement, /* nextFocusIndex */ Double, Unit]] = js.undefined
  
  /**
    * This is called whenever one of the
    * {@link KeyboardMovementBehavior.incrementKeys} are pressed.
    */
  var onIncrement: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  
  /**
    * This is called whenever one of the
    * {@link KeyboardMovementBehavior.jumpToFirstKeys} are pressed.
    */
  var onJumpToFirst: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  
  /**
    * This is called whenever one of the
    * {@link KeyboardMovementBehavior.jumpToLastKeys} are pressed.
    */
  var onJumpToLast: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
  
  /**
    * This is called whenever a single letter has been pressed and
    * {@link KeyboardMovementBehavior.searchable} is `true`.
    */
  var onSearch: js.UndefOr[KeyboardFocusHandler[HTMLDivElement]] = js.undefined
}
object MenuWidgetProps {
  
  inline def apply(id: String): MenuWidgetProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuWidgetProps]
  }
  
  extension [Self <: MenuWidgetProps](x: Self) {
    
    inline def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    inline def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    inline def setGetDefaultFocusIndex(value: (/* elements */ js.Array[HTMLElement], HTMLDivElement) => Double): Self = StObject.set(x, "getDefaultFocusIndex", js.Any.fromFunction2(value))
    
    inline def setGetDefaultFocusIndexUndefined: Self = StObject.set(x, "getDefaultFocusIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnDecrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
    
    inline def setOnFocusChange(value: (/* element */ HTMLElement, /* nextFocusIndex */ Double) => Callback): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* nextFocusIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
    
    inline def setOnIncrement(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
    
    inline def setOnJumpToFirst(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onJumpToFirst", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnJumpToFirstUndefined: Self = StObject.set(x, "onJumpToFirst", js.undefined)
    
    inline def setOnJumpToLast(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onJumpToLast", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnJumpToLastUndefined: Self = StObject.set(x, "onJumpToLast", js.undefined)
    
    inline def setOnSearch(value: /* arg */ KeyboardFocusArg[HTMLDivElement] => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[HTMLDivElement]) => value(t0).runNow()))
    
    inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
  }
}
