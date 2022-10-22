package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Callback
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Filter
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherConnectionsResource extends StObject {
  
  def batchApprove(request: Callback, body: BatchApprovePublisherConnectionsRequest): Request[BatchApprovePublisherConnectionsResponse] = js.native
  /** Batch approves multiple publisher connections. */
  def batchApprove(request: KeyOauthtoken): Request[BatchApprovePublisherConnectionsResponse] = js.native
  
  def batchReject(request: Callback, body: BatchRejectPublisherConnectionsRequest): Request[BatchRejectPublisherConnectionsResponse] = js.native
  /** Batch rejects multiple publisher connections. */
  def batchReject(request: OauthtokenParent): Request[BatchRejectPublisherConnectionsResponse] = js.native
  
  /** Gets a publisher connection. */
  def get(): Request[PublisherConnection] = js.native
  def get(request: PrettyPrint): Request[PublisherConnection] = js.native
  
  /** Lists publisher connections for a given bidder. */
  def list(): Request[ListPublisherConnectionsResponse] = js.native
  def list(request: Filter): Request[ListPublisherConnectionsResponse] = js.native
}
