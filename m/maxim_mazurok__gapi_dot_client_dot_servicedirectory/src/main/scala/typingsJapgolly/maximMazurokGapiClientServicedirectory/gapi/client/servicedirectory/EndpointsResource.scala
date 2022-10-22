package typingsJapgolly.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Alt
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Callback
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Fields
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Key
import typingsJapgolly.maximMazurokGapiClientServicedirectory.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResource extends StObject {
  
  /** Creates an endpoint, and returns the new endpoint. */
  def create(request: Accesstoken): Request[Endpoint] = js.native
  def create(request: Alt, body: Endpoint): Request[Endpoint] = js.native
  
  /** Deletes an endpoint. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets an endpoint. */
  def get(): Request[Endpoint] = js.native
  def get(request: Callback): Request[Endpoint] = js.native
  
  /** Lists all endpoints. */
  def list(): Request[ListEndpointsResponse] = js.native
  def list(request: Fields): Request[ListEndpointsResponse] = js.native
  
  /** Updates an endpoint. */
  def patch(request: Key): Request[Endpoint] = js.native
  def patch(request: Name, body: Endpoint): Request[Endpoint] = js.native
}
