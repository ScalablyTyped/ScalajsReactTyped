package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.agenda_
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.day_
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.month_
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.week_
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.work_week_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Views extends js.Object {
  var AGENDA: agenda_
  var DAY: day_
  var MONTH: month_
  var WEEK: week_
  var WORK_WEEK: work_week_
}

object Views {
  @scala.inline
  def apply(AGENDA: agenda_, DAY: day_, MONTH: month_, WEEK: week_, WORK_WEEK: work_week_): Views = {
    val __obj = js.Dynamic.literal(AGENDA = AGENDA.asInstanceOf[js.Any], DAY = DAY.asInstanceOf[js.Any], MONTH = MONTH.asInstanceOf[js.Any], WEEK = WEEK.asInstanceOf[js.Any], WORK_WEEK = WORK_WEEK.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Views]
  }
}

