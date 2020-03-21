package typingsJapgolly.momentRange.mod

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.moment.mod.unitOfTime.Diff
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentRangeStaticMethods extends js.Object {
  // @deprecated 4.0.0
  def parseZoneRange(isoTimeInterval: String): DateRange = js.native
  def range(): DateRange = js.native
  def range(range: String): DateRange = js.native
  def range(range: js.Tuple2[Date | Moment, Date | Moment]): DateRange = js.native
  def range(start: Moment, end: Moment): DateRange = js.native
  def range(start: Moment, end: Date): DateRange = js.native
  def range(start: Date, end: Moment): DateRange = js.native
  def range(start: Date, end: Date): DateRange = js.native
  def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
  def rangeFromInterval(interval: Diff): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: Date): DateRange = js.native
}

