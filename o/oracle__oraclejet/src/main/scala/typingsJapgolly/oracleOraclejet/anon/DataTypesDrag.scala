package typingsJapgolly.oracleOraclejet.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DragEvent
import typingsJapgolly.oracleOraclejet.ojtableMod.ojTable.DragRowContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTypesDrag[K, D] extends StObject {
  
  var dataTypes: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var drag: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  
  var dragEnd: js.UndefOr[js.Function1[/* param0 */ DragEvent, Unit]] = js.undefined
  
  var dragStart: js.UndefOr[js.Function2[/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D], Unit]] = js.undefined
}
object DataTypesDrag {
  
  inline def apply[K, D](): DataTypesDrag[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTypesDrag[K, D]]
  }
  
  extension [Self <: DataTypesDrag[?, ?], K, D](x: Self & (DataTypesDrag[K, D])) {
    
    inline def setDataTypes(value: String | js.Array[String]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
    
    inline def setDataTypesUndefined: Self = StObject.set(x, "dataTypes", js.undefined)
    
    inline def setDataTypesVarargs(value: String*): Self = StObject.set(x, "dataTypes", js.Array(value*))
    
    inline def setDrag(value: /* param0 */ DragEvent => Callback): Self = StObject.set(x, "drag", js.Any.fromFunction1((t0: /* param0 */ DragEvent) => value(t0).runNow()))
    
    inline def setDragEnd(value: /* param0 */ DragEvent => Callback): Self = StObject.set(x, "dragEnd", js.Any.fromFunction1((t0: /* param0 */ DragEvent) => value(t0).runNow()))
    
    inline def setDragEndUndefined: Self = StObject.set(x, "dragEnd", js.undefined)
    
    inline def setDragStart(value: (/* param0 */ DragEvent, /* param1 */ DragRowContext[K, D]) => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction2((t0: /* param0 */ DragEvent, t1: /* param1 */ DragRowContext[K, D]) => (value(t0, t1)).runNow()))
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
  }
}
