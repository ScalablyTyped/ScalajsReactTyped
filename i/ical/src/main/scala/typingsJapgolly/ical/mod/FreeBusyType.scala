package typingsJapgolly.ical.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ical.icalStrings.FREE
  - typingsJapgolly.ical.icalStrings.BUSY
*/
trait FreeBusyType extends js.Object

object FreeBusyType {
  @scala.inline
  def BUSY: typingsJapgolly.ical.icalStrings.BUSY = this.cast("BUSY")
  @scala.inline
  def FREE: typingsJapgolly.ical.icalStrings.FREE = this.cast("FREE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

