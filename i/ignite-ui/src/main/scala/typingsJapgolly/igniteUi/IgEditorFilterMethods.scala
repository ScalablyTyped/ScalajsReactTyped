package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgEditorFilterMethods extends StObject {
  
  def destroy(): Unit
  
  def exitEditMode(): Unit
  
  def hasInvalidMessage(): Unit
  
  def remove(): Unit
  
  def setFocus(delay: js.Object, toggle: js.Object): Unit
  
  def validator(): Unit
}
object IgEditorFilterMethods {
  
  inline def apply(
    destroy: Callback,
    exitEditMode: Callback,
    hasInvalidMessage: Callback,
    remove: Callback,
    setFocus: (js.Object, js.Object) => Callback,
    validator: Callback
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, exitEditMode = exitEditMode.toJsFn, hasInvalidMessage = hasInvalidMessage.toJsFn, remove = remove.toJsFn, setFocus = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setFocus(t0, t1)).runNow()), validator = validator.toJsFn)
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
  
  extension [Self <: IgEditorFilterMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExitEditMode(value: Callback): Self = StObject.set(x, "exitEditMode", value.toJsFn)
    
    inline def setHasInvalidMessage(value: Callback): Self = StObject.set(x, "hasInvalidMessage", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetFocus(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setFocus", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setValidator(value: Callback): Self = StObject.set(x, "validator", value.toJsFn)
  }
}
