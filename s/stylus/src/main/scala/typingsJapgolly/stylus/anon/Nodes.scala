package typingsJapgolly.stylus.anon

import typingsJapgolly.stylus.mod.Stylus.Nodes.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nodes extends StObject {
  
  var __type: String
  
  var column: Double
  
  var filename: String
  
  var lineno: Double
  
  var nodes: js.Array[Node]
  
  var scope: Boolean
}
object Nodes {
  
  inline def apply(
    __type: String,
    column: Double,
    filename: String,
    lineno: Double,
    nodes: js.Array[Node],
    scope: Boolean
  ): Nodes = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nodes]
  }
  
  extension [Self <: Nodes](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setLineno(value: Double): Self = StObject.set(x, "lineno", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def set__type(value: String): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
