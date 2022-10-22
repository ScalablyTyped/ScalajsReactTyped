package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSParenthesizedType
  extends StObject
     with Node
     with TSType {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSParenthesizedType: typingsJapgolly.babelTypes.babelTypesStrings.TSParenthesizedType
}
object TSParenthesizedType {
  
  @JSImport("babel-types", "TSParenthesizedType")
  @js.native
  def apply(typeAnnotation: TSType): TSParenthesizedType = js.native
  
  extension [Self <: TSParenthesizedType](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
