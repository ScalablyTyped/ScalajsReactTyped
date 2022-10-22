package typingsJapgolly.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterObject extends StObject {
  
  /**
    * The attributes of the parameter object.
    */
  var attributes: ParameterAttributeList
  
  /**
    * The ID of the parameter object. 
    */
  var id: fieldNameString
}
object ParameterObject {
  
  inline def apply(attributes: ParameterAttributeList, id: fieldNameString): ParameterObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
  
  extension [Self <: ParameterObject](x: Self) {
    
    inline def setAttributes(value: ParameterAttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: ParameterAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setId(value: fieldNameString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
