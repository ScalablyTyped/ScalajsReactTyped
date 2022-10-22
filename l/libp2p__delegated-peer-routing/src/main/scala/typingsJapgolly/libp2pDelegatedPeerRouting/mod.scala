package typingsJapgolly.libp2pDelegatedPeerRouting

import typingsJapgolly.ipfsHttpClient.mod.HTTPClientExtraOptions
import typingsJapgolly.ipfsHttpClient.mod.IPFSHTTPClient
import typingsJapgolly.libp2pDelegatedPeerRouting.anon.Id
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import typingsJapgolly.libp2pInterfacePeerRouting.mod.PeerRouting
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/delegated-peer-routing", "DelegatedPeerRouting")
  @js.native
  open class DelegatedPeerRouting protected ()
    extends StObject
       with PeerRouting
       with Startable {
    /**
      * Create a new DelegatedPeerRouting instance
      */
    def this(client: IPFSHTTPClient) = this()
    
    /* private */ var abortController: Any = js.native
    
    /* private */ val client: Any = js.native
    
    def findPeer(
      id: PeerId,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): js.Promise[PeerInfo] = js.native
    
    def getClosestPeers(
      key: js.typedarray.Uint8Array,
      options: HTTPClientExtraOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AbortOptions */ Any)
    ): AsyncGenerator[Id, Unit, Unit] = js.native
    
    /* private */ val httpQueue: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
}
