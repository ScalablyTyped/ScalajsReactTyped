package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: typingsJapgolly.babelTypes.mod.Node
}
object Node {
  
  inline def apply(node: typingsJapgolly.babelTypes.mod.Node): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: typingsJapgolly.babelTypes.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
