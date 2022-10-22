package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse extends StObject {
  
  /** A sample of errors encountered while processing the request. */
  var errorSamples: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
  
  /** Echoes the destination for the complete errors if this field was set in the request. */
  var errorsConfig: js.UndefOr[GoogleCloudRecommendationengineV1beta1ImportErrorsConfig] = js.undefined
  
  /** Aggregated statistics of user event import status. */
  var importSummary: js.UndefOr[GoogleCloudRecommendationengineV1beta1UserEventImportSummary] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse {
  
  inline def apply(): GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse]
  }
  
  extension [Self <: GoogleCloudRecommendationengineV1beta1ImportUserEventsResponse](x: Self) {
    
    inline def setErrorSamples(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "errorSamples", value.asInstanceOf[js.Any])
    
    inline def setErrorSamplesUndefined: Self = StObject.set(x, "errorSamples", js.undefined)
    
    inline def setErrorSamplesVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "errorSamples", js.Array(value*))
    
    inline def setErrorsConfig(value: GoogleCloudRecommendationengineV1beta1ImportErrorsConfig): Self = StObject.set(x, "errorsConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorsConfigUndefined: Self = StObject.set(x, "errorsConfig", js.undefined)
    
    inline def setImportSummary(value: GoogleCloudRecommendationengineV1beta1UserEventImportSummary): Self = StObject.set(x, "importSummary", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryUndefined: Self = StObject.set(x, "importSummary", js.undefined)
  }
}
