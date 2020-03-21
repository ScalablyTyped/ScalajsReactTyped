package typingsJapgolly.baseui.datepickerMod

import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.baseui.AnonDate
import typingsJapgolly.baseui.AnonDateDate
import typingsJapgolly.baseui.AnonEventEvent
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "Calendar")
@js.native
class Calendar ()
  extends Component[CalendarProps, CalendarState, js.Any] {
  def blurCalendar(): Unit = js.native
  def changeMonth(hasDate: AnonDateDate): Unit = js.native
  def changeYear(hasDate: AnonDateDate): Unit = js.native
  def focusCalendar(): Unit = js.native
  def getDateInView(): js.Date = js.native
  def getSingleDate(value: js.Array[Date]): js.Date | Null = js.native
  def getSingleDate(value: Date): js.Date | Null = js.native
  def handleArrowKey(key: String): Unit = js.native
  def handleDateChange(data: AnonDate): Unit = js.native
  def handleMonthChange(date: js.Date): Unit = js.native
  def handleTabbing(event: KeyboardEvent): Unit = js.native
  def handleTimeChange(time: js.Date, index: Double): Unit = js.native
  def handleYearChange(date: js.Date): Unit = js.native
  def onDayMouseLeave(data: AnonEventEvent): Unit = js.native
  def onDayMouseOver(data: AnonEventEvent): Unit = js.native
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  def renderCalendarHeader(date: js.Date, order: Double): Node = js.native
  def renderMonths(): js.Array[Node] = js.native
  def renderQuickSelect(): Node = js.native
  def renderTimeSelect(value: js.Date, onChange: js.Function1[/* args */ js.Any, _]): Node = js.native
  def setHighlightedDate(date: js.Date): Unit = js.native
}

