package typingsJapgolly.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.ZoneOffsetTransition")
@js.native
/* private */ open class ZoneOffsetTransition ()
  extends typingsJapgolly.jsJodaCore.mod.ZoneOffsetTransition
/* static members */
object ZoneOffsetTransition {
  
  @JSGlobal("JSJoda.ZoneOffsetTransition")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of(
    transition: typingsJapgolly.jsJodaCore.mod.LocalDateTime,
    offsetBefore: typingsJapgolly.jsJodaCore.mod.ZoneOffset,
    offsetAfter: typingsJapgolly.jsJodaCore.mod.ZoneOffset
  ): typingsJapgolly.jsJodaCore.mod.ZoneOffsetTransition = (^.asInstanceOf[js.Dynamic].applyDynamic("of")(transition.asInstanceOf[js.Any], offsetBefore.asInstanceOf[js.Any], offsetAfter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsJodaCore.mod.ZoneOffsetTransition]
}
