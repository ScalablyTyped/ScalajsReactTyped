package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorHistory extends StObject {
  
  def add(action: String, params: js.Object): Unit
  
  def canRedo(): Boolean
  
  def canUndo(): Boolean
  
  def clear(): Unit
  
  def onChange(): Unit
  
  def redo(): Unit
  
  def undo(): Unit
}
object JSONEditorHistory {
  
  inline def apply(
    add: (String, js.Object) => Callback,
    canRedo: CallbackTo[Boolean],
    canUndo: CallbackTo[Boolean],
    clear: Callback,
    onChange: Callback,
    redo: Callback,
    undo: Callback
  ): JSONEditorHistory = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Object) => (add(t0, t1)).runNow()), canRedo = canRedo.toJsFn, canUndo = canUndo.toJsFn, clear = clear.toJsFn, onChange = onChange.toJsFn, redo = redo.toJsFn, undo = undo.toJsFn)
    __obj.asInstanceOf[JSONEditorHistory]
  }
  
  extension [Self <: JSONEditorHistory](x: Self) {
    
    inline def setAdd(value: (String, js.Object) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setCanRedo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canRedo", value.toJsFn)
    
    inline def setCanUndo(value: CallbackTo[Boolean]): Self = StObject.set(x, "canUndo", value.toJsFn)
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setRedo(value: Callback): Self = StObject.set(x, "redo", value.toJsFn)
    
    inline def setUndo(value: Callback): Self = StObject.set(x, "undo", value.toJsFn)
  }
}
