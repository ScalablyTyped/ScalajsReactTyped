package typingsJapgolly.libp2pWebrtcPeer

import org.scalajs.dom.RTCPeerConnection
import typingsJapgolly.itPushable.mod.Pushable_
import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.itStreamTypes.mod.Sink
import typingsJapgolly.itStreamTypes.mod.Source
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import typingsJapgolly.libp2pLogger.mod.Logger_
import typingsJapgolly.libp2pWebrtcPeer.anon.Channel
import typingsJapgolly.libp2pWebrtcPeer.anon.WebRTCPeerInitlogPrefixst
import typingsJapgolly.libp2pWebrtcPeer.distSrcChannelMod.WebRTCDataChannel
import typingsJapgolly.libp2pWebrtcPeer.mod.WRTC
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCPeerEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerMod {
  
  @JSImport("@libp2p/webrtc-peer/dist/src/peer", "WebRTCPeer")
  @js.native
  open class WebRTCPeer protected ()
    extends EventEmitter[WebRTCPeerEvents]
       with Duplex[js.typedarray.Uint8Array, js.typedarray.Uint8Array, js.Promise[Unit]] {
    def this(opts: WebRTCPeerInitlogPrefixst) = this()
    
    /* protected */ var channel: js.UndefOr[WebRTCDataChannel] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(err: js.Error): js.Promise[Unit] = js.native
    
    var closed: Boolean = js.native
    
    /* private */ val connected: Any = js.native
    
    /* protected */ def handleDataChannelEvent(event: Channel): Unit = js.native
    
    var id: String = js.native
    
    /* protected */ def log(formatter: Any, args: Any*): Unit = js.native
    /* protected */ @JSName("log")
    var log_Original: Logger_ = js.native
    
    /* protected */ var peerConnection: RTCPeerConnection = js.native
    
    /* CompleteClass */
    override def sink(source: Source[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("sink")
    var sink_Original: Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /* CompleteClass */
    var source: Source[js.typedarray.Uint8Array] = js.native
    @JSName("source")
    var source_WebRTCPeer: Pushable_[js.typedarray.Uint8Array] = js.native
    
    /* protected */ var wrtc: WRTC = js.native
  }
}
