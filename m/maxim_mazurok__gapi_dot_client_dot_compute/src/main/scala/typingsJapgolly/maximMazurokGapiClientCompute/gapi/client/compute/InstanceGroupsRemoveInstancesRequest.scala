package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupsRemoveInstancesRequest extends StObject {
  
  /** The list of instances to remove from the instance group. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}
object InstanceGroupsRemoveInstancesRequest {
  
  inline def apply(): InstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsRemoveInstancesRequest]
  }
  
  extension [Self <: InstanceGroupsRemoveInstancesRequest](x: Self) {
    
    inline def setInstances(value: js.Array[InstanceReference]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: InstanceReference*): Self = StObject.set(x, "instances", js.Array(value*))
  }
}
