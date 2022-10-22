package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.Alt
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredictionApiKeyRegistrationsResource extends StObject {
  
  def create(
    request: Alt,
    body: GoogleCloudRecommendationengineV1beta1CreatePredictionApiKeyRegistrationRequest
  ): Request[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  /** Register an API key for use with predict method. */
  def create(request: Parent): Request[GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration] = js.native
  
  /** Unregister an apiKey from using for predict method. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** List the registered apiKeys for use with predict method. */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudRecommendationengineV1beta1ListPredictionApiKeyRegistrationsResponse] = js.native
}
