package typingsJapgolly.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentRoutingProfile extends StObject {
  
  /** See `agent.getChannelConcurrency()` for more info. */
  val channelConcurrencyMap: AgentChannelConcurrencyMap
  
  /** The default queue which should be associated with outbound contacts. */
  val defaultOutboundQueue: Queue
  
  /** The name of the routing profile. */
  val name: String
  
  /** The queues contained in the routing profile. */
  val queues: js.Array[Queue]
  
  /** The routing profile ARN. */
  val routingProfileARN: String
  
  /** Alias for `routingProfileARN`. */
  val routingProfileId: String
}
object AgentRoutingProfile {
  
  inline def apply(
    channelConcurrencyMap: AgentChannelConcurrencyMap,
    defaultOutboundQueue: Queue,
    name: String,
    queues: js.Array[Queue],
    routingProfileARN: String,
    routingProfileId: String
  ): AgentRoutingProfile = {
    val __obj = js.Dynamic.literal(channelConcurrencyMap = channelConcurrencyMap.asInstanceOf[js.Any], defaultOutboundQueue = defaultOutboundQueue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any], routingProfileARN = routingProfileARN.asInstanceOf[js.Any], routingProfileId = routingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRoutingProfile]
  }
  
  extension [Self <: AgentRoutingProfile](x: Self) {
    
    inline def setChannelConcurrencyMap(value: AgentChannelConcurrencyMap): Self = StObject.set(x, "channelConcurrencyMap", value.asInstanceOf[js.Any])
    
    inline def setDefaultOutboundQueue(value: Queue): Self = StObject.set(x, "defaultOutboundQueue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueues(value: js.Array[Queue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "queues", js.Array(value*))
    
    inline def setRoutingProfileARN(value: String): Self = StObject.set(x, "routingProfileARN", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileId(value: String): Self = StObject.set(x, "routingProfileId", value.asInstanceOf[js.Any])
  }
}
