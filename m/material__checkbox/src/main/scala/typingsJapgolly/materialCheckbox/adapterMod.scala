package typingsJapgolly.materialCheckbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCCheckboxAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def forceLayout(): Unit
    
    def hasNativeControl(): Boolean
    
    def isAttachedToDOM(): Boolean
    
    def isChecked(): Boolean
    
    def isIndeterminate(): Boolean
    
    def removeClass(className: String): Unit
    
    def removeNativeControlAttr(attr: String): Unit
    
    def setNativeControlAttr(attr: String, value: String): Unit
    
    def setNativeControlDisabled(disabled: Boolean): Unit
  }
  object MDCCheckboxAdapter {
    
    inline def apply(
      addClass: String => Callback,
      forceLayout: Callback,
      hasNativeControl: CallbackTo[Boolean],
      isAttachedToDOM: CallbackTo[Boolean],
      isChecked: CallbackTo[Boolean],
      isIndeterminate: CallbackTo[Boolean],
      removeClass: String => Callback,
      removeNativeControlAttr: String => Callback,
      setNativeControlAttr: (String, String) => Callback,
      setNativeControlDisabled: Boolean => Callback
    ): MDCCheckboxAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), forceLayout = forceLayout.toJsFn, hasNativeControl = hasNativeControl.toJsFn, isAttachedToDOM = isAttachedToDOM.toJsFn, isChecked = isChecked.toJsFn, isIndeterminate = isIndeterminate.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeNativeControlAttr = js.Any.fromFunction1((t0: String) => removeNativeControlAttr(t0).runNow()), setNativeControlAttr = js.Any.fromFunction2((t0: String, t1: String) => (setNativeControlAttr(t0, t1)).runNow()), setNativeControlDisabled = js.Any.fromFunction1((t0: Boolean) => setNativeControlDisabled(t0).runNow()))
      __obj.asInstanceOf[MDCCheckboxAdapter]
    }
    
    extension [Self <: MDCCheckboxAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setForceLayout(value: Callback): Self = StObject.set(x, "forceLayout", value.toJsFn)
      
      inline def setHasNativeControl(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNativeControl", value.toJsFn)
      
      inline def setIsAttachedToDOM(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAttachedToDOM", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setIsIndeterminate(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIndeterminate", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveNativeControlAttr(value: String => Callback): Self = StObject.set(x, "removeNativeControlAttr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetNativeControlAttr(value: (String, String) => Callback): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetNativeControlDisabled(value: Boolean => Callback): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
}
