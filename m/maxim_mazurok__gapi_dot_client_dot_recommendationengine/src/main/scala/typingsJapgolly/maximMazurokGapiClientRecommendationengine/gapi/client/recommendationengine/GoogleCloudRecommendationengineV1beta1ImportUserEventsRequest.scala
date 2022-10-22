package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest extends StObject {
  
  /** Optional. The desired location of errors incurred during the Import. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.undefined
  
  /** Required. The desired input location of the data. */
  var inputConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1InputConfig] = js.undefined
  
  /**
    * Optional. Unique identifier provided by client, within the ancestor dataset scope. Ensures idempotency for expensive long running operations. Server-generated if unspecified. Up to
    * 128 characters long. This is returned as google.longrunning.Operation.name in the response. Note that this field must not be set if the desired input config is
    * catalog_inline_source.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ImportUserEventsRequest](x: Self) {
    
    inline def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setInputConfig(value: GoogleCloudRecommendationengineV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
