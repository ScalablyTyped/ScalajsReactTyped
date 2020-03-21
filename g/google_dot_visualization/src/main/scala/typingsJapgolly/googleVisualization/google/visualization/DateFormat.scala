package typingsJapgolly.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.DateFormat")
@js.native
class DateFormat protected () extends DefaultFormatter {
  def this(options: DateFormatOptions) = this()
  /**
    * Returns the formatted value of a given value. This method does not require a DataTable.
    */
  def formatValue(value: js.Date): String = js.native
}

