package typingsJapgolly.libp2pInterfaceDht.mod

import typingsJapgolly.libp2pInterfaceDht.libp2pInterfaceDhtStrings.ADDING_PEER
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddingPeerEvent
  extends StObject
     with QueryEvent {
  
  var name: ADDING_PEER
  
  var peer: PeerId
  
  var `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.ADDING_PEER
}
object AddingPeerEvent {
  
  inline def apply(peer: PeerId, `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.ADDING_PEER): AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddingPeerEvent]
  }
  
  extension [Self <: AddingPeerEvent](x: Self) {
    
    inline def setName(value: ADDING_PEER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.ADDING_PEER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
