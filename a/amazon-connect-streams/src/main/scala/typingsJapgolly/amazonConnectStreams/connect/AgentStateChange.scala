package typingsJapgolly.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStateChange extends StObject {
  
  /** The `Agent` API object. */
  val agent: Agent
  
  /** The name of the agent's new state. */
  val newState: String
  
  /** The name of the agent's previous state. */
  val oldState: String
}
object AgentStateChange {
  
  inline def apply(agent: Agent, newState: String, oldState: String): AgentStateChange = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentStateChange]
  }
  
  extension [Self <: AgentStateChange](x: Self) {
    
    inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: String): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
  }
}
