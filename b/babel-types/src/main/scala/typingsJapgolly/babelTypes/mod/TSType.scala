package typingsJapgolly.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.TSAnyKeyword
  - typingsJapgolly.babelTypes.mod.TSArrayType
  - typingsJapgolly.babelTypes.mod.TSBooleanKeyword
  - typingsJapgolly.babelTypes.mod.TSConstructorType
  - typingsJapgolly.babelTypes.mod.TSExpressionWithTypeArguments
  - typingsJapgolly.babelTypes.mod.TSFunctionType
  - typingsJapgolly.babelTypes.mod.TSIndexedAccessType
  - typingsJapgolly.babelTypes.mod.TSIntersectionType
  - typingsJapgolly.babelTypes.mod.TSLiteralType
  - typingsJapgolly.babelTypes.mod.TSMappedType
  - typingsJapgolly.babelTypes.mod.TSNeverKeyword
  - typingsJapgolly.babelTypes.mod.TSNullKeyword
  - typingsJapgolly.babelTypes.mod.TSNumberKeyword
  - typingsJapgolly.babelTypes.mod.TSObjectKeyword
  - typingsJapgolly.babelTypes.mod.TSParenthesizedType
  - typingsJapgolly.babelTypes.mod.TSStringKeyword
  - typingsJapgolly.babelTypes.mod.TSSymbolKeyword
  - typingsJapgolly.babelTypes.mod.TSThisType
  - typingsJapgolly.babelTypes.mod.TSTupleType
  - typingsJapgolly.babelTypes.mod.TSTypeLiteral
  - typingsJapgolly.babelTypes.mod.TSTypeOperator
  - typingsJapgolly.babelTypes.mod.TSTypePredicate
  - typingsJapgolly.babelTypes.mod.TSTypeQuery
  - typingsJapgolly.babelTypes.mod.TSTypeReference
  - typingsJapgolly.babelTypes.mod.TSUndefinedKeyword
  - typingsJapgolly.babelTypes.mod.TSUnionType
  - typingsJapgolly.babelTypes.mod.TSVoidKeyword
*/
trait TSType extends js.Object

object TSType {
  @scala.inline
  def TSExpressionWithTypeArguments(
    end: Double,
    expression: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation_ = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSType],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTupleType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTypeReference(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeReference,
    typeName: TSEntityName,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterInstantiation_ = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSParenthesizedType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSParenthesizedType,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSIndexedAccessType(
    end: Double,
    indexType: TSType,
    loc: SourceLocation,
    objectType: TSType,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSIndexedAccessType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indexType = indexType.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSFunctionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSFunctionType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    parameters: js.Array[Identifier_ | RestElement_] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSThisType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSThisType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSBooleanKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSBooleanKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSSymbolKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSSymbolKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTypeQuery(
    end: Double,
    exprName: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeQuery,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exprName = exprName.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSArrayType(
    elementType: TSType,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSArrayType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSConstructorType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSConstructorType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    parameters: js.Array[Identifier_ | RestElement_] = null,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSTypeAnnotation = null,
    typeParameters: TypeParameterDeclaration_ = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSNumberKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSNumberKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTypePredicate(
    end: Double,
    loc: SourceLocation,
    parameterName: Identifier_ | TSThisType,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotation,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSAnyKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSAnyKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSNullKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSNullKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSStringKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSStringKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSUndefinedKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSUndefinedKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSObjectKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSObjectKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSVoidKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSVoidKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTypeOperator(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeOperator,
    typeAnnotation: TSType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    operator: String = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSTypeLiteral(
    end: Double,
    loc: SourceLocation,
    members: js.Array[TSTypeElement],
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeLiteral,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSUnionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSUnionType,
    types: js.Array[TSType],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSNeverKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSNeverKeyword,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSIntersectionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSIntersectionType,
    types: js.Array[TSType],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSLiteralType(
    end: Double,
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSLiteralType,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  @scala.inline
  def TSMappedType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typingsJapgolly.babelTypes.babelTypesStrings.TSMappedType,
    typeParameter: TypeParameter_,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TSType = null
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
}

