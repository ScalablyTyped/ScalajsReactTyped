package typingsJapgolly.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.Name
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientRecommendationengine.anon.UpdateMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogsResource extends StObject {
  
  var catalogItems: CatalogItemsResource = js.native
  
  var eventStores: EventStoresResource = js.native
  
  /** Lists all the catalog configurations associated with the project. */
  def list(): Request[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  def list(request: PageSize): Request[GoogleCloudRecommendationengineV1beta1ListCatalogsResponse] = js.native
  
  var operations: OperationsResource = js.native
  
  def patch(request: Name, body: GoogleCloudRecommendationengineV1beta1Catalog): Request[GoogleCloudRecommendationengineV1beta1Catalog] = js.native
  /** Updates the catalog configuration. */
  def patch(request: UpdateMask): Request[GoogleCloudRecommendationengineV1beta1Catalog] = js.native
}
