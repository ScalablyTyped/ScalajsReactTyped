package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCompute.anon.FieldsHealthCheckService
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Filter
import typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheckServiceKey
import typingsJapgolly.maximMazurokGapiClientCompute.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientCompute.anon.OauthtokenPrettyPrintProjectQuotaUserRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionHealthCheckServicesResource extends StObject {
  
  /** Deletes the specified regional HealthCheckService. */
  def delete(): Request[Operation] = js.native
  def delete(request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheckService): Request[Operation] = js.native
  
  /** Returns the specified regional HealthCheckService resource. */
  def get(): Request[HealthCheckService] = js.native
  def get(request: FieldsHealthCheckService): Request[HealthCheckService] = js.native
  
  /** Creates a regional HealthCheckService resource in the specified project and region using the data included in the request. */
  def insert(request: OauthtokenPrettyPrintProjectQuotaUserRegion): Request[Operation] = js.native
  def insert(request: Oauthtoken, body: HealthCheckService): Request[Operation] = js.native
  
  /** Lists all the HealthCheckService resources that have been configured for the specified project in the given region. */
  def list(): Request[HealthCheckServicesList] = js.native
  def list(request: Filter): Request[HealthCheckServicesList] = js.native
  
  /**
    * Updates the specified regional HealthCheckService resource with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format and
    * processing rules.
    */
  def patch(request: HealthCheckServiceKey): Request[Operation] = js.native
  def patch(
    request: typingsJapgolly.maximMazurokGapiClientCompute.anon.HealthCheckService,
    body: HealthCheckService
  ): Request[Operation] = js.native
}
