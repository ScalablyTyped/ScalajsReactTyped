package typingsJapgolly.kendoUi.kendo.mobile.ui

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListView
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  
  def append(dataItems: Any): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def items(): JQuery = js.native
  
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  
  def prepend(dataItems: Any): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def remove(dataItems: Any): Unit = js.native
  
  def replace(dataItems: Any): Unit = js.native
  
  def setDataItem(item: JQuery, dataItem: Model): Unit = js.native
  
  def setDataSource(dataSource: DataSource): Unit = js.native
  
  var wrapper: JQuery = js.native
}
