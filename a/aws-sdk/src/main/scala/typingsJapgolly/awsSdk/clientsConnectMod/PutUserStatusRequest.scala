package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutUserStatusRequest extends StObject {
  
  /**
    * The identifier of the agent status.
    */
  var AgentStatusId: typingsJapgolly.awsSdk.clientsConnectMod.AgentStatusId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the user.
    */
  var UserId: typingsJapgolly.awsSdk.clientsConnectMod.UserId
}
object PutUserStatusRequest {
  
  inline def apply(AgentStatusId: AgentStatusId, InstanceId: InstanceId, UserId: UserId): PutUserStatusRequest = {
    val __obj = js.Dynamic.literal(AgentStatusId = AgentStatusId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutUserStatusRequest]
  }
  
  extension [Self <: PutUserStatusRequest](x: Self) {
    
    inline def setAgentStatusId(value: AgentStatusId): Self = StObject.set(x, "AgentStatusId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
