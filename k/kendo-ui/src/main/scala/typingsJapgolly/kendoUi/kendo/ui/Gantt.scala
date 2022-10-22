package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.GanttDataSource
import typingsJapgolly.kendoUi.kendo.data.GanttDependency
import typingsJapgolly.kendoUi.kendo.data.GanttDependencyDataSource
import typingsJapgolly.kendoUi.kendo.data.GanttTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gantt
  extends StObject
     with Widget {
  
  def clearSelection(): Unit = js.native
  
  def dataItem(row: String): GanttTask = js.native
  def dataItem(row: Element): GanttTask = js.native
  def dataItem(row: JQuery): GanttTask = js.native
  
  var dataSource: DataSource = js.native
  
  def date(): js.Date = js.native
  def date(date: js.Date): js.Date = js.native
  
  var dependencies: GanttDependencyDataSource = js.native
  
  @JSName("options")
  var options_Gantt: GanttOptions = js.native
  
  def range(): Any = js.native
  def range(range: Any): Any = js.native
  
  def refresh(): Unit = js.native
  
  def refreshDependencies(): Unit = js.native
  
  def removeDependency(dependency: String): Unit = js.native
  def removeDependency(dependency: GanttDependency): Unit = js.native
  
  def removeTask(task: String): Unit = js.native
  def removeTask(task: GanttTask): Unit = js.native
  
  def saveAsPDF(): JQueryPromise[Any] = js.native
  
  def select(): JQuery = js.native
  def select(row: String): Unit = js.native
  def select(row: Element): Unit = js.native
  def select(row: JQuery): Unit = js.native
  
  def setDataSource(dataSource: GanttDataSource): Unit = js.native
  
  def setDependenciesDataSource(dataSource: GanttDependencyDataSource): Unit = js.native
  
  def view(): Unit = js.native
  def view(`type`: String): Unit = js.native
  @JSName("view")
  def view_GanttView(): GanttView = js.native
  
  var wrapper: JQuery = js.native
}
