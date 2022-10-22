package typingsJapgolly.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalRoot extends StObject {
  
  var aliasSymbol: js.UndefOr[Symbol] = js.undefined
  
  var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  
  var checkType: Type
  
  var extendsType: Type
  
  var inferTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
  
  var instantiations: js.UndefOr[Map[Type]] = js.undefined
  
  var isDistributive: Boolean
  
  var node: ConditionalTypeNode
  
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]] = js.undefined
}
object ConditionalRoot {
  
  inline def apply(checkType: Type, extendsType: Type, isDistributive: Boolean, node: ConditionalTypeNode): ConditionalRoot = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], isDistributive = isDistributive.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalRoot]
  }
  
  extension [Self <: ConditionalRoot](x: Self) {
    
    inline def setAliasSymbol(value: Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
    
    inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
    
    inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
    
    inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
    
    inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value*))
    
    inline def setCheckType(value: Type): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: Type): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setInferTypeParameters(value: js.Array[TypeParameter]): Self = StObject.set(x, "inferTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setInferTypeParametersUndefined: Self = StObject.set(x, "inferTypeParameters", js.undefined)
    
    inline def setInferTypeParametersVarargs(value: TypeParameter*): Self = StObject.set(x, "inferTypeParameters", js.Array(value*))
    
    inline def setInstantiations(value: Map[Type]): Self = StObject.set(x, "instantiations", value.asInstanceOf[js.Any])
    
    inline def setInstantiationsUndefined: Self = StObject.set(x, "instantiations", js.undefined)
    
    inline def setIsDistributive(value: Boolean): Self = StObject.set(x, "isDistributive", value.asInstanceOf[js.Any])
    
    inline def setNode(value: ConditionalTypeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOuterTypeParameters(value: js.Array[TypeParameter]): Self = StObject.set(x, "outerTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setOuterTypeParametersUndefined: Self = StObject.set(x, "outerTypeParameters", js.undefined)
    
    inline def setOuterTypeParametersVarargs(value: TypeParameter*): Self = StObject.set(x, "outerTypeParameters", js.Array(value*))
  }
}
