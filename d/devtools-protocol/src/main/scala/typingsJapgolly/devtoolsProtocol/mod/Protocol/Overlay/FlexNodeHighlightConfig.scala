package typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexNodeHighlightConfig extends StObject {
  
  /**
    * A descriptor for the highlight appearance of flex containers.
    */
  var flexContainerHighlightConfig: FlexContainerHighlightConfig
  
  /**
    * Identifier of the node to highlight.
    */
  var nodeId: NodeId
}
object FlexNodeHighlightConfig {
  
  inline def apply(flexContainerHighlightConfig: FlexContainerHighlightConfig, nodeId: NodeId): FlexNodeHighlightConfig = {
    val __obj = js.Dynamic.literal(flexContainerHighlightConfig = flexContainerHighlightConfig.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexNodeHighlightConfig]
  }
  
  extension [Self <: FlexNodeHighlightConfig](x: Self) {
    
    inline def setFlexContainerHighlightConfig(value: FlexContainerHighlightConfig): Self = StObject.set(x, "flexContainerHighlightConfig", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
