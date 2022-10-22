package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEnter extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  def dragEnter(param0: org.scalajs.dom.Event, param1: js.Object): Unit
  
  def dragLeave(param0: org.scalajs.dom.Event, param1: js.Object): Unit
  
  def dragOver(param0: org.scalajs.dom.Event, param1: js.Object): Unit
  
  def drop(param0: org.scalajs.dom.Event, param1: js.Object): Unit
}
object DragEnter {
  
  inline def apply(
    dataTypes: String | js.Array[String],
    dragEnter: (org.scalajs.dom.Event, js.Object) => Callback,
    dragLeave: (org.scalajs.dom.Event, js.Object) => Callback,
    dragOver: (org.scalajs.dom.Event, js.Object) => Callback,
    drop: (org.scalajs.dom.Event, js.Object) => Callback
  ): DragEnter = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], dragEnter = js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (dragEnter(t0, t1)).runNow()), dragLeave = js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (dragLeave(t0, t1)).runNow()), dragOver = js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (dragOver(t0, t1)).runNow()), drop = js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (drop(t0, t1)).runNow()))
    __obj.asInstanceOf[DragEnter]
  }
  
  extension [Self <: DragEnter](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (org.scalajs.dom.Event, js.Object) => Callback): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDragLeave(value: (org.scalajs.dom.Event, js.Object) => Callback): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDragOver(value: (org.scalajs.dom.Event, js.Object) => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDrop(value: (org.scalajs.dom.Event, js.Object) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: org.scalajs.dom.Event, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
