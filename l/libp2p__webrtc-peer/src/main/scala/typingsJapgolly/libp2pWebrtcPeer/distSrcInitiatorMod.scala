package typingsJapgolly.libp2pWebrtcPeer

import typingsJapgolly.libp2pWebrtcPeer.distSrcPeerMod.WebRTCPeer
import typingsJapgolly.libp2pWebrtcPeer.mod.Signal
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCInitiatorInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcInitiatorMod {
  
  @JSImport("@libp2p/webrtc-peer/dist/src/initiator", "WebRTCInitiator")
  @js.native
  open class WebRTCInitiator () extends WebRTCPeer {
    def this(opts: WebRTCInitiatorInit) = this()
    
    def handleSignal(signal: Signal): Unit = js.native
    
    /* private */ val handshake: Any = js.native
  }
}
