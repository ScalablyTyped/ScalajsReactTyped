package typingsJapgolly.ipfsCoreTypes.distSrcDhtMod

import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.ADDING_PEER
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.DIALING_PEER
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.FINAL_PEER
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.PEER_RESPONSE
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.PROVIDER
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.QUERY_ERROR
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.SENDING_QUERY
import typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.EventTypes.VALUE
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ProviderEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ValueEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent
  - typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddingPeerEvent(peer: PeerId, `type`: ADDING_PEER): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent]
  }
  
  inline def DialingPeerEvent(peer: PeerId, `type`: DIALING_PEER): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent]
  }
  
  inline def FinalPeerEvent(peer: PeerInfo, `type`: FINAL_PEER): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: MessageName,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(providers: js.Array[PeerInfo], `type`: PROVIDER): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ProviderEvent = {
    val __obj = js.Dynamic.literal(name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, `type`: QUERY_ERROR): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent]
  }
  
  inline def SendingQueryEvent(`type`: SENDING_QUERY): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent = {
    val __obj = js.Dynamic.literal(name = "SENDING_QUERY")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent]
  }
  
  inline def ValueEvent(`type`: VALUE, value: js.typedarray.Uint8Array): typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ValueEvent = {
    val __obj = js.Dynamic.literal(name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ipfsCoreTypes.distSrcDhtMod.ValueEvent]
  }
}
