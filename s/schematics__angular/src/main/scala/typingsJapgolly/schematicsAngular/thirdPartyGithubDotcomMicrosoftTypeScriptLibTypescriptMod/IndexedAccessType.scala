package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedAccessType
  extends StObject
     with Type {
  
  var constraint: js.UndefOr[Type] = js.undefined
  
  var indexType: Type
  
  var objectType: Type
  
  var simplifiedForReading: js.UndefOr[Type] = js.undefined
  
  var simplifiedForWriting: js.UndefOr[Type] = js.undefined
}
object IndexedAccessType {
  
  inline def apply(
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
    indexType: Type,
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
    objectType: Type,
    symbol: Symbol
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, indexType = indexType.asInstanceOf[js.Any], isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, objectType = objectType.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  extension [Self <: IndexedAccessType](x: Self) {
    
    inline def setConstraint(value: Type): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setIndexType(value: Type): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: Type): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForReading(value: Type): Self = StObject.set(x, "simplifiedForReading", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForReadingUndefined: Self = StObject.set(x, "simplifiedForReading", js.undefined)
    
    inline def setSimplifiedForWriting(value: Type): Self = StObject.set(x, "simplifiedForWriting", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedForWritingUndefined: Self = StObject.set(x, "simplifiedForWriting", js.undefined)
  }
}
