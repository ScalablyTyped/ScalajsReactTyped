package typingsJapgolly.ipfsBitswap

import typingsJapgolly.ipfsBitswap.anon.DebuggererrorDebugger
import typingsJapgolly.ipfsBitswap.anon.Signal
import typingsJapgolly.ipfsBitswap.distSrcNetworkMod.Network
import typingsJapgolly.ipfsBitswap.distSrcStatsMod.Stats
import typingsJapgolly.ipfsBitswap.distSrcWantManagerMsgQueueMod.MsgQueue
import typingsJapgolly.ipfsBitswap.distSrcWantlistMod.Wantlist
import typingsJapgolly.libp2p.mod.Libp2p
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWantManagerMod {
  
  @JSImport("ipfs-bitswap/dist/src/want-manager", "WantManager")
  @js.native
  open class WantManager protected () extends StObject {
    /**
      * @param {PeerId} peerId
      * @param {import('../network').Network} network
      * @param {import('../stats').Stats} stats
      * @param {import('libp2p').Libp2p} libp2p
      */
    def this(peerId: PeerId, network: Network, stats: Stats, libp2p: Libp2p) = this()
    
    /**
      * @private
      * @param {CID[]} cids
      * @param {boolean} cancel
      * @param {boolean} [force]
      */
    /* private */ var _addEntries: Any = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    var _peerId: typingsJapgolly.libp2pInterfacePeerId.mod.PeerId = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      */
    /* private */ var _startPeerHandler: Any = js.native
    
    var _stats: Stats = js.native
    
    /**
      * @private
      * @param {PeerId} peerId
      */
    /* private */ var _stopPeerHandler: Any = js.native
    
    /**
      * Cancel wanting all of the given keys
      *
      * @param {CID[]} cids
      */
    def cancelWants(cids: js.Array[CID]): Unit = js.native
    
    /**
      * @param {PeerId} peerId
      */
    def connected(peerId: PeerId): Unit = js.native
    
    /**
      * Returns a list of all currently connected peers
      */
    def connectedPeers(): js.Array[String] = js.native
    
    /**
      * @param {PeerId} peerId
      */
    def disconnected(peerId: PeerId): Unit = js.native
    
    var network: Network = js.native
    
    /** @type {Map<string, MsgQueue>} */
    var peers: Map[String, MsgQueue] = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /**
      * Remove blocks of all the given keys without respecting refcounts
      *
      * @param {CID[]} cids
      */
    def unwantBlocks(cids: js.Array[CID]): Unit = js.native
    
    /**
      * add all the cids to the wantlist
      *
      * @param {CID[]} cids
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      */
    def wantBlocks(cids: js.Array[CID]): Unit = js.native
    def wantBlocks(cids: js.Array[CID], options: Signal): Unit = js.native
    
    var wantlist: Wantlist = js.native
  }
  
  type CID = typingsJapgolly.multiformats.mod.CID[Any, Double, Double, Version]
  
  type PeerId = typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
}
