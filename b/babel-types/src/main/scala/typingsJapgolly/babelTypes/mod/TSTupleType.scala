package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTupleType
  extends StObject
     with Node
     with TSType {
  
  var elementTypes: js.Array[TSType]
  
  @JSName("type")
  var type_TSTupleType: typingsJapgolly.babelTypes.babelTypesStrings.TSTupleType
}
object TSTupleType {
  
  @JSImport("babel-types", "TSTupleType")
  @js.native
  def apply(elementTypes: js.Array[TSType]): TSTupleType = js.native
  
  extension [Self <: TSTupleType](x: Self) {
    
    inline def setElementTypes(value: js.Array[TSType]): Self = StObject.set(x, "elementTypes", value.asInstanceOf[js.Any])
    
    inline def setElementTypesVarargs(value: TSType*): Self = StObject.set(x, "elementTypes", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSTupleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
