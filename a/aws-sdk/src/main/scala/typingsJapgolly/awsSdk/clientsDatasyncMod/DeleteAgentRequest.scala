package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to delete. Use the ListAgents operation to return a list of agents for your account and Amazon Web Services Region.
    */
  var AgentArn: typingsJapgolly.awsSdk.clientsDatasyncMod.AgentArn
}
object DeleteAgentRequest {
  
  inline def apply(AgentArn: AgentArn): DeleteAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAgentRequest]
  }
  
  extension [Self <: DeleteAgentRequest](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
