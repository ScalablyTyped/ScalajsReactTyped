package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The method used by this reminder. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.email
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.sms
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.popup
*/
trait ReminderMethod extends js.Object

object ReminderMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsJapgolly.gapiCalendar.gapiCalendarStrings.email = this.cast("email")
  @scala.inline
  def popup: typingsJapgolly.gapiCalendar.gapiCalendarStrings.popup = this.cast("popup")
  @scala.inline
  def sms: typingsJapgolly.gapiCalendar.gapiCalendarStrings.sms = this.cast("sms")
}

