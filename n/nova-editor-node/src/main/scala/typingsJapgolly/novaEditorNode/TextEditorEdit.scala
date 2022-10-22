package typingsJapgolly.novaEditorNode

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-editor-edit/
trait TextEditorEdit extends StObject {
  
  def delete(range: Range): Unit
  
  def insert(position: Double, text: String): Unit
  
  def replace(range: Range, text: String): Unit
}
object TextEditorEdit {
  
  inline def apply(
    delete: Range => Callback,
    insert: (Double, String) => Callback,
    replace: (Range, String) => Callback
  ): TextEditorEdit = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1((t0: Range) => delete(t0).runNow()), insert = js.Any.fromFunction2((t0: Double, t1: String) => (insert(t0, t1)).runNow()), replace = js.Any.fromFunction2((t0: Range, t1: String) => (replace(t0, t1)).runNow()))
    __obj.asInstanceOf[TextEditorEdit]
  }
  
  extension [Self <: TextEditorEdit](x: Self) {
    
    inline def setDelete(value: Range => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setInsert(value: (Double, String) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setReplace(value: (Range, String) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: Range, t1: String) => (value(t0, t1)).runNow()))
  }
}
