package typingsJapgolly.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnChannelActivityEventType extends StObject
/** Specifies the type of activity events. */
@JSGlobal("Windows.Networking.Vpn.VpnChannelActivityEventType")
@js.native
object VpnChannelActivityEventType extends StObject {
  
  /** Mode in which traffic is currently being sent over the VPN channel. */
  @js.native
  sealed trait active
    extends StObject
       with VpnChannelActivityEventType
  
  /** Mode in which no traffic is being sent over the VPN channel. */
  @js.native
  sealed trait idle
    extends StObject
       with VpnChannelActivityEventType
}
