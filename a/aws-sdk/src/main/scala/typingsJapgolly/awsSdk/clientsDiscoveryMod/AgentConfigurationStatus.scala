package typingsJapgolly.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentConfigurationStatus extends StObject {
  
  /**
    * The agent/connector ID.
    */
  var agentId: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the operation performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the status of the StartDataCollection and StopDataCollection operations. The system has recorded the data collection operation. The agent/connector receives this command the next time it polls for a new command. 
    */
  var operationSucceeded: js.UndefOr[Boolean] = js.undefined
}
object AgentConfigurationStatus {
  
  inline def apply(): AgentConfigurationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigurationStatus]
  }
  
  extension [Self <: AgentConfigurationStatus](x: Self) {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOperationSucceeded(value: Boolean): Self = StObject.set(x, "operationSucceeded", value.asInstanceOf[js.Any])
    
    inline def setOperationSucceededUndefined: Self = StObject.set(x, "operationSucceeded", js.undefined)
  }
}
