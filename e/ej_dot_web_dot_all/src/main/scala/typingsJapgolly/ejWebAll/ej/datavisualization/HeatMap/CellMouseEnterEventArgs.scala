package typingsJapgolly.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellMouseEnterEventArgs extends js.Object {
  /** Returns the specific HeatMap cell
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Value displayed on the cell
    */
  var cellValue: js.UndefOr[String] = js.undefined
  /** Returns the HeatMap cell data
    */
  var source: js.UndefOr[js.Any] = js.undefined
}

object CellMouseEnterEventArgs {
  @scala.inline
  def apply(cell: js.Any = null, cellValue: String = null, source: js.Any = null): CellMouseEnterEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (cellValue != null) __obj.updateDynamic("cellValue")(cellValue.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellMouseEnterEventArgs]
  }
}

