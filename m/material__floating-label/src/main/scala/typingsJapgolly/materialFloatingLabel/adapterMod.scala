package typingsJapgolly.materialFloatingLabel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCFloatingLabelAdapter extends StObject {
    
    /**
      * Adds a class to the label element.
      */
    def addClass(className: String): Unit
    
    /**
      * Deregisters an event listener on the root element for a given event.
      */
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Returns the width of the label element.
      */
    def getWidth(): Double
    
    /**
      * Registers an event listener on the root element for a given event.
      */
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes a class from the label element.
      */
    def removeClass(className: String): Unit
  }
  object MDCFloatingLabelAdapter {
    
    inline def apply(
      addClass: String => Callback,
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      getWidth: CallbackTo[Double],
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeClass: String => Callback
    ): MDCFloatingLabelAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), deregisterInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInteractionHandler(t0, t1)).runNow()), getWidth = getWidth.toJsFn, registerInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInteractionHandler(t0, t1)).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()))
      __obj.asInstanceOf[MDCFloatingLabelAdapter]
    }
    
    extension [Self <: MDCFloatingLabelAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
