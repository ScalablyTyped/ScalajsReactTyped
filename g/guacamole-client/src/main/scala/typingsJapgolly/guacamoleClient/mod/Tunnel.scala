package typingsJapgolly.guacamoleClient.mod

import typingsJapgolly.guacamoleClient.guacamoleClientStrings._empty
import typingsJapgolly.guacamoleClient.libTunnelMod.Tunnel.TunnelState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("guacamole-client", "Tunnel")
@js.native
open class Tunnel ()
  extends typingsJapgolly.guacamoleClient.libTunnelMod.Tunnel
/* static members */
object Tunnel {
  
  @JSImport("guacamole-client", "Tunnel.INTERNAL_DATA_OPCODE")
  @js.native
  val INTERNAL_DATA_OPCODE: _empty = js.native
  
  @JSImport("guacamole-client", "Tunnel.State")
  @js.native
  val State: TunnelState = js.native
}
