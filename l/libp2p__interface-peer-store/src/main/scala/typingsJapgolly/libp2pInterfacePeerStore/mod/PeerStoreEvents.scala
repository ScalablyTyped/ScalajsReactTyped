package typingsJapgolly.libp2pInterfacePeerStore.mod

import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStoreEvents extends StObject {
  
  @JSName("change:metadata")
  var changeColonmetadata: CustomEvent
  
  @JSName("change:multiaddrs")
  var changeColonmultiaddrs: CustomEvent
  
  @JSName("change:protocols")
  var changeColonprotocols: CustomEvent
  
  @JSName("change:pubkey")
  var changeColonpubkey: CustomEvent
  
  var peer: CustomEvent
}
object PeerStoreEvents {
  
  inline def apply(
    changeColonmetadata: CustomEvent,
    changeColonmultiaddrs: CustomEvent,
    changeColonprotocols: CustomEvent,
    changeColonpubkey: CustomEvent,
    peer: CustomEvent
  ): PeerStoreEvents = {
    val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("change:metadata")(changeColonmetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("change:multiaddrs")(changeColonmultiaddrs.asInstanceOf[js.Any])
    __obj.updateDynamic("change:protocols")(changeColonprotocols.asInstanceOf[js.Any])
    __obj.updateDynamic("change:pubkey")(changeColonpubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStoreEvents]
  }
  
  extension [Self <: PeerStoreEvents](x: Self) {
    
    inline def setChangeColonmetadata(value: CustomEvent): Self = StObject.set(x, "change:metadata", value.asInstanceOf[js.Any])
    
    inline def setChangeColonmultiaddrs(value: CustomEvent): Self = StObject.set(x, "change:multiaddrs", value.asInstanceOf[js.Any])
    
    inline def setChangeColonprotocols(value: CustomEvent): Self = StObject.set(x, "change:protocols", value.asInstanceOf[js.Any])
    
    inline def setChangeColonpubkey(value: CustomEvent): Self = StObject.set(x, "change:pubkey", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: CustomEvent): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}
