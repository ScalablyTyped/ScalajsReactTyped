package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.LocalDateTime")
@js.native
/* private */ open class LocalDateTime ()
  extends typingsJapgolly.jsJodaCore.mod.LocalDateTime
/* static members */
object LocalDateTime {
  
  @JSGlobal("JSJoda.LocalDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.LocalDateTime.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.LocalDateTime] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.LocalDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDateTime.MAX")
  @js.native
  def MAX: typingsJapgolly.jsJodaCore.mod.LocalDateTime = js.native
  inline def MAX_=(x: typingsJapgolly.jsJodaCore.mod.LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDateTime.MIN")
  @js.native
  def MIN: typingsJapgolly.jsJodaCore.mod.LocalDateTime = js.native
  inline def MIN_=(x: typingsJapgolly.jsJodaCore.mod.LocalDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  
  inline def of(date: typingsJapgolly.jsJodaCore.mod.LocalDate, time: typingsJapgolly.jsJodaCore.mod.LocalTime): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Double, second: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Double, minute: Unit, second: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Double, second: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: Double, dayOfMonth: Double, hour: Unit, minute: Unit, second: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: Double,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: typingsJapgolly.jsJodaCore.mod.Month, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(year: Double, month: typingsJapgolly.jsJodaCore.mod.Month, dayOfMonth: Double, hour: Double): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Double,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Double,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Double,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def of(
    year: Double,
    month: typingsJapgolly.jsJodaCore.mod.Month,
    dayOfMonth: Double,
    hour: Unit,
    minute: Unit,
    second: Unit,
    nanoSecond: Double
  ): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoSecond.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  
  inline def ofEpochSecond(epochSecond: Double, nanoOfSecond: Double, offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def ofEpochSecond(epochSecond: Double, offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant, zoneId: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.LocalDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.LocalDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDateTime]
}
