package typingsJapgolly.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.TSAnyKeyword__
  - typingsJapgolly.babelTypes.libMod.TSBooleanKeyword__
  - typingsJapgolly.babelTypes.libMod.TSBigIntKeyword__
  - typingsJapgolly.babelTypes.libMod.TSIntrinsicKeyword__
  - typingsJapgolly.babelTypes.libMod.TSNeverKeyword__
  - typingsJapgolly.babelTypes.libMod.TSNullKeyword__
  - typingsJapgolly.babelTypes.libMod.TSNumberKeyword__
  - typingsJapgolly.babelTypes.libMod.TSObjectKeyword__
  - typingsJapgolly.babelTypes.libMod.TSStringKeyword__
  - typingsJapgolly.babelTypes.libMod.TSSymbolKeyword__
  - typingsJapgolly.babelTypes.libMod.TSUndefinedKeyword__
  - typingsJapgolly.babelTypes.libMod.TSUnknownKeyword__
  - typingsJapgolly.babelTypes.libMod.TSVoidKeyword__
  - typingsJapgolly.babelTypes.libMod.TSThisType__
  - typingsJapgolly.babelTypes.libMod.TSFunctionType__
  - typingsJapgolly.babelTypes.libMod.TSConstructorType__
  - typingsJapgolly.babelTypes.libMod.TSTypeReference__
  - typingsJapgolly.babelTypes.libMod.TSTypePredicate__
  - typingsJapgolly.babelTypes.libMod.TSTypeQuery__
  - typingsJapgolly.babelTypes.libMod.TSTypeLiteral__
  - typingsJapgolly.babelTypes.libMod.TSArrayType__
  - typingsJapgolly.babelTypes.libMod.TSTupleType__
  - typingsJapgolly.babelTypes.libMod.TSOptionalType__
  - typingsJapgolly.babelTypes.libMod.TSRestType__
  - typingsJapgolly.babelTypes.libMod.TSUnionType__
  - typingsJapgolly.babelTypes.libMod.TSIntersectionType__
  - typingsJapgolly.babelTypes.libMod.TSConditionalType__
  - typingsJapgolly.babelTypes.libMod.TSInferType__
  - typingsJapgolly.babelTypes.libMod.TSParenthesizedType__
  - typingsJapgolly.babelTypes.libMod.TSTypeOperator__
  - typingsJapgolly.babelTypes.libMod.TSIndexedAccessType__
  - typingsJapgolly.babelTypes.libMod.TSMappedType__
  - typingsJapgolly.babelTypes.libMod.TSLiteralType__
  - typingsJapgolly.babelTypes.libMod.TSExpressionWithTypeArguments__
  - typingsJapgolly.babelTypes.libMod.TSImportType__
*/
trait TSType extends StObject
object TSType {
  
  inline def TSAnyKeyword__(): typingsJapgolly.babelTypes.libMod.TSAnyKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSAnyKeyword__]
  }
  
  inline def TSArrayType__(elementType: TSType): typingsJapgolly.babelTypes.libMod.TSArrayType__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSArrayType__]
  }
  
  inline def TSBigIntKeyword__(): typingsJapgolly.babelTypes.libMod.TSBigIntKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSBigIntKeyword__]
  }
  
  inline def TSBooleanKeyword__(): typingsJapgolly.babelTypes.libMod.TSBooleanKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSBooleanKeyword__]
  }
  
  inline def TSConditionalType__(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typingsJapgolly.babelTypes.libMod.TSConditionalType__ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSConditionalType__]
  }
  
  inline def TSConstructorType__(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.libMod.TSConstructorType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSConstructorType__]
  }
  
  inline def TSExpressionWithTypeArguments__(expression: TSEntityName): typingsJapgolly.babelTypes.libMod.TSExpressionWithTypeArguments__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSExpressionWithTypeArguments__]
  }
  
  inline def TSFunctionType__(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.libMod.TSFunctionType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSFunctionType__]
  }
  
  inline def TSImportType__(argument: StringLiteral_): typingsJapgolly.babelTypes.libMod.TSImportType__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSImportType__]
  }
  
  inline def TSIndexedAccessType__(indexType: TSType, objectType: TSType): typingsJapgolly.babelTypes.libMod.TSIndexedAccessType__ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSIndexedAccessType__]
  }
  
  inline def TSInferType__(typeParameter: TSTypeParameter__): typingsJapgolly.babelTypes.libMod.TSInferType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSInferType__]
  }
  
  inline def TSIntersectionType__(types: js.Array[TSType]): typingsJapgolly.babelTypes.libMod.TSIntersectionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSIntersectionType__]
  }
  
  inline def TSIntrinsicKeyword__(): typingsJapgolly.babelTypes.libMod.TSIntrinsicKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSIntrinsicKeyword__]
  }
  
  inline def TSLiteralType__(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typingsJapgolly.babelTypes.libMod.TSLiteralType__ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSLiteralType__]
  }
  
  inline def TSMappedType__(typeParameter: TSTypeParameter__): typingsJapgolly.babelTypes.libMod.TSMappedType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSMappedType__]
  }
  
  inline def TSNeverKeyword__(): typingsJapgolly.babelTypes.libMod.TSNeverKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSNeverKeyword__]
  }
  
  inline def TSNullKeyword__(): typingsJapgolly.babelTypes.libMod.TSNullKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSNullKeyword__]
  }
  
  inline def TSNumberKeyword__(): typingsJapgolly.babelTypes.libMod.TSNumberKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSNumberKeyword__]
  }
  
  inline def TSObjectKeyword__(): typingsJapgolly.babelTypes.libMod.TSObjectKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSObjectKeyword__]
  }
  
  inline def TSOptionalType__(typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSOptionalType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSOptionalType__]
  }
  
  inline def TSParenthesizedType__(typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSParenthesizedType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSParenthesizedType__]
  }
  
  inline def TSRestType__(typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSRestType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSRestType__]
  }
  
  inline def TSStringKeyword__(): typingsJapgolly.babelTypes.libMod.TSStringKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSStringKeyword__]
  }
  
  inline def TSSymbolKeyword__(): typingsJapgolly.babelTypes.libMod.TSSymbolKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSSymbolKeyword__]
  }
  
  inline def TSThisType__(): typingsJapgolly.babelTypes.libMod.TSThisType__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSThisType__]
  }
  
  inline def TSTupleType__(elementTypes: js.Array[TSType | TSNamedTupleMember__]): typingsJapgolly.babelTypes.libMod.TSTupleType__ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTupleType__]
  }
  
  inline def TSTypeLiteral__(members: js.Array[TSTypeElement]): typingsJapgolly.babelTypes.libMod.TSTypeLiteral__ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeLiteral__]
  }
  
  inline def TSTypeOperator__(operator: String, typeAnnotation: TSType): typingsJapgolly.babelTypes.libMod.TSTypeOperator__ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeOperator__]
  }
  
  inline def TSTypePredicate__(parameterName: Identifier_ | TSThisType__): typingsJapgolly.babelTypes.libMod.TSTypePredicate__ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypePredicate__]
  }
  
  inline def TSTypeQuery__(exprName: TSEntityName | TSImportType__): typingsJapgolly.babelTypes.libMod.TSTypeQuery__ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeQuery__]
  }
  
  inline def TSTypeReference__(typeName: TSEntityName): typingsJapgolly.babelTypes.libMod.TSTypeReference__ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSTypeReference__]
  }
  
  inline def TSUndefinedKeyword__(): typingsJapgolly.babelTypes.libMod.TSUndefinedKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSUndefinedKeyword__]
  }
  
  inline def TSUnionType__(types: js.Array[TSType]): typingsJapgolly.babelTypes.libMod.TSUnionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSUnionType__]
  }
  
  inline def TSUnknownKeyword__(): typingsJapgolly.babelTypes.libMod.TSUnknownKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSUnknownKeyword__]
  }
  
  inline def TSVoidKeyword__(): typingsJapgolly.babelTypes.libMod.TSVoidKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSVoidKeyword__]
  }
}
