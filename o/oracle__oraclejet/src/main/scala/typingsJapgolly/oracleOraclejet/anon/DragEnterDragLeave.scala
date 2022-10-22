package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DropRowContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragEnterDragLeave extends StObject {
  
  var dataTypes: String | js.Array[String]
  
  var dragEnter: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  var dragLeave: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  var dragOver: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DropRowContext, Unit]] = js.undefined
  
  def drop(param0: DragEvent, param1: DropRowContext): Unit
}
object DragEnterDragLeave {
  
  inline def apply(dataTypes: String | js.Array[String], drop: (DragEvent, DropRowContext) => Callback): DragEnterDragLeave = {
    val __obj = js.Dynamic.literal(dataTypes = dataTypes.asInstanceOf[js.Any], drop = js.Any.fromFunction2((t0: DragEvent, t1: DropRowContext) => (drop(t0, t1)).runNow()))
    __obj.asInstanceOf[DragEnterDragLeave]
  }
  
  extension [Self <: DragEnterDragLeave](x: Self) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDragEnter(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2((t0: /* param0 */ DragEvent, t1: /* param1 */ DropRowContext) => (value(t0, t1)).runNow()))
    
    inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
    
    inline def setDragLeave(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2((t0: /* param0 */ DragEvent, t1: /* param1 */ DropRowContext) => (value(t0, t1)).runNow()))
    
    inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
    
    inline def setDragOver(value: (/* param0 */ DragEvent, /* param1 */ DropRowContext) => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction2((t0: /* param0 */ DragEvent, t1: /* param1 */ DropRowContext) => (value(t0, t1)).runNow()))
    
    inline def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
    
    inline def setDrop(value: (DragEvent, DropRowContext) => Callback): Self = StObject.set(x, "drop", js.Any.fromFunction2((t0: DragEvent, t1: DropRowContext) => (value(t0, t1)).runNow()))
  }
}
