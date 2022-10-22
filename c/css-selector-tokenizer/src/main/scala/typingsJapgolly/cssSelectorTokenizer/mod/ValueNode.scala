package typingsJapgolly.cssSelectorTokenizer.mod

import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueNode
  extends StObject
     with BaseNode
     with AnyValueNode {
  
  var nodes: js.Array[ValueNodeType]
  
  var `type`: value
}
object ValueNode {
  
  inline def apply(nodes: js.Array[ValueNodeType]): ValueNode = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[ValueNode]
  }
  
  extension [Self <: ValueNode](x: Self) {
    
    inline def setNodes(value: js.Array[ValueNodeType]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: ValueNodeType*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
