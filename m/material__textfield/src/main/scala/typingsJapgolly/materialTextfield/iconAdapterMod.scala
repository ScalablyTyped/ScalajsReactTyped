package typingsJapgolly.materialTextfield

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconAdapterMod {
  
  trait MDCTextFieldIconAdapter extends StObject {
    
    /**
      * Deregisters an event listener on the icon element for a given event.
      */
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Gets the value of an attribute on the icon element.
      */
    def getAttr(attr: String): String | Null
    
    /**
      * Emits a custom event "MDCTextField:icon" denoting a user has clicked the icon.
      */
    def notifyIconAction(): Unit
    
    /**
      * Registers an event listener on the icon element for a given event.
      */
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes an attribute from the icon element.
      */
    def removeAttr(attr: String): Unit
    
    /**
      * Sets an attribute on the icon element.
      */
    def setAttr(attr: String, value: String): Unit
    
    /**
      * Sets the text content of the icon element.
      */
    def setContent(content: String): Unit
  }
  object MDCTextFieldIconAdapter {
    
    inline def apply(
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      getAttr: String => String | Null,
      notifyIconAction: Callback,
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeAttr: String => Callback,
      setAttr: (String, String) => Callback,
      setContent: String => Callback
    ): MDCTextFieldIconAdapter = {
      val __obj = js.Dynamic.literal(deregisterInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInteractionHandler(t0, t1)).runNow()), getAttr = js.Any.fromFunction1(getAttr), notifyIconAction = notifyIconAction.toJsFn, registerInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInteractionHandler(t0, t1)).runNow()), removeAttr = js.Any.fromFunction1((t0: String) => removeAttr(t0).runNow()), setAttr = js.Any.fromFunction2((t0: String, t1: String) => (setAttr(t0, t1)).runNow()), setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldIconAdapter]
    }
    
    extension [Self <: MDCTextFieldIconAdapter](x: Self) {
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetAttr(value: String => String | Null): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
      
      inline def setNotifyIconAction(value: Callback): Self = StObject.set(x, "notifyIconAction", value.toJsFn)
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveAttr(value: String => Callback): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetAttr(value: (String, String) => Callback): Self = StObject.set(x, "setAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetContent(value: String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
