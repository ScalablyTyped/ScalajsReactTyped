package typingsJapgolly.angularForms.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description
  * Class used by Angular to track radio buttons. For internal use only.
  */
trait RadioControlRegistry extends StObject {
  
  /* private */ var _accessors: Any
  
  /* private */ var _isSameGroup: Any
  
  /**
    * @description
    * Adds a control to the internal registry. For internal use only.
    */
  def add(control: NgControl, accessor: RadioControlValueAccessor): Unit
  
  /**
    * @description
    * Removes a control from the internal registry. For internal use only.
    */
  def remove(accessor: RadioControlValueAccessor): Unit
  
  /**
    * @description
    * Selects a radio button. For internal use only.
    */
  def select(accessor: RadioControlValueAccessor): Unit
}
object RadioControlRegistry {
  
  inline def apply(
    _accessors: Any,
    _isSameGroup: Any,
    add: (NgControl, RadioControlValueAccessor) => Callback,
    remove: RadioControlValueAccessor => Callback,
    select: RadioControlValueAccessor => Callback
  ): RadioControlRegistry = {
    val __obj = js.Dynamic.literal(_accessors = _accessors.asInstanceOf[js.Any], _isSameGroup = _isSameGroup.asInstanceOf[js.Any], add = js.Any.fromFunction2((t0: NgControl, t1: RadioControlValueAccessor) => (add(t0, t1)).runNow()), remove = js.Any.fromFunction1((t0: RadioControlValueAccessor) => remove(t0).runNow()), select = js.Any.fromFunction1((t0: RadioControlValueAccessor) => select(t0).runNow()))
    __obj.asInstanceOf[RadioControlRegistry]
  }
  
  extension [Self <: RadioControlRegistry](x: Self) {
    
    inline def setAdd(value: (NgControl, RadioControlValueAccessor) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: NgControl, t1: RadioControlValueAccessor) => (value(t0, t1)).runNow()))
    
    inline def setRemove(value: RadioControlValueAccessor => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: RadioControlValueAccessor) => value(t0).runNow()))
    
    inline def setSelect(value: RadioControlValueAccessor => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: RadioControlValueAccessor) => value(t0).runNow()))
    
    inline def set_accessors(value: Any): Self = StObject.set(x, "_accessors", value.asInstanceOf[js.Any])
    
    inline def set_isSameGroup(value: Any): Self = StObject.set(x, "_isSameGroup", value.asInstanceOf[js.Any])
  }
}
