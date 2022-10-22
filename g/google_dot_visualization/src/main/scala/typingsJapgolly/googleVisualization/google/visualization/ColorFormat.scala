package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorFormat
  extends StObject
     with DefaultFormatter {
  
  /**
    * Assigns a background color from a range, according to the cell value. The color is scaled to match the cell's value within a range from a lower boundary color to an upper boundary color. Note that this method cannot compare string values, as addRange() can. Tip: Color ranges are often hard for viewers to gauge accurately; the simplest and easiest to read range is from a fully saturated color to white (e.g., #FF0000—FFFFFF).
    *
    * @param from - [Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞.
    * @param to - [Number, Date, DateTime, or TimeOfDay] The higher boundary (non-inclusive) of the range, or null. If null, it will match +∞.
    * @param color - The color to apply to text in matching cells. This color is the same for all cells, no matter what their value.
    * @param fromBgColor - The background color for cells holding values at the low end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param toBgColor - The background color for cells holding values at the high end of the gradient. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  def addGradientRange(from: Any, to: Any, color: String, fromBgColor: String, toBgColor: String): Unit
  
  /**
    * Specifies a foreground color and/or background color to a cell, depending on the cell value. Any cell with a value in the specified from—to range will be assigned color and bgcolor. It is important to realize that the range is non-inclusive, because creating a range from 1—1,000 and a second from 1,000— 2,000 will not cover the value 1,000!
    *
    * @param from - [String, Number, Date, DateTime, or TimeOfDay] The lower boundary (inclusive) of the range, or null. If null, it will match -∞. String boundaries are compared alphabetically against string values.
    * @param to - [String, Number, Date, DateTime, or TimeOfDay] The high boundary (non-inclusive) of the range, or null. If null, it will match +∞. String boundaries are compared alphabetically against string values.
    * @param color - The color to apply to text in matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    * @param bgcolor - The color to apply to the background of matching cells. Values can be either '#RRGGBB' values or defined color constants, (example: '#FF0000' or 'red').
    */
  def addRange(from: Any, to: Any, color: String, bgcolor: String): Unit
}
object ColorFormat {
  
  inline def apply(
    addGradientRange: (Any, Any, String, String, String) => Callback,
    addRange: (Any, Any, String, String) => Callback,
    format: (DataTable, Double) => Callback
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(addGradientRange = js.Any.fromFunction5((t0: Any, t1: Any, t2: String, t3: String, t4: String) => (addGradientRange(t0, t1, t2, t3, t4)).runNow()), addRange = js.Any.fromFunction4((t0: Any, t1: Any, t2: String, t3: String) => (addRange(t0, t1, t2, t3)).runNow()), format = js.Any.fromFunction2((t0: DataTable, t1: Double) => (format(t0, t1)).runNow()))
    __obj.asInstanceOf[ColorFormat]
  }
  
  extension [Self <: ColorFormat](x: Self) {
    
    inline def setAddGradientRange(value: (Any, Any, String, String, String) => Callback): Self = StObject.set(x, "addGradientRange", js.Any.fromFunction5((t0: Any, t1: Any, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAddRange(value: (Any, Any, String, String) => Callback): Self = StObject.set(x, "addRange", js.Any.fromFunction4((t0: Any, t1: Any, t2: String, t3: String) => (value(t0, t1, t2, t3)).runNow()))
  }
}
