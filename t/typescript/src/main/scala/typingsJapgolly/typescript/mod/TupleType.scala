package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescript.mod.FlowType because Already inherited
- typingsJapgolly.typescript.mod.Type because Already inherited
- typingsJapgolly.typescript.mod.ObjectType because Already inherited
- typingsJapgolly.typescript.mod.TypeReference because var conflicts: aliasSymbol, aliasTypeArguments, flags, objectFlags, pattern, symbol. Inlined target, node, typeArguments */ trait TupleType extends InterfaceType {
  var associatedNames: js.UndefOr[js.Array[String]] = js.undefined
  var hasRestElement: Boolean
  var minLength: Double
  var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.undefined
  var readonly: Boolean
  var target: GenericType
  var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
}

object TupleType {
  @scala.inline
  def apply(
    flags: TypeFlags,
    getApparentProperties: CallbackTo[js.Array[Symbol]],
    getBaseTypes: CallbackTo[js.UndefOr[js.Array[BaseType]]],
    getCallSignatures: CallbackTo[js.Array[Signature]],
    getConstraint: CallbackTo[js.UndefOr[Type]],
    getConstructSignatures: CallbackTo[js.Array[Signature]],
    getDefault: CallbackTo[js.UndefOr[Type]],
    getFlags: CallbackTo[TypeFlags],
    getNonNullableType: CallbackTo[Type],
    getNumberIndexType: CallbackTo[js.UndefOr[Type]],
    getProperties: CallbackTo[js.Array[Symbol]],
    getProperty: java.lang.String => CallbackTo[js.UndefOr[Symbol]],
    getStringIndexType: CallbackTo[js.UndefOr[Type]],
    getSymbol: CallbackTo[js.UndefOr[Symbol]],
    hasRestElement: Boolean,
    isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isIntersection: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean],
    isLiteral: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean],
    isNumberLiteral: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean],
    isStringLiteral: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean],
    isTypeParameter: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean],
    isUnion: CallbackTo[/* is typescript.typescript.UnionType */ Boolean],
    isUnionOrIntersection: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    minLength: Double,
    objectFlags: ObjectFlags,
    readonly: Boolean,
    symbol: Symbol,
    target: GenericType,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    associatedNames: js.Array[String] = null,
    localTypeParameters: js.Array[TypeParameter] = null,
    node: TypeReferenceNode | ArrayTypeNode | TupleTypeNode = null,
    outerTypeParameters: js.Array[TypeParameter] = null,
    pattern: DestructuringPattern = null,
    thisType: TypeParameter = null,
    typeArguments: js.Array[Type] = null,
    typeParameters: js.Array[TypeParameter] = null
  ): TupleType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], hasRestElement = hasRestElement.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], objectFlags = objectFlags.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("getApparentProperties")(getApparentProperties.toJsFn)
    __obj.updateDynamic("getBaseTypes")(getBaseTypes.toJsFn)
    __obj.updateDynamic("getCallSignatures")(getCallSignatures.toJsFn)
    __obj.updateDynamic("getConstraint")(getConstraint.toJsFn)
    __obj.updateDynamic("getConstructSignatures")(getConstructSignatures.toJsFn)
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.updateDynamic("getFlags")(getFlags.toJsFn)
    __obj.updateDynamic("getNonNullableType")(getNonNullableType.toJsFn)
    __obj.updateDynamic("getNumberIndexType")(getNumberIndexType.toJsFn)
    __obj.updateDynamic("getProperties")(getProperties.toJsFn)
    __obj.updateDynamic("getProperty")(js.Any.fromFunction1((t0: java.lang.String) => getProperty(t0).runNow()))
    __obj.updateDynamic("getStringIndexType")(getStringIndexType.toJsFn)
    __obj.updateDynamic("getSymbol")(getSymbol.toJsFn)
    __obj.updateDynamic("isClass")(isClass.toJsFn)
    __obj.updateDynamic("isClassOrInterface")(isClassOrInterface.toJsFn)
    __obj.updateDynamic("isIntersection")(isIntersection.toJsFn)
    __obj.updateDynamic("isLiteral")(isLiteral.toJsFn)
    __obj.updateDynamic("isNumberLiteral")(isNumberLiteral.toJsFn)
    __obj.updateDynamic("isStringLiteral")(isStringLiteral.toJsFn)
    __obj.updateDynamic("isTypeParameter")(isTypeParameter.toJsFn)
    __obj.updateDynamic("isUnion")(isUnion.toJsFn)
    __obj.updateDynamic("isUnionOrIntersection")(isUnionOrIntersection.toJsFn)
    if (aliasSymbol != null) __obj.updateDynamic("aliasSymbol")(aliasSymbol.asInstanceOf[js.Any])
    if (aliasTypeArguments != null) __obj.updateDynamic("aliasTypeArguments")(aliasTypeArguments.asInstanceOf[js.Any])
    if (associatedNames != null) __obj.updateDynamic("associatedNames")(associatedNames.asInstanceOf[js.Any])
    if (localTypeParameters != null) __obj.updateDynamic("localTypeParameters")(localTypeParameters.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (thisType != null) __obj.updateDynamic("thisType")(thisType.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
}

