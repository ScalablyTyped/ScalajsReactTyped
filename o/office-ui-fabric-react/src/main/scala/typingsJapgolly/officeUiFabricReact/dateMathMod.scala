package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek
import typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear
import typingsJapgolly.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/dateMath/DateMath", JSImport.Namespace)
@js.native
object dateMathMod extends js.Object {
  def addDays(date: js.Date, days: Double): js.Date = js.native
  def addMonths(date: js.Date, months: Double): js.Date = js.native
  def addWeeks(date: js.Date, weeks: Double): js.Date = js.native
  def addYears(date: js.Date, years: Double): js.Date = js.native
  def compareDatePart(date1: js.Date, date2: js.Date): Number = js.native
  def compareDates(date1: js.Date, date2: js.Date): Boolean = js.native
  def getDateRangeArray(date: js.Date, dateRangeType: DateRangeType, firstDayOfWeek: DayOfWeek): js.Array[js.Date] = js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek]
  ): js.Array[js.Date] = js.native
  def getDateRangeArray(
    date: js.Date,
    dateRangeType: DateRangeType,
    firstDayOfWeek: DayOfWeek,
    workWeekDays: js.Array[DayOfWeek],
    daysToSelectInDayView: Double
  ): js.Array[js.Date] = js.native
  def getMonthEnd(date: js.Date): js.Date = js.native
  def getMonthStart(date: js.Date): js.Date = js.native
  def getStartDateOfWeek(date: js.Date, firstDayOfWeek: DayOfWeek): js.Date = js.native
  def getWeekNumber(date: js.Date, firstDayOfWeek: DayOfWeek, firstWeekOfYear: FirstWeekOfYear): Double = js.native
  def getWeekNumbersInMonth(
    weeksInMonth: Double,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date
  ): js.Array[Double] = js.native
  def getYearEnd(date: js.Date): js.Date = js.native
  def getYearStart(date: js.Date): js.Date = js.native
  def isInDateRangeArray(date: js.Date, dateRange: js.Array[js.Date]): Boolean = js.native
  def setMonth(date: js.Date, month: Double): js.Date = js.native
}

