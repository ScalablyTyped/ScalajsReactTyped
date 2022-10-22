package typingsJapgolly.materialTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabAdapterMod {
  
  trait MDCTabAdapter extends StObject {
    
    def addClass(className: String): Unit
    
    def deregisterInteractionHandler[K /* <: EventType */](`type`: K, handler: SpecificEventListener[K]): Unit
    
    def getOffsetLeft(): Double
    
    def getOffsetWidth(): Double
    
    def notifySelected(): Unit
    
    def registerInteractionHandler[K /* <: EventType */](`type`: K, handler: SpecificEventListener[K]): Unit
    
    def removeClass(className: String): Unit
  }
  object MDCTabAdapter {
    
    inline def apply(
      addClass: String => Callback,
      deregisterInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      getOffsetLeft: CallbackTo[Double],
      getOffsetWidth: CallbackTo[Double],
      notifySelected: Callback,
      registerInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeClass: String => Callback
    ): MDCTabAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), deregisterInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInteractionHandler(t0, t1)).runNow()), getOffsetLeft = getOffsetLeft.toJsFn, getOffsetWidth = getOffsetWidth.toJsFn, notifySelected = notifySelected.toJsFn, registerInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInteractionHandler(t0, t1)).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()))
      __obj.asInstanceOf[MDCTabAdapter]
    }
    
    extension [Self <: MDCTabAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetOffsetLeft(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetLeft", value.toJsFn)
      
      inline def setGetOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidth", value.toJsFn)
      
      inline def setNotifySelected(value: Callback): Self = StObject.set(x, "notifySelected", value.toJsFn)
      
      inline def setRegisterInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
