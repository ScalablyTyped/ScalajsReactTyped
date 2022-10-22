package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProviderDatePicker extends StObject {
  
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object,
    offset: js.Object
  ): Unit
  
  def destroy(): Unit
  
  def isValid(): Unit
  
  def refreshValue(): Unit
  
  def removeFromParent(): Unit
  
  def setFocus(): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def setValue(value: js.Object, fe: js.Object, newOffset: js.Object): Unit
  
  def textChanged(evt: js.Object, ui: js.Object): Unit
  
  def validator(): Unit
}
object EditorProviderDatePicker {
  
  inline def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback,
    destroy: Callback,
    isValid: Callback,
    refreshValue: Callback,
    removeFromParent: Callback,
    setFocus: Callback,
    setSize: (js.Object, js.Object) => Callback,
    setValue: (js.Object, js.Object, js.Object) => Callback,
    textChanged: (js.Object, js.Object) => Callback,
    validator: Callback
  ): EditorProviderDatePicker = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction7((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object, t6: js.Object) => (createEditor(t0, t1, t2, t3, t4, t5, t6)).runNow()), destroy = destroy.toJsFn, isValid = isValid.toJsFn, refreshValue = refreshValue.toJsFn, removeFromParent = removeFromParent.toJsFn, setFocus = setFocus.toJsFn, setSize = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setSize(t0, t1)).runNow()), setValue = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (setValue(t0, t1, t2)).runNow()), textChanged = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (textChanged(t0, t1)).runNow()), validator = validator.toJsFn)
    __obj.asInstanceOf[EditorProviderDatePicker]
  }
  
  extension [Self <: EditorProviderDatePicker](x: Self) {
    
    inline def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "createEditor", js.Any.fromFunction7((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object, t6: js.Object) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setIsValid(value: Callback): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setRefreshValue(value: Callback): Self = StObject.set(x, "refreshValue", value.toJsFn)
    
    inline def setRemoveFromParent(value: Callback): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSetSize(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setTextChanged(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "textChanged", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setValidator(value: Callback): Self = StObject.set(x, "validator", value.toJsFn)
  }
}
