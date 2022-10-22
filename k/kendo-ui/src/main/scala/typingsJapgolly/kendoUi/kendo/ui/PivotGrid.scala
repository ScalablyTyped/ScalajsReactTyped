package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.PivotDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGrid
  extends StObject
     with Widget {
  
  def cellInfo(columnIndex: Double, rowIndex: Double): Any = js.native
  
  def cellInfoByElement(cell: String): Any = js.native
  def cellInfoByElement(cell: Element): Any = js.native
  def cellInfoByElement(cell: JQuery): Any = js.native
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_PivotGrid: PivotGridOptions = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsExcel(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[Any] = js.native
  
  def setDataSource(dataSource: PivotDataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
