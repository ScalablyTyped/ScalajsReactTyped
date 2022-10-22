package typingsJapgolly.materialChips

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType
import typingsJapgolly.materialChips.chipConstantsMod.MDCChipAnimation
import typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetAttributes
import typingsJapgolly.materialChips.chipSetConstantsMod.MDCChipSetEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetAdapterMod {
  
  trait MDCChipSetAdapter extends StObject {
    
    /** Announces the message via an aria-live region */
    def announceMessage(message: String): Unit
    
    /** Emits the given event with the given detail. */
    def emitEvent[D /* <: js.Object */](eventName: MDCChipSetEvents, eventDetail: D): Unit
    
    /** Returns the value for the given attribute, if it exists. */
    def getAttribute(attrName: MDCChipSetAttributes): String | Null
    
    /** Returns the actions provided by the child chip at the given index. */
    def getChipActionsAtIndex(index: Double): js.Array[MDCChipActionType]
    
    /** Returns the number of child chips. */
    def getChipCount(): Double
    
    /** Returns the ID of the chip at the given index. */
    def getChipIdAtIndex(index: Double): String
    
    /** Returns the index of the child chip with the matching ID. */
    def getChipIndexById(chipID: String): Double
    
    /** Proxies to the MDCChip#isActionFocusable method. */
    def isChipFocusableAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChip#isActionSelectable method. */
    def isChipSelectableAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChip#isActionSelected method. */
    def isChipSelectedAtIndex(index: Double, actionType: MDCChipActionType): Boolean
    
    /** Removes the chip at the given index. */
    def removeChipAtIndex(index: Double): Unit
    
    /** Proxies to the MDCChip#setActionFocus method. */
    def setChipFocusAtIndex(index: Double, action: MDCChipActionType, focus: MDCChipActionFocusBehavior): Unit
    
    /** Proxies to the MDCChip#setActionSelected method. */
    def setChipSelectedAtIndex(index: Double, actionType: MDCChipActionType, isSelected: Boolean): Unit
    
    /** Starts the chip animation at the given index. */
    def startChipAnimationAtIndex(index: Double, animation: MDCChipAnimation): Unit
  }
  object MDCChipSetAdapter {
    
    inline def apply(
      announceMessage: String => Callback,
      emitEvent: (MDCChipSetEvents, Any) => Callback,
      getAttribute: MDCChipSetAttributes => String | Null,
      getChipActionsAtIndex: Double => js.Array[MDCChipActionType],
      getChipCount: CallbackTo[Double],
      getChipIdAtIndex: Double => String,
      getChipIndexById: String => Double,
      isChipFocusableAtIndex: (Double, MDCChipActionType) => Boolean,
      isChipSelectableAtIndex: (Double, MDCChipActionType) => Boolean,
      isChipSelectedAtIndex: (Double, MDCChipActionType) => Boolean,
      removeChipAtIndex: Double => Callback,
      setChipFocusAtIndex: (Double, MDCChipActionType, MDCChipActionFocusBehavior) => Callback,
      setChipSelectedAtIndex: (Double, MDCChipActionType, Boolean) => Callback,
      startChipAnimationAtIndex: (Double, MDCChipAnimation) => Callback
    ): MDCChipSetAdapter = {
      val __obj = js.Dynamic.literal(announceMessage = js.Any.fromFunction1((t0: String) => announceMessage(t0).runNow()), emitEvent = js.Any.fromFunction2((t0: MDCChipSetEvents, t1: Any) => (emitEvent(t0, t1)).runNow()), getAttribute = js.Any.fromFunction1(getAttribute), getChipActionsAtIndex = js.Any.fromFunction1(getChipActionsAtIndex), getChipCount = getChipCount.toJsFn, getChipIdAtIndex = js.Any.fromFunction1(getChipIdAtIndex), getChipIndexById = js.Any.fromFunction1(getChipIndexById), isChipFocusableAtIndex = js.Any.fromFunction2(isChipFocusableAtIndex), isChipSelectableAtIndex = js.Any.fromFunction2(isChipSelectableAtIndex), isChipSelectedAtIndex = js.Any.fromFunction2(isChipSelectedAtIndex), removeChipAtIndex = js.Any.fromFunction1((t0: Double) => removeChipAtIndex(t0).runNow()), setChipFocusAtIndex = js.Any.fromFunction3((t0: Double, t1: MDCChipActionType, t2: MDCChipActionFocusBehavior) => (setChipFocusAtIndex(t0, t1, t2)).runNow()), setChipSelectedAtIndex = js.Any.fromFunction3((t0: Double, t1: MDCChipActionType, t2: Boolean) => (setChipSelectedAtIndex(t0, t1, t2)).runNow()), startChipAnimationAtIndex = js.Any.fromFunction2((t0: Double, t1: MDCChipAnimation) => (startChipAnimationAtIndex(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCChipSetAdapter]
    }
    
    extension [Self <: MDCChipSetAdapter](x: Self) {
      
      inline def setAnnounceMessage(value: String => Callback): Self = StObject.set(x, "announceMessage", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEmitEvent(value: (MDCChipSetEvents, Any) => Callback): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2((t0: MDCChipSetEvents, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setGetAttribute(value: MDCChipSetAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetChipActionsAtIndex(value: Double => js.Array[MDCChipActionType]): Self = StObject.set(x, "getChipActionsAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetChipCount(value: CallbackTo[Double]): Self = StObject.set(x, "getChipCount", value.toJsFn)
      
      inline def setGetChipIdAtIndex(value: Double => String): Self = StObject.set(x, "getChipIdAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetChipIndexById(value: String => Double): Self = StObject.set(x, "getChipIndexById", js.Any.fromFunction1(value))
      
      inline def setIsChipFocusableAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipFocusableAtIndex", js.Any.fromFunction2(value))
      
      inline def setIsChipSelectableAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipSelectableAtIndex", js.Any.fromFunction2(value))
      
      inline def setIsChipSelectedAtIndex(value: (Double, MDCChipActionType) => Boolean): Self = StObject.set(x, "isChipSelectedAtIndex", js.Any.fromFunction2(value))
      
      inline def setRemoveChipAtIndex(value: Double => Callback): Self = StObject.set(x, "removeChipAtIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetChipFocusAtIndex(value: (Double, MDCChipActionType, MDCChipActionFocusBehavior) => Callback): Self = StObject.set(x, "setChipFocusAtIndex", js.Any.fromFunction3((t0: Double, t1: MDCChipActionType, t2: MDCChipActionFocusBehavior) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetChipSelectedAtIndex(value: (Double, MDCChipActionType, Boolean) => Callback): Self = StObject.set(x, "setChipSelectedAtIndex", js.Any.fromFunction3((t0: Double, t1: MDCChipActionType, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setStartChipAnimationAtIndex(value: (Double, MDCChipAnimation) => Callback): Self = StObject.set(x, "startChipAnimationAtIndex", js.Any.fromFunction2((t0: Double, t1: MDCChipAnimation) => (value(t0, t1)).runNow()))
    }
  }
}
