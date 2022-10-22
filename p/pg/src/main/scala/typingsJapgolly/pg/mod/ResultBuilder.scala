package typingsJapgolly.pg.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultBuilder[R /* <: QueryResultRow */]
  extends StObject
     with QueryResult[R] {
  
  def addRow(row: R): Unit
}
object ResultBuilder {
  
  inline def apply[R /* <: QueryResultRow */](
    addRow: R => Callback,
    command: String,
    fields: js.Array[FieldDef],
    oid: Double,
    rowCount: Double,
    rows: js.Array[R]
  ): ResultBuilder[R] = {
    val __obj = js.Dynamic.literal(addRow = js.Any.fromFunction1((t0: R) => addRow(t0).runNow()), command = command.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultBuilder[R]]
  }
  
  extension [Self <: ResultBuilder[?], R /* <: QueryResultRow */](x: Self & ResultBuilder[R]) {
    
    inline def setAddRow(value: R => Callback): Self = StObject.set(x, "addRow", js.Any.fromFunction1((t0: R) => value(t0).runNow()))
  }
}
