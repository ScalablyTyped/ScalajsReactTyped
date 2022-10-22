package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Formatter
trait DefaultFormatter extends StObject {
  
  /**
    * Reformats the data in the specified column.
    *
    * @param data - A DataTable containing the data to reformat. You cannot use a DataView here.
    * @param columnIndex - The zero-based index of the column to format. To format multiple columns, you must call this method multiple times, with different colIndex values.
    */
  def format(data: DataTable, columnIndex: Double): Unit
}
object DefaultFormatter {
  
  inline def apply(format: (DataTable, Double) => Callback): DefaultFormatter = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2((t0: DataTable, t1: Double) => (format(t0, t1)).runNow()))
    __obj.asInstanceOf[DefaultFormatter]
  }
  
  extension [Self <: DefaultFormatter](x: Self) {
    
    inline def setFormat(value: (DataTable, Double) => Callback): Self = StObject.set(x, "format", js.Any.fromFunction2((t0: DataTable, t1: Double) => (value(t0, t1)).runNow()))
  }
}
