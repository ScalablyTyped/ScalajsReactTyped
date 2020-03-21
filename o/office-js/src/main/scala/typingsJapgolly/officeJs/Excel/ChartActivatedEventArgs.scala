package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.ChartActivated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Activated event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartActivatedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: String
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: ChartActivated
  /**
    *
    * Gets the id of the worksheet in which the chart is activated.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: String
}

object ChartActivatedEventArgs {
  @scala.inline
  def apply(chartId: String, `type`: ChartActivated, worksheetId: String): ChartActivatedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId.asInstanceOf[js.Any], worksheetId = worksheetId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartActivatedEventArgs]
  }
}

