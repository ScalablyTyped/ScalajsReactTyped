package typingsJapgolly.mockjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Date
// see https://github.com/nuysoft/Mock/wiki/Date
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mockjs.mockjsStrings.year
  - typingsJapgolly.mockjs.mockjsStrings.month
  - typingsJapgolly.mockjs.mockjsStrings.week
  - typingsJapgolly.mockjs.mockjsStrings.day
  - typingsJapgolly.mockjs.mockjsStrings.hour
  - typingsJapgolly.mockjs.mockjsStrings.minute
  - typingsJapgolly.mockjs.mockjsStrings.second
*/
trait RandomDateUtilString extends js.Object

object RandomDateUtilString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typingsJapgolly.mockjs.mockjsStrings.day = this.cast("day")
  @scala.inline
  def hour: typingsJapgolly.mockjs.mockjsStrings.hour = this.cast("hour")
  @scala.inline
  def minute: typingsJapgolly.mockjs.mockjsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typingsJapgolly.mockjs.mockjsStrings.month = this.cast("month")
  @scala.inline
  def second: typingsJapgolly.mockjs.mockjsStrings.second = this.cast("second")
  @scala.inline
  def week: typingsJapgolly.mockjs.mockjsStrings.week = this.cast("week")
  @scala.inline
  def year: typingsJapgolly.mockjs.mockjsStrings.year = this.cast("year")
}

