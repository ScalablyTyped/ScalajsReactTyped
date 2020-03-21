package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSlot extends js.Object {
  // The date, time, and time zone that a period begins.
  var end: js.UndefOr[DateTimeTimeZone] = js.undefined
  // The date, time, and time zone that a period ends.
  var start: js.UndefOr[DateTimeTimeZone] = js.undefined
}

object TimeSlot {
  @scala.inline
  def apply(end: DateTimeTimeZone = null, start: DateTimeTimeZone = null): TimeSlot = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSlot]
  }
}

