package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSMethodSignature
  extends StObject
     with Node
     with TSTypeElement {
  
  var computed: Boolean | Null
  
  var key: Expression
  
  var optional: Boolean | Null
  
  var parameters: (js.Array[Identifier_ | RestElement_]) | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  var typeParameters: TypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSMethodSignature: typingsJapgolly.babelTypes.babelTypesStrings.TSMethodSignature
}
object TSMethodSignature {
  
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(key: Expression): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(key: Expression, typeParameters: Unit, parameters: js.Array[Identifier_ | RestElement_]): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(
    key: Expression,
    typeParameters: Unit,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(key: Expression, typeParameters: Unit, parameters: Unit, typeAnnotation: TSTypeAnnotation): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(key: Expression, typeParameters: TypeParameterDeclaration_): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_]
  ): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: js.Array[Identifier_ | RestElement_],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  @JSImport("babel-types", "TSMethodSignature")
  @js.native
  def apply(
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    parameters: Unit,
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  
  extension [Self <: TSMethodSignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedNull: Self = StObject.set(x, "computed", null)
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
