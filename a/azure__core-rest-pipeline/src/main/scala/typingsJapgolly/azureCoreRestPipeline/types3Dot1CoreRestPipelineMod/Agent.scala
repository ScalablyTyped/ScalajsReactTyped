package typingsJapgolly.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agent extends StObject {
  
  /**
    * Destroy any sockets that are currently in use by the agent.
    */
  def destroy(): Unit
  
  /**
    * For agents with keepAlive enabled, this sets the maximum number of sockets that will be left open in the free state.
    */
  var maxFreeSockets: Double
  
  /**
    * Determines how many concurrent sockets the agent can have open per origin.
    */
  var maxSockets: Double
  
  /**
    * An object which contains queues of requests that have not yet been assigned to sockets.
    */
  var requests: Any
  
  /**
    * An object which contains arrays of sockets currently in use by the agent.
    */
  var sockets: Any
}
object Agent {
  
  inline def apply(destroy: Callback, maxFreeSockets: Double, maxSockets: Double, requests: Any, sockets: Any): Agent = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, maxFreeSockets = maxFreeSockets.asInstanceOf[js.Any], maxSockets = maxSockets.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Agent]
  }
  
  extension [Self <: Agent](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: Any): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setSockets(value: Any): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
  }
}
