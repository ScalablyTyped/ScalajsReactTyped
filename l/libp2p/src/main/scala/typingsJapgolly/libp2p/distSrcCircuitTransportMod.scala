package typingsJapgolly.libp2p

import typingsJapgolly.libp2p.mod.RelayConfig
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typingsJapgolly.libp2pInterfaceTransport.mod.Transport
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitTransportMod {
  
  @JSImport("libp2p/dist/src/circuit/transport", "Circuit")
  @js.native
  open class Circuit protected ()
    extends StObject
       with Transport
       with Initializable {
    def this(init: RelayConfig) = this()
    
    /* private */ val _init: Any = js.native
    
    def _onProtocol(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    /* private */ var components: Any = js.native
    
    /**
      * Dial a peer over a relay
      */
    def dial(ma: Multiaddr_): js.Promise[Connection] = js.native
    def dial(ma: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    var get: Any = js.native
    
    /* private */ var handler: Any = js.native
    
    def hopActive(): Boolean = js.native
    
    def hopEnabled(): Boolean = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Circuit: js.Function0[String] = js.native
  }
}
