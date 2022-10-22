package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeAnnotation
  extends StObject
     with Node {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeAnnotation: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeAnnotation
}
object TSTypeAnnotation {
  
  @JSImport("babel-types", "TSTypeAnnotation")
  @js.native
  def apply(typeAnnotation: TSType): TSTypeAnnotation = js.native
  
  extension [Self <: TSTypeAnnotation](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
