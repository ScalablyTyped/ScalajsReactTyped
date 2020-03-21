package typingsJapgolly.reactBigCalendar.mod

import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.DATE
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.NEXT
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.PREV
import typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.TODAY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigate extends js.Object {
  var DATE: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.DATE
  var NEXT: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.NEXT
  var PREVIOUS: PREV
  var TODAY: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.TODAY
}

object Navigate {
  @scala.inline
  def apply(DATE: DATE, NEXT: NEXT, PREVIOUS: PREV, TODAY: TODAY): Navigate = {
    val __obj = js.Dynamic.literal(DATE = DATE.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREVIOUS = PREVIOUS.asInstanceOf[js.Any], TODAY = TODAY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigate]
  }
}

