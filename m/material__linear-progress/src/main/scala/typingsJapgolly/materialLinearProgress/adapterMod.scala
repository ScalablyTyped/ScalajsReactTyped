package typingsJapgolly.materialLinearProgress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialLinearProgress.typesMod.MDCResizeObserver
import typingsJapgolly.materialLinearProgress.typesMod.MDCResizeObserverCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCLinearProgressAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    /**
      * If available, creates a `ResizeObserver` object, invokes the `#observe`
      * method on the root element. This is used for an optional performance gains
      * for the indeterminate animation on modern browsers.
      *
      * @param callback The callback to apply to the constructor of the
      *    `ResizeObserver`
      * @return Returns a `ResizeObserver` that has had `observe` called on the
      *    root element with the given callback. `null` if `ResizeObserver` is not
      *    implemented or polyfilled.
      */
    def attachResizeObserver(callback: MDCResizeObserverCallback): MDCResizeObserver | Null
    
    def forceLayout(): Unit
    
    /**
      * @return The width of the root element.
      */
    def getWidth(): Double
    
    def hasClass(className: String): Boolean
    
    def removeAttribute(name: String): Unit
    
    def removeClass(className: String): Unit
    
    def setAttribute(name: String, value: String): Unit
    
    def setBufferBarStyle(styleProperty: String, value: String): Unit
    
    def setPrimaryBarStyle(styleProperty: String, value: String): Unit
    
    /**
      * Sets the inline style on the root element.
      * @param styleProperty The style property to set.
      * @param value The value the style property should be set to.
      */
    def setStyle(styleProperty: String, value: String): Unit
  }
  object MDCLinearProgressAdapter {
    
    inline def apply(
      addClass: String => Callback,
      attachResizeObserver: MDCResizeObserverCallback => MDCResizeObserver | Null,
      forceLayout: Callback,
      getWidth: CallbackTo[Double],
      hasClass: String => Boolean,
      removeAttribute: String => Callback,
      removeClass: String => Callback,
      setAttribute: (String, String) => Callback,
      setBufferBarStyle: (String, String) => Callback,
      setPrimaryBarStyle: (String, String) => Callback,
      setStyle: (String, String) => Callback
    ): MDCLinearProgressAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), attachResizeObserver = js.Any.fromFunction1(attachResizeObserver), forceLayout = forceLayout.toJsFn, getWidth = getWidth.toJsFn, hasClass = js.Any.fromFunction1(hasClass), removeAttribute = js.Any.fromFunction1((t0: String) => removeAttribute(t0).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: String, t1: String) => (setAttribute(t0, t1)).runNow()), setBufferBarStyle = js.Any.fromFunction2((t0: String, t1: String) => (setBufferBarStyle(t0, t1)).runNow()), setPrimaryBarStyle = js.Any.fromFunction2((t0: String, t1: String) => (setPrimaryBarStyle(t0, t1)).runNow()), setStyle = js.Any.fromFunction2((t0: String, t1: String) => (setStyle(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCLinearProgressAdapter]
    }
    
    extension [Self <: MDCLinearProgressAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAttachResizeObserver(value: MDCResizeObserverCallback => MDCResizeObserver | Null): Self = StObject.set(x, "attachResizeObserver", js.Any.fromFunction1(value))
      
      inline def setForceLayout(value: Callback): Self = StObject.set(x, "forceLayout", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRemoveAttribute(value: String => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetBufferBarStyle(value: (String, String) => Callback): Self = StObject.set(x, "setBufferBarStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetPrimaryBarStyle(value: (String, String) => Callback): Self = StObject.set(x, "setPrimaryBarStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetStyle(value: (String, String) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
