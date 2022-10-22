package typingsJapgolly.c3.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.c3.mod.Primitive
import typingsJapgolly.c3.mod.PrimitiveArray
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  /** A list of columns, where the first element in each column is the ID and the remaining elements are data. If `json` or `rows` are provided, this will be ignored. */
  var columns: js.UndefOr[js.Array[Array[String | Primitive]]] = js.undefined
  
  /** Will be called when the flow ends. */
  var done: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  /** If given, the duration of the transition will be specified value. If not given, `transition.duration` will be used as default. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /** An object to convert to data to load. Can be in the column form `{key1: [val1, val2, ...]; ...}` or in the row form `[{key1: val1; key2: val2}, ...]`. */
  var json: js.UndefOr[(Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])] = js.undefined
  
  /** If json is provided and is in row form, these keys are used to pull the data from each row. */
  var keys: js.UndefOr[Value] = js.undefined
  
  /** If given, the lower x edge will move by the number of this argument. */
  var length: js.UndefOr[Double] = js.undefined
  
  /** A list of rows, where the first row is the column names and the remaining rows are data. If this is provided and `json` is provided, this is ignored. */
  var rows: js.UndefOr[Array[js.Array[String] | PrimitiveArray]] = js.undefined
  
  /** If given, the lower x edge will move to that point. If not given, the lower x edge will move by the number of given data points. */
  var to: js.UndefOr[String | Double] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[Array[String | Primitive]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: (Array[String | Primitive])*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setDone(value: Callback): Self = StObject.set(x, "done", value.toJsFn)
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setJson(value: (Record[String, PrimitiveArray]) | (js.Array[Record[String, Primitive]])): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setJsonVarargs(value: (Record[String, Primitive])*): Self = StObject.set(x, "json", js.Array(value*))
    
    inline def setKeys(value: Value): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setRows(value: Array[js.Array[String] | PrimitiveArray]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTo(value: String | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
