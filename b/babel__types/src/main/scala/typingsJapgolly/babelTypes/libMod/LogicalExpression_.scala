package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsJapgolly.babelTypes.babelTypesStrings.LogicalExpression
import typingsJapgolly.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typingsJapgolly.babelTypes.babelTypesStrings.VerticallineVerticalline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalExpression_
  extends StObject
     with BaseNode
     with Binary
     with Expression
     with Node
     with Standardized {
  
  var left: Expression
  
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark
  
  var right: Expression
  
  @JSName("type")
  var type_LogicalExpression_ : LogicalExpression
}
object LogicalExpression_ {
  
  inline def apply(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[LogicalExpression_]
  }
  
  extension [Self <: LogicalExpression_](x: Self) {
    
    inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
