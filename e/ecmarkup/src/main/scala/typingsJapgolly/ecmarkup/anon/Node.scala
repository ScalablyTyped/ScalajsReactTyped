package typingsJapgolly.ecmarkup.anon

import org.scalajs.dom.Text
import typingsJapgolly.ecmarkup.ecmarkupStrings.node
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node
  extends StObject
     with Warning {
  
  var message: String
  
  var node: Text | org.scalajs.dom.Element
  
  var ruleId: String
  
  var `type`: node
}
object Node {
  
  inline def apply(message: String, node: Text | org.scalajs.dom.Element, ruleId: String): Node = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("node")
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Text | org.scalajs.dom.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: node): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
