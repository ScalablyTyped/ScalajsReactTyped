package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the chart's position within a sheet. Can be updated using the EmbeddedChart.modify() function.
  *
  *     chart = chart.modify().setPosition(5, 5, 0, 0).build();
  *     sheet.updateChart(chart);
  */
trait ContainerInfo extends StObject {
  
  def getAnchorColumn(): Integer
  
  def getAnchorRow(): Integer
  
  def getOffsetX(): Integer
  
  def getOffsetY(): Integer
}
object ContainerInfo {
  
  inline def apply(
    getAnchorColumn: CallbackTo[Integer],
    getAnchorRow: CallbackTo[Integer],
    getOffsetX: CallbackTo[Integer],
    getOffsetY: CallbackTo[Integer]
  ): ContainerInfo = {
    val __obj = js.Dynamic.literal(getAnchorColumn = getAnchorColumn.toJsFn, getAnchorRow = getAnchorRow.toJsFn, getOffsetX = getOffsetX.toJsFn, getOffsetY = getOffsetY.toJsFn)
    __obj.asInstanceOf[ContainerInfo]
  }
  
  extension [Self <: ContainerInfo](x: Self) {
    
    inline def setGetAnchorColumn(value: CallbackTo[Integer]): Self = StObject.set(x, "getAnchorColumn", value.toJsFn)
    
    inline def setGetAnchorRow(value: CallbackTo[Integer]): Self = StObject.set(x, "getAnchorRow", value.toJsFn)
    
    inline def setGetOffsetX(value: CallbackTo[Integer]): Self = StObject.set(x, "getOffsetX", value.toJsFn)
    
    inline def setGetOffsetY(value: CallbackTo[Integer]): Self = StObject.set(x, "getOffsetY", value.toJsFn)
  }
}
