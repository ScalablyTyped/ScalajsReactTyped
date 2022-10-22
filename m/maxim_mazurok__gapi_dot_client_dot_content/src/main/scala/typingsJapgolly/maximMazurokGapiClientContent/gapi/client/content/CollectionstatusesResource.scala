package typingsJapgolly.maximMazurokGapiClientContent.gapi.client.content

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContent.anon.CollectionId
import typingsJapgolly.maximMazurokGapiClientContent.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionstatusesResource extends StObject {
  
  /** Gets the status of a collection from your Merchant Center account. */
  def get(): Request[CollectionStatus] = js.native
  def get(request: CollectionId): Request[CollectionStatus] = js.native
  
  /** Lists the statuses of the collections in your Merchant Center account. */
  def list(): Request[ListCollectionStatusesResponse] = js.native
  def list(request: PageSize): Request[ListCollectionStatusesResponse] = js.native
}
