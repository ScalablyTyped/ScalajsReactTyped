package typingsJapgolly.cssSelectorTokenizer.mod

import typingsJapgolly.cssSelectorTokenizer.cssSelectorTokenizerStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorNode
  extends StObject
     with BaseNode
     with SelectorNodeType {
  
  var operator: String
  
  var `type`: operator
}
object OperatorNode {
  
  inline def apply(operator: String): OperatorNode = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[OperatorNode]
  }
  
  extension [Self <: OperatorNode](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
