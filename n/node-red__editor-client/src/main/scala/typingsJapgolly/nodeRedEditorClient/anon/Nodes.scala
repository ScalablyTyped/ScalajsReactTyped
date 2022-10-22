package typingsJapgolly.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var links: js.Array[js.Object]
  
  var nodes: js.Array[js.Object]
  
  var subflows: js.Array[js.Object]
}
object Nodes {
  
  inline def apply(links: js.Array[js.Object], nodes: js.Array[js.Object], subflows: js.Array[js.Object]): Nodes = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], subflows = subflows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setLinks(value: js.Array[js.Object]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksVarargs(value: js.Object*): Self = StObject.set(x, "links", js.Array(value*))
    
    inline def setNodes(value: js.Array[js.Object]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: js.Object*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setSubflows(value: js.Array[js.Object]): Self = StObject.set(x, "subflows", value.asInstanceOf[js.Any])
    
    inline def setSubflowsVarargs(value: js.Object*): Self = StObject.set(x, "subflows", js.Array(value*))
  }
}
