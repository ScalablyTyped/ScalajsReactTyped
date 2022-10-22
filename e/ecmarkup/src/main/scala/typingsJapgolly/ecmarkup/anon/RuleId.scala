package typingsJapgolly.ecmarkup.anon

import typingsJapgolly.ecmarkup.ecmarkupStrings.`attr-value`
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleId
  extends StObject
     with Warning {
  
  var attr: String
  
  var message: String
  
  var node: org.scalajs.dom.Element
  
  var ruleId: String
  
  var `type`: `attr-value`
}
object RuleId {
  
  inline def apply(attr: String, message: String, node: org.scalajs.dom.Element, ruleId: String): RuleId = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attr-value")
    __obj.asInstanceOf[RuleId]
  }
  
  extension [Self <: RuleId](x: Self) {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode(value: org.scalajs.dom.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: `attr-value`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
