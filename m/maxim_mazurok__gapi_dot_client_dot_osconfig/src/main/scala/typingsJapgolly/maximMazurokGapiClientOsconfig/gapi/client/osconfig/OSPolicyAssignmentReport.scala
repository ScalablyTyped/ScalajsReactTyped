package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSPolicyAssignmentReport extends StObject {
  
  /** The Compute Engine VM instance name. */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier of the last attempted run to apply the OS policies associated with this assignment on the VM. This ID is logged by the OS Config agent while applying the OS
    * policies associated with this assignment on the VM. NOTE: If the service is unable to successfully connect to the agent for this run, then this id will not be available in the agent
    * logs.
    */
  var lastRunId: js.UndefOr[String] = js.undefined
  
  /**
    * The `OSPolicyAssignmentReport` API resource name. Format:
    * `projects/{project_number}/locations/{location}/instances/{instance_id}/osPolicyAssignments/{os_policy_assignment_id}/report`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the `OSPolicyAssignment` API resource that the `OSPolicy` belongs to. Format:
    * `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id@revision_id}`
    */
  var osPolicyAssignment: js.UndefOr[String] = js.undefined
  
  /** Compliance data for each `OSPolicy` that is applied to the VM. */
  var osPolicyCompliances: js.UndefOr[js.Array[OSPolicyAssignmentReportOSPolicyCompliance]] = js.undefined
  
  /** Timestamp for when the report was last generated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object OSPolicyAssignmentReport {
  
  inline def apply(): OSPolicyAssignmentReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSPolicyAssignmentReport]
  }
  
  extension [Self <: OSPolicyAssignmentReport](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLastRunId(value: String): Self = StObject.set(x, "lastRunId", value.asInstanceOf[js.Any])
    
    inline def setLastRunIdUndefined: Self = StObject.set(x, "lastRunId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsPolicyAssignment(value: String): Self = StObject.set(x, "osPolicyAssignment", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentUndefined: Self = StObject.set(x, "osPolicyAssignment", js.undefined)
    
    inline def setOsPolicyCompliances(value: js.Array[OSPolicyAssignmentReportOSPolicyCompliance]): Self = StObject.set(x, "osPolicyCompliances", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyCompliancesUndefined: Self = StObject.set(x, "osPolicyCompliances", js.undefined)
    
    inline def setOsPolicyCompliancesVarargs(value: OSPolicyAssignmentReportOSPolicyCompliance*): Self = StObject.set(x, "osPolicyCompliances", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
