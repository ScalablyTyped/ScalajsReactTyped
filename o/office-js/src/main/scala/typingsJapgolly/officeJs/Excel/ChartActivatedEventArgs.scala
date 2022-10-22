package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.ChartActivated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the chart that raised the activated event.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait ChartActivatedEventArgs extends StObject {
  
  /**
    * Gets the ID of the chart that is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  
  /**
    * Gets the type of the event. See `Excel.EventType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartActivated
  
  /**
    * Gets the ID of the worksheet in which the chart is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}
object ChartActivatedEventArgs {
  
  inline def apply(chartId: String, worksheetId: String): ChartActivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ChartActivated")
    __obj.asInstanceOf[ChartActivatedEventArgs]
  }
  
  extension [Self <: ChartActivatedEventArgs](x: Self) {
    
    inline def setChartId(value: String): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ChartActivated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorksheetId(value: String): Self = StObject.set(x, "worksheetId", value.asInstanceOf[js.Any])
  }
}
