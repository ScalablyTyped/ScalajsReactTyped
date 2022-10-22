package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peers extends StObject {
  
  var Peers: js.Array[Multiaddr_]
}
object Peers {
  
  inline def apply(Peers: js.Array[Multiaddr_]): Peers = {
    val __obj = js.Dynamic.literal(Peers = Peers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peers]
  }
  
  extension [Self <: Peers](x: Self) {
    
    inline def setPeers(value: js.Array[Multiaddr_]): Self = StObject.set(x, "Peers", value.asInstanceOf[js.Any])
    
    inline def setPeersVarargs(value: Multiaddr_ *): Self = StObject.set(x, "Peers", js.Array(value*))
  }
}
