package typingsJapgolly.xEditable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEditable extends StObject {
  
  def activate(): Unit
  
  def destroy(): Unit
  
  def disable(): Unit
  
  def enable(): Unit
  
  def getValue(isSingle: Boolean): Any
  
  def hide(): Unit
  
  def option(key: Any, value: Any): Unit
  
  var options: XEditableOptions
  
  def setValue(value: Any, convertStr: Boolean): Unit
  
  def show(closeAll: Boolean): Unit
  
  def submit(options: XEditableSubmitOptions): Unit
  
  def toggle(closeAll: Boolean): Unit
  
  def toggleDisabled(): Unit
  
  def validate(): Unit
}
object XEditable {
  
  inline def apply(
    activate: Callback,
    destroy: Callback,
    disable: Callback,
    enable: Callback,
    getValue: Boolean => Any,
    hide: Callback,
    option: (Any, Any) => Callback,
    options: XEditableOptions,
    setValue: (Any, Boolean) => Callback,
    show: Boolean => Callback,
    submit: XEditableSubmitOptions => Callback,
    toggle: Boolean => Callback,
    toggleDisabled: Callback,
    validate: Callback
  ): XEditable = {
    val __obj = js.Dynamic.literal(activate = activate.toJsFn, destroy = destroy.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, getValue = js.Any.fromFunction1(getValue), hide = hide.toJsFn, option = js.Any.fromFunction2((t0: Any, t1: Any) => (option(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], setValue = js.Any.fromFunction2((t0: Any, t1: Boolean) => (setValue(t0, t1)).runNow()), show = js.Any.fromFunction1((t0: Boolean) => show(t0).runNow()), submit = js.Any.fromFunction1((t0: XEditableSubmitOptions) => submit(t0).runNow()), toggle = js.Any.fromFunction1((t0: Boolean) => toggle(t0).runNow()), toggleDisabled = toggleDisabled.toJsFn, validate = validate.toJsFn)
    __obj.asInstanceOf[XEditable]
  }
  
  extension [Self <: XEditable](x: Self) {
    
    inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetValue(value: Boolean => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOption(value: (Any, Any) => Callback): Self = StObject.set(x, "option", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOptions(value: XEditableOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: (Any, Boolean) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Any, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setShow(value: Boolean => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSubmit(value: XEditableSubmitOptions => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction1((t0: XEditableSubmitOptions) => value(t0).runNow()))
    
    inline def setToggle(value: Boolean => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setToggleDisabled(value: Callback): Self = StObject.set(x, "toggleDisabled", value.toJsFn)
    
    inline def setValidate(value: Callback): Self = StObject.set(x, "validate", value.toJsFn)
  }
}
