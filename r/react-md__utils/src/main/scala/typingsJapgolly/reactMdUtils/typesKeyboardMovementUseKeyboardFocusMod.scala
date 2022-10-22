package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementUseKeyboardFocusMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/useKeyboardFocus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardFocus[E /* <: HTMLElement */](): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")().asInstanceOf[KeyboardFocusHookReturnValue[E]]
  inline def useKeyboardFocus[E /* <: HTMLElement */](options: KeyboardFocusHookOptions[E]): KeyboardFocusHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardFocus")(options.asInstanceOf[js.Any]).asInstanceOf[KeyboardFocusHookReturnValue[E]]
  
  trait KeyboardFocusArg[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The keyboard event.
      */
    var event: ReactKeyboardEventFrom[E & Element]
    
    /**
      * The keyboard key/letter that was pressed. (`event.key`).
      */
    var key: String
  }
  object KeyboardFocusArg {
    
    inline def apply[E /* <: HTMLElement */](event: ReactKeyboardEventFrom[E & Element], key: String): KeyboardFocusArg[E] = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardFocusArg[E]]
    }
    
    extension [Self <: KeyboardFocusArg[?], E /* <: HTMLElement */](x: Self & KeyboardFocusArg[E]) {
      
      inline def setEvent(value: ReactKeyboardEventFrom[E & Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardFocusCallbacks[E /* <: HTMLElement */] extends StObject {
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.decrementKeys} are pressed.
      */
    var onDecrement: js.UndefOr[KeyboardFocusHandler[E]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.incrementKeys} are pressed.
      */
    var onIncrement: js.UndefOr[KeyboardFocusHandler[E]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToFirstKeys} are pressed.
      */
    var onJumpToFirst: js.UndefOr[KeyboardFocusHandler[E]] = js.undefined
    
    /**
      * This is called whenever one of the
      * {@link KeyboardMovementBehavior.jumpToLastKeys} are pressed.
      */
    var onJumpToLast: js.UndefOr[KeyboardFocusHandler[E]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
    
    /**
      * This is called whenever a single letter has been pressed and
      * {@link KeyboardMovementBehavior.searchable} is `true`.
      */
    var onSearch: js.UndefOr[KeyboardFocusHandler[E]] = js.undefined
  }
  object KeyboardFocusCallbacks {
    
    inline def apply[E /* <: HTMLElement */](): KeyboardFocusCallbacks[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardFocusCallbacks[E]]
    }
    
    extension [Self <: KeyboardFocusCallbacks[?], E /* <: HTMLElement */](x: Self & KeyboardFocusCallbacks[E]) {
      
      inline def setOnDecrement(value: /* arg */ KeyboardFocusArg[E] => Callback): Self = StObject.set(x, "onDecrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[E]) => value(t0).runNow()))
      
      inline def setOnDecrementUndefined: Self = StObject.set(x, "onDecrement", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnIncrement(value: /* arg */ KeyboardFocusArg[E] => Callback): Self = StObject.set(x, "onIncrement", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[E]) => value(t0).runNow()))
      
      inline def setOnIncrementUndefined: Self = StObject.set(x, "onIncrement", js.undefined)
      
      inline def setOnJumpToFirst(value: /* arg */ KeyboardFocusArg[E] => Callback): Self = StObject.set(x, "onJumpToFirst", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[E]) => value(t0).runNow()))
      
      inline def setOnJumpToFirstUndefined: Self = StObject.set(x, "onJumpToFirst", js.undefined)
      
      inline def setOnJumpToLast(value: /* arg */ KeyboardFocusArg[E] => Callback): Self = StObject.set(x, "onJumpToLast", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[E]) => value(t0).runNow()))
      
      inline def setOnJumpToLastUndefined: Self = StObject.set(x, "onJumpToLast", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnSearch(value: /* arg */ KeyboardFocusArg[E] => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* arg */ KeyboardFocusArg[E]) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
  
  type KeyboardFocusHandler[E /* <: HTMLElement */] = js.Function1[/* arg */ KeyboardFocusArg[E], Unit]
  
  trait KeyboardFocusHookOptions[E /* <: HTMLElement */]
    extends StObject
       with KeyboardFocusCallbacks[E] {
    
    /**
      * A function that can be used to get the default focus index when the
      * container element first gains focus. If this returns `-1`, no child element
      * will be focused and the container will maintain focus instead.
      *
      * @param elements - The current list of elements that can be focused within
      * the container element
      * @param container - The container element that gained focus
      */
    var getDefaultFocusIndex: js.UndefOr[js.Function2[/* elements */ js.Array[HTMLElement], /* container */ E, Double]] = js.undefined
    
    /**
      * An optional function to call when the custom focused element should change.
      * The default value is just to call `element.focus()`.
      *
      * @param element - The element that should gain custom focus
      * @param nextFocusIndex - The next focus index which can be used for
      * additional movement behavior.
      */
    var onFocusChange: js.UndefOr[js.Function2[/* element */ HTMLElement, /* nextFocusIndex */ Double, Unit]] = js.undefined
  }
  object KeyboardFocusHookOptions {
    
    inline def apply[E /* <: HTMLElement */](): KeyboardFocusHookOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardFocusHookOptions[E]]
    }
    
    extension [Self <: KeyboardFocusHookOptions[?], E /* <: HTMLElement */](x: Self & KeyboardFocusHookOptions[E]) {
      
      inline def setGetDefaultFocusIndex(value: (/* elements */ js.Array[HTMLElement], /* container */ E) => Double): Self = StObject.set(x, "getDefaultFocusIndex", js.Any.fromFunction2(value))
      
      inline def setGetDefaultFocusIndexUndefined: Self = StObject.set(x, "getDefaultFocusIndex", js.undefined)
      
      inline def setOnFocusChange(value: (/* element */ HTMLElement, /* nextFocusIndex */ Double) => Callback): Self = StObject.set(x, "onFocusChange", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* nextFocusIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusChangeUndefined: Self = StObject.set(x, "onFocusChange", js.undefined)
    }
  }
  
  trait KeyboardFocusHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var focusIndex: MutableRefObject[Double]
    
    var onFocus: FocusEventHandler[E]
    
    var onKeyDown: KeyboardEventHandler[E]
  }
  object KeyboardFocusHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      focusIndex: MutableRefObject[Double],
      onFocus: ReactFocusEventFrom[E & Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[E & Element] => Callback
    ): KeyboardFocusHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(focusIndex = focusIndex.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => onFocus(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => onKeyDown(t0).runNow()))
      __obj.asInstanceOf[KeyboardFocusHookReturnValue[E]]
    }
    
    extension [Self <: KeyboardFocusHookReturnValue[?], E /* <: HTMLElement */](x: Self & KeyboardFocusHookReturnValue[E]) {
      
      inline def setFocusIndex(value: MutableRefObject[Double]): Self = StObject.set(x, "focusIndex", value.asInstanceOf[js.Any])
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
    }
  }
}
