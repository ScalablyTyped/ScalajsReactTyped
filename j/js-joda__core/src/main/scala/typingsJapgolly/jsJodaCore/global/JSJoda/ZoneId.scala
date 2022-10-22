package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("JSJoda.ZoneId")
@js.native
open class ZoneId ()
  extends typingsJapgolly.jsJodaCore.mod.ZoneId
/* static members */
object ZoneId {
  
  @JSGlobal("JSJoda.ZoneId")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.ZoneId.SYSTEM")
  @js.native
  def SYSTEM: typingsJapgolly.jsJodaCore.mod.ZoneId = js.native
  inline def SYSTEM_=(x: typingsJapgolly.jsJodaCore.mod.ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.ZoneId.UTC")
  @js.native
  def UTC: typingsJapgolly.jsJodaCore.mod.ZoneId = js.native
  inline def UTC_=(x: typingsJapgolly.jsJodaCore.mod.ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typingsJapgolly.jsJodaCore.mod.TemporalAccessor): typingsJapgolly.jsJodaCore.mod.ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneId]
  
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  inline def of(zoneId: String): typingsJapgolly.jsJodaCore.mod.ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(zoneId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneId]
  
  inline def ofOffset(prefix: String, offset: typingsJapgolly.jsJodaCore.mod.ZoneOffset): typingsJapgolly.jsJodaCore.mod.ZoneId = (^.asInstanceOf[js.Dynamic].applyDynamic("ofOffset")(prefix.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneId]
  
  inline def systemDefault(): typingsJapgolly.jsJodaCore.mod.ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefault")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneId]
}
