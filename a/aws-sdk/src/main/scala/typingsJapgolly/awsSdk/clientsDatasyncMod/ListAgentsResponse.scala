package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentsResponse extends StObject {
  
  /**
    * A list of agents in your account.
    */
  var Agents: js.UndefOr[AgentList] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin returning the next list of agents.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.NextToken] = js.undefined
}
object ListAgentsResponse {
  
  inline def apply(): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentsResponse]
  }
  
  extension [Self <: ListAgentsResponse](x: Self) {
    
    inline def setAgents(value: AgentList): Self = StObject.set(x, "Agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsUndefined: Self = StObject.set(x, "Agents", js.undefined)
    
    inline def setAgentsVarargs(value: AgentListEntry*): Self = StObject.set(x, "Agents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
