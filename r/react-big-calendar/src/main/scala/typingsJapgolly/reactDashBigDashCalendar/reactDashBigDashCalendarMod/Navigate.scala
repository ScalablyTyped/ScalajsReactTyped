package typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.PREV
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.DATE
  var NEXT: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigate]
  }
}

