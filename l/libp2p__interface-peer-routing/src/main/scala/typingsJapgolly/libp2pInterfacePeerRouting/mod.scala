package typingsJapgolly.libp2pInterfacePeerRouting

import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait PeerRouting extends StObject {
    
    def findPeer(peerId: PeerId): js.Promise[PeerInfo] = js.native
    def findPeer(peerId: PeerId, options: AbortOptions): js.Promise[PeerInfo] = js.native
    
    def getClosestPeers(key: js.typedarray.Uint8Array): AsyncIterable[PeerInfo] = js.native
    def getClosestPeers(key: js.typedarray.Uint8Array, options: AbortOptions): AsyncIterable[PeerInfo] = js.native
  }
}
