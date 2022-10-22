package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QTable extends StObject {
  
  var colCount: Double
  
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ String, Unit]): Unit
  
  def getColByName(fld: String): js.UndefOr[Double]
  
  def getMoreData(): Unit
  
  var headers: js.Array[QHeader]
  
  var rowCount: Double
  
  var rows: js.Array[QRow]
  
  var totals: js.Array[QMeasureCell]
}
object QTable {
  
  inline def apply(
    colCount: Double,
    exportData: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Callback,
    getColByName: String => js.UndefOr[Double],
    getMoreData: Callback,
    headers: js.Array[QHeader],
    rowCount: Double,
    rows: js.Array[QRow],
    totals: js.Array[QMeasureCell]
  ): QTable = {
    val __obj = js.Dynamic.literal(colCount = colCount.asInstanceOf[js.Any], exportData = js.Any.fromFunction2((t0: ExportDataOptions, t1: js.Function1[/* url */ String, Unit]) => (exportData(t0, t1)).runNow()), getColByName = js.Any.fromFunction1(getColByName), getMoreData = getMoreData.toJsFn, headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any])
    __obj.asInstanceOf[QTable]
  }
  
  extension [Self <: QTable](x: Self) {
    
    inline def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
    
    inline def setExportData(value: (ExportDataOptions, js.Function1[/* url */ String, Unit]) => Callback): Self = StObject.set(x, "exportData", js.Any.fromFunction2((t0: ExportDataOptions, t1: js.Function1[/* url */ String, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetColByName(value: String => js.UndefOr[Double]): Self = StObject.set(x, "getColByName", js.Any.fromFunction1(value))
    
    inline def setGetMoreData(value: Callback): Self = StObject.set(x, "getMoreData", value.toJsFn)
    
    inline def setHeaders(value: js.Array[QHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: QHeader*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[QRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: QRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotals(value: js.Array[QMeasureCell]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsVarargs(value: QMeasureCell*): Self = StObject.set(x, "totals", js.Array(value*))
  }
}
