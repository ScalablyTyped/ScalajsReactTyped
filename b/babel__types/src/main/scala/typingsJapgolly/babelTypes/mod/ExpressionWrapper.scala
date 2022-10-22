package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ExpressionStatement_
  - typingsJapgolly.babelTypes.mod.ParenthesizedExpression_
  - typingsJapgolly.babelTypes.mod.TypeCastExpression_
*/
trait ExpressionWrapper
  extends StObject
     with _Node
object ExpressionWrapper {
  
  inline def ExpressionStatement_(expression: Expression): typingsJapgolly.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExpressionStatement_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ParenthesizedExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeCastExpression_]
  }
}
