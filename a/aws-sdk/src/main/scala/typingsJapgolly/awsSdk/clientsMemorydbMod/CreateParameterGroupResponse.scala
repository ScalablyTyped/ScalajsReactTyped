package typingsJapgolly.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParameterGroupResponse extends StObject {
  
  /**
    * The newly-created parameter group.
    */
  var ParameterGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsMemorydbMod.ParameterGroup] = js.undefined
}
object CreateParameterGroupResponse {
  
  inline def apply(): CreateParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateParameterGroupResponse]
  }
  
  extension [Self <: CreateParameterGroupResponse](x: Self) {
    
    inline def setParameterGroup(value: ParameterGroup): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
  }
}
