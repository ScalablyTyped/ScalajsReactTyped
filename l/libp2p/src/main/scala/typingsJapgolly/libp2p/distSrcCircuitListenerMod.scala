package typingsJapgolly.libp2p

import typingsJapgolly.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typingsJapgolly.libp2pInterfacePeerStore.mod.PeerStore
import typingsJapgolly.libp2pInterfaceTransport.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitListenerMod {
  
  @JSImport("libp2p/dist/src/circuit/listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createListener(options: ListenerOptions): Listener = ^.asInstanceOf[js.Dynamic].applyDynamic("createListener")(options.asInstanceOf[js.Any]).asInstanceOf[Listener]
  
  trait ListenerOptions extends StObject {
    
    var connectionManager: ConnectionManager
    
    var peerStore: PeerStore
  }
  object ListenerOptions {
    
    inline def apply(connectionManager: ConnectionManager, peerStore: PeerStore): ListenerOptions = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerOptions]
    }
    
    extension [Self <: ListenerOptions](x: Self) {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
}
