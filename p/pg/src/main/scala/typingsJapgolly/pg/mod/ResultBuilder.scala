package typingsJapgolly.pg.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultBuilder[R /* <: QueryResultRow */] extends QueryResult[R] {
  def addRow(row: R): Unit
}

object ResultBuilder {
  @scala.inline
  def apply[R /* <: QueryResultRow */](
    addRow: R => Callback,
    command: String,
    fields: js.Array[FieldDef],
    oid: Double,
    rowCount: Double,
    rows: js.Array[R]
  ): ResultBuilder[R] = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("addRow")(js.Any.fromFunction1((t0: R) => addRow(t0).runNow()))
    __obj.asInstanceOf[ResultBuilder[R]]
  }
}

