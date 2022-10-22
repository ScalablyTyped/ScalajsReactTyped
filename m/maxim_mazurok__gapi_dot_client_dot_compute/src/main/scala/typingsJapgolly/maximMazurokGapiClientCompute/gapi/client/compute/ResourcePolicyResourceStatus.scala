package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcePolicyResourceStatus extends StObject {
  
  /** [Output Only] Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field. */
  var instanceSchedulePolicy: js.UndefOr[ResourcePolicyResourceStatusInstanceSchedulePolicyStatus] = js.undefined
}
object ResourcePolicyResourceStatus {
  
  inline def apply(): ResourcePolicyResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcePolicyResourceStatus]
  }
  
  extension [Self <: ResourcePolicyResourceStatus](x: Self) {
    
    inline def setInstanceSchedulePolicy(value: ResourcePolicyResourceStatusInstanceSchedulePolicyStatus): Self = StObject.set(x, "instanceSchedulePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceSchedulePolicyUndefined: Self = StObject.set(x, "instanceSchedulePolicy", js.undefined)
  }
}
