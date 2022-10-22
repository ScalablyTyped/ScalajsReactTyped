package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstitutionType
  extends StObject
     with Type {
  
  var baseType: Type
  
  var objectFlags: ObjectFlags
  
  var substitute: Type
}
object SubstitutionType {
  
  inline def apply(
    baseType: Type,
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
    isClass: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
    ],
    isClassOrInterface: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
    ],
    isIndexType: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IndexType */ Boolean
    ],
    isIntersection: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IntersectionType */ Boolean
    ],
    isLiteral: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.LiteralType */ Boolean
    ],
    isNumberLiteral: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.NumberLiteralType */ Boolean
    ],
    isStringLiteral: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.StringLiteralType */ Boolean
    ],
    isTypeParameter: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.TypeParameter */ Boolean
    ],
    isUnion: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionType */ Boolean
    ],
    isUnionOrIntersection: CallbackTo[
      /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionOrIntersectionType */ Boolean
    ],
    objectFlags: ObjectFlags,
    substitute: Type,
    symbol: Symbol
  ): SubstitutionType = {
    val __obj = js.Dynamic.literal(baseType = baseType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, objectFlags = objectFlags.asInstanceOf[js.Any], substitute = substitute.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstitutionType]
  }
  
  extension [Self <: SubstitutionType](x: Self) {
    
    inline def setBaseType(value: Type): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setObjectFlags(value: ObjectFlags): Self = StObject.set(x, "objectFlags", value.asInstanceOf[js.Any])
    
    inline def setSubstitute(value: Type): Self = StObject.set(x, "substitute", value.asInstanceOf[js.Any])
  }
}
