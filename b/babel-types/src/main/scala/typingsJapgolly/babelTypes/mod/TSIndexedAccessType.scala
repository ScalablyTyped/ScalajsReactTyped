package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIndexedAccessType
  extends StObject
     with Node
     with TSType {
  
  var indexType: TSType
  
  var objectType: TSType
  
  @JSName("type")
  var type_TSIndexedAccessType: typingsJapgolly.babelTypes.babelTypesStrings.TSIndexedAccessType
}
object TSIndexedAccessType {
  
  @JSImport("babel-types", "TSIndexedAccessType")
  @js.native
  def apply(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
  
  extension [Self <: TSIndexedAccessType](x: Self) {
    
    inline def setIndexType(value: TSType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: TSType): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSIndexedAccessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
