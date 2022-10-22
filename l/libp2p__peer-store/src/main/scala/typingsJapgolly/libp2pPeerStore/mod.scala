package typingsJapgolly.libp2pPeerStore

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pComponents.mod.Initializable
import typingsJapgolly.libp2pInterfacePeerStore.mod.PeerStore
import typingsJapgolly.libp2pInterfacePeerStore.mod.PeerStoreInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-store", "PersistentPeerStore")
  @js.native
  open class PersistentPeerStore ()
    extends PeerStore
       with Initializable {
    def this(init: PeerStoreInit) = this()
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val store: Any = js.native
  }
}
