package typingsJapgolly.libp2pInterfaceDht.mod

import typingsJapgolly.libp2pInterfaceDht.libp2pInterfaceDhtStrings.DIALING_PEER
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialingPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: DIALING_PEER
  
  var peer: PeerId
  
  var `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.DIALING_PEER
}
object DialingPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.DIALING_PEER): DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialingPeerEvent]
  }
  
  extension [Self <: DialingPeerEvent](x: Self) {
    
    inline def setName(value: DIALING_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.DIALING_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
