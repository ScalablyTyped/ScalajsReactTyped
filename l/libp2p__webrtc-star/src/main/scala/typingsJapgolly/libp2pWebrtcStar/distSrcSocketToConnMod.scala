package typingsJapgolly.libp2pWebrtcStar

import typingsJapgolly.libp2pInterfaceConnection.mod.MultiaddrConnection
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.libp2pWebrtcPeer.mod.WebRTCPeer
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSocketToConnMod {
  
  @JSImport("@libp2p/webrtc-star/dist/src/socket-to-conn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMultiaddrConnection(socket: WebRTCPeer, options: ToMultiaddrConnectionOptions): MultiaddrConnection = (^.asInstanceOf[js.Dynamic].applyDynamic("toMultiaddrConnection")(socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MultiaddrConnection]
  
  trait ToMultiaddrConnectionOptions
    extends StObject
       with AbortOptions {
    
    var remoteAddr: Multiaddr_
  }
  object ToMultiaddrConnectionOptions {
    
    inline def apply(remoteAddr: Multiaddr_): ToMultiaddrConnectionOptions = {
      val __obj = js.Dynamic.literal(remoteAddr = remoteAddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToMultiaddrConnectionOptions]
    }
    
    extension [Self <: ToMultiaddrConnectionOptions](x: Self) {
      
      inline def setRemoteAddr(value: Multiaddr_): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
    }
  }
}
