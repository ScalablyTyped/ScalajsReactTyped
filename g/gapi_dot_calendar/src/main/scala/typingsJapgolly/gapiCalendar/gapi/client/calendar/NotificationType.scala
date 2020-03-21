package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of notification. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventCreation
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventChange
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventCancellation
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventResponse
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.agenda
*/
trait NotificationType extends js.Object

object NotificationType {
  @scala.inline
  def agenda: typingsJapgolly.gapiCalendar.gapiCalendarStrings.agenda = this.cast("agenda")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eventCancellation: typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventCancellation = this.cast("eventCancellation")
  @scala.inline
  def eventChange: typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventChange = this.cast("eventChange")
  @scala.inline
  def eventCreation: typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventCreation = this.cast("eventCreation")
  @scala.inline
  def eventResponse: typingsJapgolly.gapiCalendar.gapiCalendarStrings.eventResponse = this.cast("eventResponse")
}

