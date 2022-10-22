package typingsJapgolly.ecmarkup.anon

import org.scalajs.dom.Text
import typingsJapgolly.ecmarkup.ecmarkupStrings.contents
import typingsJapgolly.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeRelativeColumn
  extends StObject
     with Warning {
  
  var message: String
  
  var node: Text | org.scalajs.dom.Element
  
  var nodeRelativeColumn: Double
  
  var nodeRelativeLine: Double
  
  var ruleId: String
  
  var `type`: contents
}
object NodeRelativeColumn {
  
  inline def apply(
    message: String,
    node: Text | org.scalajs.dom.Element,
    nodeRelativeColumn: Double,
    nodeRelativeLine: Double,
    ruleId: String
  ): NodeRelativeColumn = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contents")
    __obj.asInstanceOf[NodeRelativeColumn]
  }
  
  extension [Self <: NodeRelativeColumn](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Text | org.scalajs.dom.Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeRelativeColumn(value: Double): Self = StObject.set(x, "nodeRelativeColumn", value.asInstanceOf[js.Any])
    
    inline def setNodeRelativeLine(value: Double): Self = StObject.set(x, "nodeRelativeLine", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: contents): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
