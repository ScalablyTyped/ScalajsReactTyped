package typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.Key
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.PageSize
import typingsJapgolly.maximMazurokGapiClientSasportal.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomersResource extends StObject {
  
  var deployments: DeploymentsResource = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested customer. */
  def get(): Request[SasPortalCustomer] = js.native
  def get(request: Key): Request[SasPortalCustomer] = js.native
  
  /** Returns a list of requested customers. */
  def list(): Request[SasPortalListCustomersResponse] = js.native
  def list(request: PageSize): Request[SasPortalListCustomersResponse] = js.native
  
  var nodes: NodesResource = js.native
  
  /** Updates an existing customer. */
  def patch(request: AltCallback): Request[SasPortalCustomer] = js.native
  def patch(request: PrettyPrint, body: SasPortalCustomer): Request[SasPortalCustomer] = js.native
}
