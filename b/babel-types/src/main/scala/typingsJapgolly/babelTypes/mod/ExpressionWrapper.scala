package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.ExpressionStatement_
  - typingsJapgolly.babelTypes.mod.TypeCastExpression_
  - typingsJapgolly.babelTypes.mod.ParenthesizedExpression_
*/
trait ExpressionWrapper extends StObject
object ExpressionWrapper {
  
  inline def ExpressionStatement_(end: Double, expression: Expression, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ExpressionStatement_]
  }
  
  inline def ParenthesizedExpression_(end: Double, expression: Expression, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ParenthesizedExpression_]
  }
  
  inline def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    typeAnnotation: FlowTypeAnnotation
  ): typingsJapgolly.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TypeCastExpression_]
  }
}
