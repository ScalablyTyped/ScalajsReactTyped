package typingsJapgolly.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.cellEdit
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowAdd
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowDelete
  - typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowMoved
*/
trait HistoryAction extends js.Object

object HistoryAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cellEdit: typingsJapgolly.tabulatorTables.tabulatorTablesStrings.cellEdit = this.cast("cellEdit")
  @scala.inline
  def rowAdd: typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowAdd = this.cast("rowAdd")
  @scala.inline
  def rowDelete: typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowDelete = this.cast("rowDelete")
  @scala.inline
  def rowMoved: typingsJapgolly.tabulatorTables.tabulatorTablesStrings.rowMoved = this.cast("rowMoved")
}

