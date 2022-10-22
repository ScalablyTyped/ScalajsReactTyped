package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for all ControlValueAccessor classes defined in Forms package.
  * Contains common logic and utility functions.
  *
  * Note: this is an *internal-only* class and should not be extended or used directly in
  * applications code.
  */
trait BaseControlValueAccessor extends StObject {
  
  /* private */ var _elementRef: Any
  
  /* private */ var _renderer: Any
  
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  def onChange(_underscore: Any): Unit
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  def onTouched(): Unit
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  def registerOnChange(fn: js.Function1[/* _ */ Any, js.Object]): Unit
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  def registerOnTouched(fn: js.Function0[Unit]): Unit
  
  /**
    * Sets the "disabled" property on the range input element.
    * @nodoc
    */
  def setDisabledState(isDisabled: Boolean): Unit
  
  /**
    * Helper method that sets a property on a target element using the current Renderer
    * implementation.
    * @nodoc
    */
  /* protected */ def setProperty(key: String, value: Any): Unit
}
object BaseControlValueAccessor {
  
  inline def apply(
    _elementRef: Any,
    _renderer: Any,
    onChange: Any => Callback,
    onTouched: Callback,
    registerOnChange: js.Function1[/* _ */ Any, js.Object] => Callback,
    registerOnTouched: js.Function0[Unit] => Callback,
    setDisabledState: Boolean => Callback,
    setProperty: (String, Any) => Callback
  ): BaseControlValueAccessor = {
    val __obj = js.Dynamic.literal(_elementRef = _elementRef.asInstanceOf[js.Any], _renderer = _renderer.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Any) => onChange(t0).runNow()), onTouched = onTouched.toJsFn, registerOnChange = js.Any.fromFunction1((t0: js.Function1[/* _ */ Any, js.Object]) => registerOnChange(t0).runNow()), registerOnTouched = js.Any.fromFunction1((t0: js.Function0[Unit]) => registerOnTouched(t0).runNow()), setDisabledState = js.Any.fromFunction1((t0: Boolean) => setDisabledState(t0).runNow()), setProperty = js.Any.fromFunction2((t0: String, t1: Any) => (setProperty(t0, t1)).runNow()))
    __obj.asInstanceOf[BaseControlValueAccessor]
  }
  
  extension [Self <: BaseControlValueAccessor](x: Self) {
    
    inline def setOnChange(value: Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnTouched(value: Callback): Self = StObject.set(x, "onTouched", value.toJsFn)
    
    inline def setRegisterOnChange(value: js.Function1[/* _ */ Any, js.Object] => Callback): Self = StObject.set(x, "registerOnChange", js.Any.fromFunction1((t0: js.Function1[/* _ */ Any, js.Object]) => value(t0).runNow()))
    
    inline def setRegisterOnTouched(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "registerOnTouched", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setSetDisabledState(value: Boolean => Callback): Self = StObject.set(x, "setDisabledState", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetProperty(value: (String, Any) => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def set_elementRef(value: Any): Self = StObject.set(x, "_elementRef", value.asInstanceOf[js.Any])
    
    inline def set_renderer(value: Any): Self = StObject.set(x, "_renderer", value.asInstanceOf[js.Any])
  }
}
