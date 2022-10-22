package typingsJapgolly.typestubIpfs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerInfo extends StObject {
  
  def distinctMultiaddr(): js.Array[Multiaddr]
  
  var id: PeerId
  
  var multiaddr: Multiaddr
  
  var multiaddrs: js.Array[Multiaddr]
}
object PeerInfo {
  
  inline def apply(
    distinctMultiaddr: CallbackTo[js.Array[Multiaddr]],
    id: PeerId,
    multiaddr: Multiaddr,
    multiaddrs: js.Array[Multiaddr]
  ): PeerInfo = {
    val __obj = js.Dynamic.literal(distinctMultiaddr = distinctMultiaddr.toJsFn, id = id.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInfo]
  }
  
  extension [Self <: PeerInfo](x: Self) {
    
    inline def setDistinctMultiaddr(value: CallbackTo[js.Array[Multiaddr]]): Self = StObject.set(x, "distinctMultiaddr", value.toJsFn)
    
    inline def setId(value: PeerId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMultiaddr(value: Multiaddr): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
    
    inline def setMultiaddrs(value: js.Array[Multiaddr]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
    
    inline def setMultiaddrsVarargs(value: Multiaddr*): Self = StObject.set(x, "multiaddrs", js.Array(value*))
  }
}
