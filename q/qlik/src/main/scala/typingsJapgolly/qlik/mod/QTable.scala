package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QTable extends js.Object {
  var colCount: Double
  var headers: js.Array[QHeader]
  var rowCount: Double
  var rows: js.Array[QRow]
  var totals: js.Array[QMeasureCell]
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit
  def getColByName(fld: String): js.UndefOr[Double]
  def getMoreData(): Unit
}

object QTable {
  @scala.inline
  def apply(
    colCount: Double,
    exportData: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Callback,
    getColByName: String => CallbackTo[js.UndefOr[Double]],
    getMoreData: Callback,
    headers: js.Array[QHeader],
    rowCount: Double,
    rows: js.Array[QRow],
    totals: js.Array[QMeasureCell]
  ): QTable = {
    val __obj = js.Dynamic.literal(colCount = colCount.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.updateDynamic("exportData")(js.Any.fromFunction2((t0: typingsJapgolly.qlik.mod.ExportDataOptions, t1: js.Function1[/* url */ java.lang.String, scala.Unit]) => exportData(t0, t1).runNow()))
    __obj.updateDynamic("getColByName")(js.Any.fromFunction1((t0: java.lang.String) => getColByName(t0).runNow()))
    __obj.updateDynamic("getMoreData")(getMoreData.toJsFn)
    __obj.asInstanceOf[QTable]
  }
}

