package typingsJapgolly.materialSwitch

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedAdapterMod {
  
  trait MDCSwitchAdapter extends StObject {
    
    /**
      * Adds a CSS class to the root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Removes a CSS class from the root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets an attribute value of the native HTML control underlying the switch.
      */
    def setNativeControlAttr(attr: String, value: String): Unit
    
    /**
      * Sets checked state of the native HTML control underlying the switch.
      */
    def setNativeControlChecked(checked: Boolean): Unit
    
    /**
      * Sets the disabled state of the native HTML control underlying the switch.
      */
    def setNativeControlDisabled(disabled: Boolean): Unit
  }
  object MDCSwitchAdapter {
    
    inline def apply(
      addClass: String => Callback,
      removeClass: String => Callback,
      setNativeControlAttr: (String, String) => Callback,
      setNativeControlChecked: Boolean => Callback,
      setNativeControlDisabled: Boolean => Callback
    ): MDCSwitchAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setNativeControlAttr = js.Any.fromFunction2((t0: String, t1: String) => (setNativeControlAttr(t0, t1)).runNow()), setNativeControlChecked = js.Any.fromFunction1((t0: Boolean) => setNativeControlChecked(t0).runNow()), setNativeControlDisabled = js.Any.fromFunction1((t0: Boolean) => setNativeControlDisabled(t0).runNow()))
      __obj.asInstanceOf[MDCSwitchAdapter]
    }
    
    extension [Self <: MDCSwitchAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetNativeControlAttr(value: (String, String) => Callback): Self = StObject.set(x, "setNativeControlAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetNativeControlChecked(value: Boolean => Callback): Self = StObject.set(x, "setNativeControlChecked", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetNativeControlDisabled(value: Boolean => Callback): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
}
