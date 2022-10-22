package typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientManagedidentities.anon.Callback
import typingsJapgolly.maximMazurokGapiClientManagedidentities.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlIntegrationsResource extends StObject {
  
  /** Gets details of a single sqlIntegration. */
  def get(): Request[SqlIntegration] = js.native
  def get(request: Callback): Request[SqlIntegration] = js.native
  
  /** Lists SqlIntegrations in a given domain. */
  def list(): Request[ListSqlIntegrationsResponse] = js.native
  def list(request: Filter): Request[ListSqlIntegrationsResponse] = js.native
}
