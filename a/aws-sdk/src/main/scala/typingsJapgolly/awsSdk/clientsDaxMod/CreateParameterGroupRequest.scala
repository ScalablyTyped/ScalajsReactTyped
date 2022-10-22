package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParameterGroupRequest extends StObject {
  
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter group to apply to all of the clusters in this replication group.
    */
  var ParameterGroupName: String
}
object CreateParameterGroupRequest {
  
  inline def apply(ParameterGroupName: String): CreateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParameterGroupRequest]
  }
  
  extension [Self <: CreateParameterGroupRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
