package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementsResource extends StObject {
  
  def predict(request: Callback, body: GoogleCloudRecommendationengineV1beta1PredictRequest): Request[GoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
  /**
    * Makes a recommendation prediction. If using API Key based authentication, the API Key must be registered using the PredictionApiKeyRegistry service. [Learn
    * more](https://cloud.google.com/recommendations-ai/docs/setting-up#register-key).
    */
  def predict(request: PrettyPrint): Request[GoogleCloudRecommendationengineV1beta1PredictResponse] = js.native
}
