package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceTypeWithDeclaredMembers extends InterfaceType {
  var declaredCallSignatures: js.Array[Signature]
  var declaredConstructSignatures: js.Array[Signature]
  var declaredNumberIndexInfo: js.UndefOr[IndexInfo] = js.undefined
  var declaredProperties: js.Array[Symbol]
  var declaredStringIndexInfo: js.UndefOr[IndexInfo] = js.undefined
}

object InterfaceTypeWithDeclaredMembers {
  @scala.inline
  def apply(
    declaredCallSignatures: js.Array[Signature],
    declaredConstructSignatures: js.Array[Signature],
    declaredProperties: js.Array[Symbol],
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
    getProperty: String => CallbackTo[js.UndefOr[Symbol]],
    getStringIndexType: CallbackTo[js.UndefOr[Type]],
    getSymbol: CallbackTo[js.UndefOr[Symbol]],
    isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isIntersection: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean],
    isLiteral: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean],
    isNumberLiteral: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean],
    isStringLiteral: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean],
    isTypeParameter: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean],
    isUnion: CallbackTo[/* is typescript.typescript.UnionType */ Boolean],
    isUnionOrIntersection: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean],
    objectFlags: ObjectFlags,
    symbol: Symbol,
    aliasSymbol: Symbol = null,
    aliasTypeArguments: js.Array[Type] = null,
    declaredNumberIndexInfo: IndexInfo = null,
    declaredStringIndexInfo: IndexInfo = null,
    localTypeParameters: js.Array[TypeParameter] = null,
    outerTypeParameters: js.Array[TypeParameter] = null,
    pattern: DestructuringPattern = null,
    thisType: TypeParameter = null,
    typeParameters: js.Array[TypeParameter] = null
  ): InterfaceTypeWithDeclaredMembers = {
    val __obj = js.Dynamic.literal(declaredCallSignatures = declaredCallSignatures.asInstanceOf[js.Any], declaredConstructSignatures = declaredConstructSignatures.asInstanceOf[js.Any], declaredProperties = declaredProperties.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
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
    if (declaredNumberIndexInfo != null) __obj.updateDynamic("declaredNumberIndexInfo")(declaredNumberIndexInfo.asInstanceOf[js.Any])
    if (declaredStringIndexInfo != null) __obj.updateDynamic("declaredStringIndexInfo")(declaredStringIndexInfo.asInstanceOf[js.Any])
    if (localTypeParameters != null) __obj.updateDynamic("localTypeParameters")(localTypeParameters.asInstanceOf[js.Any])
    if (outerTypeParameters != null) __obj.updateDynamic("outerTypeParameters")(outerTypeParameters.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (thisType != null) __obj.updateDynamic("thisType")(thisType.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeWithDeclaredMembers]
  }
}

