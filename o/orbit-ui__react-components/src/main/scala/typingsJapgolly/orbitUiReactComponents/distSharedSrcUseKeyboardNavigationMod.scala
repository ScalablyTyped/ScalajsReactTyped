package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.anon.OnKeyDown
import typingsJapgolly.orbitUiReactComponents.distSharedSrcKeysMod.Keys
import typingsJapgolly.orbitUiReactComponents.distSharedSrcUseFocusManagerMod.FocusManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseKeyboardNavigationMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useKeyboardNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeyboardNavigation(focusManager: FocusManager, hasPreviousNextFirstLast: KeyboardNavigationBindings): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  inline def useKeyboardNavigation(
    focusManager: FocusManager,
    hasPreviousNextFirstLast: KeyboardNavigationBindings,
    hasOnSelect: KeyboardNavigationOptions
  ): OnKeyDown = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardNavigation")(focusManager.asInstanceOf[js.Any], hasPreviousNextFirstLast.asInstanceOf[js.Any], hasOnSelect.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown]
  
  trait KeyboardNavigationBindings extends StObject {
    
    var first: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var last: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var next: js.UndefOr[js.Array[Keys]] = js.undefined
    
    var previous: js.UndefOr[js.Array[Keys]] = js.undefined
  }
  object KeyboardNavigationBindings {
    
    inline def apply(): KeyboardNavigationBindings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardNavigationBindings]
    }
    
    extension [Self <: KeyboardNavigationBindings](x: Self) {
      
      inline def setFirst(value: js.Array[Keys]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setFirstVarargs(value: Keys*): Self = StObject.set(x, "first", js.Array(value*))
      
      inline def setLast(value: js.Array[Keys]): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setLastVarargs(value: Keys*): Self = StObject.set(x, "last", js.Array(value*))
      
      inline def setNext(value: js.Array[Keys]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setNextVarargs(value: Keys*): Self = StObject.set(x, "next", js.Array(value*))
      
      inline def setPrevious(value: js.Array[Keys]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setPreviousVarargs(value: Keys*): Self = StObject.set(x, "previous", js.Array(value*))
    }
  }
  
  trait KeyboardNavigationOptions extends StObject {
    
    var onSelect: js.UndefOr[
        js.Function2[/* event */ ReactKeyboardEventFrom[Element], /* element */ Element, Unit]
      ] = js.undefined
  }
  object KeyboardNavigationOptions {
    
    inline def apply(): KeyboardNavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardNavigationOptions]
    }
    
    extension [Self <: KeyboardNavigationOptions](x: Self) {
      
      inline def setOnSelect(value: (/* event */ ReactKeyboardEventFrom[Element], /* element */ Element) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* event */ ReactKeyboardEventFrom[Element], t1: /* element */ Element) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
