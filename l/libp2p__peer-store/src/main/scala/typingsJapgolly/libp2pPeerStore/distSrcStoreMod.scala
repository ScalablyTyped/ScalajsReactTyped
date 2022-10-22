package typingsJapgolly.libp2pPeerStore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.interfaceDatastore.keyMod.Key
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerStore.mod.Peer
import typingsJapgolly.libp2pPeerStore.anon.PartialPeer
import typingsJapgolly.libp2pPeerStore.anon.ReadLock
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStoreMod {
  
  @JSImport("@libp2p/peer-store/dist/src/store", "PersistentStore")
  @js.native
  open class PersistentStore () extends StObject {
    
    def _merge(peerId: PeerId, data: PartialPeer, peer: Peer): js.Promise[Peer] = js.native
    
    def _patch(peerId: PeerId, data: PartialPeer, peer: Peer): js.Promise[Peer] = js.native
    
    def _peerIdToDatastoreKey(peerId: PeerId): Key = js.native
    
    def all(): AsyncGenerator[Peer, Unit, Any] = js.native
    
    /* private */ var components: Any = js.native
    
    def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    def has(peerId: PeerId): js.Promise[Boolean] = js.native
    
    def init(components: Components): Unit = js.native
    
    def load(peerId: PeerId): js.Promise[Peer] = js.native
    
    var lock: Any = js.native
    
    def merge(peerId: PeerId, data: PartialPeer): js.Promise[Peer] = js.native
    
    def mergeOrCreate(peerId: PeerId, data: PartialPeer): js.Promise[Peer] = js.native
    
    def patch(peerId: PeerId, data: PartialPeer): js.Promise[Peer] = js.native
    
    def patchOrCreate(peerId: PeerId, data: PartialPeer): js.Promise[Peer] = js.native
    
    def save(peer: Peer): js.Promise[Peer] = js.native
  }
  
  trait Store extends StObject {
    
    def all(): AsyncIterable[Peer]
    
    def delete(peerId: PeerId): js.Promise[Unit]
    
    def has(peerId: PeerId): js.Promise[Boolean]
    
    def load(peerId: PeerId): js.Promise[Peer]
    
    var lock: ReadLock
    
    def merge(peerId: PeerId, data: PartialPeer): js.Promise[Peer]
    
    def mergeOrCreate(peerId: PeerId, data: PartialPeer): js.Promise[Peer]
    
    def patch(peerId: PeerId, data: PartialPeer): js.Promise[Peer]
    
    def patchOrCreate(peerId: PeerId, data: PartialPeer): js.Promise[Peer]
    
    def save(peer: Peer): js.Promise[Peer]
  }
  object Store {
    
    inline def apply(
      all: CallbackTo[AsyncIterable[Peer]],
      delete: PeerId => js.Promise[Unit],
      has: PeerId => js.Promise[Boolean],
      load: PeerId => js.Promise[Peer],
      lock: ReadLock,
      merge: (PeerId, PartialPeer) => js.Promise[Peer],
      mergeOrCreate: (PeerId, PartialPeer) => js.Promise[Peer],
      patch: (PeerId, PartialPeer) => js.Promise[Peer],
      patchOrCreate: (PeerId, PartialPeer) => js.Promise[Peer],
      save: Peer => js.Promise[Peer]
    ): Store = {
      val __obj = js.Dynamic.literal(all = all.toJsFn, delete = js.Any.fromFunction1(delete), has = js.Any.fromFunction1(has), load = js.Any.fromFunction1(load), lock = lock.asInstanceOf[js.Any], merge = js.Any.fromFunction2(merge), mergeOrCreate = js.Any.fromFunction2(mergeOrCreate), patch = js.Any.fromFunction2(patch), patchOrCreate = js.Any.fromFunction2(patchOrCreate), save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setAll(value: CallbackTo[AsyncIterable[Peer]]): Self = StObject.set(x, "all", value.toJsFn)
      
      inline def setDelete(value: PeerId => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setHas(value: PeerId => js.Promise[Boolean]): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setLoad(value: PeerId => js.Promise[Peer]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLock(value: ReadLock): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setMerge(value: (PeerId, PartialPeer) => js.Promise[Peer]): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
      
      inline def setMergeOrCreate(value: (PeerId, PartialPeer) => js.Promise[Peer]): Self = StObject.set(x, "mergeOrCreate", js.Any.fromFunction2(value))
      
      inline def setPatch(value: (PeerId, PartialPeer) => js.Promise[Peer]): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPatchOrCreate(value: (PeerId, PartialPeer) => js.Promise[Peer]): Self = StObject.set(x, "patchOrCreate", js.Any.fromFunction2(value))
      
      inline def setSave(value: Peer => js.Promise[Peer]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
}
