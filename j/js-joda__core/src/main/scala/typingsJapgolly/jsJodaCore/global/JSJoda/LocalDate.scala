package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.LocalDate")
@js.native
/* private */ open class LocalDate ()
  extends typingsJapgolly.jsJodaCore.mod.LocalDate
/* static members */
object LocalDate {
  
  @JSGlobal("JSJoda.LocalDate")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.LocalDate.EPOCH_0")
  @js.native
  def EPOCH_0: typingsJapgolly.jsJodaCore.mod.LocalDate = js.native
  inline def EPOCH_0_=(x: typingsJapgolly.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH_0")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.LocalDate] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.LocalDate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.MAX")
  @js.native
  def MAX: typingsJapgolly.jsJodaCore.mod.LocalDate = js.native
  inline def MAX_=(x: typingsJapgolly.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.LocalDate.MIN")
  @js.native
  def MIN: typingsJapgolly.jsJodaCore.mod.LocalDate = js.native
  inline def MIN_=(x: typingsJapgolly.jsJodaCore.mod.LocalDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  inline def now(clockOrZone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clockOrZone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def of(year: Double, month: Double, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  inline def of(year: Double, month: typingsJapgolly.jsJodaCore.mod.Month, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def ofEpochDay(epochDay: Double): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochDay")(epochDay.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  inline def ofInstant(instant: typingsJapgolly.jsJodaCore.mod.Instant, zoneId: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofInstant")(instant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def ofYearDay(year: Double, dayOfYear: Double): typingsJapgolly.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("ofYearDay")(year.asInstanceOf[js.Any], dayOfYear.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.LocalDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.LocalDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.LocalDate]
}
