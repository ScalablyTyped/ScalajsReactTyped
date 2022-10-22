package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for objects that can represent their data as a DataTable.
  * Implementing classes
  *
  * NameBrief description
  *
  * DataTableA Data Table to be used in charts.
  *
  * RangeAccess and modify spreadsheet ranges.
  */
trait DataTableSource extends StObject {
  
  def getDataTable(): DataTable
}
object DataTableSource {
  
  inline def apply(getDataTable: CallbackTo[DataTable]): DataTableSource = {
    val __obj = js.Dynamic.literal(getDataTable = getDataTable.toJsFn)
    __obj.asInstanceOf[DataTableSource]
  }
  
  extension [Self <: DataTableSource](x: Self) {
    
    inline def setGetDataTable(value: CallbackTo[DataTable]): Self = StObject.set(x, "getDataTable", value.toJsFn)
  }
}
