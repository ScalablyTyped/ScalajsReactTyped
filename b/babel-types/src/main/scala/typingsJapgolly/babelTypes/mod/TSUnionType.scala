package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUnionType
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSUnionType: typingsJapgolly.babelTypes.babelTypesStrings.TSUnionType
  
  var types: js.Array[TSType]
}
object TSUnionType {
  
  @JSImport("babel-types", "TSUnionType")
  @js.native
  def apply(types: js.Array[TSType]): TSUnionType = js.native
  
  extension [Self <: TSUnionType](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
