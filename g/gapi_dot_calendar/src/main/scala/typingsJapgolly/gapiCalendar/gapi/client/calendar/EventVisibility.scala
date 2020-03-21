package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Visibility of the event. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.default
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.public
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.`private`
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.confidential
*/
trait EventVisibility extends js.Object

object EventVisibility {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confidential: typingsJapgolly.gapiCalendar.gapiCalendarStrings.confidential = this.cast("confidential")
  @scala.inline
  def default: typingsJapgolly.gapiCalendar.gapiCalendarStrings.default = this.cast("default")
  @scala.inline
  def `private`: typingsJapgolly.gapiCalendar.gapiCalendarStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsJapgolly.gapiCalendar.gapiCalendarStrings.public = this.cast("public")
}

