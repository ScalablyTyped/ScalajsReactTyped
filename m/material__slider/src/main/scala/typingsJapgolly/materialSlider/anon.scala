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

object anon {
  
  /* Inlined std.Partial<@material/slider.@material/slider/adapter.MDCSliderAdapter> */
  trait PartialMDCSliderAdapter extends StObject {
    
    var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var addThumbClass: js.UndefOr[js.Function2[/* className */ String, /* thumb */ Thumb, Unit]] = js.undefined
    
    var deregisterBodyEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var deregisterInputEventHandler: js.UndefOr[
        js.Function3[
          /* thumb */ Thumb, 
          /* evtType */ EventType, 
          /* handler */ SpecificEventListener[EventType], 
          Unit
        ]
      ] = js.undefined
    
    var deregisterThumbEventHandler: js.UndefOr[
        js.Function3[
          /* thumb */ Thumb, 
          /* evtType */ EventType, 
          /* handler */ SpecificEventListener[EventType], 
          Unit
        ]
      ] = js.undefined
    
    var deregisterWindowEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var emitChangeEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.undefined
    
    var emitDragEndEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.undefined
    
    var emitDragStartEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.undefined
    
    var emitInputEvent: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.undefined
    
    var focusInput: js.UndefOr[js.Function1[/* thumb */ Thumb, Unit]] = js.undefined
    
    var getAttribute: js.UndefOr[js.Function1[/* attribute */ String, String | Null]] = js.undefined
    
    var getBoundingClientRect: js.UndefOr[js.Function0[DOMRect]] = js.undefined
    
    var getInputAttribute: js.UndefOr[js.Function2[/* attribute */ String, /* thumb */ Thumb, String | Null]] = js.undefined
    
    var getInputValue: js.UndefOr[js.Function1[/* thumb */ Thumb, String]] = js.undefined
    
    var getThumbBoundingClientRect: js.UndefOr[js.Function1[/* thumb */ Thumb, DOMRect]] = js.undefined
    
    var getThumbKnobWidth: js.UndefOr[js.Function1[/* thumb */ Thumb, Double]] = js.undefined
    
    var getValueIndicatorContainerWidth: js.UndefOr[js.Function1[/* thumb */ Thumb, Double]] = js.undefined
    
    var getValueToAriaValueTextFn: js.UndefOr[
        js.Function0[(js.Function2[/* value */ Double, /* thumb */ Thumb, String]) | Null]
      ] = js.undefined
    
    var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
    
    var isInputFocused: js.UndefOr[js.Function1[/* thumb */ Thumb, Boolean]] = js.undefined
    
    var isRTL: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var registerBodyEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var registerInputEventHandler: js.UndefOr[
        js.Function3[
          /* thumb */ Thumb, 
          /* evtType */ EventType, 
          /* handler */ SpecificEventListener[EventType], 
          Unit
        ]
      ] = js.undefined
    
    var registerThumbEventHandler: js.UndefOr[
        js.Function3[
          /* thumb */ Thumb, 
          /* evtType */ EventType, 
          /* handler */ SpecificEventListener[EventType], 
          Unit
        ]
      ] = js.undefined
    
    var registerWindowEventHandler: js.UndefOr[
        js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
      ] = js.undefined
    
    var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
    
    var removeInputAttribute: js.UndefOr[js.Function2[/* attribute */ String, /* thumb */ Thumb, Unit]] = js.undefined
    
    var removeThumbClass: js.UndefOr[js.Function2[/* className */ String, /* thumb */ Thumb, Unit]] = js.undefined
    
    var removeThumbStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* thumb */ Thumb, Unit]] = js.undefined
    
    var removeTrackActiveStyleProperty: js.UndefOr[js.Function1[/* propertyName */ String, Unit]] = js.undefined
    
    var setInputAttribute: js.UndefOr[
        js.Function3[/* attribute */ String, /* value */ String, /* thumb */ Thumb, Unit]
      ] = js.undefined
    
    var setInputValue: js.UndefOr[js.Function2[/* value */ String, /* thumb */ Thumb, Unit]] = js.undefined
    
    var setPointerCapture: js.UndefOr[js.Function1[/* pointerId */ Double, Unit]] = js.undefined
    
    var setThumbStyleProperty: js.UndefOr[
        js.Function3[/* propertyName */ String, /* value */ String, /* thumb */ Thumb, Unit]
      ] = js.undefined
    
    var setTrackActiveStyleProperty: js.UndefOr[js.Function2[/* propertyName */ String, /* value */ String, Unit]] = js.undefined
    
    var setValueIndicatorText: js.UndefOr[js.Function2[/* value */ Double, /* thumb */ Thumb, Unit]] = js.undefined
    
    var shouldHideFocusStylesForPointerEvents: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    var updateTickMarks: js.UndefOr[js.Function1[/* tickMarks */ js.Array[TickMark], Unit]] = js.undefined
  }
  object PartialMDCSliderAdapter {
    
    inline def apply(): PartialMDCSliderAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCSliderAdapter]
    }
    
    extension [Self <: PartialMDCSliderAdapter](x: Self) {
      
      inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
      
      inline def setAddThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "addThumbClass", js.Any.fromFunction2((t0: /* className */ String, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setAddThumbClassUndefined: Self = StObject.set(x, "addThumbClass", js.undefined)
      
      inline def setDeregisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterBodyEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterBodyEventHandlerUndefined: Self = StObject.set(x, "deregisterBodyEventHandler", js.undefined)
      
      inline def setDeregisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterEventHandlerUndefined: Self = StObject.set(x, "deregisterEventHandler", js.undefined)
      
      inline def setDeregisterInputEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback
      ): Self = StObject.set(x, "deregisterInputEventHandler", js.Any.fromFunction3((t0: /* thumb */ Thumb, t1: /* evtType */ EventType, t2: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDeregisterInputEventHandlerUndefined: Self = StObject.set(x, "deregisterInputEventHandler", js.undefined)
      
      inline def setDeregisterThumbEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback
      ): Self = StObject.set(x, "deregisterThumbEventHandler", js.Any.fromFunction3((t0: /* thumb */ Thumb, t1: /* evtType */ EventType, t2: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDeregisterThumbEventHandlerUndefined: Self = StObject.set(x, "deregisterThumbEventHandler", js.undefined)
      
      inline def setDeregisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterWindowEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterWindowEventHandlerUndefined: Self = StObject.set(x, "deregisterWindowEventHandler", js.undefined)
      
      inline def setEmitChangeEvent(value: (/* value */ Double, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "emitChangeEvent", js.Any.fromFunction2((t0: /* value */ Double, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitChangeEventUndefined: Self = StObject.set(x, "emitChangeEvent", js.undefined)
      
      inline def setEmitDragEndEvent(value: (/* value */ Double, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "emitDragEndEvent", js.Any.fromFunction2((t0: /* value */ Double, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitDragEndEventUndefined: Self = StObject.set(x, "emitDragEndEvent", js.undefined)
      
      inline def setEmitDragStartEvent(value: (/* value */ Double, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "emitDragStartEvent", js.Any.fromFunction2((t0: /* value */ Double, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitDragStartEventUndefined: Self = StObject.set(x, "emitDragStartEvent", js.undefined)
      
      inline def setEmitInputEvent(value: (/* value */ Double, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "emitInputEvent", js.Any.fromFunction2((t0: /* value */ Double, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setEmitInputEventUndefined: Self = StObject.set(x, "emitInputEvent", js.undefined)
      
      inline def setFocusInput(value: /* thumb */ Thumb => Callback): Self = StObject.set(x, "focusInput", js.Any.fromFunction1((t0: /* thumb */ Thumb) => value(t0).runNow()))
      
      inline def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      inline def setGetAttribute(value: /* attribute */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeUndefined: Self = StObject.set(x, "getAttribute", js.undefined)
      
      inline def setGetBoundingClientRect(value: CallbackTo[DOMRect]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
      
      inline def setGetBoundingClientRectUndefined: Self = StObject.set(x, "getBoundingClientRect", js.undefined)
      
      inline def setGetInputAttribute(value: (/* attribute */ String, /* thumb */ Thumb) => String | Null): Self = StObject.set(x, "getInputAttribute", js.Any.fromFunction2(value))
      
      inline def setGetInputAttributeUndefined: Self = StObject.set(x, "getInputAttribute", js.undefined)
      
      inline def setGetInputValue(value: /* thumb */ Thumb => String): Self = StObject.set(x, "getInputValue", js.Any.fromFunction1(value))
      
      inline def setGetInputValueUndefined: Self = StObject.set(x, "getInputValue", js.undefined)
      
      inline def setGetThumbBoundingClientRect(value: /* thumb */ Thumb => DOMRect): Self = StObject.set(x, "getThumbBoundingClientRect", js.Any.fromFunction1(value))
      
      inline def setGetThumbBoundingClientRectUndefined: Self = StObject.set(x, "getThumbBoundingClientRect", js.undefined)
      
      inline def setGetThumbKnobWidth(value: /* thumb */ Thumb => Double): Self = StObject.set(x, "getThumbKnobWidth", js.Any.fromFunction1(value))
      
      inline def setGetThumbKnobWidthUndefined: Self = StObject.set(x, "getThumbKnobWidth", js.undefined)
      
      inline def setGetValueIndicatorContainerWidth(value: /* thumb */ Thumb => Double): Self = StObject.set(x, "getValueIndicatorContainerWidth", js.Any.fromFunction1(value))
      
      inline def setGetValueIndicatorContainerWidthUndefined: Self = StObject.set(x, "getValueIndicatorContainerWidth", js.undefined)
      
      inline def setGetValueToAriaValueTextFn(value: CallbackTo[(js.Function2[/* value */ Double, /* thumb */ Thumb, String]) | Null]): Self = StObject.set(x, "getValueToAriaValueTextFn", value.toJsFn)
      
      inline def setGetValueToAriaValueTextFnUndefined: Self = StObject.set(x, "getValueToAriaValueTextFn", js.undefined)
      
      inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
      
      inline def setIsInputFocused(value: /* thumb */ Thumb => Boolean): Self = StObject.set(x, "isInputFocused", js.Any.fromFunction1(value))
      
      inline def setIsInputFocusedUndefined: Self = StObject.set(x, "isInputFocused", js.undefined)
      
      inline def setIsRTL(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRTL", value.toJsFn)
      
      inline def setIsRTLUndefined: Self = StObject.set(x, "isRTL", js.undefined)
      
      inline def setRegisterBodyEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerBodyEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterBodyEventHandlerUndefined: Self = StObject.set(x, "registerBodyEventHandler", js.undefined)
      
      inline def setRegisterEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterEventHandlerUndefined: Self = StObject.set(x, "registerEventHandler", js.undefined)
      
      inline def setRegisterInputEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback
      ): Self = StObject.set(x, "registerInputEventHandler", js.Any.fromFunction3((t0: /* thumb */ Thumb, t1: /* evtType */ EventType, t2: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRegisterInputEventHandlerUndefined: Self = StObject.set(x, "registerInputEventHandler", js.undefined)
      
      inline def setRegisterThumbEventHandler(
        value: (/* thumb */ Thumb, /* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback
      ): Self = StObject.set(x, "registerThumbEventHandler", js.Any.fromFunction3((t0: /* thumb */ Thumb, t1: /* evtType */ EventType, t2: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRegisterThumbEventHandlerUndefined: Self = StObject.set(x, "registerThumbEventHandler", js.undefined)
      
      inline def setRegisterWindowEventHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerWindowEventHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterWindowEventHandlerUndefined: Self = StObject.set(x, "registerWindowEventHandler", js.undefined)
      
      inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
      
      inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
      
      inline def setRemoveInputAttribute(value: (/* attribute */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "removeInputAttribute", js.Any.fromFunction2((t0: /* attribute */ String, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveInputAttributeUndefined: Self = StObject.set(x, "removeInputAttribute", js.undefined)
      
      inline def setRemoveThumbClass(value: (/* className */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "removeThumbClass", js.Any.fromFunction2((t0: /* className */ String, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveThumbClassUndefined: Self = StObject.set(x, "removeThumbClass", js.undefined)
      
      inline def setRemoveThumbStyleProperty(value: (/* propertyName */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "removeThumbStyleProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setRemoveThumbStylePropertyUndefined: Self = StObject.set(x, "removeThumbStyleProperty", js.undefined)
      
      inline def setRemoveTrackActiveStyleProperty(value: /* propertyName */ String => Callback): Self = StObject.set(x, "removeTrackActiveStyleProperty", js.Any.fromFunction1((t0: /* propertyName */ String) => value(t0).runNow()))
      
      inline def setRemoveTrackActiveStylePropertyUndefined: Self = StObject.set(x, "removeTrackActiveStyleProperty", js.undefined)
      
      inline def setSetInputAttribute(value: (/* attribute */ String, /* value */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "setInputAttribute", js.Any.fromFunction3((t0: /* attribute */ String, t1: /* value */ String, t2: /* thumb */ Thumb) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetInputAttributeUndefined: Self = StObject.set(x, "setInputAttribute", js.undefined)
      
      inline def setSetInputValue(value: (/* value */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "setInputValue", js.Any.fromFunction2((t0: /* value */ String, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setSetInputValueUndefined: Self = StObject.set(x, "setInputValue", js.undefined)
      
      inline def setSetPointerCapture(value: /* pointerId */ Double => Callback): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1((t0: /* pointerId */ Double) => value(t0).runNow()))
      
      inline def setSetPointerCaptureUndefined: Self = StObject.set(x, "setPointerCapture", js.undefined)
      
      inline def setSetThumbStyleProperty(value: (/* propertyName */ String, /* value */ String, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "setThumbStyleProperty", js.Any.fromFunction3((t0: /* propertyName */ String, t1: /* value */ String, t2: /* thumb */ Thumb) => (value(t0, t1, t2)).runNow()))
      
      inline def setSetThumbStylePropertyUndefined: Self = StObject.set(x, "setThumbStyleProperty", js.undefined)
      
      inline def setSetTrackActiveStyleProperty(value: (/* propertyName */ String, /* value */ String) => Callback): Self = StObject.set(x, "setTrackActiveStyleProperty", js.Any.fromFunction2((t0: /* propertyName */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
      
      inline def setSetTrackActiveStylePropertyUndefined: Self = StObject.set(x, "setTrackActiveStyleProperty", js.undefined)
      
      inline def setSetValueIndicatorText(value: (/* value */ Double, /* thumb */ Thumb) => Callback): Self = StObject.set(x, "setValueIndicatorText", js.Any.fromFunction2((t0: /* value */ Double, t1: /* thumb */ Thumb) => (value(t0, t1)).runNow()))
      
      inline def setSetValueIndicatorTextUndefined: Self = StObject.set(x, "setValueIndicatorText", js.undefined)
      
      inline def setShouldHideFocusStylesForPointerEvents(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldHideFocusStylesForPointerEvents", value.toJsFn)
      
      inline def setShouldHideFocusStylesForPointerEventsUndefined: Self = StObject.set(x, "shouldHideFocusStylesForPointerEvents", js.undefined)
      
      inline def setUpdateTickMarks(value: /* tickMarks */ js.Array[TickMark] => Callback): Self = StObject.set(x, "updateTickMarks", js.Any.fromFunction1((t0: /* tickMarks */ js.Array[TickMark]) => value(t0).runNow()))
      
      inline def setUpdateTickMarksUndefined: Self = StObject.set(x, "updateTickMarks", js.undefined)
    }
  }
  
  trait SkipInitialUIUpdate extends StObject {
    
    var skipInitialUIUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object SkipInitialUIUpdate {
    
    inline def apply(): SkipInitialUIUpdate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipInitialUIUpdate]
    }
    
    extension [Self <: SkipInitialUIUpdate](x: Self) {
      
      inline def setSkipInitialUIUpdate(value: Boolean): Self = StObject.set(x, "skipInitialUIUpdate", value.asInstanceOf[js.Any])
      
      inline def setSkipInitialUIUpdateUndefined: Self = StObject.set(x, "skipInitialUIUpdate", js.undefined)
    }
  }
  
  trait SkipUpdateUI extends StObject {
    
    var skipUpdateUI: js.UndefOr[Boolean] = js.undefined
  }
  object SkipUpdateUI {
    
    inline def apply(): SkipUpdateUI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipUpdateUI]
    }
    
    extension [Self <: SkipUpdateUI](x: Self) {
      
      inline def setSkipUpdateUI(value: Boolean): Self = StObject.set(x, "skipUpdateUI", value.asInstanceOf[js.Any])
      
      inline def setSkipUpdateUIUndefined: Self = StObject.set(x, "skipUpdateUI", js.undefined)
    }
  }
}
