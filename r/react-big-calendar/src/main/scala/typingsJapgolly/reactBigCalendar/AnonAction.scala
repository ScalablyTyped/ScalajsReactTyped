package typingsJapgolly.reactBigCalendar

import typingsJapgolly.reactBigCalendar.mod.stringOrDate
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.click
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.doubleClick
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: select | click | doubleClick
  var end: stringOrDate
  var slots: js.Array[js.Date | String]
  var start: stringOrDate
}

object AnonAction {
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[js.Date | String],
    start: stringOrDate
  ): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

