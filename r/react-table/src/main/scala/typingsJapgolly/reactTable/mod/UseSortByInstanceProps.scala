package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSortByInstanceProps[D /* <: js.Object */] extends js.Object {
  var preSortedRows: js.Array[Row[D]]
  var rows: js.Array[Row[D]]
  def toggleSortBy(columnId: IdType[D], descending: Boolean, isMulti: Boolean): Unit
}

object UseSortByInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    preSortedRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    toggleSortBy: (IdType[D], Boolean, Boolean) => Callback
  ): UseSortByInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preSortedRows = preSortedRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleSortBy")(js.Any.fromFunction3((t0: typingsJapgolly.reactTable.mod.IdType[D], t1: scala.Boolean, t2: scala.Boolean) => toggleSortBy(t0, t1, t2).runNow()))
    __obj.asInstanceOf[UseSortByInstanceProps[D]]
  }
}

