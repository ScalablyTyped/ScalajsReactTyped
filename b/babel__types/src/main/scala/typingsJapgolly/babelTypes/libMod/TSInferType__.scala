package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TSInferType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSInferType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeParameter: TSTypeParameter__
  
  @JSName("type")
  var type_TSInferType__ : TSInferType
}
object TSInferType__ {
  
  inline def apply(typeParameter: TSTypeParameter__): TSInferType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[TSInferType__]
  }
  
  extension [Self <: TSInferType__](x: Self) {
    
    inline def setType(value: TSInferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameter(value: TSTypeParameter__): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
  }
}
