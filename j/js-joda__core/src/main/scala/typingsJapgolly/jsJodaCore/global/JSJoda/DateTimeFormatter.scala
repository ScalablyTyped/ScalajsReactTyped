package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.DateTimeFormatter")
@js.native
/* private */ open class DateTimeFormatter ()
  extends typingsJapgolly.jsJodaCore.mod.DateTimeFormatter
/* static members */
object DateTimeFormatter {
  
  @JSGlobal("JSJoda.DateTimeFormatter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_INSTANT")
  @js.native
  def ISO_INSTANT: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_INSTANT_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_INSTANT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_DATE")
  @js.native
  def ISO_LOCAL_DATE: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_DATE_TIME")
  @js.native
  def ISO_LOCAL_DATE_TIME: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_TIME_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_TIME")
  @js.native
  def ISO_LOCAL_TIME: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_TIME_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_OFFSET_DATE_TIME")
  @js.native
  def ISO_OFFSET_DATE_TIME: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_OFFSET_DATE_TIME_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_OFFSET_TIME")
  @js.native
  def ISO_OFFSET_TIME: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_OFFSET_TIME_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_ZONED_DATE_TIME")
  @js.native
  def ISO_ZONED_DATE_TIME: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_ZONED_DATE_TIME_=(x: typingsJapgolly.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_ZONED_DATE_TIME")(x.asInstanceOf[js.Any])
  
  inline def ofPattern(pattern: String): typingsJapgolly.jsJodaCore.mod.DateTimeFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("ofPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.DateTimeFormatter]
  
  inline def parsedExcessDays(): typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.Period] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedExcessDays")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.TemporalQuery[typingsJapgolly.jsJodaCore.mod.Period]]
  
  inline def parsedLeapSecond(): typingsJapgolly.jsJodaCore.mod.TemporalQuery[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedLeapSecond")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.TemporalQuery[Boolean]]
}
