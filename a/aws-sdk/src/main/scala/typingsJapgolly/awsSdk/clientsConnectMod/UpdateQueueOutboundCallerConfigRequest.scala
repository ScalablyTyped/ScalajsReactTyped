package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueOutboundCallerConfigRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The outbound caller ID name, number, and outbound whisper flow.
    */
  var OutboundCallerConfig: typingsJapgolly.awsSdk.clientsConnectMod.OutboundCallerConfig
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typingsJapgolly.awsSdk.clientsConnectMod.QueueId
}
object UpdateQueueOutboundCallerConfigRequest {
  
  inline def apply(InstanceId: InstanceId, OutboundCallerConfig: OutboundCallerConfig, QueueId: QueueId): UpdateQueueOutboundCallerConfigRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], OutboundCallerConfig = OutboundCallerConfig.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueOutboundCallerConfigRequest]
  }
  
  extension [Self <: UpdateQueueOutboundCallerConfigRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallerConfig(value: OutboundCallerConfig): Self = StObject.set(x, "OutboundCallerConfig", value.asInstanceOf[js.Any])
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
