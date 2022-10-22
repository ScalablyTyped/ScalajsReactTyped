package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSExpressionWithTypeArguments
  extends StObject
     with Node
     with TSType {
  
  var expression: TSEntityName
  
  var typeParameters: TypeParameterInstantiation_ | Null
  
  @JSName("type")
  var type_TSExpressionWithTypeArguments: typingsJapgolly.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
}
object TSExpressionWithTypeArguments {
  
  @JSImport("babel-types", "TSExpressionWithTypeArguments")
  @js.native
  def apply(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  @JSImport("babel-types", "TSExpressionWithTypeArguments")
  @js.native
  def apply(expression: TSEntityName, typeParameters: TypeParameterInstantiation_): TSExpressionWithTypeArguments = js.native
  
  extension [Self <: TSExpressionWithTypeArguments](x: Self) {
    
    inline def setExpression(value: TSEntityName): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterInstantiation_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
