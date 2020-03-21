package typingsJapgolly.plottable

import typingsJapgolly.plottable.plottableStrings.day
import typingsJapgolly.plottable.plottableStrings.hour
import typingsJapgolly.plottable.plottableStrings.minute
import typingsJapgolly.plottable.plottableStrings.month
import typingsJapgolly.plottable.plottableStrings.second
import typingsJapgolly.plottable.plottableStrings.week
import typingsJapgolly.plottable.plottableStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDay extends js.Object {
  var day: typingsJapgolly.plottable.plottableStrings.day
  var hour: typingsJapgolly.plottable.plottableStrings.hour
  var minute: typingsJapgolly.plottable.plottableStrings.minute
  var month: typingsJapgolly.plottable.plottableStrings.month
  var second: typingsJapgolly.plottable.plottableStrings.second
  var week: typingsJapgolly.plottable.plottableStrings.week
  var year: typingsJapgolly.plottable.plottableStrings.year
}

object AnonDay {
  @scala.inline
  def apply(day: day, hour: hour, minute: minute, month: month, second: second, week: week, year: year): AnonDay = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDay]
  }
}

