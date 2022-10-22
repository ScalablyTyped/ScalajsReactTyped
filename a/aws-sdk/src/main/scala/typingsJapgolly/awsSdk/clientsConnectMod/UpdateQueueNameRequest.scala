package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueNameRequest extends StObject {
  
  /**
    * The description of the queue.
    */
  var Description: js.UndefOr[QueueDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the queue.
    */
  var Name: js.UndefOr[CommonNameLength127] = js.undefined
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typingsJapgolly.awsSdk.clientsConnectMod.QueueId
}
object UpdateQueueNameRequest {
  
  inline def apply(InstanceId: InstanceId, QueueId: QueueId): UpdateQueueNameRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueNameRequest]
  }
  
  extension [Self <: UpdateQueueNameRequest](x: Self) {
    
    inline def setDescription(value: QueueDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
