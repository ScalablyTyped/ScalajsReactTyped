package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.ExpressionStatement_
  - typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_
  - typingsJapgolly.babelTypes.libMod.TypeCastExpression_
*/
trait ExpressionWrapper extends StObject
object ExpressionWrapper {
  
  inline def ExpressionStatement_(expression: Expression): typingsJapgolly.babelTypes.libMod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ExpressionStatement_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ParenthesizedExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typingsJapgolly.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TypeCastExpression_]
  }
}
