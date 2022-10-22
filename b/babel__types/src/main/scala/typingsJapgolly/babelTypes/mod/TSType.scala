package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.TSAnyKeyword_
  - typingsJapgolly.babelTypes.mod.TSBooleanKeyword_
  - typingsJapgolly.babelTypes.mod.TSBigIntKeyword_
  - typingsJapgolly.babelTypes.mod.TSIntrinsicKeyword_
  - typingsJapgolly.babelTypes.mod.TSNeverKeyword_
  - typingsJapgolly.babelTypes.mod.TSNullKeyword_
  - typingsJapgolly.babelTypes.mod.TSNumberKeyword_
  - typingsJapgolly.babelTypes.mod.TSObjectKeyword_
  - typingsJapgolly.babelTypes.mod.TSStringKeyword_
  - typingsJapgolly.babelTypes.mod.TSSymbolKeyword_
  - typingsJapgolly.babelTypes.mod.TSUndefinedKeyword_
  - typingsJapgolly.babelTypes.mod.TSUnknownKeyword_
  - typingsJapgolly.babelTypes.mod.TSVoidKeyword_
  - typingsJapgolly.babelTypes.mod.TSThisType_
  - typingsJapgolly.babelTypes.mod.TSFunctionType_
  - typingsJapgolly.babelTypes.mod.TSConstructorType_
  - typingsJapgolly.babelTypes.mod.TSTypeReference_
  - typingsJapgolly.babelTypes.mod.TSTypePredicate_
  - typingsJapgolly.babelTypes.mod.TSTypeQuery_
  - typingsJapgolly.babelTypes.mod.TSTypeLiteral_
  - typingsJapgolly.babelTypes.mod.TSArrayType_
  - typingsJapgolly.babelTypes.mod.TSTupleType_
  - typingsJapgolly.babelTypes.mod.TSOptionalType_
  - typingsJapgolly.babelTypes.mod.TSRestType_
  - typingsJapgolly.babelTypes.mod.TSUnionType_
  - typingsJapgolly.babelTypes.mod.TSIntersectionType_
  - typingsJapgolly.babelTypes.mod.TSConditionalType_
  - typingsJapgolly.babelTypes.mod.TSInferType_
  - typingsJapgolly.babelTypes.mod.TSParenthesizedType_
  - typingsJapgolly.babelTypes.mod.TSTypeOperator_
  - typingsJapgolly.babelTypes.mod.TSIndexedAccessType_
  - typingsJapgolly.babelTypes.mod.TSMappedType_
  - typingsJapgolly.babelTypes.mod.TSLiteralType_
  - typingsJapgolly.babelTypes.mod.TSExpressionWithTypeArguments_
  - typingsJapgolly.babelTypes.mod.TSImportType_
*/
trait TSType
  extends StObject
     with _Node
object TSType {
  
  inline def TSAnyKeyword_(): typingsJapgolly.babelTypes.mod.TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSAnyKeyword_]
  }
  
  inline def TSArrayType_(elementType: TSType): typingsJapgolly.babelTypes.mod.TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSArrayType_]
  }
  
  inline def TSBigIntKeyword_(): typingsJapgolly.babelTypes.mod.TSBigIntKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSBigIntKeyword_]
  }
  
  inline def TSBooleanKeyword_(): typingsJapgolly.babelTypes.mod.TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSBooleanKeyword_]
  }
  
  inline def TSConditionalType_(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typingsJapgolly.babelTypes.mod.TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSConditionalType_]
  }
  
  inline def TSConstructorType_(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.mod.TSConstructorType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSConstructorType_]
  }
  
  inline def TSExpressionWithTypeArguments_(expression: TSEntityName): typingsJapgolly.babelTypes.mod.TSExpressionWithTypeArguments_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSExpressionWithTypeArguments_]
  }
  
  inline def TSFunctionType_(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.mod.TSFunctionType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSFunctionType_]
  }
  
  inline def TSImportType_(argument: StringLiteral_): typingsJapgolly.babelTypes.mod.TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, qualifier = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSImportType_]
  }
  
  inline def TSIndexedAccessType_(indexType: TSType, objectType: TSType): typingsJapgolly.babelTypes.mod.TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSIndexedAccessType_]
  }
  
  inline def TSInferType_(typeParameter: TSTypeParameter_): typingsJapgolly.babelTypes.mod.TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSInferType_]
  }
  
  inline def TSIntersectionType_(types: js.Array[TSType]): typingsJapgolly.babelTypes.mod.TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSIntersectionType_]
  }
  
  inline def TSIntrinsicKeyword_(): typingsJapgolly.babelTypes.mod.TSIntrinsicKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSIntrinsicKeyword_]
  }
  
  inline def TSLiteralType_(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typingsJapgolly.babelTypes.mod.TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSLiteralType_]
  }
  
  inline def TSMappedType_(typeParameter: TSTypeParameter_): typingsJapgolly.babelTypes.mod.TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, nameType = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSMappedType_]
  }
  
  inline def TSNeverKeyword_(): typingsJapgolly.babelTypes.mod.TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSNeverKeyword_]
  }
  
  inline def TSNullKeyword_(): typingsJapgolly.babelTypes.mod.TSNullKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSNullKeyword_]
  }
  
  inline def TSNumberKeyword_(): typingsJapgolly.babelTypes.mod.TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSNumberKeyword_]
  }
  
  inline def TSObjectKeyword_(): typingsJapgolly.babelTypes.mod.TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSObjectKeyword_]
  }
  
  inline def TSOptionalType_(typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSOptionalType_]
  }
  
  inline def TSParenthesizedType_(typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSParenthesizedType_]
  }
  
  inline def TSRestType_(typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSRestType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSRestType_]
  }
  
  inline def TSStringKeyword_(): typingsJapgolly.babelTypes.mod.TSStringKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSStringKeyword_]
  }
  
  inline def TSSymbolKeyword_(): typingsJapgolly.babelTypes.mod.TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSSymbolKeyword_]
  }
  
  inline def TSThisType_(): typingsJapgolly.babelTypes.mod.TSThisType_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSThisType_]
  }
  
  inline def TSTupleType_(elementTypes: js.Array[TSType | TSNamedTupleMember_]): typingsJapgolly.babelTypes.mod.TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTupleType_]
  }
  
  inline def TSTypeLiteral_(members: js.Array[TSTypeElement]): typingsJapgolly.babelTypes.mod.TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeLiteral_]
  }
  
  inline def TSTypeOperator_(operator: String, typeAnnotation: TSType): typingsJapgolly.babelTypes.mod.TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeOperator_]
  }
  
  inline def TSTypePredicate_(parameterName: Identifier_ | TSThisType_): typingsJapgolly.babelTypes.mod.TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], asserts = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypePredicate_]
  }
  
  inline def TSTypeQuery_(exprName: TSEntityName | TSImportType_): typingsJapgolly.babelTypes.mod.TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeQuery_]
  }
  
  inline def TSTypeReference_(typeName: TSEntityName): typingsJapgolly.babelTypes.mod.TSTypeReference_ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSTypeReference_]
  }
  
  inline def TSUndefinedKeyword_(): typingsJapgolly.babelTypes.mod.TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSUndefinedKeyword_]
  }
  
  inline def TSUnionType_(types: js.Array[TSType]): typingsJapgolly.babelTypes.mod.TSUnionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSUnionType_]
  }
  
  inline def TSUnknownKeyword_(): typingsJapgolly.babelTypes.mod.TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSUnknownKeyword_]
  }
  
  inline def TSVoidKeyword_(): typingsJapgolly.babelTypes.mod.TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSVoidKeyword_]
  }
}
