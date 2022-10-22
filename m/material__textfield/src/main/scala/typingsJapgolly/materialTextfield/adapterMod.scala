package typingsJapgolly.materialTextfield

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MutationObserver
import typingsJapgolly.materialBase.typesMod.EventType
import typingsJapgolly.materialBase.typesMod.SpecificEventListener
import typingsJapgolly.materialTextfield.typesMod.MDCTextFieldNativeInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  trait MDCTextFieldAdapter
    extends StObject
       with MDCTextFieldRootAdapter
       with MDCTextFieldInputAdapter
       with MDCTextFieldLabelAdapter
       with MDCTextFieldLineRippleAdapter
       with MDCTextFieldOutlineAdapter
  object MDCTextFieldAdapter {
    
    inline def apply(
      activateLineRipple: Callback,
      addClass: String => Callback,
      closeOutline: Callback,
      deactivateLineRipple: Callback,
      deregisterInputInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterTextFieldInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterValidationAttributeChangeHandler: MutationObserver => Callback,
      floatLabel: Boolean => Callback,
      getLabelWidth: CallbackTo[Double],
      getNativeInput: CallbackTo[MDCTextFieldNativeInputElement | Null],
      hasClass: String => Boolean,
      hasLabel: CallbackTo[Boolean],
      hasOutline: CallbackTo[Boolean],
      isFocused: CallbackTo[Boolean],
      notchOutline: Double => Callback,
      registerInputInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerTextFieldInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
      removeClass: String => Callback,
      removeInputAttr: String => Callback,
      setInputAttr: (String, String) => Callback,
      setLabelRequired: Boolean => Callback,
      setLineRippleTransformOrigin: Double => Callback,
      shakeLabel: Boolean => Callback
    ): MDCTextFieldAdapter = {
      val __obj = js.Dynamic.literal(activateLineRipple = activateLineRipple.toJsFn, addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), closeOutline = closeOutline.toJsFn, deactivateLineRipple = deactivateLineRipple.toJsFn, deregisterInputInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInputInteractionHandler(t0, t1)).runNow()), deregisterTextFieldInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterTextFieldInteractionHandler(t0, t1)).runNow()), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1((t0: MutationObserver) => deregisterValidationAttributeChangeHandler(t0).runNow()), floatLabel = js.Any.fromFunction1((t0: Boolean) => floatLabel(t0).runNow()), getLabelWidth = getLabelWidth.toJsFn, getNativeInput = getNativeInput.toJsFn, hasClass = js.Any.fromFunction1(hasClass), hasLabel = hasLabel.toJsFn, hasOutline = hasOutline.toJsFn, isFocused = isFocused.toJsFn, notchOutline = js.Any.fromFunction1((t0: Double) => notchOutline(t0).runNow()), registerInputInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInputInteractionHandler(t0, t1)).runNow()), registerTextFieldInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerTextFieldInteractionHandler(t0, t1)).runNow()), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()), removeInputAttr = js.Any.fromFunction1((t0: String) => removeInputAttr(t0).runNow()), setInputAttr = js.Any.fromFunction2((t0: String, t1: String) => (setInputAttr(t0, t1)).runNow()), setLabelRequired = js.Any.fromFunction1((t0: Boolean) => setLabelRequired(t0).runNow()), setLineRippleTransformOrigin = js.Any.fromFunction1((t0: Double) => setLineRippleTransformOrigin(t0).runNow()), shakeLabel = js.Any.fromFunction1((t0: Boolean) => shakeLabel(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldAdapter]
    }
  }
  
  trait MDCTextFieldInputAdapter extends StObject {
    
    /**
      * Deregisters an event listener on the native input element for a given event.
      */
    def deregisterInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * @return The native `<input>` element, or an object with the same shape.
      * Note that this method can return null, which the foundation will handle gracefully.
      */
    def getNativeInput(): MDCTextFieldNativeInputElement | Null
    
    /**
      * @return true if the textfield is focused. We achieve this via `document.activeElement === this.root`.
      */
    def isFocused(): Boolean
    
    /**
      * Registers an event listener on the native input element for a given event.
      */
    def registerInputInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Removes the specified attribute from the input element.
      */
    def removeInputAttr(attr: String): Unit
    
    /**
      * Sets the specified attribute to the specified value on the input element.
      */
    def setInputAttr(attr: String, value: String): Unit
  }
  object MDCTextFieldInputAdapter {
    
    inline def apply(
      deregisterInputInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      getNativeInput: CallbackTo[MDCTextFieldNativeInputElement | Null],
      isFocused: CallbackTo[Boolean],
      registerInputInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      removeInputAttr: String => Callback,
      setInputAttr: (String, String) => Callback
    ): MDCTextFieldInputAdapter = {
      val __obj = js.Dynamic.literal(deregisterInputInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterInputInteractionHandler(t0, t1)).runNow()), getNativeInput = getNativeInput.toJsFn, isFocused = isFocused.toJsFn, registerInputInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerInputInteractionHandler(t0, t1)).runNow()), removeInputAttr = js.Any.fromFunction1((t0: String) => removeInputAttr(t0).runNow()), setInputAttr = js.Any.fromFunction2((t0: String, t1: String) => (setInputAttr(t0, t1)).runNow()))
      __obj.asInstanceOf[MDCTextFieldInputAdapter]
    }
    
    extension [Self <: MDCTextFieldInputAdapter](x: Self) {
      
      inline def setDeregisterInputInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterInputInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGetNativeInput(value: CallbackTo[MDCTextFieldNativeInputElement | Null]): Self = StObject.set(x, "getNativeInput", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setRegisterInputInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerInputInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveInputAttr(value: String => Callback): Self = StObject.set(x, "removeInputAttr", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetInputAttr(value: (String, String) => Callback): Self = StObject.set(x, "setInputAttr", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  trait MDCTextFieldLabelAdapter extends StObject {
    
    /**
      * Only implement if label exists.
      * Floats the label above the input element if shouldFloat is true.
      */
    def floatLabel(shouldFloat: Boolean): Unit
    
    /**
      * Only implement if label exists.
      * @return width of label in pixels.
      */
    def getLabelWidth(): Double
    
    /**
      * @return true if label element exists, false if it doesn't.
      */
    def hasLabel(): Boolean
    
    /**
      * Only implement if label exists.
      * Styles the label as required.
      */
    def setLabelRequired(isRequired: Boolean): Unit
    
    /**
      * Only implement if label exists.
      * Shakes label if shouldShake is true.
      */
    def shakeLabel(shouldShake: Boolean): Unit
  }
  object MDCTextFieldLabelAdapter {
    
    inline def apply(
      floatLabel: Boolean => Callback,
      getLabelWidth: CallbackTo[Double],
      hasLabel: CallbackTo[Boolean],
      setLabelRequired: Boolean => Callback,
      shakeLabel: Boolean => Callback
    ): MDCTextFieldLabelAdapter = {
      val __obj = js.Dynamic.literal(floatLabel = js.Any.fromFunction1((t0: Boolean) => floatLabel(t0).runNow()), getLabelWidth = getLabelWidth.toJsFn, hasLabel = hasLabel.toJsFn, setLabelRequired = js.Any.fromFunction1((t0: Boolean) => setLabelRequired(t0).runNow()), shakeLabel = js.Any.fromFunction1((t0: Boolean) => shakeLabel(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldLabelAdapter]
    }
    
    extension [Self <: MDCTextFieldLabelAdapter](x: Self) {
      
      inline def setFloatLabel(value: Boolean => Callback): Self = StObject.set(x, "floatLabel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setGetLabelWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getLabelWidth", value.toJsFn)
      
      inline def setHasLabel(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLabel", value.toJsFn)
      
      inline def setSetLabelRequired(value: Boolean => Callback): Self = StObject.set(x, "setLabelRequired", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setShakeLabel(value: Boolean => Callback): Self = StObject.set(x, "shakeLabel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait MDCTextFieldLineRippleAdapter extends StObject {
    
    /**
      * Activates the line ripple.
      */
    def activateLineRipple(): Unit
    
    /**
      * Deactivates the line ripple.
      */
    def deactivateLineRipple(): Unit
    
    /**
      * Sets the transform origin of the line ripple.
      */
    def setLineRippleTransformOrigin(normalizedX: Double): Unit
  }
  object MDCTextFieldLineRippleAdapter {
    
    inline def apply(
      activateLineRipple: Callback,
      deactivateLineRipple: Callback,
      setLineRippleTransformOrigin: Double => Callback
    ): MDCTextFieldLineRippleAdapter = {
      val __obj = js.Dynamic.literal(activateLineRipple = activateLineRipple.toJsFn, deactivateLineRipple = deactivateLineRipple.toJsFn, setLineRippleTransformOrigin = js.Any.fromFunction1((t0: Double) => setLineRippleTransformOrigin(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldLineRippleAdapter]
    }
    
    extension [Self <: MDCTextFieldLineRippleAdapter](x: Self) {
      
      inline def setActivateLineRipple(value: Callback): Self = StObject.set(x, "activateLineRipple", value.toJsFn)
      
      inline def setDeactivateLineRipple(value: Callback): Self = StObject.set(x, "deactivateLineRipple", value.toJsFn)
      
      inline def setSetLineRippleTransformOrigin(value: Double => Callback): Self = StObject.set(x, "setLineRippleTransformOrigin", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait MDCTextFieldOutlineAdapter extends StObject {
    
    /**
      * Only implement if outline element exists.
      * Closes notch in outline element.
      */
    def closeOutline(): Unit
    
    /**
      * @return true if outline element exists, false if it doesn't.
      */
    def hasOutline(): Boolean
    
    /**
      * Only implement if outline element exists.
      */
    def notchOutline(labelWidth: Double): Unit
  }
  object MDCTextFieldOutlineAdapter {
    
    inline def apply(closeOutline: Callback, hasOutline: CallbackTo[Boolean], notchOutline: Double => Callback): MDCTextFieldOutlineAdapter = {
      val __obj = js.Dynamic.literal(closeOutline = closeOutline.toJsFn, hasOutline = hasOutline.toJsFn, notchOutline = js.Any.fromFunction1((t0: Double) => notchOutline(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldOutlineAdapter]
    }
    
    extension [Self <: MDCTextFieldOutlineAdapter](x: Self) {
      
      inline def setCloseOutline(value: Callback): Self = StObject.set(x, "closeOutline", value.toJsFn)
      
      inline def setHasOutline(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasOutline", value.toJsFn)
      
      inline def setNotchOutline(value: Double => Callback): Self = StObject.set(x, "notchOutline", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait MDCTextFieldRootAdapter extends StObject {
    
    /**
      * Adds a class to the root Element.
      */
    def addClass(className: String): Unit
    
    /**
      * Deregisters an event handler on the root element for a given event.
      */
    def deregisterTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Disconnects a validation attribute observer on the input element.
      */
    def deregisterValidationAttributeChangeHandler(observer: MutationObserver): Unit
    
    /**
      * @return true if the root element contains the given class name.
      */
    def hasClass(className: String): Boolean
    
    /**
      * Registers an event handler on the root element for a given event.
      */
    def registerTextFieldInteractionHandler[K /* <: EventType */](evtType: K, handler: SpecificEventListener[K]): Unit
    
    /**
      * Registers a validation attribute change listener on the input element.
      * Handler accepts list of attribute names.
      */
    def registerValidationAttributeChangeHandler(handler: js.Function1[/* attributeNames */ js.Array[String], Unit]): MutationObserver
    
    /**
      * Removes a class from the root Element.
      */
    def removeClass(className: String): Unit
  }
  object MDCTextFieldRootAdapter {
    
    inline def apply(
      addClass: String => Callback,
      deregisterTextFieldInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      deregisterValidationAttributeChangeHandler: MutationObserver => Callback,
      hasClass: String => Boolean,
      registerTextFieldInteractionHandler: (Any, SpecificEventListener[Any]) => Callback,
      registerValidationAttributeChangeHandler: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver,
      removeClass: String => Callback
    ): MDCTextFieldRootAdapter = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: String) => addClass(t0).runNow()), deregisterTextFieldInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (deregisterTextFieldInteractionHandler(t0, t1)).runNow()), deregisterValidationAttributeChangeHandler = js.Any.fromFunction1((t0: MutationObserver) => deregisterValidationAttributeChangeHandler(t0).runNow()), hasClass = js.Any.fromFunction1(hasClass), registerTextFieldInteractionHandler = js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (registerTextFieldInteractionHandler(t0, t1)).runNow()), registerValidationAttributeChangeHandler = js.Any.fromFunction1(registerValidationAttributeChangeHandler), removeClass = js.Any.fromFunction1((t0: String) => removeClass(t0).runNow()))
      __obj.asInstanceOf[MDCTextFieldRootAdapter]
    }
    
    extension [Self <: MDCTextFieldRootAdapter](x: Self) {
      
      inline def setAddClass(value: String => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeregisterTextFieldInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "deregisterTextFieldInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDeregisterValidationAttributeChangeHandler(value: MutationObserver => Callback): Self = StObject.set(x, "deregisterValidationAttributeChangeHandler", js.Any.fromFunction1((t0: MutationObserver) => value(t0).runNow()))
      
      inline def setHasClass(value: String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
      
      inline def setRegisterTextFieldInteractionHandler(value: (Any, SpecificEventListener[Any]) => Callback): Self = StObject.set(x, "registerTextFieldInteractionHandler", js.Any.fromFunction2((t0: Any, t1: SpecificEventListener[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRegisterValidationAttributeChangeHandler(value: js.Function1[/* attributeNames */ js.Array[String], Unit] => MutationObserver): Self = StObject.set(x, "registerValidationAttributeChangeHandler", js.Any.fromFunction1(value))
      
      inline def setRemoveClass(value: String => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
