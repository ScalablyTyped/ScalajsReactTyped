package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.StringExpr
import typingsJapgolly.qlik.qlikStrings.StringExpression
import typingsJapgolly.qlik.qlikStrings.ValueExpression
import typingsJapgolly.qlik.qlikStrings.dimension
import typingsJapgolly.qlik.qlikStrings.expression
import typingsJapgolly.qlik.qlikStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyExpression
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: expression
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  
  @JSName("type")
  var type_CustomPropertyExpression: Unit
}
object CustomPropertyExpression {
  
  inline def apply(
    expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    `type`: Unit
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = "expression", expressionType = expressionType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
  
  extension [Self <: CustomPropertyExpression](x: Self) {
    
    inline def setComponent(value: expression): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExpressionType(
      value: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
    ): Self = StObject.set(x, "expressionType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
