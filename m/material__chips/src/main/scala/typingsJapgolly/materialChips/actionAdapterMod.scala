package typingsJapgolly.materialChips

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionAttributes
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionAdapterMod {
  
  trait MDCChipActionAdapter extends StObject {
    
    def emitEvent[D /* <: js.Object */](name: MDCChipActionEvents, detail: D): Unit
    
    def focus(): Unit
    
    def getAttribute(attr: MDCChipActionAttributes): String | Null
    
    def getElementID(): String
    
    def removeAttribute(attr: MDCChipActionAttributes): Unit
    
    def setAttribute(attr: MDCChipActionAttributes, value: String): Unit
  }
  object MDCChipActionAdapter {
    
    inline def apply(
      emitEvent: (MDCChipActionEvents, Any) => Callback,
      focus: Callback,
      getAttribute: MDCChipActionAttributes => String | Null,
      getElementID: CallbackTo[String],
      removeAttribute: MDCChipActionAttributes => Callback,
      setAttribute: (MDCChipActionAttributes, String) => Callback
    ): MDCChipActionAdapter = {
      val __obj = js.Dynamic.literal(emitEvent = js.Any.fromFunction2((t0: MDCChipActionEvents, t1: Any) => (emitEvent(t0, t1)).runNow()), focus = focus.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getElementID = getElementID.toJsFn, removeAttribute = js.Any.fromFunction1((t0: MDCChipActionAttributes) => removeAttribute(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: MDCChipActionAttributes, t1: String) => (setAttribute(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCChipActionAdapter]
    }
    
    extension [Self <: MDCChipActionAdapter](x: Self) {
      
      inline def setEmitEvent(value: (MDCChipActionEvents, Any) => Callback): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2((t0: MDCChipActionEvents, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetAttribute(value: MDCChipActionAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementID(value: CallbackTo[String]): Self = StObject.set(x, "getElementID", value.toJsFn)
      
      inline def setRemoveAttribute(value: MDCChipActionAttributes => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: MDCChipActionAttributes) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (MDCChipActionAttributes, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: MDCChipActionAttributes, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
