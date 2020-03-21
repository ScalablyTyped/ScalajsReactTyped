package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGlobalFiltersInstanceProps[D /* <: js.Object */] extends js.Object {
  var preGlobalFilteredRows: js.Array[Row[D]]
  var rows: js.Array[Row[D]]
  def setGlobalFilter(filterValue: FilterValue): Unit
}

object UseGlobalFiltersInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    preGlobalFilteredRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    setGlobalFilter: FilterValue => Callback
  ): UseGlobalFiltersInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preGlobalFilteredRows = preGlobalFilteredRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("setGlobalFilter")(js.Any.fromFunction1((t0: typingsJapgolly.reactTable.mod.FilterValue) => setGlobalFilter(t0).runNow()))
    __obj.asInstanceOf[UseGlobalFiltersInstanceProps[D]]
  }
}

