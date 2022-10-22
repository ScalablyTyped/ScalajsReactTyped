package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TupleType
  extends StObject
     with GenericType {
  
  var combinedFlags: ElementFlags
  
  var elementFlags: js.Array[ElementFlags]
  
  var fixedLength: Double
  
  var hasRestElement: Boolean
  
  var labeledElementDeclarations: js.UndefOr[js.Array[NamedTupleMember | ParameterDeclaration]] = js.undefined
  
  var minLength: Double
  
  var readonly: Boolean
}
object TupleType {
  
  inline def apply(
    combinedFlags: ElementFlags,
    elementFlags: js.Array[ElementFlags],
    fixedLength: Double,
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
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: CallbackTo[js.UndefOr[Type]],
    getSymbol: CallbackTo[js.UndefOr[Symbol]],
    hasRestElement: Boolean,
    isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
    isIndexType: CallbackTo[/* is typescript.typescript.IndexType */ Boolean],
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
    target: GenericType
  ): TupleType = {
    val __obj = js.Dynamic.literal(combinedFlags = combinedFlags.asInstanceOf[js.Any], elementFlags = elementFlags.asInstanceOf[js.Any], fixedLength = fixedLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, hasRestElement = hasRestElement.asInstanceOf[js.Any], isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, minLength = minLength.asInstanceOf[js.Any], objectFlags = objectFlags.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  
  extension [Self <: TupleType](x: Self) {
    
    inline def setCombinedFlags(value: ElementFlags): Self = StObject.set(x, "combinedFlags", value.asInstanceOf[js.Any])
    
    inline def setElementFlags(value: js.Array[ElementFlags]): Self = StObject.set(x, "elementFlags", value.asInstanceOf[js.Any])
    
    inline def setElementFlagsVarargs(value: ElementFlags*): Self = StObject.set(x, "elementFlags", js.Array(value*))
    
    inline def setFixedLength(value: Double): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setHasRestElement(value: Boolean): Self = StObject.set(x, "hasRestElement", value.asInstanceOf[js.Any])
    
    inline def setLabeledElementDeclarations(value: js.Array[NamedTupleMember | ParameterDeclaration]): Self = StObject.set(x, "labeledElementDeclarations", value.asInstanceOf[js.Any])
    
    inline def setLabeledElementDeclarationsUndefined: Self = StObject.set(x, "labeledElementDeclarations", js.undefined)
    
    inline def setLabeledElementDeclarationsVarargs(value: (NamedTupleMember | ParameterDeclaration)*): Self = StObject.set(x, "labeledElementDeclarations", js.Array(value*))
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
  }
}
