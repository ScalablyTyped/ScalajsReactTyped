package typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.Callback
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.FilterKey
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.OauthtokenParent
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientMonitoring.anon.ServiceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  def create(request: OauthtokenParent, body: Service): Request[Service] = js.native
  /** Create a Service. */
  def create(request: ServiceId): Request[Service] = js.native
  
  /** Soft delete this Service. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Get the named Service. */
  def get(): Request[Service] = js.native
  def get(request: Callback): Request[Service] = js.native
  
  /** List Services for this Metrics Scope. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: FilterKey): Request[ListServicesResponse] = js.native
  
  /** Update this Service. */
  def patch(request: OauthtokenPrettyPrint): Request[Service] = js.native
  def patch(request: Oauthtoken, body: Service): Request[Service] = js.native
  
  var serviceLevelObjectives: ServiceLevelObjectivesResource = js.native
}
