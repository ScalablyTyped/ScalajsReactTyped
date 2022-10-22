package typingsJapgolly.materialChips

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionFocusBehavior
import typingsJapgolly.materialChips.actionConstantsMod.MDCChipActionType
import typingsJapgolly.materialChips.chipConstantsMod.MDCChipAttributes
import typingsJapgolly.materialChips.chipConstantsMod.MDCChipCssClasses
import typingsJapgolly.materialChips.chipConstantsMod.MDCChipEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipAdapterMod {
  
  trait MDCChipAdapter extends StObject {
    
    /** Adds the given class to the root element. */
    def addClass(className: MDCChipCssClasses): Unit
    
    /** Emits the given event with the given detail. */
    def emitEvent[D /* <: js.Object */](eventName: MDCChipEvents, eventDetail: D): Unit
    
    /** Returns the child actions provided by the chip. */
    def getActions(): js.Array[MDCChipActionType]
    
    /** Returns the value for the given attribute, if it exists. */
    def getAttribute(attrName: MDCChipAttributes): String | Null
    
    /** Returns the ID of the root element. */
    def getElementID(): String
    
    /** Returns the offset width of the root element. */
    def getOffsetWidth(): Double
    
    /** Returns true if the root element has the given class. */
    def hasClass(className: MDCChipCssClasses): Boolean
    
    /** Proxies to the MDCChipAction#isDisabled method. */
    def isActionDisabled(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isFocusable method. */
    def isActionFocusable(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isSelectable method. */
    def isActionSelectable(action: MDCChipActionType): Boolean
    
    /** Proxies to the MDCChipAction#isSelected method. */
    def isActionSelected(action: MDCChipActionType): Boolean
    
    /** Returns true if the text direction is right-to-left. */
    def isRTL(): Boolean
    
    /** Removes the given class from the root element. */
    def removeClass(className: MDCChipCssClasses): Unit
    
    /** Proxies to the MDCChipAction#setDisabled method. */
    def setActionDisabled(action: MDCChipActionType, isDisabled: Boolean): Unit
    
    /** Proxies to the MDCChipAction#setFocus method. */
    def setActionFocus(action: MDCChipActionType, behavior: MDCChipActionFocusBehavior): Unit
    
    /** Proxies to the MDCChipAction#setSelected method. */
    def setActionSelected(action: MDCChipActionType, isSelected: Boolean): Unit
    
    /** Sets the style property to the given value. */
    def setStyleProperty(property: String, value: String): Unit
  }
  object MDCChipAdapter {
    
    inline def apply(
      addClass: MDCChipCssClasses => Callback,
      emitEvent: (MDCChipEvents, Any) => Callback,
      getActions: CallbackTo[js.Array[MDCChipActionType]],
      getAttribute: MDCChipAttributes => String | Null,
      getElementID: CallbackTo[String],
      getOffsetWidth: CallbackTo[Double],
      hasClass: MDCChipCssClasses => Boolean,
      isActionDisabled: MDCChipActionType => Boolean,
      isActionFocusable: MDCChipActionType => Boolean,
      isActionSelectable: MDCChipActionType => Boolean,
      isActionSelected: MDCChipActionType => Boolean,
      isRTL: CallbackTo[Boolean],
      removeClass: MDCChipCssClasses => Callback,
      setActionDisabled: (MDCChipActionType, Boolean) => Callback,
      setActionFocus: (MDCChipActionType, MDCChipActionFocusBehavior) => Callback,
      setActionSelected: (MDCChipActionType, Boolean) => Callback,
      setStyleProperty: (String, String) => Callback
    ): MDCChipAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: MDCChipCssClasses) => addClass(t0).runNow()), emitEvent = js.Any.fromFunction2((t0: MDCChipEvents, t1: Any) => (emitEvent(t0, t1)).runNow()), getActions = getActions.toJsFn, getAttribute = js.Any.fromFunction1(getAttribute), getElementID = getElementID.toJsFn, getOffsetWidth = getOffsetWidth.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isActionDisabled = js.Any.fromFunction1(isActionDisabled), isActionFocusable = js.Any.fromFunction1(isActionFocusable), isActionSelectable = js.Any.fromFunction1(isActionSelectable), isActionSelected = js.Any.fromFunction1(isActionSelected), isRTL = isRTL.toJsFn, removeClass = js.Any.fromFunction1((t0: MDCChipCssClasses) => removeClass(t0).runNow()), setActionDisabled = js.Any.fromFunction2((t0: MDCChipActionType, t1: Boolean) => (setActionDisabled(t0, t1)).runNow()), setActionFocus = js.Any.fromFunction2((t0: MDCChipActionType, t1: MDCChipActionFocusBehavior) => (setActionFocus(t0, t1)).runNow()), setActionSelected = js.Any.fromFunction2((t0: MDCChipActionType, t1: Boolean) => (setActionSelected(t0, t1)).runNow()), setStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setStyleProperty(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCChipAdapter]
    }
    
    extension [Self <: MDCChipAdapter](x: Self) {
      
      inline def setAddClass(value: MDCChipCssClasses => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: MDCChipCssClasses) => value(t0).runNow()))
      
      inline def setEmitEvent(value: (MDCChipEvents, Any) => Callback): Self = StObject.set(x, "emitEvent", js.Any.fromFunction2((t0: MDCChipEvents, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setGetActions(value: CallbackTo[js.Array[MDCChipActionType]]): Self = StObject.set(x, "getActions", value.toJsFn)
      
      inline def setGetAttribute(value: MDCChipAttributes => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetElementID(value: CallbackTo[String]): Self = StObject.set(x, "getElementID", value.toJsFn)
      
      inline def setGetOffsetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getOffsetWidth", value.toJsFn)
      
      inline def setHasClass(value: MDCChipCssClasses => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsActionDisabled(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionDisabled", js.Any.fromFunction1(value))
      
      inline def setIsActionFocusable(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionFocusable", js.Any.fromFunction1(value))
      
      inline def setIsActionSelectable(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionSelectable", js.Any.fromFunction1(value))
      
      inline def setIsActionSelected(value: MDCChipActionType => Boolean): Self = StObject.set(x, "isActionSelected", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setRemoveClass(value: MDCChipCssClasses => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: MDCChipCssClasses) => value(t0).runNow()))
      
      inline def setSetActionDisabled(value: (MDCChipActionType, Boolean) => Callback): Self = StObject.set(x, "setActionDisabled", js.Any.fromFunction2((t0: MDCChipActionType, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetActionFocus(value: (MDCChipActionType, MDCChipActionFocusBehavior) => Callback): Self = StObject.set(x, "setActionFocus", js.Any.fromFunction2((t0: MDCChipActionType, t1: MDCChipActionFocusBehavior) => (value(t0, t1)).runNow()))
      
      inline def setSetActionSelected(value: (MDCChipActionType, Boolean) => Callback): Self = StObject.set(x, "setActionSelected", js.Any.fromFunction2((t0: MDCChipActionType, t1: Boolean) => (value(t0, t1)).runNow()))
      
      inline def setSetStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
