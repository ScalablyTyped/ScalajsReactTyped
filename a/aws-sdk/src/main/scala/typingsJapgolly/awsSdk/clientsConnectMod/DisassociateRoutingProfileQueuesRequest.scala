package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateRoutingProfileQueuesRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The queues to disassociate from this routing profile.
    */
  var QueueReferences: RoutingProfileQueueReferenceList
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typingsJapgolly.awsSdk.clientsConnectMod.RoutingProfileId
}
object DisassociateRoutingProfileQueuesRequest {
  
  inline def apply(
    InstanceId: InstanceId,
    QueueReferences: RoutingProfileQueueReferenceList,
    RoutingProfileId: RoutingProfileId
  ): DisassociateRoutingProfileQueuesRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueReferences = QueueReferences.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateRoutingProfileQueuesRequest]
  }
  
  extension [Self <: DisassociateRoutingProfileQueuesRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQueueReferences(value: RoutingProfileQueueReferenceList): Self = StObject.set(x, "QueueReferences", value.asInstanceOf[js.Any])
    
    inline def setQueueReferencesVarargs(value: RoutingProfileQueueReference*): Self = StObject.set(x, "QueueReferences", js.Array(value*))
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
