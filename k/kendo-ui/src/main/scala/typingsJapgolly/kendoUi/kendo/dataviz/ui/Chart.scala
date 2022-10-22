package typingsJapgolly.kendoUi.kendo.dataviz.ui

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.dataviz.ChartAxis
import typingsJapgolly.kendoUi.kendo.dataviz.ChartSeries
import typingsJapgolly.kendoUi.kendo.drawing.PDFOptions
import typingsJapgolly.kendoUi.kendo.drawing.Surface
import typingsJapgolly.kendoUi.kendo.ui.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chart
  extends StObject
     with Widget {
  
  var dataSource: DataSource = js.native
  
  def exportImage(options: Any): JQueryPromise[Any] = js.native
  
  def exportPDF(): JQueryPromise[Any] = js.native
  def exportPDF(options: PDFOptions): JQueryPromise[Any] = js.native
  
  def exportSVG(options: Any): JQueryPromise[Any] = js.native
  
  def findAxisByName(name: String): ChartAxis = js.native
  
  def findPaneByIndex(index: Double): typingsJapgolly.kendoUi.kendo.dataviz.ChartPane = js.native
  
  def findPaneByName(name: String): typingsJapgolly.kendoUi.kendo.dataviz.ChartPane = js.native
  
  def findSeries(callback: js.Function): ChartSeries = js.native
  
  def findSeriesByIndex(index: Double): ChartSeries = js.native
  
  def findSeriesByName(name: String): ChartSeries = js.native
  
  def getAxis(name: String): ChartAxis = js.native
  
  def hideTooltip(): Unit = js.native
  
  def imageDataURL(): String = js.native
  
  @JSName("options")
  var options_Chart: ChartOptions = js.native
  
  def plotArea(): typingsJapgolly.kendoUi.kendo.dataviz.ChartPlotArea = js.native
  
  def redraw(): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsPDF(): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def showTooltip(filter: String): Unit = js.native
  def showTooltip(filter: js.Date): Unit = js.native
  def showTooltip(filter: js.Function): Unit = js.native
  def showTooltip(filter: Double): Unit = js.native
  
  var surface: Surface = js.native
  
  def svg(): String = js.native
  
  def toggleHighlight(show: Boolean, options: Any): Unit = js.native
  
  var wrapper: JQuery = js.native
}
