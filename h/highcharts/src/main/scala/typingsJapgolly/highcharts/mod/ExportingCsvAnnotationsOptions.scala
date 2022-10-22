package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingCsvAnnotationsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The way to mark the separator
    * for annotations combined in one export-data table cell.
    */
  var itemDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When several labels are assigned
    * to a specific point, they will be displayed in one field in the table.
    */
  var join: js.UndefOr[Boolean] = js.undefined
}
object ExportingCsvAnnotationsOptions {
  
  inline def apply(): ExportingCsvAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingCsvAnnotationsOptions]
  }
  
  extension [Self <: ExportingCsvAnnotationsOptions](x: Self) {
    
    inline def setItemDelimiter(value: String): Self = StObject.set(x, "itemDelimiter", value.asInstanceOf[js.Any])
    
    inline def setItemDelimiterUndefined: Self = StObject.set(x, "itemDelimiter", js.undefined)
    
    inline def setJoin(value: Boolean): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
  }
}
