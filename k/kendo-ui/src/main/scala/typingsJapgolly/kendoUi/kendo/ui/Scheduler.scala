package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.SchedulerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduler
  extends StObject
     with Widget {
  
  def addEvent(data: Any): Unit = js.native
  
  var calendar: Calendar = js.native
  
  def cancelEvent(): Unit = js.native
  
  def data(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  def date(): Unit = js.native
  def date(value: js.Date): Unit = js.native
  @JSName("date")
  def date_Date(): js.Date = js.native
  
  def editEvent(event: String): Unit = js.native
  def editEvent(event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  
  def items(): Any = js.native
  
  def occurrenceByUid(uid: String): typingsJapgolly.kendoUi.kendo.data.SchedulerEvent = js.native
  
  def occurrencesInRange(start: js.Date, end: js.Date): Any = js.native
  
  @JSName("options")
  var options_Scheduler: SchedulerOptions = js.native
  
  def refresh(): Unit = js.native
  
  def removeEvent(event: String): Unit = js.native
  def removeEvent(event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  
  var resources: Any = js.native
  
  def resourcesBySlot(slot: Any): Any = js.native
  
  def saveAsPDF(): JQueryPromise[Any] = js.native
  
  def saveEvent(): Unit = js.native
  
  def select(): Unit = js.native
  def select(options: js.Array[SchedulerEvent]): Unit = js.native
  def select(options: SchedulerSelectOptions): Unit = js.native
  
  def setDataSource(dataSource: SchedulerDataSource): Unit = js.native
  
  def slotByElement(element: Element): Any = js.native
  def slotByElement(element: JQuery): Any = js.native
  
  def slotByPosition(xPosition: Double, yPosition: Double): Any = js.native
  
  def view(): Unit = js.native
  def view(`type`: String): Unit = js.native
  
  def viewName(): String = js.native
  
  @JSName("view")
  def view_SchedulerView(): SchedulerView = js.native
  
  var wrapper: JQuery = js.native
}
