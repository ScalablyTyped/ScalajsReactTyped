package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.Identifier_
  - typingsJapgolly.babelTypes.libMod.MemberExpression_
  - typingsJapgolly.babelTypes.libMod.RestElement_
  - typingsJapgolly.babelTypes.libMod.AssignmentPattern_
  - typingsJapgolly.babelTypes.libMod.ArrayPattern_
  - typingsJapgolly.babelTypes.libMod.ObjectPattern_
  - typingsJapgolly.babelTypes.libMod.TSParameterProperty__
  - typingsJapgolly.babelTypes.libMod.TSAsExpression__
  - typingsJapgolly.babelTypes.libMod.TSTypeAssertion__
  - typingsJapgolly.babelTypes.libMod.TSNonNullExpression__
*/
trait LVal extends StObject
object LVal {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typingsJapgolly.babelTypes.libMod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSTypeAssertion__ | TSNonNullExpression__,
    right: Expression
  ): typingsJapgolly.babelTypes.libMod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.AssignmentPattern_]
  }
  
  inline def Identifier_(name: String): typingsJapgolly.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.Identifier_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typingsJapgolly.babelTypes.libMod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.MemberExpression_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typingsJapgolly.babelTypes.libMod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal): typingsJapgolly.babelTypes.libMod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.RestElement_]
  }
  
  inline def TSAsExpression__(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSAsExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSAsExpression__]
  }
  
  inline def TSNonNullExpression__(expression: Expression): typingsJapgolly.babelTypes.libMod.TSNonNullExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSNonNullExpression__]
  }
  
  inline def TSParameterProperty__(parameter: Identifier_ | AssignmentPattern_): typingsJapgolly.babelTypes.libMod.TSParameterProperty__ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSParameterProperty__]
  }
  
  inline def TSTypeAssertion__(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSTypeAssertion__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeAssertion__]
  }
}
