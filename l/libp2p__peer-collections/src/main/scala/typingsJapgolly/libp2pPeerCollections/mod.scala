package typingsJapgolly.libp2pPeerCollections

import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-collections", "PeerList")
  @js.native
  open class PeerList ()
    extends typingsJapgolly.libp2pPeerCollections.distSrcListMod.PeerList {
    def this(list: typingsJapgolly.libp2pPeerCollections.distSrcListMod.PeerList) = this()
  }
  
  @JSImport("@libp2p/peer-collections", "PeerMap")
  @js.native
  open class PeerMap[T] ()
    extends typingsJapgolly.libp2pPeerCollections.distSrcMapMod.PeerMap[T] {
    def this(map: typingsJapgolly.libp2pPeerCollections.distSrcMapMod.PeerMap[T]) = this()
  }
  
  @JSImport("@libp2p/peer-collections", "PeerSet")
  @js.native
  open class PeerSet ()
    extends typingsJapgolly.libp2pPeerCollections.distSrcSetMod.PeerSet {
    def this(set: js.Iterable[PeerId]) = this()
    def this(set: typingsJapgolly.libp2pPeerCollections.distSrcSetMod.PeerSet) = this()
  }
}
