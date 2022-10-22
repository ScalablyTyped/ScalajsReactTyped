package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSArrayType
  extends StObject
     with Node
     with TSType {
  
  var elementType: TSType
  
  @JSName("type")
  var type_TSArrayType: typingsJapgolly.babelTypes.babelTypesStrings.TSArrayType
}
object TSArrayType {
  
  @JSImport("babel-types", "TSArrayType")
  @js.native
  def apply(elementType: TSType): TSArrayType = js.native
  
  extension [Self <: TSArrayType](x: Self) {
    
    inline def setElementType(value: TSType): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSArrayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
