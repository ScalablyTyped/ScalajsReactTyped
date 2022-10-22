package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSConstructSignatureDeclaration__
  extends StObject
     with BaseNode
     with Node
     with TSTypeElement
     with TypeScript {
  
  var parameters: js.Array[Identifier_ | RestElement_]
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation__ | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration__ | Null] = js.undefined
  
  @JSName("type")
  var type_TSConstructSignatureDeclaration__ : TSConstructSignatureDeclaration
}
object TSConstructSignatureDeclaration__ {
  
  inline def apply(parameters: js.Array[Identifier_ | RestElement_]): TSConstructSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[TSConstructSignatureDeclaration__]
  }
  
  extension [Self <: TSConstructSignatureDeclaration__](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: TSConstructSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation__): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration__): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
