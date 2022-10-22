package typingsJapgolly.guacamoleClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client", "ChainedTunnel")
@js.native
open class ChainedTunnel protected ()
  extends typingsJapgolly.guacamoleClient.libChainedTunnelMod.ChainedTunnel {
  /**
    * @param tunnelChain The tunnels to use, in order of priority.
    */
  def this(tunnels: typingsJapgolly.guacamoleClient.libTunnelMod.Tunnel*) = this()
}
