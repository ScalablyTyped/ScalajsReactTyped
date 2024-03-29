package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDatalabeling.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotatedDatasetsResource extends StObject {
  
  var dataItems: DataItemsResource = js.native
  
  /** Deletes an annotated dataset by resource name. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  var examples: ExamplesResource = js.native
  
  var feedbackThreads: FeedbackThreadsResource = js.native
  
  /** Gets an annotated dataset by resource name. */
  def get(): Request[GoogleCloudDatalabelingV1beta1AnnotatedDataset] = js.native
  def get(request: Callback): Request[GoogleCloudDatalabelingV1beta1AnnotatedDataset] = js.native
  
  /** Lists annotated datasets for a dataset. Pagination is supported. */
  def list(): Request[GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse] = js.native
  def list(request: Fields): Request[GoogleCloudDatalabelingV1beta1ListAnnotatedDatasetsResponse] = js.native
}
