package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TypeParameterDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeParameterDeclaration_
  extends StObject
     with BaseNode
     with Flow
     with Node {
  
  var params: js.Array[TypeParameter_]
  
  @JSName("type")
  var type_TypeParameterDeclaration_ : TypeParameterDeclaration
}
object TypeParameterDeclaration_ {
  
  inline def apply(params: js.Array[TypeParameter_]): TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[TypeParameterDeclaration_]
  }
  
  extension [Self <: TypeParameterDeclaration_](x: Self) {
    
    inline def setParams(value: js.Array[TypeParameter_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: TypeParameter_ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setType(value: TypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
