package typingsJapgolly.tern.anon

import typingsJapgolly.tern.libInferMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: typingsJapgolly.estree.mod.Node
  
  var state: Scope | Null
}
object Node {
  
  inline def apply(node: typingsJapgolly.estree.mod.Node): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], state = null)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setNode(value: typingsJapgolly.estree.mod.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setState(value: Scope): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
  }
}
