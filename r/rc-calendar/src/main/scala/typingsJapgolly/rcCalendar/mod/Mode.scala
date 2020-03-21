package typingsJapgolly.rcCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcCalendar.rcCalendarStrings.time
  - typingsJapgolly.rcCalendar.rcCalendarStrings.date
  - typingsJapgolly.rcCalendar.rcCalendarStrings.month
  - typingsJapgolly.rcCalendar.rcCalendarStrings.year
  - typingsJapgolly.rcCalendar.rcCalendarStrings.decade
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.rcCalendar.rcCalendarStrings.date = this.cast("date")
  @scala.inline
  def decade: typingsJapgolly.rcCalendar.rcCalendarStrings.decade = this.cast("decade")
  @scala.inline
  def month: typingsJapgolly.rcCalendar.rcCalendarStrings.month = this.cast("month")
  @scala.inline
  def time: typingsJapgolly.rcCalendar.rcCalendarStrings.time = this.cast("time")
  @scala.inline
  def year: typingsJapgolly.rcCalendar.rcCalendarStrings.year = this.cast("year")
}

