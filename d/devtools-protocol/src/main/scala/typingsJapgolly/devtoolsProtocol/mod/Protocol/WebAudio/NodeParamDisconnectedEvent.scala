package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeParamDisconnectedEvent extends StObject {
  
  var contextId: GraphObjectId
  
  var destinationId: GraphObjectId
  
  var sourceId: GraphObjectId
  
  var sourceOutputIndex: js.UndefOr[Double] = js.undefined
}
object NodeParamDisconnectedEvent {
  
  inline def apply(contextId: GraphObjectId, destinationId: GraphObjectId, sourceId: GraphObjectId): NodeParamDisconnectedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParamDisconnectedEvent]
  }
  
  extension [Self <: NodeParamDisconnectedEvent](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setDestinationId(value: GraphObjectId): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: GraphObjectId): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceOutputIndex(value: Double): Self = StObject.set(x, "sourceOutputIndex", value.asInstanceOf[js.Any])
    
    inline def setSourceOutputIndexUndefined: Self = StObject.set(x, "sourceOutputIndex", js.undefined)
  }
}
