package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowGraphResponse extends StObject {
  
  /**
    * A list of the edges in the resulting DAG.
    */
  var DagEdges: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.DagEdges] = js.undefined
  
  /**
    * A list of the nodes in the resulting DAG.
    */
  var DagNodes: js.UndefOr[typingsJapgolly.awsSdk.clientsGlueMod.DagNodes] = js.undefined
}
object GetDataflowGraphResponse {
  
  inline def apply(): GetDataflowGraphResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataflowGraphResponse]
  }
  
  extension [Self <: GetDataflowGraphResponse](x: Self) {
    
    inline def setDagEdges(value: DagEdges): Self = StObject.set(x, "DagEdges", value.asInstanceOf[js.Any])
    
    inline def setDagEdgesUndefined: Self = StObject.set(x, "DagEdges", js.undefined)
    
    inline def setDagEdgesVarargs(value: CodeGenEdge*): Self = StObject.set(x, "DagEdges", js.Array(value*))
    
    inline def setDagNodes(value: DagNodes): Self = StObject.set(x, "DagNodes", value.asInstanceOf[js.Any])
    
    inline def setDagNodesUndefined: Self = StObject.set(x, "DagNodes", js.undefined)
    
    inline def setDagNodesVarargs(value: CodeGenNode*): Self = StObject.set(x, "DagNodes", js.Array(value*))
  }
}
