package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Whether the event blocks time on the calendar. Optional. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.opaque
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.transparent
*/
trait EventTransparency extends js.Object

object EventTransparency {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def opaque: typingsJapgolly.gapiCalendar.gapiCalendarStrings.opaque = this.cast("opaque")
  @scala.inline
  def transparent: typingsJapgolly.gapiCalendar.gapiCalendarStrings.transparent = this.cast("transparent")
}

