package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZoneOffset")
@js.native
/* private */ open class ZoneOffset ()
  extends typingsJapgolly.jsJodaCore.mod.ZoneOffset
/* static members */
object ZoneOffset {
  
  @JSGlobal("JSJoda.ZoneOffset")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.ZoneOffset.MAX")
  @js.native
  def MAX: typingsJapgolly.jsJodaCore.mod.ZoneOffset = js.native
  inline def MAX_=(x: typingsJapgolly.jsJodaCore.mod.ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.ZoneOffset.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: typingsJapgolly.jsJodaCore.mod.ZoneOffset = js.native
  inline def MAX_SECONDS_=(x: typingsJapgolly.jsJodaCore.mod.ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.ZoneOffset.MIN")
  @js.native
  def MIN: typingsJapgolly.jsJodaCore.mod.ZoneOffset = js.native
  inline def MIN_=(x: typingsJapgolly.jsJodaCore.mod.ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.ZoneOffset.UTC")
  @js.native
  def UTC: typingsJapgolly.jsJodaCore.mod.ZoneOffset = js.native
  inline def UTC_=(x: typingsJapgolly.jsJodaCore.mod.ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  inline def of(offsetId: String): typingsJapgolly.jsJodaCore.mod.ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(offsetId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
  
  inline def ofHours(hours: Double): typingsJapgolly.jsJodaCore.mod.ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofHours")(hours.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
  
  inline def ofHoursMinutes(hours: Double, minutes: Double): typingsJapgolly.jsJodaCore.mod.ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutes")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
  
  inline def ofHoursMinutesSeconds(hours: Double, minutes: Double, seconds: Double): typingsJapgolly.jsJodaCore.mod.ZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("ofHoursMinutesSeconds")(hours.asInstanceOf[js.Any], minutes.asInstanceOf[js.Any], seconds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
  
  inline def ofTotalMinutes(totalMinutes: Double): typingsJapgolly.jsJodaCore.mod.ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalMinutes")(totalMinutes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
  
  inline def ofTotalSeconds(totalSeconds: Double): typingsJapgolly.jsJodaCore.mod.ZoneOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("ofTotalSeconds")(totalSeconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffset]
}
