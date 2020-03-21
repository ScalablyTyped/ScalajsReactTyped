package typingsJapgolly.frappeGantt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.frappeGantt.frappeGanttStrings.`Quarter Day`
  - typingsJapgolly.frappeGantt.frappeGanttStrings.`Half Day`
  - typingsJapgolly.frappeGantt.frappeGanttStrings.Day
  - typingsJapgolly.frappeGantt.frappeGanttStrings.Week
  - typingsJapgolly.frappeGantt.frappeGanttStrings.Month
*/
trait viewMode extends js.Object

object viewMode {
  @scala.inline
  def Day: typingsJapgolly.frappeGantt.frappeGanttStrings.Day = this.cast("Day")
  @scala.inline
  def `Half Day`: typingsJapgolly.frappeGantt.frappeGanttStrings.`Half Day` = this.cast("Half Day")
  @scala.inline
  def Month: typingsJapgolly.frappeGantt.frappeGanttStrings.Month = this.cast("Month")
  @scala.inline
  def `Quarter Day`: typingsJapgolly.frappeGantt.frappeGanttStrings.`Quarter Day` = this.cast("Quarter Day")
  @scala.inline
  def Week: typingsJapgolly.frappeGantt.frappeGanttStrings.Week = this.cast("Week")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

