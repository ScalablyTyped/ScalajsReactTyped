package typingsJapgolly.libp2pWebrtcPeer

import typingsJapgolly.libp2pWebrtcPeer.distSrcPeerMod.WebRTCPeer
import typingsJapgolly.libp2pWebrtcPeer.mod.Signal
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCReceiverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReceiverMod {
  
  @JSImport("@libp2p/webrtc-peer/dist/src/receiver", "WebRTCReceiver")
  @js.native
  open class WebRTCReceiver () extends WebRTCPeer {
    def this(opts: WebRTCReceiverInit) = this()
    
    def handleSignal(signal: Signal): Unit = js.native
    
    /* private */ val handshake: Any = js.native
  }
}
