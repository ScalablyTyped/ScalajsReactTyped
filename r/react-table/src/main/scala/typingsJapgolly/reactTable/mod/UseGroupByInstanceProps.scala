package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByInstanceProps[D /* <: js.Object */] extends js.Object {
  var preGroupedRows: js.Array[Row[D]]
  var rows: js.Array[Row[D]]
  def toggleGroupBy(columnId: IdType[D], toggle: Boolean): Unit
}

object UseGroupByInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    preGroupedRows: js.Array[Row[D]],
    rows: js.Array[Row[D]],
    toggleGroupBy: (IdType[D], Boolean) => Callback
  ): UseGroupByInstanceProps[D] = {
    val __obj = js.Dynamic.literal(preGroupedRows = preGroupedRows.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleGroupBy")(js.Any.fromFunction2((t0: typingsJapgolly.reactTable.mod.IdType[D], t1: scala.Boolean) => toggleGroupBy(t0, t1).runNow()))
    __obj.asInstanceOf[UseGroupByInstanceProps[D]]
  }
}

