package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Alt
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Fields
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Key
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Name
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesResource extends StObject {
  
  def create(request: Callback, body: Creative): Request[Creative] = js.native
  /** Creates a creative. */
  def create(request: Fields): Request[Creative] = js.native
  
  /** Gets a creative. */
  def get(): Request[Creative] = js.native
  def get(request: Key): Request[Creative] = js.native
  
  /**
    * Lists creatives as they are at the time of the initial request. This call may take multiple hours to complete. For large, paginated requests, this method returns a snapshot of
    * creatives at the time of request for the first page. `lastStatusUpdate` and `creativeServingDecision` may be outdated for creatives on sequential pages. We recommend [Google Cloud
    * Pub/Sub](//cloud.google.com/pubsub/docs/overview) to view the latest status.
    */
  def list(): Request[ListCreativesResponse] = js.native
  def list(request: Accesstoken): Request[ListCreativesResponse] = js.native
  
  /** Updates a creative. */
  def patch(request: Name): Request[Creative] = js.native
  def patch(request: Oauthtoken, body: Creative): Request[Creative] = js.native
  
  /**
    * Watches all creatives pertaining to a bidder. It is sufficient to invoke this endpoint once per bidder. A Pub/Sub topic will be created and notifications will be pushed to the topic
    * when any of the bidder's creatives change status. All of the bidder's service accounts will have access to read from the topic. Subsequent invocations of this method will return the
    * existing Pub/Sub configuration.
    */
  def watch(request: Alt): Request[WatchCreativesResponse] = js.native
  def watch(request: Callback, body: WatchCreativesRequest): Request[WatchCreativesResponse] = js.native
}
