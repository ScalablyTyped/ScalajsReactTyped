package typingsJapgolly.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "LocalDateTime")
@js.native
/* private */ open class LocalDateTime () extends ChronoLocalDateTime {
  
  def atOffset(offset: ZoneOffset): OffsetDateTime = js.native
  
  def atZone(zone: ZoneId): ZonedDateTime = js.native
  
  def compareTo(other: LocalDateTime): Double = js.native
  
  def dayOfMonth(): Double = js.native
  
  def dayOfWeek(): DayOfWeek = js.native
  
  def dayOfYear(): Double = js.native
  
  def format(formatter: DateTimeFormatter): String = js.native
  
  def hour(): Double = js.native
  
  def isAfter(other: LocalDateTime): Boolean = js.native
  
  def isBefore(other: LocalDateTime): Boolean = js.native
  
  def isEqual(other: LocalDateTime): Boolean = js.native
  
  def minusDays(days: Double): LocalDateTime = js.native
  
  def minusHours(hours: Double): LocalDateTime = js.native
  
  def minusMinutes(minutes: Double): LocalDateTime = js.native
  
  def minusMonths(months: Double): LocalDateTime = js.native
  
  def minusNanos(nanos: Double): LocalDateTime = js.native
  
  def minusSeconds(seconds: Double): LocalDateTime = js.native
  
  def minusWeeks(weeks: Double): LocalDateTime = js.native
  
  def minusYears(years: Double): LocalDateTime = js.native
  
  def minute(): Double = js.native
  
  def month(): Month = js.native
  
  def monthValue(): Double = js.native
  
  def nano(): Double = js.native
  
  def plusDays(days: Double): LocalDateTime = js.native
  
  def plusHours(hours: Double): LocalDateTime = js.native
  
  def plusMinutes(minutes: Double): LocalDateTime = js.native
  
  def plusMonths(months: Double): LocalDateTime = js.native
  
  def plusNanos(nanos: Double): LocalDateTime = js.native
  
  def plusSeconds(seconds: Double): LocalDateTime = js.native
  
  def plusWeeks(weeks: Double): LocalDateTime = js.native
  
  def plusYears(years: Double): LocalDateTime = js.native
  
  def second(): Double = js.native
  
  def toJSON(): String = js.native
  
  def toLocalDate(): LocalDate = js.native
  
  def toLocalTime(): LocalTime = js.native
  
  def truncatedTo(unit: TemporalUnit): LocalDateTime = js.native
  
  def withDayOfMonth(dayOfMonth: Double): LocalDateTime = js.native
  
  def withDayOfYear(dayOfYear: Double): LocalDateTime = js.native
  
  def withHour(hour: Double): LocalDateTime = js.native
  
  def withMinute(minute: Double): LocalDateTime = js.native
  
  def withMonth(month: Double): LocalDateTime = js.native
  def withMonth(month: Month): LocalDateTime = js.native
  
  def withNano(nanoOfSecond: Double): LocalDateTime = js.native
  
  def withSecond(second: Double): LocalDateTime = js.native
  
  def withYear(year: Double): LocalDateTime = js.native
  
  def year(): Double = js.native
}
/* static members */
object LocalDateTime {
  
  @JSImport("@js-joda/core", "LocalDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "LocalDateTime.FROM")
  @js.native
  def FROM: TemporalQuery[LocalDateTime] = js.native
  inline def FROM_=(x: TemporalQuery[LocalDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalDateTime.MAX")
  @js.native
  def MAX: LocalDateTime = js.native
  inline def MAX_=(x: LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "LocalDateTime.MIN")
  @js.native
  def MIN: LocalDateTime = js.native
  inline def MIN_=(x: LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: TemporalAccessor): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[LocalDateTime]
  
  inline def now(): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[LocalDateTime]
  inline def now(clockOrZone: Clock): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalDateTime]
  inline def now(clockOrZone: ZoneId): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[LocalDateTime]
  
  inline def of(date: LocalDate, time: LocalTime): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Unit, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Unit, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Double, minute: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Double, minute: Double, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Double, minute: Unit, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Unit, minute: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Unit, minute: Double, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(year: Double, month: Month, dayOfMonth: Double, hour: Unit, minute: Unit, second: Double): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def of(
    year: Double,
    month: Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  
  inline def ofEpochSecond(epochSecond: Double, nanoOfSecond: Double, offset: ZoneOffset): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  inline def ofEpochSecond(epochSecond: Double, offset: ZoneOffset): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  
  inline def ofInstant(instant: Instant): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[LocalDateTime]
  inline def ofInstant(instant: Instant, zoneId: ZoneId): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
  
  inline def parse(text: String): LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[LocalDateTime]
  inline def parse(text: String, formatter: DateTimeFormatter): LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[LocalDateTime]
}
