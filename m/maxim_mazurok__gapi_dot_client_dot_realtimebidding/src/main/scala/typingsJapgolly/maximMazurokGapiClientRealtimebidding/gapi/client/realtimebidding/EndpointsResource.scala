package typingsJapgolly.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientRealtimebidding.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResource extends StObject {
  
  /** Gets a bidder endpoint by its name. */
  def get(): Request[Endpoint] = js.native
  def get(request: PrettyPrint): Request[Endpoint] = js.native
  
  /** Lists all the bidder's endpoints. */
  def list(): Request[ListEndpointsResponse] = js.native
  def list(request: PageSize): Request[ListEndpointsResponse] = js.native
  
  def patch(request: Oauthtoken, body: Endpoint): Request[Endpoint] = js.native
  /** Updates a bidder's endpoint. */
  def patch(request: QuotaUser): Request[Endpoint] = js.native
}
