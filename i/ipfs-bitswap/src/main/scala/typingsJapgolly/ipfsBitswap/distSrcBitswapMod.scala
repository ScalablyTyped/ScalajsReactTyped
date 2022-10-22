package typingsJapgolly.ipfsBitswap

import typingsJapgolly.ipfsBitswap.anon.DebuggererrorDebugger
import typingsJapgolly.ipfsBitswap.anon.HashLoader
import typingsJapgolly.ipfsBitswap.anon.IncomingStreamTimeout
import typingsJapgolly.ipfsBitswap.anon.Key
import typingsJapgolly.ipfsBitswap.anon.Signal
import typingsJapgolly.ipfsBitswap.distSrcDecisionEngineMod.DecisionEngine
import typingsJapgolly.ipfsBitswap.distSrcNetworkMod.Network
import typingsJapgolly.ipfsBitswap.distSrcNotificationsMod.Notifications
import typingsJapgolly.ipfsBitswap.distSrcStatsMod.Stats
import typingsJapgolly.ipfsBitswap.distSrcWantManagerMod.WantManager
import typingsJapgolly.ipfsBitswap.distSrcWantlistEntryMod.WantListEntry
import typingsJapgolly.libp2p.mod.Libp2p
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBitswapMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseBlockstore * / any */ @JSImport("ipfs-bitswap/dist/src/bitswap", "Bitswap")
  @js.native
  open class Bitswap protected ()
    extends StObject
       with typingsJapgolly.ipfsBitswap.distSrcTypesMod.IPFSBitswap {
    /**
      * @param {import('libp2p').Libp2p} libp2p
      * @param {Blockstore} blockstore
      * @param {object} [options]
      * @param {boolean} [options.statsEnabled=false]
      * @param {number} [options.statsComputeThrottleTimeout=1000]
      * @param {number} [options.statsComputeThrottleMaxQueueSize=1000]
      * @param {number} [options.maxInboundStreams=32]
      * @param {number} [options.maxOutboundStreams=32]
      * @param {number} [options.incomingStreamTimeout=30000]
      * @param {MultihashHasherLoader} [options.hashLoader]
      */
    def this(libp2p: Libp2p, blockstore: Blockstore) = this()
    def this(libp2p: Libp2p, blockstore: Blockstore, options: HashLoader) = this()
    
    /**
      * @private
      * @param {PeerId} peerId
      * @param {CID} cid
      * @param {Uint8Array} data
      * @param {boolean} wasWanted
      */
    /* private */ var _handleReceivedBlock: Any = js.native
    
    var _libp2p: Libp2p = js.native
    
    def _log(formatter: Any, args: Any*): Unit = js.native
    @JSName("_log")
    var _log_Original: DebuggererrorDebugger = js.native
    
    /**
      * handle new peers
      *
      * @param {PeerId} peerId
      */
    def _onPeerConnected(peerId: PeerId): Unit = js.native
    
    /**
      * handle peers being disconnected
      *
      * @param {PeerId} peerId
      */
    def _onPeerDisconnected(peerId: PeerId): Unit = js.native
    
    var _options: IncomingStreamTimeout = js.native
    
    /**
      * handle errors on the receiving channel
      *
      * @param {Error} err
      */
    def _receiveError(err: js.Error): Unit = js.native
    
    /**
      * handle messages received through the network
      *
      * @param {PeerId} peerId
      * @param {BitswapMessage} incoming
      */
    def _receiveMessage(peerId: PeerId, incoming: BitswapMessage): js.Promise[Unit] = js.native
    
    /**
      * Sends notifications about the arrival of a block
      *
      * @private
      * @param {CID} cid
      * @param {Uint8Array} data
      */
    /* private */ var _sendHaveBlockNotifications: Any = js.native
    
    var _stats: Stats = js.native
    
    /**
      * @private
      * @param {string} peerIdStr
      * @param {CID} cid
      * @param {Uint8Array} data
      * @param {boolean} exists
      */
    /* private */ var _updateReceiveCounters: Any = js.native
    
    var blockstore: typingsJapgolly.interfaceBlockstore.mod.Blockstore = js.native
    
    var engine: DecisionEngine = js.native
    
    def getMany(cids: js.Iterable[CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(cids: js.Iterable[CID[Any, Double, Double, Version]], options: Signal): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    /**
      * Fetch a a list of blocks by cid. If the blocks are in the local
      * blockstore they are returned, otherwise the blocks are added to the wantlist and returned once another node sends them to us.
      *
      * @param {AsyncIterable<CID>|Iterable<CID>} cids
      * @param {object} [options]
      * @param {AbortSignal} [options.signal]
      */
    def getMany(cids: AsyncIterable[CID[Any, Double, Double, Version]]): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    def getMany(cids: AsyncIterable[CID[Any, Double, Double, Version]], options: Signal): AsyncGenerator[js.typedarray.Uint8Array, Unit, Any] = js.native
    
    var network: Network = js.native
    
    var notifications: Notifications = js.native
    
    /**
      * @type {PeerId}
      */
    @JSName("peerId")
    def peerId_MBitswap: typingsJapgolly.libp2pInterfacePeerId.mod.PeerId = js.native
    
    /**
      * Put the given block to the underlying blockstore and
      * send it to nodes that have it in their wantlist.
      *
      * @param {CID} cid
      * @param {Uint8Array} block
      * @param {any} [_options]
      */
    def put(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def put(cid: CID[Any, Double, Double, Version], block: js.typedarray.Uint8Array, _options: Any): js.Promise[Unit] = js.native
    
    /**
      * Put the given blocks to the underlying blockstore and
      * send it to nodes that have it them their wantlist.
      *
      * @param {Iterable<Pair> | AsyncIterable<Pair>} source
      * @param {Options} [options]
      */
    def putMany(source: js.Iterable[Pair]): AsyncGenerator[Key, Unit, Any] = js.native
    def putMany(source: js.Iterable[Pair], options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncGenerator[Key, Unit, Any] = js.native
    def putMany(source: AsyncIterable[Pair]): AsyncGenerator[Key, Unit, Any] = js.native
    def putMany(source: AsyncIterable[Pair], options: typingsJapgolly.interfaceBlockstore.mod.Options): AsyncGenerator[Key, Unit, Any] = js.native
    
    var started: Boolean = js.native
    
    def wantlistForPeer(peerId: PeerId, _options: Any): Map[String, WantListEntry] = js.native
    
    var wm: WantManager = js.native
  }
  
  type BitswapMessage = typingsJapgolly.ipfsBitswap.distSrcMessageMod.BitswapMessage
  
  type Blockstore = typingsJapgolly.interfaceBlockstore.mod.Blockstore
  
  type IPFSBitswap = typingsJapgolly.ipfsBitswap.distSrcTypesMod.IPFSBitswap
  
  type MultihashHasherLoader = typingsJapgolly.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
  
  type Options = typingsJapgolly.interfaceBlockstore.mod.Options
  
  type Pair = typingsJapgolly.interfaceBlockstore.mod.Pair
  
  type PeerId = typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
}
