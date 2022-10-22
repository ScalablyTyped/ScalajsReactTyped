package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Year")
@js.native
/* private */ open class Year ()
  extends typingsJapgolly.jsJodaCore.mod.Year
/* static members */
object Year {
  
  @JSGlobal("JSJoda.Year")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Year.FROM")
  @js.native
  def FROM: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.Year] = js.native
  inline def FROM_=(x: typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.Year]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Year.MAX_VALUE")
  @js.native
  def MAX_VALUE: Double = js.native
  inline def MAX_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_VALUE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Year.MIN_VALUE")
  @js.native
  def MIN_VALUE: Double = js.native
  inline def MIN_VALUE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_VALUE")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  
  inline def isLeap(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeap")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def now(): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.Clock): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  inline def now(zoneIdOrClock: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(zoneIdOrClock.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  
  inline def of(isoYear: Double): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(isoYear.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.Year = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
  inline def parse(text: String, formatter: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): typingsJapgolly.jsJodaCore.mod.Year = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], formatter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Year]
}
