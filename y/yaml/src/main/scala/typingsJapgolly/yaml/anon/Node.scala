package typingsJapgolly.yaml.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var anchor: String | Null
  
  var node: typingsJapgolly.yaml.distNodesNodeMod.Node[Any] | Null
}
object Node {
  
  inline def apply(): Node = {
    val __obj = js.Dynamic.literal(anchor = null, node = null)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setNode(value: typingsJapgolly.yaml.distNodesNodeMod.Node[Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
  }
}
