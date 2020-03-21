package typingsJapgolly.reactDateRange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactDateRange.reactDateRangeStrings.Today
  - typingsJapgolly.reactDateRange.reactDateRangeStrings.Yesterday
  - typingsJapgolly.reactDateRange.reactDateRangeStrings.`Last 7 Days`
  - typingsJapgolly.reactDateRange.reactDateRangeStrings.`Last 30 Days`
*/
trait DateRangeIndex extends js.Object

object DateRangeIndex {
  @scala.inline
  def `Last 30 Days`: typingsJapgolly.reactDateRange.reactDateRangeStrings.`Last 30 Days` = this.cast("Last 30 Days")
  @scala.inline
  def `Last 7 Days`: typingsJapgolly.reactDateRange.reactDateRangeStrings.`Last 7 Days` = this.cast("Last 7 Days")
  @scala.inline
  def Today: typingsJapgolly.reactDateRange.reactDateRangeStrings.Today = this.cast("Today")
  @scala.inline
  def Yesterday: typingsJapgolly.reactDateRange.reactDateRangeStrings.Yesterday = this.cast("Yesterday")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

