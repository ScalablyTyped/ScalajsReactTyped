package typingsJapgolly.rmcCalendar.singleMonthMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcCalendar.AnonWeekComponents
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.CellData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.MonthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleMonth
  extends Component[PropsType, AnonWeekComponents, js.Any] {
  var wrapperDivDOM: HTMLDivElement | Null = js.native
  @JSName("componentWillMount")
  def componentWillMount_MSingleMonth(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): Unit = js.native
  def genWeek(weeksData: js.Array[CellData], index: Double): Unit = js.native
  def setWarpper(dom: HTMLDivElement): Unit = js.native
  def updateWeeks(): Unit = js.native
  def updateWeeks(monthData: MonthData): Unit = js.native
}

