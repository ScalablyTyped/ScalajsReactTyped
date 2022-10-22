package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.OffsetDateTime")
@js.native
/* private */ open class OffsetDateTime ()
  extends typingsJapgolly.jsJodaCore.mod.OffsetDateTime
/* static members */
object OffsetDateTime {
  
  @JSGlobal("JSJoda.OffsetDateTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.OffsetDateTime.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.OffsetDateTime] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetDateTime.MAX")
  @js.native
  def MAX: typingsJapgolly.jsJodaCore.mod.OffsetDateTime = js.native
  inline def MAX_=(x: typingsJapgolly.jsJodaCore.mod.OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetDateTime.MIN")
  @js.native
  def MIN: typingsJapgolly.jsJodaCore.mod.OffsetDateTime = js.native
  inline def MIN_=(x: typingsJapgolly.jsJodaCore.mod.OffsetDateTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  
  inline def of(
    dateTime: typingsJapgolly.jsJodaCore.mod.LocalDateTime,
    offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset
  ): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(dateTime.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  inline def of(
    date: typingsJapgolly.jsJodaCore.mod.LocalDate,
    time: typingsJapgolly.jsJodaCore.mod.LocalTime,
    offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset
  ): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  inline def of(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset
  ): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant, zone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.OffsetDateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetDateTime]
}
