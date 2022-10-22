package typingsJapgolly.libp2pPeerStore

import org.scalajs.dom.Event
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerStore.mod.Address
import typingsJapgolly.libp2pInterfacePeerStore.mod.AddressFilter
import typingsJapgolly.libp2pInterfaceRecord.mod.Envelope
import typingsJapgolly.libp2pPeerRecord.mod.RecordEnvelope
import typingsJapgolly.libp2pPeerStore.distSrcStoreMod.Store
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcAddressBookMod {
  
  @JSImport("@libp2p/peer-store/dist/src/address-book", "PeerStoreAddressBook")
  @js.native
  open class PeerStoreAddressBook protected () extends StObject {
    def this(dispatchEvent: js.Function1[/* event */ Event, Boolean], store: Store) = this()
    def this(
      dispatchEvent: js.Function1[/* event */ Event, Boolean],
      store: Store,
      addressFilter: AddressFilter
    ) = this()
    
    def add(peerId: PeerId, multiaddrs: js.Array[Multiaddr_]): js.Promise[Unit] = js.native
    
    /* private */ val addressFilter: Any = js.native
    
    /**
      * ConsumePeerRecord adds addresses from a signed peer record contained in a record envelope.
      * This will return a boolean that indicates if the record was successfully processed and added
      * into the AddressBook.
      */
    def consumePeerRecord(envelope: Envelope): js.Promise[Boolean] = js.native
    
    def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    /* private */ val dispatchEvent: Any = js.native
    
    def get(peerId: PeerId): js.Promise[js.Array[Address]] = js.native
    
    /**
      * Get an Envelope containing a PeerRecord for the given peer.
      * Returns undefined if no record exists.
      */
    def getPeerRecord(peerId: PeerId): js.Promise[js.UndefOr[RecordEnvelope]] = js.native
    
    def getRawEnvelope(peerId: PeerId): js.Promise[js.UndefOr[js.typedarray.Uint8Array]] = js.native
    
    def set(peerId: PeerId, multiaddrs: js.Array[Multiaddr_]): js.Promise[Unit] = js.native
    
    /* private */ val store: Any = js.native
  }
}
