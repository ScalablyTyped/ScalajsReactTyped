package typingsJapgolly.sparqljs.mod

import typingsJapgolly.sparqljs.sparqljsStrings.operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationExpression
  extends StObject
     with BaseExpression
     with _Expression {
  
  var args: js.Array[Expression]
  
  var operator: String
  
  @JSName("type")
  var type_OperationExpression: operation
}
object OperationExpression {
  
  inline def apply(args: js.Array[Expression], operator: String): OperationExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operation")
    __obj.asInstanceOf[OperationExpression]
  }
  
  extension [Self <: OperationExpression](x: Self) {
    
    inline def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setType(value: operation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
