package typingsJapgolly.materialRadio

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCRadioAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def removeClass(className: String): Unit
    
    def setNativeControlDisabled(disabled: Boolean): Unit
  }
  object MDCRadioAdapter {
    
    inline def apply(
      addClass: String => Callback,
      removeClass: String => Callback,
      setNativeControlDisabled: Boolean => Callback
    ): MDCRadioAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setNativeControlDisabled = js.Any.fromFunction1((t0: Boolean) => setNativeControlDisabled(t0).runNow()))
      __obj.asInstanceOf[MDCRadioAdapter]
    }
    
    extension [Self <: MDCRadioAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetNativeControlDisabled(value: Boolean => Callback): Self = StObject.set(x, "setNativeControlDisabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
}
