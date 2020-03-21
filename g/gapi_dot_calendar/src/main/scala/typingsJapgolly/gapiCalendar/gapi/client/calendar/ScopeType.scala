package typingsJapgolly.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The type of the scope. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.default
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.user
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.group
  - typingsJapgolly.gapiCalendar.gapiCalendarStrings.domain
*/
trait ScopeType extends js.Object

object ScopeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typingsJapgolly.gapiCalendar.gapiCalendarStrings.default = this.cast("default")
  @scala.inline
  def domain: typingsJapgolly.gapiCalendar.gapiCalendarStrings.domain = this.cast("domain")
  @scala.inline
  def group: typingsJapgolly.gapiCalendar.gapiCalendarStrings.group = this.cast("group")
  @scala.inline
  def user: typingsJapgolly.gapiCalendar.gapiCalendarStrings.user = this.cast("user")
}

