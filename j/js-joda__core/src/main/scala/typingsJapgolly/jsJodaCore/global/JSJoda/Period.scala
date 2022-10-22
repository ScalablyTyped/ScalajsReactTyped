package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Period")
@js.native
/* private */ open class Period ()
  extends typingsJapgolly.jsJodaCore.mod.Period
/* static members */
object Period {
  
  @JSGlobal("JSJoda.Period")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Period.ZERO")
  @js.native
  def ZERO: typingsJapgolly.jsJodaCore.mod.Period = js.native
  inline def ZERO_=(x: typingsJapgolly.jsJodaCore.mod.Period): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  
  inline def between(
    startDate: typingsJapgolly.jsJodaCore.mod.LocalDate,
    endDate: typingsJapgolly.jsJodaCore.mod.LocalDate
  ): typingsJapgolly.jsJodaCore.mod.Period = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def from(amount: typingsJapgolly.jsJodaCore.mod.TemporalAmount): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(amount.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def of(years: Double, months: Double, days: Double): typingsJapgolly.jsJodaCore.mod.Period = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(years.asInstanceOf[js.Any], months.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def ofDays(days: Double): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofDays")(days.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def ofMonths(months: Double): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofMonths")(months.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def ofWeeks(weeks: Double): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofWeeks")(weeks.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def ofYears(years: Double): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("ofYears")(years.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
  
  inline def parse(text: String): typingsJapgolly.jsJodaCore.mod.Period = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Period]
}
