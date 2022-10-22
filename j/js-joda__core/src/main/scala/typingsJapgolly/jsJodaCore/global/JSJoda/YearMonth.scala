package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.YearMonth")
@js.native
/* private */ open class YearMonth ()
  extends typingsJapgolly.jsJodaCore.mod.YearMonth
/* static members */
object YearMonth {
  
  @JSGlobal("JSJoda.YearMonth")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.YearMonth.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.YearMonth] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.YearMonth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  
  inline def of(year: Double, monthOrNumber: Double): typingsJapgolly.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  inline def of(year: Double, monthOrNumber: typingsJapgolly.jsJodaCore.mod.Month): typingsJapgolly.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(year.asInstanceOf[js.Any], monthOrNumber.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.YearMonth = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.YearMonth = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.YearMonth]
}
