package typingsJapgolly.moment

import typingsJapgolly.moment.momentMod.LongDateFormatKey
import typingsJapgolly.moment.momentMod.RelativeTimeKey
import typingsJapgolly.moment.momentMod._CalendarKey
import typingsJapgolly.moment.momentMod.unitOfTime.All
import typingsJapgolly.moment.momentMod.unitOfTime.Base
import typingsJapgolly.moment.momentMod.unitOfTime.Diff
import typingsJapgolly.moment.momentMod.unitOfTime.DurationConstructor
import typingsJapgolly.moment.momentMod.unitOfTime.MomentConstructor
import typingsJapgolly.moment.momentMod.unitOfTime._date
import typingsJapgolly.moment.momentMod.unitOfTime._isoWeek
import typingsJapgolly.moment.momentMod.unitOfTime._quarter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object momentStrings {
  @js.native
  sealed trait `()` extends js.Object
  
  @js.native
  sealed trait `(]` extends js.Object
  
  @js.native
  sealed trait D
    extends _date
       with All
       with MomentConstructor
  
  @js.native
  sealed trait DDD extends All
  
  @js.native
  sealed trait E extends All
  
  @js.native
  sealed trait GG extends All
  
  @js.native
  sealed trait L extends LongDateFormatKey
  
  @js.native
  sealed trait LL extends LongDateFormatKey
  
  @js.native
  sealed trait LLL extends LongDateFormatKey
  
  @js.native
  sealed trait LLLL extends LongDateFormatKey
  
  @js.native
  sealed trait LT extends LongDateFormatKey
  
  @js.native
  sealed trait LTS extends LongDateFormatKey
  
  @js.native
  sealed trait M
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait MM extends RelativeTimeKey
  
  @js.native
  sealed trait Q
    extends _quarter
       with All
       with Diff
       with DurationConstructor
  
  @js.native
  sealed trait W
    extends _isoWeek
       with All
  
  @js.native
  sealed trait `[)` extends js.Object
  
  @js.native
  sealed trait `[]` extends js.Object
  
  @js.native
  sealed trait d_
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait date
    extends _date
       with All
       with MomentConstructor
  
  @js.native
  sealed trait dates
    extends _date
       with All
       with MomentConstructor
  
  @js.native
  sealed trait day
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait dayOfYear extends All
  
  @js.native
  sealed trait dayOfYears extends All
  
  @js.native
  sealed trait days
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait dd extends RelativeTimeKey
  
  @js.native
  sealed trait e_ extends All
  
  @js.native
  sealed trait gg_ extends All
  
  @js.native
  sealed trait h
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait hh extends RelativeTimeKey
  
  @js.native
  sealed trait hour
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait hours
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait isoWeek
    extends _isoWeek
       with All
  
  @js.native
  sealed trait isoWeekYear extends All
  
  @js.native
  sealed trait isoWeekYears extends All
  
  @js.native
  sealed trait isoWeekday extends All
  
  @js.native
  sealed trait isoWeekdays extends All
  
  @js.native
  sealed trait isoWeeks
    extends _isoWeek
       with All
  
  @js.native
  sealed trait l_ extends LongDateFormatKey
  
  @js.native
  sealed trait lastDay extends _CalendarKey
  
  @js.native
  sealed trait lastWeek extends _CalendarKey
  
  @js.native
  sealed trait ll_ extends LongDateFormatKey
  
  @js.native
  sealed trait lll_ extends LongDateFormatKey
  
  @js.native
  sealed trait llll_ extends LongDateFormatKey
  
  @js.native
  sealed trait lt_ extends LongDateFormatKey
  
  @js.native
  sealed trait lts_ extends LongDateFormatKey
  
  @js.native
  sealed trait m_
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait millisecond
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait milliseconds
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait minute
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait minutes
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait mm_ extends RelativeTimeKey
  
  @js.native
  sealed trait month
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait months
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait ms
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait nextDay extends _CalendarKey
  
  @js.native
  sealed trait nextWeek extends _CalendarKey
  
  @js.native
  sealed trait quarter
    extends _quarter
       with All
       with Diff
       with DurationConstructor
  
  @js.native
  sealed trait quarters
    extends _quarter
       with All
       with Diff
       with DurationConstructor
  
  @js.native
  sealed trait s
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait sameDay extends _CalendarKey
  
  @js.native
  sealed trait sameElse extends _CalendarKey
  
  @js.native
  sealed trait second
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait seconds
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait ss extends RelativeTimeKey
  
  @js.native
  sealed trait w_
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait week
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait weekYear extends All
  
  @js.native
  sealed trait weekYears extends All
  
  @js.native
  sealed trait weekday extends All
  
  @js.native
  sealed trait weekdays extends All
  
  @js.native
  sealed trait weeks
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait y
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
       with RelativeTimeKey
  
  @js.native
  sealed trait year
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait years
    extends Base
       with All
       with Diff
       with DurationConstructor
       with MomentConstructor
  
  @js.native
  sealed trait yy extends RelativeTimeKey
  
  @scala.inline
  def `()`: `()` = "()".asInstanceOf[`()`]
  @scala.inline
  def `(]`: `(]` = "(]".asInstanceOf[`(]`]
  @scala.inline
  def D: D = "D".asInstanceOf[D]
  @scala.inline
  def DDD: DDD = "DDD".asInstanceOf[DDD]
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  @scala.inline
  def GG: GG = "GG".asInstanceOf[GG]
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def LL: LL = "LL".asInstanceOf[LL]
  @scala.inline
  def LLL: LLL = "LLL".asInstanceOf[LLL]
  @scala.inline
  def LLLL: LLLL = "LLLL".asInstanceOf[LLLL]
  @scala.inline
  def LT: LT = "LT".asInstanceOf[LT]
  @scala.inline
  def LTS: LTS = "LTS".asInstanceOf[LTS]
  @scala.inline
  def M: M = "M".asInstanceOf[M]
  @scala.inline
  def MM: MM = "MM".asInstanceOf[MM]
  @scala.inline
  def Q: Q = "Q".asInstanceOf[Q]
  @scala.inline
  def W: W = "W".asInstanceOf[W]
  @scala.inline
  def `[)`: `[)` = "[)".asInstanceOf[`[)`]
  @scala.inline
  def `[]`: `[]` = "[]".asInstanceOf[`[]`]
  @scala.inline
  def d_ : d_ = "d".asInstanceOf[d_]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def dates: dates = "dates".asInstanceOf[dates]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def dayOfYear: dayOfYear = "dayOfYear".asInstanceOf[dayOfYear]
  @scala.inline
  def dayOfYears: dayOfYears = "dayOfYears".asInstanceOf[dayOfYears]
  @scala.inline
  def days: days = "days".asInstanceOf[days]
  @scala.inline
  def dd: dd = "dd".asInstanceOf[dd]
  @scala.inline
  def e_ : e_ = "e".asInstanceOf[e_]
  @scala.inline
  def gg_ : gg_ = "gg".asInstanceOf[gg_]
  @scala.inline
  def h: h = "h".asInstanceOf[h]
  @scala.inline
  def hh: hh = "hh".asInstanceOf[hh]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def hours: hours = "hours".asInstanceOf[hours]
  @scala.inline
  def isoWeek: isoWeek = "isoWeek".asInstanceOf[isoWeek]
  @scala.inline
  def isoWeekYear: isoWeekYear = "isoWeekYear".asInstanceOf[isoWeekYear]
  @scala.inline
  def isoWeekYears: isoWeekYears = "isoWeekYears".asInstanceOf[isoWeekYears]
  @scala.inline
  def isoWeekday: isoWeekday = "isoWeekday".asInstanceOf[isoWeekday]
  @scala.inline
  def isoWeekdays: isoWeekdays = "isoWeekdays".asInstanceOf[isoWeekdays]
  @scala.inline
  def isoWeeks: isoWeeks = "isoWeeks".asInstanceOf[isoWeeks]
  @scala.inline
  def l_ : l_ = "l".asInstanceOf[l_]
  @scala.inline
  def lastDay: lastDay = "lastDay".asInstanceOf[lastDay]
  @scala.inline
  def lastWeek: lastWeek = "lastWeek".asInstanceOf[lastWeek]
  @scala.inline
  def ll_ : ll_ = "ll".asInstanceOf[ll_]
  @scala.inline
  def lll_ : lll_ = "lll".asInstanceOf[lll_]
  @scala.inline
  def llll_ : llll_ = "llll".asInstanceOf[llll_]
  @scala.inline
  def lt_ : lt_ = "lt".asInstanceOf[lt_]
  @scala.inline
  def lts_ : lts_ = "lts".asInstanceOf[lts_]
  @scala.inline
  def m_ : m_ = "m".asInstanceOf[m_]
  @scala.inline
  def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  @scala.inline
  def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def minutes: minutes = "minutes".asInstanceOf[minutes]
  @scala.inline
  def mm_ : mm_ = "mm".asInstanceOf[mm_]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def months: months = "months".asInstanceOf[months]
  @scala.inline
  def ms: ms = "ms".asInstanceOf[ms]
  @scala.inline
  def nextDay: nextDay = "nextDay".asInstanceOf[nextDay]
  @scala.inline
  def nextWeek: nextWeek = "nextWeek".asInstanceOf[nextWeek]
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  @scala.inline
  def quarters: quarters = "quarters".asInstanceOf[quarters]
  @scala.inline
  def s: s = "s".asInstanceOf[s]
  @scala.inline
  def sameDay: sameDay = "sameDay".asInstanceOf[sameDay]
  @scala.inline
  def sameElse: sameElse = "sameElse".asInstanceOf[sameElse]
  @scala.inline
  def second: second = "second".asInstanceOf[second]
  @scala.inline
  def seconds: seconds = "seconds".asInstanceOf[seconds]
  @scala.inline
  def ss: ss = "ss".asInstanceOf[ss]
  @scala.inline
  def w_ : w_ = "w".asInstanceOf[w_]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def weekYear: weekYear = "weekYear".asInstanceOf[weekYear]
  @scala.inline
  def weekYears: weekYears = "weekYears".asInstanceOf[weekYears]
  @scala.inline
  def weekday: weekday = "weekday".asInstanceOf[weekday]
  @scala.inline
  def weekdays: weekdays = "weekdays".asInstanceOf[weekdays]
  @scala.inline
  def weeks: weeks = "weeks".asInstanceOf[weeks]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def years: years = "years".asInstanceOf[years]
  @scala.inline
  def yy: yy = "yy".asInstanceOf[yy]
}

