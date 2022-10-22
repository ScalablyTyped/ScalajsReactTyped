package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with FlowType {
  
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  
  var flags: TypeFlags
  
  def getApparentProperties(): js.Array[Symbol]
  
  def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
  
  def getCallSignatures(): js.Array[Signature]
  
  def getConstraint(): js.UndefOr[Type]
  
  def getConstructSignatures(): js.Array[Signature]
  
  def getDefault(): js.UndefOr[Type]
  
  def getFlags(): TypeFlags
  
  def getNonNullableType(): Type
  
  def getNumberIndexType(): js.UndefOr[Type]
  
  def getProperties(): js.Array[Symbol]
  
  def getProperty(propertyName: java.lang.String): js.UndefOr[Symbol]
  
  def getStringIndexType(): js.UndefOr[Type]
  
  def getSymbol(): js.UndefOr[Symbol]
  
  def isClass(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
  
  def isClassOrInterface(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
  
  def isIndexType(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IndexType */ Boolean
  
  def isIntersection(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IntersectionType */ Boolean
  
  def isLiteral(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.LiteralType */ Boolean
  
  def isNumberLiteral(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.NumberLiteralType */ Boolean
  
  def isStringLiteral(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.StringLiteralType */ Boolean
  
  def isTypeParameter(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.TypeParameter */ Boolean
  
  def isUnion(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionType */ Boolean
  
  def isUnionOrIntersection(): /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionOrIntersectionType */ Boolean
  
  var pattern: js.UndefOr[DestructuringPattern] = js.undefined
  
  var symbol: Symbol
}
object Type {
  
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
    symbol: Symbol
  ): Type = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setAliasSymbol(value: Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
    
    inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
    
    inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
    
    inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value*))
    
    inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetApparentProperties(value: CallbackTo[js.Array[Symbol]]): Self = StObject.set(x, "getApparentProperties", value.toJsFn)
    
    inline def setGetBaseTypes(value: CallbackTo[js.UndefOr[js.Array[BaseType]]]): Self = StObject.set(x, "getBaseTypes", value.toJsFn)
    
    inline def setGetCallSignatures(value: CallbackTo[js.Array[Signature]]): Self = StObject.set(x, "getCallSignatures", value.toJsFn)
    
    inline def setGetConstraint(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getConstraint", value.toJsFn)
    
    inline def setGetConstructSignatures(value: CallbackTo[js.Array[Signature]]): Self = StObject.set(x, "getConstructSignatures", value.toJsFn)
    
    inline def setGetDefault(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getDefault", value.toJsFn)
    
    inline def setGetFlags(value: CallbackTo[TypeFlags]): Self = StObject.set(x, "getFlags", value.toJsFn)
    
    inline def setGetNonNullableType(value: CallbackTo[Type]): Self = StObject.set(x, "getNonNullableType", value.toJsFn)
    
    inline def setGetNumberIndexType(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getNumberIndexType", value.toJsFn)
    
    inline def setGetProperties(value: CallbackTo[js.Array[Symbol]]): Self = StObject.set(x, "getProperties", value.toJsFn)
    
    inline def setGetProperty(value: java.lang.String => js.UndefOr[Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
    
    inline def setGetStringIndexType(value: CallbackTo[js.UndefOr[Type]]): Self = StObject.set(x, "getStringIndexType", value.toJsFn)
    
    inline def setGetSymbol(value: CallbackTo[js.UndefOr[Symbol]]): Self = StObject.set(x, "getSymbol", value.toJsFn)
    
    inline def setIsClass(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
        ]
    ): Self = StObject.set(x, "isClass", value.toJsFn)
    
    inline def setIsClassOrInterface(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean
        ]
    ): Self = StObject.set(x, "isClassOrInterface", value.toJsFn)
    
    inline def setIsIndexType(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IndexType */ Boolean
        ]
    ): Self = StObject.set(x, "isIndexType", value.toJsFn)
    
    inline def setIsIntersection(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IntersectionType */ Boolean
        ]
    ): Self = StObject.set(x, "isIntersection", value.toJsFn)
    
    inline def setIsLiteral(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.LiteralType */ Boolean
        ]
    ): Self = StObject.set(x, "isLiteral", value.toJsFn)
    
    inline def setIsNumberLiteral(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.NumberLiteralType */ Boolean
        ]
    ): Self = StObject.set(x, "isNumberLiteral", value.toJsFn)
    
    inline def setIsStringLiteral(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.StringLiteralType */ Boolean
        ]
    ): Self = StObject.set(x, "isStringLiteral", value.toJsFn)
    
    inline def setIsTypeParameter(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.TypeParameter */ Boolean
        ]
    ): Self = StObject.set(x, "isTypeParameter", value.toJsFn)
    
    inline def setIsUnion(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionType */ Boolean
        ]
    ): Self = StObject.set(x, "isUnion", value.toJsFn)
    
    inline def setIsUnionOrIntersection(
      value: CallbackTo[
          /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionOrIntersectionType */ Boolean
        ]
    ): Self = StObject.set(x, "isUnionOrIntersection", value.toJsFn)
    
    inline def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
