package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder of DataTable objects. Building a data table consists of first specifying its columns, and
  * then adding its rows, one at a time. Example:
  *
  *     var data = Charts.newDataTable()
  *         .addColumn(Charts.ColumnType.STRING, "Month")
  *         .addColumn(Charts.ColumnType.NUMBER, "In Store")
  *         .addColumn(Charts.ColumnType.NUMBER, "Online")
  *         .addRow(["January", 10, 1])
  *         .addRow(["February", 12, 1])
  *         .addRow(["March", 20, 2])
  *         .addRow(["April", 25, 3])
  *         .addRow(["May", 30, 4])
  *         .build();
  */
trait DataTableBuilder extends js.Object {
  def addColumn(`type`: ColumnType, label: String): DataTableBuilder
  def addRow(values: js.Array[_]): DataTableBuilder
  def build(): DataTable
  def setValue(row: Integer, column: Integer, value: js.Any): DataTableBuilder
}

object DataTableBuilder {
  @scala.inline
  def apply(
    addColumn: (ColumnType, String) => CallbackTo[DataTableBuilder],
    addRow: js.Array[js.Any] => CallbackTo[DataTableBuilder],
    build: CallbackTo[DataTable],
    setValue: (Integer, Integer, js.Any) => CallbackTo[DataTableBuilder]
  ): DataTableBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addColumn")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts.ColumnType, t1: java.lang.String) => addColumn(t0, t1).runNow()))
    __obj.updateDynamic("addRow")(js.Any.fromFunction1((t0: js.Array[js.Any]) => addRow(t0).runNow()))
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("setValue")(js.Any.fromFunction3((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t1: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer, t2: js.Any) => setValue(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DataTableBuilder]
  }
}

