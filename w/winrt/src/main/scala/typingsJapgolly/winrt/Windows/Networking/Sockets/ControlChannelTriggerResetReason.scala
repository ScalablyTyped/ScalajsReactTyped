package typingsJapgolly.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ControlChannelTriggerResetReason extends StObject
@JSGlobal("Windows.Networking.Sockets.ControlChannelTriggerResetReason")
@js.native
object ControlChannelTriggerResetReason extends StObject {
  
  @js.native
  sealed trait fastUserSwitched
    extends StObject
       with ControlChannelTriggerResetReason
  
  @js.native
  sealed trait lowPowerExit
    extends StObject
       with ControlChannelTriggerResetReason
}
