package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.MonthDay")
@js.native
/* private */ open class MonthDay ()
  extends typingsJapgolly.jsJodaCore.mod.MonthDay
/* static members */
object MonthDay {
  
  @JSGlobal("JSJoda.MonthDay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.MonthDay.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.MonthDay] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.MonthDay]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  
  inline def of(month: Double, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  inline def of(month: typingsJapgolly.jsJodaCore.mod.Month, dayOfMonth: Double): typingsJapgolly.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(month.asInstanceOf[js.Any], dayOfMonth.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.MonthDay = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.MonthDay = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.MonthDay]
}
