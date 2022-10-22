package typingsJapgolly.stylus.anon

import typingsJapgolly.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var __type: String
  
  var block: typingsJapgolly.stylus.mod.Stylus.Nodes.Block
  
  var column: Double
  
  var filename: String
  
  var lineno: Double
  
  var nodes: js.Array[Node]
}
object Block {
  
  inline def apply(
    __type: String,
    block: typingsJapgolly.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[Node]
  ): Block = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: typingsJapgolly.stylus.mod.Stylus.Nodes.Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
