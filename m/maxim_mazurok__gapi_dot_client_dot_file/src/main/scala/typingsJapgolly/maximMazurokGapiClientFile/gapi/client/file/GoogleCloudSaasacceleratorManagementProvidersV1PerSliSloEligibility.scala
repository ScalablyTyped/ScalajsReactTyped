package typingsJapgolly.maximMazurokGapiClientFile.gapi.client.file

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility extends StObject {
  
  /**
    * An entry in the eligibilities map specifies an eligibility for a particular SLI for the given instance. The SLI key in the name must be a valid SLI name specified in the Eligibility
    * Exporter binary flags otherwise an error will be emitted by Eligibility Exporter and the oncaller will be alerted. If an SLI has been defined in the binary flags but the
    * eligibilities map does not contain it, the corresponding SLI time series will not be emitted by the Eligibility Exporter. This ensures a smooth rollout and compatibility between the
    * data produced by different versions of the Eligibility Exporters. If eligibilities map contains a key for an SLI which has not been declared in the binary flags, there will be an
    * error message emitted in the Eligibility Exporter log and the metric for the SLI in question will not be emitted.
    */
  var eligibilities: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.file.gapi.client.file.GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility} */ js.Any
  ] = js.undefined
}
object GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility {
  
  inline def apply(): GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility]
  }
  
  extension [Self <: GoogleCloudSaasacceleratorManagementProvidersV1PerSliSloEligibility](x: Self) {
    
    inline def setEligibilities(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.file.gapi.client.file.GoogleCloudSaasacceleratorManagementProvidersV1SloEligibility} */ js.Any
    ): Self = StObject.set(x, "eligibilities", value.asInstanceOf[js.Any])
    
    inline def setEligibilitiesUndefined: Self = StObject.set(x, "eligibilities", js.undefined)
  }
}
