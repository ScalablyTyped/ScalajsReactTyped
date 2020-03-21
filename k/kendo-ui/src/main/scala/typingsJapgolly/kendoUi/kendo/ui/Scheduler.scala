package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.SchedulerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Scheduler")
@js.native
class Scheduler protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SchedulerOptions) = this()
  var calendar: Calendar = js.native
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Scheduler: SchedulerOptions = js.native
  var resources: js.Any = js.native
  var wrapper: JQuery = js.native
  def addEvent(data: js.Any): Unit = js.native
  def cancelEvent(): Unit = js.native
  def data(): Unit = js.native
  def date(): Unit = js.native
  def date(value: js.Date): Unit = js.native
  @JSName("date")
  def date_Date(): js.Date = js.native
  def editEvent(event: String): Unit = js.native
  def editEvent(event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  def items(): js.Any = js.native
  def occurrenceByUid(uid: String): typingsJapgolly.kendoUi.kendo.data.SchedulerEvent = js.native
  def occurrencesInRange(start: js.Date, end: js.Date): js.Any = js.native
  def refresh(): Unit = js.native
  def removeEvent(event: String): Unit = js.native
  def removeEvent(event: typingsJapgolly.kendoUi.kendo.data.SchedulerEvent): Unit = js.native
  def resourcesBySlot(slot: js.Any): js.Any = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def saveEvent(): Unit = js.native
  def select(): Unit = js.native
  def select(options: js.Array[SchedulerEvent]): Unit = js.native
  def select(options: SchedulerSelectOptions): Unit = js.native
  def setDataSource(dataSource: SchedulerDataSource): Unit = js.native
  def slotByElement(element: JQuery): js.Any = js.native
  def slotByElement(element: typingsJapgolly.std.Element): js.Any = js.native
  def slotByPosition(xPosition: Double, yPosition: Double): js.Any = js.native
  def view(): Unit = js.native
  def view(`type`: String): Unit = js.native
  def viewName(): String = js.native
  @JSName("view")
  def view_SchedulerView(): SchedulerView = js.native
}

/* static members */
@JSGlobal("kendo.ui.Scheduler")
@js.native
object Scheduler extends js.Object {
  var fn: Scheduler = js.native
  def extend(proto: js.Object): Scheduler = js.native
}

