package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import typingsJapgolly.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.direct
import typingsJapgolly.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.fanout
import typingsJapgolly.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.floodsub
import typingsJapgolly.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubStrings.mesh
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerGroup extends StObject {
  
  var peerGroup: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout
  
  var topic: TopicLabel
}
object PeerGroup {
  
  inline def apply(
    peerGroup: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout,
    topic: TopicLabel
  ): PeerGroup = {
    val __obj = js.Dynamic.literal(peerGroup = peerGroup.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerGroup]
  }
  
  extension [Self <: PeerGroup](x: Self) {
    
    inline def setPeerGroup(
      value: /* keyof @chainsafe/libp2p-gossipsub.@chainsafe/libp2p-gossipsub/dist/src/metrics.ToSendGroupCount */ direct | floodsub | mesh | fanout
    ): Self = StObject.set(x, "peerGroup", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
