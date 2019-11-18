package typingsJapgolly.antd.esCalendarMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.antdStrings.changePanel
import typingsJapgolly.antd.antdStrings.select
import typingsJapgolly.moment.momentMod.Moment
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calendar
  extends Component[CalendarProps, CalendarState, js.Any] {
  var prefixCls: js.UndefOr[String] = js.native
  def dateCellRender(value: Moment): Element = js.native
  def getDateRange(validRange: js.Tuple2[Moment, Moment]): js.Function1[/* current */ Moment, Boolean] = js.native
  def getDateRange(validRange: js.Tuple2[Moment, Moment], disabledDate: js.Function1[/* current */ Moment, Boolean]): js.Function1[/* current */ Moment, Boolean] = js.native
  def getDefaultLocale(): js.Any = js.native
  def monthCellRender(value: Moment): Element = js.native
  def onHeaderTypeChange(mode: CalendarMode): Unit = js.native
  def onHeaderValueChange(value: Moment): Unit = js.native
  def onPanelChange(value: Moment): Unit = js.native
  def onPanelChange(value: Moment, mode: CalendarMode): Unit = js.native
  def onSelect(value: Moment): Unit = js.native
  def renderCalendar(locale: js.Any, localeCode: String): Element = js.native
  @JSName("setValue")
  def setValue_changePanel(value: Moment, way: changePanel): Unit = js.native
  @JSName("setValue")
  def setValue_select(value: Moment, way: select): Unit = js.native
}

