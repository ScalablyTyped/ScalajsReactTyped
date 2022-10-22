package typingsJapgolly.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility extends StObject {
  
  /** Whether an instance is eligible or ineligible. */
  var eligible: js.UndefOr[Boolean] = js.undefined
  
  /** User-defined reason for the current value of instance eligibility. Usually, this can be directly mapped to the internal state. An empty reason is allowed. */
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility](x: Self) {
    
    inline def setEligible(value: Boolean): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    inline def setEligibleUndefined: Self = StObject.set(x, "eligible", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
