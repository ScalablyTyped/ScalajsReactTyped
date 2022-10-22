package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcCore.typesMod.TsKeywordType
  - typingsJapgolly.swcCore.typesMod.TsThisType
  - typingsJapgolly.swcCore.typesMod.TsFnOrConstructorType
  - typingsJapgolly.swcCore.typesMod.TsTypeReference
  - typingsJapgolly.swcCore.typesMod.TsTypeQuery
  - typingsJapgolly.swcCore.typesMod.TsTypeLiteral
  - typingsJapgolly.swcCore.typesMod.TsArrayType
  - typingsJapgolly.swcCore.typesMod.TsTupleType
  - typingsJapgolly.swcCore.typesMod.TsOptionalType
  - typingsJapgolly.swcCore.typesMod.TsRestType
  - typingsJapgolly.swcCore.typesMod.TsUnionOrIntersectionType
  - typingsJapgolly.swcCore.typesMod.TsConditionalType
  - typingsJapgolly.swcCore.typesMod.TsInferType
  - typingsJapgolly.swcCore.typesMod.TsParenthesizedType
  - typingsJapgolly.swcCore.typesMod.TsTypeOperator
  - typingsJapgolly.swcCore.typesMod.TsIndexedAccessType
  - typingsJapgolly.swcCore.typesMod.TsMappedType
  - typingsJapgolly.swcCore.typesMod.TsLiteralType
  - typingsJapgolly.swcCore.typesMod.TsTypePredicate
  - typingsJapgolly.swcCore.typesMod.TsImportType
*/
trait TsType extends StObject
object TsType {
  
  inline def TsArrayType(elemType: TsType, span: Span): typingsJapgolly.swcCore.typesMod.TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsArrayType]
  }
  
  inline def TsConditionalType(checkType: TsType, extendsType: TsType, falseType: TsType, span: Span, trueType: TsType): typingsJapgolly.swcCore.typesMod.TsConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConditionalType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsConditionalType]
  }
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcCore.typesMod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcCore.typesMod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsFunctionType]
  }
  
  inline def TsImportType(argument: StringLiteral, span: Span): typingsJapgolly.swcCore.typesMod.TsImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsImportType]
  }
  
  inline def TsIndexedAccessType(indexType: TsType, objectType: TsType, readonly: Boolean, span: Span): typingsJapgolly.swcCore.typesMod.TsIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsIndexedAccessType]
  }
  
  inline def TsInferType(span: Span, typeParam: TsTypeParameter): typingsJapgolly.swcCore.typesMod.TsInferType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInferType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsInferType]
  }
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcCore.typesMod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsIntersectionType]
  }
  
  inline def TsKeywordType(kind: TsKeywordTypeKind, span: Span): typingsJapgolly.swcCore.typesMod.TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsKeywordType]
  }
  
  inline def TsLiteralType(literal: TsLiteral, span: Span): typingsJapgolly.swcCore.typesMod.TsLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsLiteralType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsLiteralType]
  }
  
  inline def TsMappedType(span: Span, typeParam: TsTypeParameter): typingsJapgolly.swcCore.typesMod.TsMappedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMappedType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsMappedType]
  }
  
  inline def TsOptionalType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsOptionalType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsOptionalType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsOptionalType]
  }
  
  inline def TsParenthesizedType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsParenthesizedType]
  }
  
  inline def TsRestType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsRestType]
  }
  
  inline def TsThisType(span: Span): typingsJapgolly.swcCore.typesMod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsThisType]
  }
  
  inline def TsTupleType(elemTypes: js.Array[TsTupleElement], span: Span): typingsJapgolly.swcCore.typesMod.TsTupleType = {
    val __obj = js.Dynamic.literal(elemTypes = elemTypes.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTupleType]
  }
  
  inline def TsTypeLiteral(members: js.Array[TsTypeElement], span: Span): typingsJapgolly.swcCore.typesMod.TsTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeLiteral]
  }
  
  inline def TsTypeOperator(op: TsTypeOperatorOp, span: Span, typeAnnotation: TsType): typingsJapgolly.swcCore.typesMod.TsTypeOperator = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeOperator")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeOperator]
  }
  
  inline def TsTypePredicate(asserts: Boolean, paramName: TsThisTypeOrIdent, span: Span): typingsJapgolly.swcCore.typesMod.TsTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], paramName = paramName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypePredicate")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypePredicate]
  }
  
  inline def TsTypeQuery(exprName: TsTypeQueryExpr, span: Span): typingsJapgolly.swcCore.typesMod.TsTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeQuery")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeQuery]
  }
  
  inline def TsTypeReference(span: Span, typeName: TsEntityName): typingsJapgolly.swcCore.typesMod.TsTypeReference = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeReference")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsTypeReference]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcCore.typesMod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typingsJapgolly.swcCore.typesMod.TsUnionType]
  }
}
