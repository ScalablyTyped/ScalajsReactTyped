package typingsJapgolly.materialSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialSlider.typesMod.Thumb
import typingsJapgolly.materialSlider.typesMod.TickMark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCSliderAdapter extends StObject {
    
    /**
      * Adds the given class to the slider root element.
      */
    def addClass(className: String): Unit
    
    /**
      * Adds the class to the given thumb element.
      */
    def addThumbClass(className: String, thumb: Thumb): Unit
    
    /**
      * Deregisters an event listener on the body element.
      */
    def deregisterBodyEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener on the root element.
      */
    def deregisterEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener on the given input element.
      */
    def deregisterInputEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener on the given thumb element.
      */
    def deregisterThumbEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Deregisters an event listener on the window.
      */
    def deregisterWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Emits a `change` event from the slider root, indicating that the value
      * has been changed and committed on the given thumb, from a user event.
      * Mirrors the native `change` event:
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/change_event
      */
    def emitChangeEvent(value: Double, thumb: Thumb): Unit
    
    /**
      * Emits an event on drag end, containing the final value on the
      * thumb that was dragged.
      */
    def emitDragEndEvent(value: Double, thumb: Thumb): Unit
    
    /**
      * Emits an event on drag start, containing the current value on the
      * thumb being dragged.
      */
    def emitDragStartEvent(value: Double, thumb: Thumb): Unit
    
    /**
      * Emits an `input` event from the slider root, indicating that the value
      * has been changed on the given thumb, from a user event.
      * Mirrors the native `input` event:
      * https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/input_event
      */
    def emitInputEvent(value: Double, thumb: Thumb): Unit
    
    /**
      * - If thumb is `Thumb.START`, focuses start input (range slider variant).
      * - If thumb is `Thumb.END`, focuses end input (or only input for single
      *   point slider).
      */
    def focusInput(thumb: Thumb): Unit
    
    /**
      * @return Returns the given attribute value on the slider root element.
      */
    def getAttribute(attribute: String): String | Null
    
    /**
      * @return Returns the bounding client rect for the slider root element.
      */
    def getBoundingClientRect(): DOMRect
    
    /**
      * - If thumb is `Thumb.START`, returns the attribute value on the start input
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, returns the attribute value on the end input (or
      *   only input for single point slider).
      */
    def getInputAttribute(attribute: String, thumb: Thumb): String | Null
    
    /**
      * - If thumb is `Thumb.START`, returns the value property on the start input
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, returns the value property on the end input (or
      *   only input for single point slider).
      */
    def getInputValue(thumb: Thumb): String
    
    /**
      * @return Returns the bounding client rect of the given thumb.
      */
    def getThumbBoundingClientRect(thumb: Thumb): DOMRect
    
    /**
      * @return Returns the width of the given thumb knob.
      */
    def getThumbKnobWidth(thumb: Thumb): Double
    
    /**
      * @return Returns the width of the given value indicator container.
      */
    def getValueIndicatorContainerWidth(thumb: Thumb): Double
    
    /**
      * Returns a function that maps the slider value to the value of the
      * `aria-valuetext` attribute on the thumb element. If null, the
      * `aria-valuetext` attribute is unchanged when the value changes.
      */
    def getValueToAriaValueTextFn(): (js.Function2[/* value */ Double, /* thumb */ Thumb, String]) | Null
    
    /**
      * @return Returns true if the slider root element has the given class.
      */
    def hasClass(className: String): Boolean
    
    /**
      * @return Returns true if the given input is focused.
      */
    def isInputFocused(thumb: Thumb): Boolean
    
    /**
      * @return Returns true if the root element is RTL, otherwise false
      */
    def isRTL(): Boolean
    
    /**
      * Registers an event listener on the body element.
      */
    def registerBodyEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener on the root element.
      */
    def registerEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener on the given input element.
      */
    def registerInputEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener on the given thumb element.
      */
    def registerThumbEventHandler[K /* <: EventType */](thumb: Thumb, evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers an event listener on the window.
      */
    def registerWindowEventHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes the given class from the slider root element.
      */
    def removeClass(className: String): Unit
    
    /**
      * - If thumb is `Thumb.START`, removes the attribute on the start input
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, removes the attribute on the end input (or
      *   only input for single point slider).
      */
    def removeInputAttribute(attribute: String, thumb: Thumb): Unit
    
    /**
      * Removes the class from the given thumb element.
      */
    def removeThumbClass(className: String, thumb: Thumb): Unit
    
    /**
      * Removes the given style property from the thumb element.
      * - If thumb is `Thumb.START`, removes style from the start thumb (for
      *   range slider variant).
      * - If thumb is `Thumb.END`, removes style from the end thumb (or only thumb
      *   for single point slider).
      */
    def removeThumbStyleProperty(propertyName: String, thumb: Thumb): Unit
    
    /**
      * Removes the given style property from the active track element.
      */
    def removeTrackActiveStyleProperty(propertyName: String): Unit
    
    /**
      * - If thumb is `Thumb.START`, sets the attribute on the start input
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, sets the attribute on the end input (or
      *   only input for single point slider).
      */
    def setInputAttribute(attribute: String, value: String, thumb: Thumb): Unit
    
    /**
      * - If thumb is `Thumb.START`, sets the value property on the start input
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, sets the value property on the end input (or
      *   only input for single point slider).
      */
    def setInputValue(value: String, thumb: Thumb): Unit
    
    /**
      * Sets pointer capture on the slider root.
      * https://developer.mozilla.org/en-US/docs/Web/API/Element/setPointerCapture
      */
    def setPointerCapture(pointerId: Double): Unit
    
    /**
      * Sets a style property of the thumb element to the passed value.
      * - If thumb is `Thumb.START`, sets style on the start thumb (for
      *   range slider variant).
      * - If thumb is `Thumb.END`, sets style on the end thumb (or only thumb
      *   for single point slider).
      */
    def setThumbStyleProperty(propertyName: String, value: String, thumb: Thumb): Unit
    
    /**
      * Sets a style property of the active track element to the passed value.
      */
    def setTrackActiveStyleProperty(propertyName: String, value: String): Unit
    
    /**
      * Sets value indicator text based on the given value.
      * - If thumb is `Thumb.START`, updates value indicator on start thumb
      *   (for range slider variant).
      * - If thumb is `Thumb.END`, updates value indicator on end thumb (or
      *   only thumb for single point slider).
      */
    def setValueIndicatorText(value: Double, thumb: Thumb): Unit
    
    /**
      * @return Returns true if focus styles should be hidden for pointer events.
      */
    var shouldHideFocusStylesForPointerEvents: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /**
      * Updates tick marks container element with tick mark elements and their
      * active/inactive classes, based on the given mappings:
      * - TickMark.ACTIVE => `cssClasses.TICK_MARK_ACTIVE`
      * - TickMark.INACTIVE => `cssClasses.TICK_MARK_INACTIVE`
      */
    def updateTickMarks(tickMarks: js.Array[TickMark]): Unit
  }
  object MDCSliderAdapter {
    
    inline def apply(
      addClass: String => Callback,
      addThumbClass: (String, Thumb) => Callback,
      deregisterBodyEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterInputEventHandler: (Thumb, Any, SpecificEventListener[Any]) => Callback,
      deregisterThumbEventHandler: (Thumb, Any, SpecificEventListener[Any]) => Callback,
      deregisterWindowEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      emitChangeEvent: (Double, Thumb) => Callback,
      emitDragEndEvent: (Double, Thumb) => Callback,
      emitDragStartEvent: (Double, Thumb) => Callback,
      emitInputEvent: (Double, Thumb) => Callback,
      focusInput: Thumb => Callback,
      getAttribute: String => String | Null,
      getBoundingClientRect: CallbackTo[DOMRect],
      getInputAttribute: (String, Thumb) => String | Null,
      getInputValue: Thumb => String,
      getThumbBoundingClientRect: Thumb => DOMRect,
      getThumbKnobWidth: Thumb => Double,
      getValueIndicatorContainerWidth: Thumb => Double,
      getValueToAriaValueTextFn: CallbackTo[(js.Function2[/* value */ Double, /* thumb */ Thumb, String]) | Null],
      hasClass: String => Boolean,
      isInputFocused: Thumb => Boolean,
      isRTL: CallbackTo[Boolean],
      registerBodyEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerInputEventHandler: (Thumb, Any, SpecificEventListener[Any]) => Callback,
      registerThumbEventHandler: (Thumb, Any, SpecificEventListener[Any]) => Callback,
      registerWindowEventHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeClass: String => Callback,
      removeInputAttribute: (String, Thumb) => Callback,
      removeThumbClass: (String, Thumb) => Callback,
      removeThumbStyleProperty: (String, Thumb) => Callback,
      removeTrackActiveStyleProperty: String => Callback,
      setInputAttribute: (String, String, Thumb) => Callback,
      setInputValue: (String, Thumb) => Callback,
      setPointerCapture: Double => Callback,
      setThumbStyleProperty: (String, String, Thumb) => Callback,
      setTrackActiveStyleProperty: (String, String) => Callback,
      setValueIndicatorText: (Double, Thumb) => Callback,
      updateTickMarks: js.Array[TickMark] => Callback
    ): MDCSliderAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), addThumbClass = js.Any.fromFunction2((t0: String, t1: Thumb) => (addThumbClass(t0, t1)).runNow()), deregisterBodyEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterBodyEventHandler(t0, t1)).runNow()), deregisterEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterEventHandler(t0, t1)).runNow()), deregisterInputEventHandler = js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (deregisterInputEventHandler(t0, t1, t2)).runNow()), deregisterThumbEventHandler = js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (deregisterThumbEventHandler(t0, t1, t2)).runNow()), deregisterWindowEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterWindowEventHandler(t0, t1)).runNow()), emitChangeEvent = js.Any.fromFunction2((t0: Double, t1: Thumb) => (emitChangeEvent(t0, t1)).runNow()), emitDragEndEvent = js.Any.fromFunction2((t0: Double, t1: Thumb) => (emitDragEndEvent(t0, t1)).runNow()), emitDragStartEvent = js.Any.fromFunction2((t0: Double, t1: Thumb) => (emitDragStartEvent(t0, t1)).runNow()), emitInputEvent = js.Any.fromFunction2((t0: Double, t1: Thumb) => (emitInputEvent(t0, t1)).runNow()), focusInput = js.Any.fromFunction1((t0: Thumb) => focusInput(t0).runNow()), getAttribute = js.Any.fromFunction1(getAttribute), getBoundingClientRect = getBoundingClientRect.toJsFn, getInputAttribute = js.Any.fromFunction2(getInputAttribute), getInputValue = js.Any.fromFunction1(getInputValue), getThumbBoundingClientRect = js.Any.fromFunction1(getThumbBoundingClientRect), getThumbKnobWidth = js.Any.fromFunction1(getThumbKnobWidth), getValueIndicatorContainerWidth = js.Any.fromFunction1(getValueIndicatorContainerWidth), getValueToAriaValueTextFn = getValueToAriaValueTextFn.toJsFn, hasClass = js.Any.fromFunction1(hasClass), isInputFocused = js.Any.fromFunction1(isInputFocused), isRTL = isRTL.toJsFn, registerBodyEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerBodyEventHandler(t0, t1)).runNow()), registerEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerEventHandler(t0, t1)).runNow()), registerInputEventHandler = js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (registerInputEventHandler(t0, t1, t2)).runNow()), registerThumbEventHandler = js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (registerThumbEventHandler(t0, t1, t2)).runNow()), registerWindowEventHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerWindowEventHandler(t0, t1)).runNow()), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeInputAttribute = js.Any.fromFunction2((t0: String, t1: Thumb) => (removeInputAttribute(t0, t1)).runNow()), removeThumbClass = js.Any.fromFunction2((t0: String, t1: Thumb) => (removeThumbClass(t0, t1)).runNow()), removeThumbStyleProperty = js.Any.fromFunction2((t0: String, t1: Thumb) => (removeThumbStyleProperty(t0, t1)).runNow()), removeTrackActiveStyleProperty = js.Any.fromFunction1((t0: String) => removeTrackActiveStyleProperty(t0).runNow()), setInputAttribute = js.Any.fromFunction3((t0: String, t1: String, t2: Thumb) => (setInputAttribute(t0, t1, t2)).runNow()), setInputValue = js.Any.fromFunction2((t0: String, t1: Thumb) => (setInputValue(t0, t1)).runNow()), setPointerCapture = js.Any.fromFunction1((t0: Double) => setPointerCapture(t0).runNow()), setThumbStyleProperty = js.Any.fromFunction3((t0: String, t1: String, t2: Thumb) => (setThumbStyleProperty(t0, t1, t2)).runNow()), setTrackActiveStyleProperty = js.Any.fromFunction2((t0: String, t1: String) => (setTrackActiveStyleProperty(t0, t1)).runNow()), setValueIndicatorText = js.Any.fromFunction2((t0: Double, t1: Thumb) => (setValueIndicatorText(t0, t1)).runNow()), updateTickMarks = js.Any.fromFunction1((t0: js.Array[TickMark]) => updateTickMarks(t0).runNow()))
      __obj.asInstanceOf[MDCSliderAdapter]
    }
    
    extension [Self <: MDCSliderAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setAddThumbClass(value: (String, Thumb) => Callback): Self = StObject.set(x, "addThumbClass", js.Any.fromFunction2((t0: String, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterBodyEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterBodyEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterInputEventHandler(value: (Thumb, Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInputEventHandler", js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDeregisterThumbEventHandler(value: (Thumb, Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterThumbEventHandler", js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDeregisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setEmitChangeEvent(value: (Double, Thumb) => Callback): Self = StObject.set(x, "emitChangeEvent", js.Any.fromFunction2((t0: Double, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitDragEndEvent(value: (Double, Thumb) => Callback): Self = StObject.set(x, "emitDragEndEvent", js.Any.fromFunction2((t0: Double, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitDragStartEvent(value: (Double, Thumb) => Callback): Self = StObject.set(x, "emitDragStartEvent", js.Any.fromFunction2((t0: Double, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitInputEvent(value: (Double, Thumb) => Callback): Self = StObject.set(x, "emitInputEvent", js.Any.fromFunction2((t0: Double, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setFocusInput(value: Thumb => Callback): Self = StObject.set(x, "focusInput", js.Any.fromFunction1((t0: Thumb) => value(t0).runNow()))
      
      inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetBoundingClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
      
      inline def setGetInputAttribute(value: (String, Thumb) => String | Null): Self = StObject.set(x, "getInputAttribute", js.Any.fromFunction2(value))
      
      inline def setGetInputValue(value: Thumb => String): Self = StObject.set(x, "getInputValue", js.Any.fromFunction1(value))
      
      inline def setGetThumbBoundingClientRect(value: Thumb => DOMRect): Self = StObject.set(x, "getThumbBoundingClientRect", js.Any.fromFunction1(value))
      
      inline def setGetThumbKnobWidth(value: Thumb => Double): Self = StObject.set(x, "getThumbKnobWidth", js.Any.fromFunction1(value))
      
      inline def setGetValueIndicatorContainerWidth(value: Thumb => Double): Self = StObject.set(x, "getValueIndicatorContainerWidth", js.Any.fromFunction1(value))
      
      inline def setGetValueToAriaValueTextFn(value: CallbackTo[(js.Function2[/* value */ Double, /* thumb */ Thumb, String]) | Null]): Self = StObject.set(x, "getValueToAriaValueTextFn", value.toJsFn)
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setIsInputFocused(value: Thumb => Boolean): Self = StObject.set(x, "isInputFocused", js.Any.fromFunction1(value))
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setRegisterBodyEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerBodyEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterInputEventHandler(value: (Thumb, Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInputEventHandler", js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRegisterThumbEventHandler(value: (Thumb, Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerThumbEventHandler", js.Any.fromFunction3((t0: Thumb, t1: Any, t2: SpecificEventListener[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRegisterWindowEventHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveInputAttribute(value: (String, Thumb) => Callback): Self = StObject.set(x, "removeInputAttribute", js.Any.fromFunction2((t0: String, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveThumbClass(value: (String, Thumb) => Callback): Self = StObject.set(x, "removeThumbClass", js.Any.fromFunction2((t0: String, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveThumbStyleProperty(value: (String, Thumb) => Callback): Self = StObject.set(x, "removeThumbStyleProperty", js.Any.fromFunction2((t0: String, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveTrackActiveStyleProperty(value: String => Callback): Self = StObject.set(x, "removeTrackActiveStyleProperty", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetInputAttribute(value: (String, String, Thumb) => Callback): Self = StObject.set(x, "setInputAttribute", js.Any.fromFunction3((t0: String, t1: String, t2: Thumb) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetInputValue(value: (String, Thumb) => Callback): Self = StObject.set(x, "setInputValue", js.Any.fromFunction2((t0: String, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setSetPointerCapture(value: Double => Callback): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetThumbStyleProperty(value: (String, String, Thumb) => Callback): Self = StObject.set(x, "setThumbStyleProperty", js.Any.fromFunction3((t0: String, t1: String, t2: Thumb) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetTrackActiveStyleProperty(value: (String, String) => Callback): Self = StObject.set(x, "setTrackActiveStyleProperty", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSetValueIndicatorText(value: (Double, Thumb) => Callback): Self = StObject.set(x, "setValueIndicatorText", js.Any.fromFunction2((t0: Double, t1: Thumb) => (value(t0, t1)).runNow()))
      
      inline def setShouldHideFocusStylesForPointerEvents(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldHideFocusStylesForPointerEvents", value.toJsFn)
      
      inline def setShouldHideFocusStylesForPointerEventsUndefined: Self = StObject.set(x, "shouldHideFocusStylesForPointerEvents", js.undefined)
      
      inline def setUpdateTickMarks(value: js.Array[TickMark] => Callback): Self = StObject.set(x, "updateTickMarks", js.Any.fromFunction1((t0: js.Array[TickMark]) => value(t0).runNow()))
    }
  }
}
