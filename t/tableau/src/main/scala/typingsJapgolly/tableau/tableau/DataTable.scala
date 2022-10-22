package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTable extends StObject {
  
  /** The column information, including the name, data type, and index. */
  def getColumns(): js.Array[Column]
  
  /**
    * A two-dimensional array of data without the sheet or column metadata.
    * The first array index is the row index and the second array index is the column index.
    */
  def getData(): js.Array[Any]
  
  /** Whether the data is summary data or underlying data. Returns true for summary data. */
  def getIsSummaryData(): Boolean
  
  /** Either "Underlying Data Table" or "Summary Data Table". */
  def getName(): String
  
  /** The number of rows in the returned data. */
  def getTotalRowCount(): Double
}
object DataTable {
  
  inline def apply(
    getColumns: CallbackTo[js.Array[Column]],
    getData: CallbackTo[js.Array[Any]],
    getIsSummaryData: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getTotalRowCount: CallbackTo[Double]
  ): DataTable = {
    val __obj = js.Dynamic.literal(getColumns = getColumns.toJsFn, getData = getData.toJsFn, getIsSummaryData = getIsSummaryData.toJsFn, getName = getName.toJsFn, getTotalRowCount = getTotalRowCount.toJsFn)
    __obj.asInstanceOf[DataTable]
  }
  
  extension [Self <: DataTable](x: Self) {
    
    inline def setGetColumns(value: CallbackTo[js.Array[Column]]): Self = StObject.set(x, "getColumns", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetIsSummaryData(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsSummaryData", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetTotalRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "getTotalRowCount", value.toJsFn)
  }
}
