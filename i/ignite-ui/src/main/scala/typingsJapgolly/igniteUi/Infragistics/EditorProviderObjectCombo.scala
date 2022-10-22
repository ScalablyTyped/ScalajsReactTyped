package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProviderObjectCombo extends StObject {
  
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
  
  def internalSelectionChanged(evt: js.Object, ui: js.Object): Unit
  
  def isValid(): Unit
  
  def keyDown(evt: js.Object, ui: js.Object): Unit
  
  def refreshValue(): Unit
  
  def removeFromParent(): Unit
  
  def selectionChanged(evt: js.Object, ui: js.Object): Unit
  
  def setFocus(): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def setValue(`val`: js.Object, fire: js.Object): Unit
  
  def validator(): Unit
}
object EditorProviderObjectCombo {
  
  inline def apply(
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback,
    destroy: Callback,
    getValue: Callback,
    internalSelectionChanged: (js.Object, js.Object) => Callback,
    isValid: Callback,
    keyDown: (js.Object, js.Object) => Callback,
    refreshValue: Callback,
    removeFromParent: Callback,
    selectionChanged: (js.Object, js.Object) => Callback,
    setFocus: Callback,
    setSize: (js.Object, js.Object) => Callback,
    setValue: (js.Object, js.Object) => Callback,
    validator: Callback
  ): EditorProviderObjectCombo = {
    val __obj = js.Dynamic.literal(createEditor = js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (createEditor(t0, t1, t2, t3, t4, t5)).runNow()), destroy = destroy.toJsFn, getValue = getValue.toJsFn, internalSelectionChanged = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (internalSelectionChanged(t0, t1)).runNow()), isValid = isValid.toJsFn, keyDown = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (keyDown(t0, t1)).runNow()), refreshValue = refreshValue.toJsFn, removeFromParent = removeFromParent.toJsFn, selectionChanged = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (selectionChanged(t0, t1)).runNow()), setFocus = setFocus.toJsFn, setSize = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setSize(t0, t1)).runNow()), setValue = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setValue(t0, t1)).runNow()), validator = validator.toJsFn)
    __obj.asInstanceOf[EditorProviderObjectCombo]
  }
  
  extension [Self <: EditorProviderObjectCombo](x: Self) {
    
    inline def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "createEditor", js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetValue(value: Callback): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setInternalSelectionChanged(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "internalSelectionChanged", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setIsValid(value: Callback): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setKeyDown(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "keyDown", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setRefreshValue(value: Callback): Self = StObject.set(x, "refreshValue", value.toJsFn)
    
    inline def setRemoveFromParent(value: Callback): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setSelectionChanged(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetFocus(value: Callback): Self = StObject.set(x, "setFocus", value.toJsFn)
    
    inline def setSetSize(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setValidator(value: Callback): Self = StObject.set(x, "validator", value.toJsFn)
  }
}
