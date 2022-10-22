package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZoneRulesProvider")
@js.native
open class ZoneRulesProvider ()
  extends typingsJapgolly.jsJodaCore.mod.ZoneRulesProvider
/* static members */
object ZoneRulesProvider {
  
  @JSGlobal("JSJoda.ZoneRulesProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAvailableZoneIds(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableZoneIds")().asInstanceOf[js.Array[String]]
  
  inline def getRules(zoneId: String): typingsJapgolly.jsJodaCore.mod.ZoneRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")(zoneId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneRules]
}
