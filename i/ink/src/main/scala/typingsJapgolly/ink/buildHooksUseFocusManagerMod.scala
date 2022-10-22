package typingsJapgolly.ink

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildHooksUseFocusManagerMod {
  
  @JSImport("ink/build/hooks/use-focus-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This hook exposes methods to enable or disable focus management for all
    * components or manually switch focus to next or previous components.
    */
  inline def default(): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Output]
  
  trait Output extends StObject {
    
    /**
      * Disable focus management for all components. Currently active component (if there's one) will lose its focus.
      */
    var disableFocus: js.Function0[Unit]
    
    /**
      * Enable focus management for all components.
      */
    var enableFocus: js.Function0[Unit]
    
    /**
      * Switch focus to the element with provided `id`.
      * If there's no element with that `id`, focus will be given to the first focusable component.
      */
    var focus: js.Function1[/* id */ String, Unit]
    
    /**
      * Switch focus to the next focusable component.
      * If there's no active component right now, focus will be given to the first focusable component.
      * If active component is the last in the list of focusable components, focus will be switched to the first component.
      */
    var focusNext: js.Function0[Unit]
    
    /**
      * Switch focus to the previous focusable component.
      * If there's no active component right now, focus will be given to the first focusable component.
      * If active component is the first in the list of focusable components, focus will be switched to the last component.
      */
    var focusPrevious: js.Function0[Unit]
  }
  object Output {
    
    inline def apply(
      disableFocus: Callback,
      enableFocus: Callback,
      focus: /* id */ String => Callback,
      focusNext: Callback,
      focusPrevious: Callback
    ): Output = {
      val __obj = js.Dynamic.literal(disableFocus = disableFocus.toJsFn, enableFocus = enableFocus.toJsFn, focus = js.Any.fromFunction1((t0: /* id */ String) => focus(t0).runNow()), focusNext = focusNext.toJsFn, focusPrevious = focusPrevious.toJsFn)
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setDisableFocus(value: Callback): Self = StObject.set(x, "disableFocus", value.toJsFn)
      
      inline def setEnableFocus(value: Callback): Self = StObject.set(x, "enableFocus", value.toJsFn)
      
      inline def setFocus(value: /* id */ String => Callback): Self = StObject.set(x, "focus", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
      
      inline def setFocusNext(value: Callback): Self = StObject.set(x, "focusNext", value.toJsFn)
      
      inline def setFocusPrevious(value: Callback): Self = StObject.set(x, "focusPrevious", value.toJsFn)
    }
  }
}
