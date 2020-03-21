package typingsJapgolly.agGrid.iViewportDatasourceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportDatasourceParams extends js.Object {
  /** datasource calls this when it wants a row node - typically used when it wants to update the row node */
  def getRow(rowIndex: Double): RowNode
  /** datasource calls this method when the total row count changes. This in turn sets the height of the grids vertical scroll. */
  def setRowCount(count: Double): Unit
  /** datasource calls this when new data arrives. The grid then updates the provided rows. The rows are mapped [rowIndex]=>rowData].*/
  def setRowData(rowData: NumberDictionary[js.Any]): Unit
}

object IViewportDatasourceParams {
  @scala.inline
  def apply(
    getRow: Double => CallbackTo[RowNode],
    setRowCount: Double => Callback,
    setRowData: NumberDictionary[js.Any] => Callback
  ): IViewportDatasourceParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRow")(js.Any.fromFunction1((t0: scala.Double) => getRow(t0).runNow()))
    __obj.updateDynamic("setRowCount")(js.Any.fromFunction1((t0: scala.Double) => setRowCount(t0).runNow()))
    __obj.updateDynamic("setRowData")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.NumberDictionary[js.Any]) => setRowData(t0).runNow()))
    __obj.asInstanceOf[IViewportDatasourceParams]
  }
}

