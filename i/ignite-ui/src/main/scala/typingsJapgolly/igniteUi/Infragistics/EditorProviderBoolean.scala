package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProviderBoolean extends StObject {
  
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit
  
  def destroy(): Unit
  
  def getValue(): Unit
  
  def isValid(): Unit
  
  def keyDown(evt: js.Object, ui: js.Object): Unit
  
  def refreshValue(): Unit
  
  def removeFromParent(): Unit
  
  def setFocus(): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def setValue(`val`: js.Object): Unit
  
  def textChanged(evt: js.Object, ui: js.Object): Unit
  
  def validator(): Unit
  
  def valueChanged(evt: js.Object, ui: js.Object): Unit
}
object EditorProviderBoolean {
  
  inline def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback,
    destroy: Callback,
    getValue: Callback,
    isValid: Callback,
    keyDown: (js.Object, js.Object) => Callback,
    refreshValue: Callback,
    removeFromParent: Callback,
    setFocus: Callback,
    setSize: (js.Object, js.Object) => Callback,
    setValue: js.Object => Callback,
    textChanged: (js.Object, js.Object) => Callback,
    validator: Callback,
    valueChanged: (js.Object, js.Object) => Callback
  ): EditorProviderBoolean = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (createEditor(t0, t1, t2, t3, t4, t5)).runNow()), destroy = destroy.toJsFn, getValue = getValue.toJsFn, isValid = isValid.toJsFn, keyDown = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (keyDown(t0, t1)).runNow()), refreshValue = refreshValue.toJsFn, removeFromParent = removeFromParent.toJsFn, setFocus = setFocus.toJsFn, setSize = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setSize(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: js.Object) => setValue(t0).runNow()), textChanged = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (textChanged(t0, t1)).runNow()), validator = validator.toJsFn, valueChanged = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (valueChanged(t0, t1)).runNow()))
    __obj.asInstanceOf[EditorProviderBoolean]
  }
  
  extension [Self <: EditorProviderBoolean](x: Self) {
    
    inline def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "createEditor", js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetValue(value: Callback): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIsValid(value: Callback): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setKeyDown(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "keyDown", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setRefreshValue(value: Callback): Self = StObject.set(x, "refreshValue", value.toJsFn)
    
    inline def setRemoveFromParent(value: Callback): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSetSize(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: js.Object => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setTextChanged(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "textChanged", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setValidator(value: Callback): Self = StObject.set(x, "validator", value.toJsFn)
    
    inline def setValueChanged(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
