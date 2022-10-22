package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.Identifier_
  - typingsJapgolly.babelTypes.mod.MemberExpression_
  - typingsJapgolly.babelTypes.mod.RestElement_
  - typingsJapgolly.babelTypes.mod.AssignmentPattern_
  - typingsJapgolly.babelTypes.mod.ArrayPattern_
  - typingsJapgolly.babelTypes.mod.ObjectPattern_
  - typingsJapgolly.babelTypes.mod.TSParameterProperty_
  - typingsJapgolly.babelTypes.mod.TSAsExpression_
  - typingsJapgolly.babelTypes.mod.TSTypeAssertion_
  - typingsJapgolly.babelTypes.mod.TSNonNullExpression_
*/
trait LVal
  extends StObject
     with _Node
object LVal {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typingsJapgolly.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSTypeAssertion_ | TSNonNullExpression_,
    right: Expression
  ): typingsJapgolly.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.AssignmentPattern_]
  }
  
  inline def Identifier_(name: String): typingsJapgolly.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.Identifier_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typingsJapgolly.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.MemberExpression_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typingsJapgolly.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.ObjectPattern_]
  }
  
  inline def RestElement_(argument: LVal): typingsJapgolly.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.RestElement_]
  }
  
  inline def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSAsExpression_]
  }
  
  inline def TSNonNullExpression_(expression: Expression): typingsJapgolly.babelTypes.mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSNonNullExpression_]
  }
  
  inline def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_): typingsJapgolly.babelTypes.mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.updateDynamic("override")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSParameterProperty_]
  }
  
  inline def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeAssertion_]
  }
}
