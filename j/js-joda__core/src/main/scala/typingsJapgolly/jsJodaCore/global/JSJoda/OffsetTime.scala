package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.OffsetTime")
@js.native
/* private */ open class OffsetTime ()
  extends typingsJapgolly.jsJodaCore.mod.OffsetTime
/* static members */
object OffsetTime {
  
  @JSGlobal("JSJoda.OffsetTime")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.OffsetTime.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.OffsetTime] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.OffsetTime]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetTime.MAX")
  @js.native
  def MAX: typingsJapgolly.jsJodaCore.mod.OffsetTime = js.native
  inline def MAX_=(x: typingsJapgolly.jsJodaCore.mod.OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.OffsetTime.MIN")
  @js.native
  def MIN: typingsJapgolly.jsJodaCore.mod.OffsetTime = js.native
  inline def MIN_=(x: typingsJapgolly.jsJodaCore.mod.OffsetTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  
  inline def of(
    hour: Double,
    minute: Double,
    second: Double,
    nanoOfSecond: Double,
    offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset
  ): typingsJapgolly.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], nanoOfSecond.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  inline def of(time: typingsJapgolly.jsJodaCore.mod.LocalTime, offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset): typingsJapgolly.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant, zone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.OffsetTime = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.OffsetTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.OffsetTime]
}
