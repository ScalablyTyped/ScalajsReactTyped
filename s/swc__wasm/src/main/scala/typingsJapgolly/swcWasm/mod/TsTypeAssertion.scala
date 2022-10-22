package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeAssertion
  extends StObject
     with ExpressionBase
     with Expression {
  
  var expression: Expression
  
  var typeAnnotation: TsType
  
  @JSName("type")
  var type_TsTypeAssertion: typingsJapgolly.swcWasm.swcWasmStrings.TsTypeAssertion
}
object TsTypeAssertion {
  
  inline def apply(expression: Expression, span: Span, typeAnnotation: TsType): TsTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeAssertion")
    __obj.asInstanceOf[TsTypeAssertion]
  }
  
  extension [Self <: TsTypeAssertion](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.swcWasm.swcWasmStrings.TsTypeAssertion): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
