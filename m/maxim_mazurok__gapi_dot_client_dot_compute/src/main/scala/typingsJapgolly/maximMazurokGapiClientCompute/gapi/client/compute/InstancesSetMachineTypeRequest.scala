package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesSetMachineTypeRequest extends StObject {
  
  /** Full or partial URL of the machine type resource. See Machine Types for a full list of machine types. For example: zones/us-central1-f/machineTypes/n1-standard-1 */
  var machineType: js.UndefOr[String] = js.undefined
}
object InstancesSetMachineTypeRequest {
  
  inline def apply(): InstancesSetMachineTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMachineTypeRequest]
  }
  
  extension [Self <: InstancesSetMachineTypeRequest](x: Self) {
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
  }
}
