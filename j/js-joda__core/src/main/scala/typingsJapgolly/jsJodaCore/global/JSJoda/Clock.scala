package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("JSJoda.Clock")
@js.native
open class Clock ()
  extends typingsJapgolly.jsJodaCore.mod.Clock
/* static members */
object Clock {
  
  @JSGlobal("JSJoda.Clock")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixed(
    fixedInstant: typingsJapgolly.jsJodaCore.mod.Instant,
    zoneId: typingsJapgolly.jsJodaCore.mod.ZoneId
  ): typingsJapgolly.jsJodaCore.mod.Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("fixed")(fixedInstant.asInstanceOf[js.Any], zoneId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Clock]
  
  inline def offset(
    baseClock: typingsJapgolly.jsJodaCore.mod.Clock,
    offsetDuration: typingsJapgolly.jsJodaCore.mod.Duration
  ): typingsJapgolly.jsJodaCore.mod.Clock = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(baseClock.asInstanceOf[js.Any], offsetDuration.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Clock]
  
  inline def system(zone: typingsJapgolly.jsJodaCore.mod.ZoneId): typingsJapgolly.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("system")(zone.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsJodaCore.mod.Clock]
  
  inline def systemDefaultZone(): typingsJapgolly.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemDefaultZone")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.Clock]
  
  inline def systemUTC(): typingsJapgolly.jsJodaCore.mod.Clock = ^.asInstanceOf[js.Dynamic].applyDynamic("systemUTC")().asInstanceOf[typingsJapgolly.jsJodaCore.mod.Clock]
}
