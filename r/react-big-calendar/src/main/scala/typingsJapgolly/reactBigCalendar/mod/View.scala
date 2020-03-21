package typingsJapgolly.reactBigCalendar.mod

import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.agenda_
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.day_
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.month_
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.week_
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.month_
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.week_
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.work_week_
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.day_
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.agenda_
*/
trait View extends js.Object

object View {
  @scala.inline
  def agenda: agenda_ = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: day_ = this.cast("day")
  @scala.inline
  def month: month_ = this.cast("month")
  @scala.inline
  def week: week_ = this.cast("week")
  @scala.inline
  def work_week: work_week_ = this.cast("work_week")
}

