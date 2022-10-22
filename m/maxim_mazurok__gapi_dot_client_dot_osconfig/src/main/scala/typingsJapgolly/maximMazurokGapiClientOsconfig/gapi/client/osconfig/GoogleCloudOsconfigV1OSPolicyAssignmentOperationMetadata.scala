package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudOsconfigV1OSPolicyAssignmentOperationMetadata extends StObject {
  
  /** The OS policy assignment API method. */
  var apiMethod: js.UndefOr[String] = js.undefined
  
  /** Reference to the `OSPolicyAssignment` API resource. Format: `projects/{project_number}/locations/{location}/osPolicyAssignments/{os_policy_assignment_id@revision_id}` */
  var osPolicyAssignment: js.UndefOr[String] = js.undefined
  
  /** Rollout start time */
  var rolloutStartTime: js.UndefOr[String] = js.undefined
  
  /** State of the rollout */
  var rolloutState: js.UndefOr[String] = js.undefined
  
  /** Rollout update time */
  var rolloutUpdateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudOsconfigV1OSPolicyAssignmentOperationMetadata {
  
  inline def apply(): GoogleCloudOsconfigV1OSPolicyAssignmentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudOsconfigV1OSPolicyAssignmentOperationMetadata]
  }
  
  extension [Self <: GoogleCloudOsconfigV1OSPolicyAssignmentOperationMetadata](x: Self) {
    
    inline def setApiMethod(value: String): Self = StObject.set(x, "apiMethod", value.asInstanceOf[js.Any])
    
    inline def setApiMethodUndefined: Self = StObject.set(x, "apiMethod", js.undefined)
    
    inline def setOsPolicyAssignment(value: String): Self = StObject.set(x, "osPolicyAssignment", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentUndefined: Self = StObject.set(x, "osPolicyAssignment", js.undefined)
    
    inline def setRolloutStartTime(value: String): Self = StObject.set(x, "rolloutStartTime", value.asInstanceOf[js.Any])
    
    inline def setRolloutStartTimeUndefined: Self = StObject.set(x, "rolloutStartTime", js.undefined)
    
    inline def setRolloutState(value: String): Self = StObject.set(x, "rolloutState", value.asInstanceOf[js.Any])
    
    inline def setRolloutStateUndefined: Self = StObject.set(x, "rolloutState", js.undefined)
    
    inline def setRolloutUpdateTime(value: String): Self = StObject.set(x, "rolloutUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setRolloutUpdateTimeUndefined: Self = StObject.set(x, "rolloutUpdateTime", js.undefined)
  }
}
