package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1Edge extends StObject {
  
  /** The source node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var sourceNode: js.UndefOr[String] = js.undefined
  
  /** The target node of the edge. For example, it could be a full resource name for a resource node or an email of an identity. */
  var targetNode: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1Edge {
  
  inline def apply(): GoogleCloudAssetV1Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Edge]
  }
  
  extension [Self <: GoogleCloudAssetV1Edge](x: Self) {
    
    inline def setSourceNode(value: String): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    inline def setTargetNode(value: String): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
    
    inline def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
  }
}
