package typingsJapgolly.exceljs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<exceljs.exceljs.TableProperties> */
trait Table extends js.Object {
  var columns: js.Array[TableColumnProperties]
  var displayName: String
  var headerRow: Boolean
  var name: String
  var ref: String
  var rows: js.Array[js.Array[_]]
  var style: TableStyleProperties
  var totalsRow: Boolean
  /**
  	 * Add a new column, including column defn and values
  	 * inserts at colNumber or adds to the right
  	 */
  def addColumn(column: TableColumnProperties, values: js.Array[_], colIndex: Double): Unit
  /**
  	 * Add a row of data, either insert at rowNumber or append
  	 */
  def addRow(values: js.Array[_], rowNumber: Double): Unit
  /**
  	 * Commit changes
  	 */
  def commit(): Unit
  /**
  	 * Get column
  	 */
  def getColumn(colIndex: Double): TableColumn
  /**
  	 * Remove a column with data
  	 */
  def removeColumns(colIndex: Double, count: Double): Unit
  /**
  	 * Remove a rows of data
  	 */
  def removeRows(rowIndex: Double, count: Double): Unit
}

object Table {
  @scala.inline
  def apply(
    addColumn: (TableColumnProperties, js.Array[js.Any], Double) => Callback,
    addRow: (js.Array[js.Any], Double) => Callback,
    columns: js.Array[TableColumnProperties],
    commit: Callback,
    displayName: String,
    getColumn: Double => CallbackTo[TableColumn],
    headerRow: Boolean,
    name: String,
    ref: String,
    removeColumns: (Double, Double) => Callback,
    removeRows: (Double, Double) => Callback,
    rows: js.Array[js.Array[_]],
    style: TableStyleProperties,
    totalsRow: Boolean
  ): Table = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], headerRow = headerRow.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], totalsRow = totalsRow.asInstanceOf[js.Any])
    __obj.updateDynamic("addColumn")(js.Any.fromFunction3((t0: typingsJapgolly.exceljs.mod.TableColumnProperties, t1: js.Array[js.Any], t2: scala.Double) => addColumn(t0, t1, t2).runNow()))
    __obj.updateDynamic("addRow")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => addRow(t0, t1).runNow()))
    __obj.updateDynamic("commit")(commit.toJsFn)
    __obj.updateDynamic("getColumn")(js.Any.fromFunction1((t0: scala.Double) => getColumn(t0).runNow()))
    __obj.updateDynamic("removeColumns")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => removeColumns(t0, t1).runNow()))
    __obj.updateDynamic("removeRows")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => removeRows(t0, t1).runNow()))
    __obj.asInstanceOf[Table]
  }
}

