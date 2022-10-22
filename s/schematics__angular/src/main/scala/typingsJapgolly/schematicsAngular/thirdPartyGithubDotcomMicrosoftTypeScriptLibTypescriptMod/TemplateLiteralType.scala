package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLiteralType
  extends StObject
     with Type {
  
  var texts: js.Array[java.lang.String]
  
  var types: js.Array[Type]
}
object TemplateLiteralType {
  
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
    symbol: Symbol,
    texts: js.Array[java.lang.String],
    types: js.Array[Type]
  ): TemplateLiteralType = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, symbol = symbol.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteralType]
  }
  
  extension [Self <: TemplateLiteralType](x: Self) {
    
    inline def setTexts(value: js.Array[java.lang.String]): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsVarargs(value: java.lang.String*): Self = StObject.set(x, "texts", js.Array(value*))
    
    inline def setTypes(value: js.Array[Type]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: Type*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
