package typingsJapgolly.materialTabIndicator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTabIndicatorAdapter extends StObject {
    
    /**
      * Adds the given className to the root element.
      * @param className The className to add
      */
    def addClass(className: String): Unit
    
    /**
      * Returns the client rect of the content element.
      */
    def computeContentClientRect(): DOMRect
    
    /**
      * Removes the given className from the root element.
      * @param className The className to remove
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets a style property of the content element to the passed value
      * @param propName The style property name to set
      * @param value The style property value
      */
    def setContentStyleProperty(propName: String, value: String): Unit
  }
  object MDCTabIndicatorAdapter {
    
    inline def apply(
      addClass: String => Callback,
      computeContentClientRect: CallbackTo[DOMRect],
      removeClass: String => Callback,
      setContentStyleProperty: (String, String) => Callback
    ): MDCTabIndicatorAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), computeContentClientRect = computeContentClientRect.toJsFn, removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setContentStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setContentStyleProperty(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCTabIndicatorAdapter]
    }
    
    extension [Self <: MDCTabIndicatorAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setComputeContentClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "computeContentClientRect", value.toJsFn)
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetContentStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setContentStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
