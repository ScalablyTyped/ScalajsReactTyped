package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeOperator
  extends StObject
     with Node
     with TSType {
  
  var operator: String | Null
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeOperator: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeOperator
}
object TSTypeOperator {
  
  @JSImport("babel-types", "TSTypeOperator")
  @js.native
  def apply(typeAnnotation: TSType): TSTypeOperator = js.native
  
  extension [Self <: TSTypeOperator](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
