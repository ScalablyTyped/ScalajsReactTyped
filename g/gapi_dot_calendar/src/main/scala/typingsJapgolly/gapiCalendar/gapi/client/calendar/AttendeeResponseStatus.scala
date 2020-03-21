package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The attendee's response status. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.needsAction
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.declined
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.tentative
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.accepted
*/
trait AttendeeResponseStatus extends js.Object

object AttendeeResponseStatus {
  @scala.inline
  def accepted: typingsJapgolly.gapiCalendar.gapiCalendarStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typingsJapgolly.gapiCalendar.gapiCalendarStrings.declined = this.cast("declined")
  @scala.inline
  def needsAction: typingsJapgolly.gapiCalendar.gapiCalendarStrings.needsAction = this.cast("needsAction")
  @scala.inline
  def tentative: typingsJapgolly.gapiCalendar.gapiCalendarStrings.tentative = this.cast("tentative")
}

