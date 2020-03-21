package typingsJapgolly.rmcCalendar.timePickerMod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePicker
  extends Component[PropsType, StateType, js.Any] {
  def getMaxTime(): js.UndefOr[js.Date] = js.native
  def getMaxTime(date: js.Date): js.UndefOr[js.Date] = js.native
  def getMinTime(): js.UndefOr[js.Date] = js.native
  def getMinTime(date: js.Date): js.UndefOr[js.Date] = js.native
  def onDateChange(date: js.Date): Unit = js.native
}

