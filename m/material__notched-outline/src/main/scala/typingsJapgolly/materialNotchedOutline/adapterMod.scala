package typingsJapgolly.materialNotchedOutline

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCNotchedOutlineAdapter extends StObject {
    
    /**
      * Adds a class to the root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Removes a class from the root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Removes the width style property from the notch element.
      */
    def removeNotchWidthProperty(): Unit
    
    /**
      * Sets the width style property of the notch element.
      */
    def setNotchWidthProperty(width: Double): Unit
  }
  object MDCNotchedOutlineAdapter {
    
    inline def apply(
      addClass: String => Callback,
      removeClass: String => Callback,
      removeNotchWidthProperty: Callback,
      setNotchWidthProperty: Double => Callback
    ): MDCNotchedOutlineAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeNotchWidthProperty = removeNotchWidthProperty.toJsFn, setNotchWidthProperty = js.Any.fromFunction1((t0: Double) => setNotchWidthProperty(t0).runNow()))
      __obj.asInstanceOf[MDCNotchedOutlineAdapter]
    }
    
    extension [Self <: MDCNotchedOutlineAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveNotchWidthProperty(value: Callback): Self = StObject.set(x, "removeNotchWidthProperty", value.toJsFn)
      
      inline def setSetNotchWidthProperty(value: Double => Callback): Self = StObject.set(x, "setNotchWidthProperty", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
