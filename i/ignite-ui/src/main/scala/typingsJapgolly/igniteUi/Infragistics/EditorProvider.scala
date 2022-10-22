package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProvider extends StObject {
  
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit
  
  /**
    * Create handlers cache
    *
    * @param callbacks
    * @param key
    * @param editorOptions
    * @param tabIndex
    * @param format
    * @param element
    */
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit
  
  def destroy(): Unit
  
  def getEditor(): Unit
  
  def getValue(): Unit
  
  def isValid(): Unit
  
  def keyDown(evt: js.Object, ui: js.Object): Unit
  
  def refreshValue(): Unit
  
  def removeFromParent(): Unit
  
  def requestValidate(evt: js.Object): Unit
  
  def setFocus(toggle: js.Object): Unit
  
  def setSize(width: js.Object, height: js.Object): Unit
  
  def setValue(`val`: js.Object): Unit
  
  def validate(): Unit
  
  def validator(): Unit
}
object EditorProvider {
  
  inline def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Callback,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback,
    destroy: Callback,
    getEditor: Callback,
    getValue: Callback,
    isValid: Callback,
    keyDown: (js.Object, js.Object) => Callback,
    refreshValue: Callback,
    removeFromParent: Callback,
    requestValidate: js.Object => Callback,
    setFocus: js.Object => Callback,
    setSize: (js.Object, js.Object) => Callback,
    setValue: js.Object => Callback,
    validate: Callback,
    validator: Callback
  ): EditorProvider = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (attachErrorEvents(t0, t1, t2)).runNow()), createEditor = js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (createEditor(t0, t1, t2, t3, t4, t5)).runNow()), destroy = destroy.toJsFn, getEditor = getEditor.toJsFn, getValue = getValue.toJsFn, isValid = isValid.toJsFn, keyDown = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (keyDown(t0, t1)).runNow()), refreshValue = refreshValue.toJsFn, removeFromParent = removeFromParent.toJsFn, requestValidate = js.Any.fromFunction1((t0: js.Object) => requestValidate(t0).runNow()), setFocus = js.Any.fromFunction1((t0: js.Object) => setFocus(t0).runNow()), setSize = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (setSize(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: js.Object) => setValue(t0).runNow()), validate = validate.toJsFn, validator = validator.toJsFn)
    __obj.asInstanceOf[EditorProvider]
  }
  
  extension [Self <: EditorProvider](x: Self) {
    
    inline def setAttachErrorEvents(value: (js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "attachErrorEvents", js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: js.Object) => (value(t0, t1, t2)).runNow()))
    
    inline def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Callback): Self = StObject.set(x, "createEditor", js.Any.fromFunction6((t0: js.Object, t1: js.Object, t2: js.Object, t3: js.Object, t4: js.Object, t5: js.Object) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setGetEditor(value: Callback): Self = StObject.set(x, "getEditor", value.toJsFn)
    
    inline def setGetValue(value: Callback): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setIsValid(value: Callback): Self = StObject.set(x, "isValid", value.toJsFn)
    
    inline def setKeyDown(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "keyDown", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setRefreshValue(value: Callback): Self = StObject.set(x, "refreshValue", value.toJsFn)
    
    inline def setRemoveFromParent(value: Callback): Self = StObject.set(x, "removeFromParent", value.toJsFn)
    
    inline def setRequestValidate(value: js.Object => Callback): Self = StObject.set(x, "requestValidate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetFocus(value: js.Object => Callback): Self = StObject.set(x, "setFocus", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetSize(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: js.Object => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setValidate(value: Callback): Self = StObject.set(x, "validate", value.toJsFn)
    
    inline def setValidator(value: Callback): Self = StObject.set(x, "validator", value.toJsFn)
  }
}
