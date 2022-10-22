package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutingProfileQueueReference extends StObject {
  
  /**
    * The channels agents can handle in the Contact Control Panel (CCP) for this routing profile.
    */
  var Channel: typingsJapgolly.awsSdk.clientsConnectMod.Channel
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typingsJapgolly.awsSdk.clientsConnectMod.QueueId
}
object RoutingProfileQueueReference {
  
  inline def apply(Channel: Channel, QueueId: QueueId): RoutingProfileQueueReference = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileQueueReference]
  }
  
  extension [Self <: RoutingProfileQueueReference](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
