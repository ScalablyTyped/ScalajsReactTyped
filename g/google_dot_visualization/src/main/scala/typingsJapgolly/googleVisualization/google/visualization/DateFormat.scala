package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat
  extends StObject
     with DefaultFormatter {
  
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: js.Date): String
}
object DateFormat {
  
  inline def apply(format: (DataTable, Double) => Callback, formatValue: js.Date => String): DateFormat = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2((t0: DataTable, t1: Double) => (format(t0, t1)).runNow()), formatValue = js.Any.fromFunction1(formatValue))
    __obj.asInstanceOf[DateFormat]
  }
  
  extension [Self <: DateFormat](x: Self) {
    
    inline def setFormatValue(value: js.Date => String): Self = StObject.set(x, "formatValue", js.Any.fromFunction1(value))
  }
}
