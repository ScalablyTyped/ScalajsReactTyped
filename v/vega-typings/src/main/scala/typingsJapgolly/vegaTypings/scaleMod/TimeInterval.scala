package typingsJapgolly.vegaTypings.scaleMod

import typingsJapgolly.vegaTypings.axisMod._TickCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.millisecond
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.second
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.minute
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.hour
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.day
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.week
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.month
  - typingsJapgolly.vegaTypings.vegaTypingsStrings.year
*/
trait TimeInterval extends _TickCount

object TimeInterval {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsJapgolly.vegaTypings.vegaTypingsStrings.day = this.cast("day")
  @scala.inline
  def hour: typingsJapgolly.vegaTypings.vegaTypingsStrings.hour = this.cast("hour")
  @scala.inline
  def millisecond: typingsJapgolly.vegaTypings.vegaTypingsStrings.millisecond = this.cast("millisecond")
  @scala.inline
  def minute: typingsJapgolly.vegaTypings.vegaTypingsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typingsJapgolly.vegaTypings.vegaTypingsStrings.month = this.cast("month")
  @scala.inline
  def second: typingsJapgolly.vegaTypings.vegaTypingsStrings.second = this.cast("second")
  @scala.inline
  def week: typingsJapgolly.vegaTypings.vegaTypingsStrings.week = this.cast("week")
  @scala.inline
  def year: typingsJapgolly.vegaTypings.vegaTypingsStrings.year = this.cast("year")
}

