package typingsJapgolly.reactDashBigDashCalendar

import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.click
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.doubleClick
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: select | click | doubleClick
  var end: stringOrDate
  var slots: js.Array[js.Date | String]
  var start: stringOrDate
}

object Anon_Action {
  @scala.inline
  def apply(
    action: select | click | doubleClick,
    end: stringOrDate,
    slots: js.Array[js.Date | String],
    start: stringOrDate
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Action]
  }
}

