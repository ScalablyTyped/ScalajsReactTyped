package typingsJapgolly.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("js-joda", "ZoneId")
@js.native
open class ZoneId () extends StObject {
  
  def id(): String = js.native
  
  def normalized(): ZoneId = js.native
  
  def rules(): ZoneRules = js.native
}
object ZoneId {
  
  @JSImport("js-joda", "ZoneId")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneId.SYSTEM")
  @js.native
  def SYSTEM: ZoneId = js.native
  inline def SYSTEM_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneId.UTC")
  @js.native
  def UTC: ZoneId = js.native
  inline def UTC_=(x: ZoneId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def from(temporal: TemporalAccessor): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[ZoneId]
  
  /* static member */
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  /* static member */
  inline def of(zoneId: String): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(zoneId.asInstanceOf[js.Any]).asInstanceOf[ZoneId]
  
  /* static member */
  inline def ofOffset(prefix: String, offset: ZoneOffset): ZoneId = (^.asInstanceOf[js.Dynamic].applyDynamic("ofOffset")(prefix.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[ZoneId]
  
  /* static member */
  inline def systemDefault(): ZoneId = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefault")().asInstanceOf[ZoneId]
}
