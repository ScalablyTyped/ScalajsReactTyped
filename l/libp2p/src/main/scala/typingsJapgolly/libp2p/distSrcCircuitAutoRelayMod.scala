package typingsJapgolly.libp2p

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`-1`
import typingsJapgolly.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`0`
import typingsJapgolly.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`1`
import typingsJapgolly.libp2pInterfacePeerStore.mod.Address
import typingsJapgolly.libp2pInterfacePeerStore.mod.AddressSorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitAutoRelayMod {
  
  @JSImport("libp2p/dist/src/circuit/auto-relay", "AutoRelay")
  @js.native
  open class AutoRelay protected () extends StObject {
    def this(components: Components, init: AutoRelayInit) = this()
    
    /**
      * Attempt to listen on the given relay connection
      */
    def _addListenRelay(connection: Connection, id: String): js.Promise[Unit] = js.native
    
    /**
      * Try to listen on available hop relay connections.
      * The following order will happen while we do not have enough relays.
      * 1. Check the metadata store for known relays, try to listen on the ones we are already connected.
      * 2. Dial and try to listen on the peers we know that support hop but are not connected.
      * 3. Search the network.
      */
    def _listenOnAvailableHopRelays(): js.Promise[Unit] = js.native
    def _listenOnAvailableHopRelays(peersToIgnore: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Peer disconnects
      */
    def _onPeerDisconnected(evt: CustomEvent): Unit = js.native
    
    /**
      * Check if a peer supports the relay protocol.
      * If the protocol is not supported, check if it was supported before and remove it as a listen relay.
      * If the protocol is supported, check if the peer supports **HOP** and add it as a listener if
      * inside the threshold.
      */
    def _onProtocolChange(evt: CustomEvent): js.Promise[Unit] = js.native
    
    /**
      * Remove listen relay
      */
    def _removeListenRelay(id: String): js.Promise[Unit] = js.native
    
    def _tryToListenOnRelay(peerId: PeerId): js.Promise[Unit] = js.native
    
    /* private */ val addressSorter: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val listenRelays: Any = js.native
    
    /* private */ val maxListeners: Any = js.native
    
    /* private */ val onError: Any = js.native
  }
  
  trait AutoRelayInit extends StObject {
    
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
    
    var maxListeners: js.UndefOr[Double] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* error */ js.Error, /* msg */ js.UndefOr[String], Unit]] = js.undefined
  }
  object AutoRelayInit {
    
    inline def apply(): AutoRelayInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRelayInit]
    }
    
    extension [Self <: AutoRelayInit](x: Self) {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
      
      inline def setMaxListeners(value: Double): Self = StObject.set(x, "maxListeners", value.asInstanceOf[js.Any])
      
      inline def setMaxListenersUndefined: Self = StObject.set(x, "maxListeners", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* msg */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* msg */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
}
