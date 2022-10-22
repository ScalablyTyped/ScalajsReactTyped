package typingsJapgolly.materialFormField

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCFormFieldAdapter extends StObject {
    
    def activateInputRipple(): Unit
    
    def deactivateInputRipple(): Unit
    
    def deregisterInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    def registerInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
  }
  object MDCFormFieldAdapter {
    
    inline def apply(
      activateInputRipple: Callback,
      deactivateInputRipple: Callback,
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Callback
    ): MDCFormFieldAdapter = {
      val __obj = js.Dynamic.literal(activateInputRipple = activateInputRipple.toJsFn, deactivateInputRipple = deactivateInputRipple.toJsFn, deregisterInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInteractionHandler(t0, t1)).runNow()), registerInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInteractionHandler(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCFormFieldAdapter]
    }
    
    extension [Self <: MDCFormFieldAdapter](x: Self) {
      
      inline def setActivateInputRipple(value: Callback): Self = StObject.set(x, "activateInputRipple", value.toJsFn)
      
      inline def setDeactivateInputRipple(value: Callback): Self = StObject.set(x, "deactivateInputRipple", value.toJsFn)
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
    }
  }
}
