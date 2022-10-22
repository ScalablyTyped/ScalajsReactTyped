package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateQueueMaxContactsRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of contacts that can be in the queue before it is considered full.
    */
  var MaxContacts: js.UndefOr[QueueMaxContacts] = js.undefined
  
  /**
    * The identifier for the queue.
    */
  var QueueId: typingsJapgolly.awsSdk.clientsConnectMod.QueueId
}
object UpdateQueueMaxContactsRequest {
  
  inline def apply(InstanceId: InstanceId, QueueId: QueueId): UpdateQueueMaxContactsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QueueId = QueueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueueMaxContactsRequest]
  }
  
  extension [Self <: UpdateQueueMaxContactsRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxContacts(value: QueueMaxContacts): Self = StObject.set(x, "MaxContacts", value.asInstanceOf[js.Any])
    
    inline def setMaxContactsUndefined: Self = StObject.set(x, "MaxContacts", js.undefined)
    
    inline def setQueueId(value: QueueId): Self = StObject.set(x, "QueueId", value.asInstanceOf[js.Any])
  }
}
