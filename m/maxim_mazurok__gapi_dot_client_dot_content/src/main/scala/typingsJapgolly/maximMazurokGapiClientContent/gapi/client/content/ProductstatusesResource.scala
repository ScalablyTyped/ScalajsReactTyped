package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.CallbackDestinations
import typingsJapgolly.maximMazurokGapiClientContent.anon.DestinationsFields
import typingsJapgolly.maximMazurokGapiClientContent.anon.FieldsKeyOauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientContent.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductstatusesResource extends StObject {
  
  /** Gets the statuses of multiple products in a single request. */
  def custombatch(request: FieldsKeyOauthtokenPrettyPrint): Request[ProductstatusesCustomBatchResponse] = js.native
  def custombatch(request: UploadType, body: ProductstatusesCustomBatchRequest): Request[ProductstatusesCustomBatchResponse] = js.native
  
  /** Gets the status of a product from your Merchant Center account. */
  def get(): Request[ProductStatus] = js.native
  def get(request: CallbackDestinations): Request[ProductStatus] = js.native
  
  /** Lists the statuses of the products in your Merchant Center account. */
  def list(): Request[ProductstatusesListResponse] = js.native
  def list(request: DestinationsFields): Request[ProductstatusesListResponse] = js.native
  
  var repricingreports: RepricingreportsResource = js.native
}
