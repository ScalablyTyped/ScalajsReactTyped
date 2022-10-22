package typingsJapgolly.ipfsCoreTypes.distSrcDhtMod

import typingsJapgolly.ipfsCoreTypes.ipfsCoreTypesStrings.PEER_RESPONSE
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerResponseEvent
  extends StObject
     with QueryEvent {
  
  var closer: js.Array[PeerInfo]
  
  var from: PeerId
  
  var messageName: MessageName
  
  var messageType: MessageType
  
  var name: PEER_RESPONSE
  
  var providers: js.Array[PeerInfo]
  
  var record: js.UndefOr[DHTRecord] = js.undefined
  
  var `type`: typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.PEER_RESPONSE
}
object PeerResponseEvent {
  
  inline def apply(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: MessageName,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.PEER_RESPONSE
  ): PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerResponseEvent]
  }
  
  extension [Self <: PeerResponseEvent](x: Self) {
    
    inline def setCloser(value: js.Array[PeerInfo]): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
    
    inline def setCloserVarargs(value: PeerInfo*): Self = StObject.set(x, "closer", js.Array(value*))
    
    inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMessageName(value: MessageName): Self = StObject.set(x, "messageName", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setName(value: PEER_RESPONSE): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[PeerInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: PeerInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setRecord(value: DHTRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setType(value: typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.PEER_RESPONSE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
