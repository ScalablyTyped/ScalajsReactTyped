package typingsJapgolly.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.PREV
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.NEXT
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.TODAY
  - typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.DATE
*/
trait NavigateAction extends js.Object

object NavigateAction {
  @scala.inline
  def DATE: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.DATE = this.cast("DATE")
  @scala.inline
  def NEXT: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.NEXT = this.cast("NEXT")
  @scala.inline
  def PREV: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.PREV = this.cast("PREV")
  @scala.inline
  def TODAY: typingsJapgolly.reactBigCalendar.reactBigCalendarStrings.TODAY = this.cast("TODAY")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

