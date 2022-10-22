package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.AccesstokenAltCallback
import typingsJapgolly.maximMazurokGapiClientContent.anon.Country
import typingsJapgolly.maximMazurokGapiClientContent.anon.PageToken
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedstatusesResource extends StObject {
  
  /** Gets multiple Merchant Center datafeed statuses in a single request. */
  def custombatch(request: AccesstokenAltCallback): Request[DatafeedstatusesCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: DatafeedstatusesCustomBatchRequest): Request[DatafeedstatusesCustomBatchResponse] = js.native
  
  /** Retrieves the status of a datafeed from your Merchant Center account. */
  def get(): Request[DatafeedStatus] = js.native
  def get(request: Country): Request[DatafeedStatus] = js.native
  
  /** Lists the statuses of the datafeeds in your Merchant Center account. */
  def list(): Request[DatafeedstatusesListResponse] = js.native
  def list(request: PageToken): Request[DatafeedstatusesListResponse] = js.native
}
