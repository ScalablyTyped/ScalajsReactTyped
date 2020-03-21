package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The user's access role for this calendar. Read-only. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.none
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.freeBusyReader
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.reader
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.writer
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.owner
*/
trait AccessRole extends js.Object

object AccessRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def freeBusyReader: typingsJapgolly.gapiCalendar.gapiCalendarStrings.freeBusyReader = this.cast("freeBusyReader")
  @scala.inline
  def none: typingsJapgolly.gapiCalendar.gapiCalendarStrings.none = this.cast("none")
  @scala.inline
  def owner: typingsJapgolly.gapiCalendar.gapiCalendarStrings.owner = this.cast("owner")
  @scala.inline
  def reader: typingsJapgolly.gapiCalendar.gapiCalendarStrings.reader = this.cast("reader")
  @scala.inline
  def writer: typingsJapgolly.gapiCalendar.gapiCalendarStrings.writer = this.cast("writer")
}

