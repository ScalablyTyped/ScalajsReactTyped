package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.PivotDataSourceV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridV2
  extends StObject
     with Widget {
  
  def cellInfo(columnIndex: Double, rowIndex: Double): Any = js.native
  
  def cellInfoByElement(cell: String): Any = js.native
  def cellInfoByElement(cell: Element): Any = js.native
  def cellInfoByElement(cell: JQuery): Any = js.native
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_PivotGridV2: PivotGridV2Options = js.native
  
  def refresh(): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[Any] = js.native
  
  def setDataSource(dataSource: PivotDataSourceV2): Unit = js.native
  
  var wrapper: JQuery = js.native
}
