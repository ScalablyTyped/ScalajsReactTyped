package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionFilterClause extends StObject {
  
  var fieldName: String
  
  /**
    * The order in which this clause appeared in the filter query
    */
  var index: Double
  
  /**
    * Logical Operator 'AND', 'OR' or NULL (only for the first clause in the filter)
    */
  var logicalOperator: String
  
  var operator: String
  
  var value: String
}
object ExpressionFilterClause {
  
  inline def apply(fieldName: String, index: Double, logicalOperator: String, operator: String, value: String): ExpressionFilterClause = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], logicalOperator = logicalOperator.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionFilterClause]
  }
  
  extension [Self <: ExpressionFilterClause](x: Self) {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
