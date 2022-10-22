package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterfaceTypeWithDeclaredMembers
  extends StObject
     with InterfaceType {
  
  var declaredCallSignatures: js.Array[Signature]
  
  var declaredConstructSignatures: js.Array[Signature]
  
  var declaredIndexInfos: js.Array[IndexInfo]
  
  var declaredProperties: js.Array[Symbol]
}
object InterfaceTypeWithDeclaredMembers {
  
  inline def apply(
    declaredCallSignatures: js.Array[Signature],
    declaredConstructSignatures: js.Array[Signature],
    declaredIndexInfos: js.Array[IndexInfo],
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
    symbol: Symbol
  ): InterfaceTypeWithDeclaredMembers = {
    val __obj = js.Dynamic.literal(declaredCallSignatures = declaredCallSignatures.asInstanceOf[js.Any], declaredConstructSignatures = declaredConstructSignatures.asInstanceOf[js.Any], declaredIndexInfos = declaredIndexInfos.asInstanceOf[js.Any], declaredProperties = declaredProperties.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeWithDeclaredMembers]
  }
  
  extension [Self <: InterfaceTypeWithDeclaredMembers](x: Self) {
    
    inline def setDeclaredCallSignatures(value: js.Array[Signature]): Self = StObject.set(x, "declaredCallSignatures", value.asInstanceOf[js.Any])
    
    inline def setDeclaredCallSignaturesVarargs(value: Signature*): Self = StObject.set(x, "declaredCallSignatures", js.Array(value*))
    
    inline def setDeclaredConstructSignatures(value: js.Array[Signature]): Self = StObject.set(x, "declaredConstructSignatures", value.asInstanceOf[js.Any])
    
    inline def setDeclaredConstructSignaturesVarargs(value: Signature*): Self = StObject.set(x, "declaredConstructSignatures", js.Array(value*))
    
    inline def setDeclaredIndexInfos(value: js.Array[IndexInfo]): Self = StObject.set(x, "declaredIndexInfos", value.asInstanceOf[js.Any])
    
    inline def setDeclaredIndexInfosVarargs(value: IndexInfo*): Self = StObject.set(x, "declaredIndexInfos", js.Array(value*))
    
    inline def setDeclaredProperties(value: js.Array[Symbol]): Self = StObject.set(x, "declaredProperties", value.asInstanceOf[js.Any])
    
    inline def setDeclaredPropertiesVarargs(value: Symbol*): Self = StObject.set(x, "declaredProperties", js.Array(value*))
  }
}
