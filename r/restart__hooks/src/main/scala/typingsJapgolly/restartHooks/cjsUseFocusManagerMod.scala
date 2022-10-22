package typingsJapgolly.restartHooks

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseFocusManagerMod {
  
  @JSImport("@restart/hooks/cjs/useFocusManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: FocusManagerOptions): FocusController = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[FocusController]
  
  trait FocusController extends StObject {
    
    def onBlur(event: Any): Unit
    
    def onFocus(event: Any): Unit
  }
  object FocusController {
    
    inline def apply(onBlur: Any => Callback, onFocus: Any => Callback): FocusController = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: Any) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: Any) => onFocus(t0).runNow()))
      __obj.asInstanceOf[FocusController]
    }
    
    extension [Self <: FocusController](x: Self) {
      
      inline def setOnBlur(value: Any => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnFocus(value: Any => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait FocusManagerOptions extends StObject {
    
    /**
      * A callback fired after focus is handled but before onChange is called
      */
    var didHandle: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element], Unit]
      ] = js.undefined
    
    /**
      * When true, the event handlers will not report focus changes
      */
    def isDisabled(): Boolean
    
    /**
      * A callback fired after focus has changed
      */
    var onChange: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element], Unit]
      ] = js.undefined
    
    /**
      * A callback fired when focus shifts. returning `false` will prevent
      * handling the focus event
      */
    var willHandle: js.UndefOr[
        js.Function2[/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element], Boolean | Unit]
      ] = js.undefined
  }
  object FocusManagerOptions {
    
    inline def apply(isDisabled: CallbackTo[Boolean]): FocusManagerOptions = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.toJsFn)
      __obj.asInstanceOf[FocusManagerOptions]
    }
    
    extension [Self <: FocusManagerOptions](x: Self) {
      
      inline def setDidHandle(value: (/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element]) => Callback): Self = StObject.set(x, "didHandle", js.Any.fromFunction2((t0: /* focused */ Boolean, t1: /* event */ ReactFocusEventFrom[Element]) => (value(t0, t1)).runNow()))
      
      inline def setDidHandleUndefined: Self = StObject.set(x, "didHandle", js.undefined)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setOnChange(value: (/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* focused */ Boolean, t1: /* event */ ReactFocusEventFrom[Element]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setWillHandle(value: (/* focused */ Boolean, /* event */ ReactFocusEventFrom[Element]) => Boolean | Unit): Self = StObject.set(x, "willHandle", js.Any.fromFunction2(value))
      
      inline def setWillHandleUndefined: Self = StObject.set(x, "willHandle", js.undefined)
    }
  }
}
