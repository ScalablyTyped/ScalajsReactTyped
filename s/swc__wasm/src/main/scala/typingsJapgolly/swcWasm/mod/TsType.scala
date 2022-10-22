package typingsJapgolly.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.swcWasm.mod.TsKeywordType
  - typingsJapgolly.swcWasm.mod.TsThisType
  - typingsJapgolly.swcWasm.mod.TsFnOrConstructorType
  - typingsJapgolly.swcWasm.mod.TsTypeReference
  - typingsJapgolly.swcWasm.mod.TsTypeQuery
  - typingsJapgolly.swcWasm.mod.TsTypeLiteral
  - typingsJapgolly.swcWasm.mod.TsArrayType
  - typingsJapgolly.swcWasm.mod.TsTupleType
  - typingsJapgolly.swcWasm.mod.TsOptionalType
  - typingsJapgolly.swcWasm.mod.TsRestType
  - typingsJapgolly.swcWasm.mod.TsUnionOrIntersectionType
  - typingsJapgolly.swcWasm.mod.TsConditionalType
  - typingsJapgolly.swcWasm.mod.TsInferType
  - typingsJapgolly.swcWasm.mod.TsParenthesizedType
  - typingsJapgolly.swcWasm.mod.TsTypeOperator
  - typingsJapgolly.swcWasm.mod.TsIndexedAccessType
  - typingsJapgolly.swcWasm.mod.TsMappedType
  - typingsJapgolly.swcWasm.mod.TsLiteralType
  - typingsJapgolly.swcWasm.mod.TsTypePredicate
  - typingsJapgolly.swcWasm.mod.TsImportType
*/
trait TsType extends StObject
object TsType {
  
  inline def TsArrayType(elemType: TsType, span: Span): typingsJapgolly.swcWasm.mod.TsArrayType = {
    val __obj = js.Dynamic.literal(elemType = elemType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsArrayType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsArrayType]
  }
  
  inline def TsConditionalType(checkType: TsType, extendsType: TsType, falseType: TsType, span: Span, trueType: TsType): typingsJapgolly.swcWasm.mod.TsConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConditionalType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsConditionalType]
  }
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcWasm.mod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typingsJapgolly.swcWasm.mod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsFunctionType]
  }
  
  inline def TsImportType(argument: StringLiteral, span: Span): typingsJapgolly.swcWasm.mod.TsImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsImportType]
  }
  
  inline def TsIndexedAccessType(indexType: TsType, objectType: TsType, readonly: Boolean, span: Span): typingsJapgolly.swcWasm.mod.TsIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIndexedAccessType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsIndexedAccessType]
  }
  
  inline def TsInferType(span: Span, typeParam: TsTypeParameter): typingsJapgolly.swcWasm.mod.TsInferType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsInferType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsInferType]
  }
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcWasm.mod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsIntersectionType]
  }
  
  inline def TsKeywordType(kind: TsKeywordTypeKind, span: Span): typingsJapgolly.swcWasm.mod.TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsKeywordType]
  }
  
  inline def TsLiteralType(literal: TsLiteral, span: Span): typingsJapgolly.swcWasm.mod.TsLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsLiteralType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsLiteralType]
  }
  
  inline def TsMappedType(span: Span, typeParam: TsTypeParameter): typingsJapgolly.swcWasm.mod.TsMappedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeParam = typeParam.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsMappedType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsMappedType]
  }
  
  inline def TsOptionalType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsOptionalType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsOptionalType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsOptionalType]
  }
  
  inline def TsParenthesizedType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsParenthesizedType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsParenthesizedType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsParenthesizedType]
  }
  
  inline def TsRestType(span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsRestType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsRestType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsRestType]
  }
  
  inline def TsThisType(span: Span): typingsJapgolly.swcWasm.mod.TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsThisType]
  }
  
  inline def TsTupleType(elemTypes: js.Array[TsTupleElement], span: Span): typingsJapgolly.swcWasm.mod.TsTupleType = {
    val __obj = js.Dynamic.literal(elemTypes = elemTypes.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTupleType]
  }
  
  inline def TsTypeLiteral(members: js.Array[TsTypeElement], span: Span): typingsJapgolly.swcWasm.mod.TsTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeLiteral")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeLiteral]
  }
  
  inline def TsTypeOperator(op: TsTypeOperatorOp, span: Span, typeAnnotation: TsType): typingsJapgolly.swcWasm.mod.TsTypeOperator = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeOperator")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeOperator]
  }
  
  inline def TsTypePredicate(asserts: Boolean, paramName: TsThisTypeOrIdent, span: Span): typingsJapgolly.swcWasm.mod.TsTypePredicate = {
    val __obj = js.Dynamic.literal(asserts = asserts.asInstanceOf[js.Any], paramName = paramName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypePredicate")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypePredicate]
  }
  
  inline def TsTypeQuery(exprName: TsTypeQueryExpr, span: Span): typingsJapgolly.swcWasm.mod.TsTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeQuery")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeQuery]
  }
  
  inline def TsTypeReference(span: Span, typeName: TsEntityName): typingsJapgolly.swcWasm.mod.TsTypeReference = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeReference")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsTypeReference]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typingsJapgolly.swcWasm.mod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typingsJapgolly.swcWasm.mod.TsUnionType]
  }
}
