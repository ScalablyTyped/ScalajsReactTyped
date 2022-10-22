package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsInstantiation
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  var expression: Expression
  
  var typeArguments: TsTypeParameterInstantiation
  
  @JSName("type")
  var type_TsInstantiation: typingsJapgolly.swcCore.swcCoreStrings.TsInstantiation
}
object TsInstantiation {
  
  inline def apply(expression: Expression, span: Span, typeArguments: TsTypeParameterInstantiation): TsInstantiation = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeArguments = typeArguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInstantiation")
    __obj.asInstanceOf[TsInstantiation]
  }
  
  extension [Self <: TsInstantiation](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.TsInstantiation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
  }
}
