package typingsJapgolly.materialTextfield.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MutationObserver
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/textfield.@material/textfield/adapter.MDCTextFieldAdapter> */
trait PartialMDCTextFieldAdapte extends StObject {
  
  var activateLineRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var addClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var closeOutline: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deactivateLineRipple: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var deregisterInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var deregisterTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var deregisterValidationAttributeChangeHandler: js.UndefOr[js.Function1[/* observer */ MutationObserver, Unit]] = js.undefined
  
  var floatLabel: js.UndefOr[js.Function1[/* shouldFloat */ Boolean, Unit]] = js.undefined
  
  var getLabelWidth: js.UndefOr[js.Function0[Double]] = js.undefined
  
  var getNativeInput: js.UndefOr[js.Function0[MDCTextFieldNativeInputElement | Null]] = js.undefined
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.undefined
  
  var hasLabel: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var hasOutline: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var isFocused: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var notchOutline: js.UndefOr[js.Function1[/* labelWidth */ Double, Unit]] = js.undefined
  
  var registerInputInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var registerTextFieldInteractionHandler: js.UndefOr[
    js.Function2[/* evtType */ EventType, /* handler */ SpecificEventListener[EventType], Unit]
  ] = js.undefined
  
  var registerValidationAttributeChangeHandler: js.UndefOr[
    js.Function1[
      /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit], 
      MutationObserver
    ]
  ] = js.undefined
  
  var removeClass: js.UndefOr[js.Function1[/* className */ String, Unit]] = js.undefined
  
  var removeInputAttr: js.UndefOr[js.Function1[/* attr */ String, Unit]] = js.undefined
  
  var setInputAttr: js.UndefOr[js.Function2[/* attr */ String, /* value */ String, Unit]] = js.undefined
  
  var setLabelRequired: js.UndefOr[js.Function1[/* isRequired */ Boolean, Unit]] = js.undefined
  
  var setLineRippleTransformOrigin: js.UndefOr[js.Function1[/* normalizedX */ Double, Unit]] = js.undefined
  
  var shakeLabel: js.UndefOr[js.Function1[/* shouldShake */ Boolean, Unit]] = js.undefined
}
object PartialMDCTextFieldAdapte {
  
  inline def apply(): PartialMDCTextFieldAdapte = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCTextFieldAdapte]
  }
  
  extension [Self <: PartialMDCTextFieldAdapte](x: Self) {
    
    inline def setActivateLineRipple(value: Callback): Self = StObject.set(x, "activateLineRipple", value.toJsFn)
    
    inline def setActivateLineRippleUndefined: Self = StObject.set(x, "activateLineRipple", js.undefined)
    
    inline def setAddClass(value: /* className */ String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
    
    inline def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
    
    inline def setCloseOutline(value: Callback): Self = StObject.set(x, "closeOutline", value.toJsFn)
    
    inline def setCloseOutlineUndefined: Self = StObject.set(x, "closeOutline", js.undefined)
    
    inline def setDeactivateLineRipple(value: Callback): Self = StObject.set(x, "deactivateLineRipple", value.toJsFn)
    
    inline def setDeactivateLineRippleUndefined: Self = StObject.set(x, "deactivateLineRipple", js.undefined)
    
    inline def setDeregisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterInputInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
    
    inline def setDeregisterInputInteractionHandlerUndefined: Self = StObject.set(x, "deregisterInputInteractionHandler", js.undefined)
    
    inline def setDeregisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
    
    inline def setDeregisterTextFieldInteractionHandlerUndefined: Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.undefined)
    
    inline def setDeregisterValidationAttributeChangeHandler(value: /* observer */ MutationObserver => Callback): Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.Any.fromFunction1((t0: /* observer */ MutationObserver) => value(t0).runNow()))
    
    inline def setDeregisterValidationAttributeChangeHandlerUndefined: Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.undefined)
    
    inline def setFloatLabel(value: /* shouldFloat */ Boolean => Callback): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1((t0: /* shouldFloat */ Boolean) => value(t0).runNow()))
    
    inline def setFloatLabelUndefined: Self = StObject.set(x, "floatLabel", js.undefined)
    
    inline def setGetLabelWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelWidth", value.toJsFn)
    
    inline def setGetLabelWidthUndefined: Self = StObject.set(x, "getLabelWidth", js.undefined)
    
    inline def setGetNativeInput(value: CallbackTo[MDCTextFieldNativeInputElement | Null]): Self = StObject.set(x, "getNativeInput", value.toJsFn)
    
    inline def setGetNativeInputUndefined: Self = StObject.set(x, "getNativeInput", js.undefined)
    
    inline def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
    
    inline def setHasClassUndefined: Self = StObject.set(x, "hasClass", js.undefined)
    
    inline def setHasLabel(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLabel", value.toJsFn)
    
    inline def setHasLabelUndefined: Self = StObject.set(x, "hasLabel", js.undefined)
    
    inline def setHasOutline(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOutline", value.toJsFn)
    
    inline def setHasOutlineUndefined: Self = StObject.set(x, "hasOutline", js.undefined)
    
    inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setNotchOutline(value: /* labelWidth */ Double => Callback): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1((t0: /* labelWidth */ Double) => value(t0).runNow()))
    
    inline def setNotchOutlineUndefined: Self = StObject.set(x, "notchOutline", js.undefined)
    
    inline def setRegisterInputInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerInputInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterInputInteractionHandlerUndefined: Self = StObject.set(x, "registerInputInteractionHandler", js.undefined)
    
    inline def setRegisterTextFieldInteractionHandler(value: (/* evtType */ EventType, /* handler */ SpecificEventListener[EventType]) => Callback): Self = StObject.set(x, "registerTextFieldInteractionHandler", js.Any.fromFunction2((t0: /* evtType */ EventType, t1: /* handler */ SpecificEventListener[EventType]) => (value(t0, t1)).runNow()))
    
    inline def setRegisterTextFieldInteractionHandlerUndefined: Self = StObject.set(x, "registerTextFieldInteractionHandler", js.undefined)
    
    inline def setRegisterValidationAttributeChangeHandler(value: /* handler */ js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
    
    inline def setRegisterValidationAttributeChangeHandlerUndefined: Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.undefined)
    
    inline def setRemoveClass(value: /* className */ String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: /* className */ String) => value(t0).runNow()))
    
    inline def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
    
    inline def setRemoveInputAttr(value: /* attr */ String => Callback): Self = StObject.set(x, "removeInputAttr", js.Any.fromFunction1((t0: /* attr */ String) => value(t0).runNow()))
    
    inline def setRemoveInputAttrUndefined: Self = StObject.set(x, "removeInputAttr", js.undefined)
    
    inline def setSetInputAttr(value: (/* attr */ String, /* value */ String) => Callback): Self = StObject.set(x, "setInputAttr", js.Any.fromFunction2((t0: /* attr */ String, t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def setSetInputAttrUndefined: Self = StObject.set(x, "setInputAttr", js.undefined)
    
    inline def setSetLabelRequired(value: /* isRequired */ Boolean => Callback): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1((t0: /* isRequired */ Boolean) => value(t0).runNow()))
    
    inline def setSetLabelRequiredUndefined: Self = StObject.set(x, "setLabelRequired", js.undefined)
    
    inline def setSetLineRippleTransformOrigin(value: /* normalizedX */ Double => Callback): Self = StObject.set(x, "setLineRippleTransformOrigin", js.Any.fromFunction1((t0: /* normalizedX */ Double) => value(t0).runNow()))
    
    inline def setSetLineRippleTransformOriginUndefined: Self = StObject.set(x, "setLineRippleTransformOrigin", js.undefined)
    
    inline def setShakeLabel(value: /* shouldShake */ Boolean => Callback): Self = StObject.set(x, "shakeLabel", js.Any.fromFunction1((t0: /* shouldShake */ Boolean) => value(t0).runNow()))
    
    inline def setShakeLabelUndefined: Self = StObject.set(x, "shakeLabel", js.undefined)
  }
}
