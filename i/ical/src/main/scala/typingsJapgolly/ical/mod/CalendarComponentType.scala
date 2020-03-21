package typingsJapgolly.ical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ical.icalStrings.VEVENT
  - typingsJapgolly.ical.icalStrings.VTODO
  - typingsJapgolly.ical.icalStrings.VJOURNAL
  - typingsJapgolly.ical.icalStrings.VFREEBUSY
  - typingsJapgolly.ical.icalStrings.VTIMEZONE
  - typingsJapgolly.ical.icalStrings.VALARM
*/
trait CalendarComponentType extends js.Object

object CalendarComponentType {
  @scala.inline
  def VALARM: typingsJapgolly.ical.icalStrings.VALARM = this.cast("VALARM")
  @scala.inline
  def VEVENT: typingsJapgolly.ical.icalStrings.VEVENT = this.cast("VEVENT")
  @scala.inline
  def VFREEBUSY: typingsJapgolly.ical.icalStrings.VFREEBUSY = this.cast("VFREEBUSY")
  @scala.inline
  def VJOURNAL: typingsJapgolly.ical.icalStrings.VJOURNAL = this.cast("VJOURNAL")
  @scala.inline
  def VTIMEZONE: typingsJapgolly.ical.icalStrings.VTIMEZONE = this.cast("VTIMEZONE")
  @scala.inline
  def VTODO: typingsJapgolly.ical.icalStrings.VTODO = this.cast("VTODO")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

