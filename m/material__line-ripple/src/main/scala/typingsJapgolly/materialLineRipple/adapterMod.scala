package typingsJapgolly.materialLineRipple

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCLineRippleAdapter extends StObject {
    
    /**
      * Adds a class to the line ripple element.
      */
    def addClass(className: String): Unit
    
    /**
      * Deregisters an event listener on the line ripple element for a given event.
      */
    def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    def hasClass(className: String): Boolean
    
    /**
      * Registers an event listener on the line ripple element for a given event.
      */
    def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes a class from the line ripple element.
      */
    def removeClass(className: String): Unit
    
    /**
      * Sets the style property with propertyName to value on the root element.
      */
    def setStyle(propertyName: String, value: String): Unit
  }
  object MDCLineRippleAdapter {
    
    inline def apply(
      addClass: String => Callback,
      deregisterEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      hasClass: String => Boolean,
      registerEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeClass: String => Callback,
      setStyle: (String, String) => Callback
    ): MDCLineRippleAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), deregisterEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterEventHandler(t0, t1)).runNow()), hasClass = js.Any.fromFunction1(hasClass), registerEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerEventHandler(t0, t1)).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), setStyle = js.Any.fromFunction2((t0: String, t1: String) => (setStyle(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCLineRippleAdapter]
    }
    
    extension [Self <: MDCLineRippleAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRegisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetStyle(value: (String, String) => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
