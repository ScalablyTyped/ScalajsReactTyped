package typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightNodeRequest extends StObject {
  
  /**
    * Identifier of the backend node to highlight.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
  
  /**
    * A descriptor for the highlight appearance.
    */
  var highlightConfig: HighlightConfig
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
  
  /**
    * JavaScript object id of the node to be highlighted.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Selectors to highlight relevant nodes.
    */
  var selector: js.UndefOr[String] = js.undefined
}
object HighlightNodeRequest {
  
  inline def apply(highlightConfig: HighlightConfig): HighlightNodeRequest = {
    val __obj = js.Dynamic.literal(highlightConfig = highlightConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightNodeRequest]
  }
  
  extension [Self <: HighlightNodeRequest](x: Self) {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
    
    inline def setHighlightConfig(value: HighlightConfig): Self = StObject.set(x, "highlightConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
